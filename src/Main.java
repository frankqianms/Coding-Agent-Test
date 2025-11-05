import java.util.List;
import java.util.Scanner;

/**
 * GitHub Copilot Issue Assignment Tool
 * 
 * This application helps identify and assign suitable GitHub issues to the Copilot Coding Agent.
 * It retrieves recent issues, evaluates their suitability based on clarity, acceptance criteria,
 * and complexity, then assigns appropriate issues to Copilot for autonomous work.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== GitHub Copilot Issue Assignment Tool ===\n");
        
        // Configuration - in a real implementation, these would come from environment variables or command line args
        String owner = "copilot-agent-test-org";
        String repo = "copilot-agent-test";
        String token = "github_token_placeholder"; // Would use real GitHub token
        
        // Initialize components
        GitHubClient client = new GitHubClient(owner, repo, token);
        IssueEvaluator evaluator = new IssueEvaluator();
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Get list of recent issues
        System.out.println("Step 1: Retrieving recent issues...\n");
        List<GitHubIssue> issues = client.listIssues(10);
        
        System.out.println("\n" + "=".repeat(80) + "\n");
        
        // Step 2: Evaluate and assign issues
        System.out.println("Step 2: Evaluating issues for Copilot assignment...\n");
        
        int suitableCount = 0;
        int uncertainCount = 0;
        int unsuitableCount = 0;
        
        for (GitHubIssue issue : issues) {
            System.out.println("─".repeat(80));
            System.out.println(issue);
            System.out.println("Title: " + issue.getTitle());
            if (issue.getBody().length() > 100) {
                System.out.println("Description: " + issue.getBody().substring(0, 100) + "...");
            } else {
                System.out.println("Description: " + issue.getBody());
            }
            
            IssueEvaluator.Suitability suitability = evaluator.evaluateIssue(issue);
            String reason = evaluator.getEvaluationReason(issue, suitability);
            
            System.out.println("\nEvaluation: " + suitability);
            System.out.println("Reason: " + reason);
            
            switch (suitability) {
                case SUITABLE:
                    suitableCount++;
                    System.out.println("\n✓ Automatically assigning to Copilot...");
                    client.assignCopilotToIssue(issue.getNumber());
                    break;
                    
                case UNCERTAIN:
                    uncertainCount++;
                    System.out.println("\n⚠ Uncertain - requesting user confirmation...");
                    System.out.print("Assign this issue to Copilot? (y/n): ");
                    String response = scanner.nextLine().trim().toLowerCase();
                    if (response.equals("y") || response.equals("yes")) {
                        client.assignCopilotToIssue(issue.getNumber());
                        System.out.println("✓ Assigned based on user confirmation");
                    } else {
                        System.out.println("✗ Skipped based on user decision");
                    }
                    break;
                    
                case UNSUITABLE:
                    unsuitableCount++;
                    System.out.println("\n✗ Not suitable for Copilot - skipping");
                    break;
            }
            
            System.out.println();
        }
        
        // Summary
        System.out.println("\n" + "=".repeat(80));
        System.out.println("\n=== Summary ===");
        System.out.println(String.format("Total issues evaluated: %d", issues.size()));
        System.out.println(String.format("Suitable (auto-assigned): %d", suitableCount));
        System.out.println(String.format("Uncertain (user review): %d", uncertainCount));
        System.out.println(String.format("Unsuitable (skipped): %d", unsuitableCount));
        System.out.println("\nDone!");
        
        scanner.close();
    }
}