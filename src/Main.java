import java.util.List;

/**
 * Personal Assistant for GitHub Copilot Coding Agent
 * 
 * This application helps users assign tasks to the Coding Agent based on their 
 * open GitHub issues. It analyzes issues to determine if they are suitable for 
 * autonomous work (clearly defined coding tasks with acceptance criteria and 
 * low to medium complexity).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===================================================");
        System.out.println("  GitHub Copilot Coding Agent - Personal Assistant");
        System.out.println("===================================================\n");
        
        // Initialize components
        GitHubRepository repo = new GitHubRepository("frankqianms", "Coding-Agent-Test");
        IssueAnalyzer analyzer = new IssueAnalyzer();
        CopilotAssigner assigner = new CopilotAssigner();
        
        // Fetch recent issues
        System.out.println("Fetching the 10 most recent issues from " + repo.getFullName() + "...\n");
        List<GitHubIssue> issues = repo.fetchRecentIssues(10);
        
        if (issues.isEmpty()) {
            System.out.println("No issues found in the repository.");
            return;
        }
        
        System.out.println("Found " + issues.size() + " issues. Analyzing each for suitability...\n");
        
        // Analyze each issue
        for (GitHubIssue issue : issues) {
            System.out.println("─────────────────────────────────────────────────");
            System.out.println("Issue #" + issue.getNumber() + ": " + issue.getTitle());
            System.out.println("State: " + issue.getState());
            
            // Show labels
            if (issue.getLabels().length > 0) {
                System.out.print("Labels: ");
                for (int i = 0; i < issue.getLabels().length; i++) {
                    System.out.print(issue.getLabels()[i]);
                    if (i < issue.getLabels().length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
            
            // Analyze suitability
            boolean suitable = analyzer.isSuitableForCodingAgent(issue);
            String reason = analyzer.getSuitabilityReason(issue);
            
            System.out.println("Analysis: " + reason);
            System.out.println("Suitable for Copilot: " + (suitable ? "YES ✓" : "NO ✗"));
            
            // If suitable and certain, assign automatically
            if (suitable) {
                System.out.println("Action: Auto-assigning to Copilot (clearly defined and suitable)");
                assigner.assignToCopilot(issue);
            } else {
                System.out.println("Action: Not assigning (does not meet criteria)");
            }
            
            System.out.println();
        }
        
        // Print summary
        System.out.println("═════════════════════════════════════════════════");
        assigner.printAssignedSummary();
        
        System.out.println("Analysis complete! " + assigner.getAssignedIssues().size() + 
                         " out of " + issues.size() + " issues were assigned to Copilot.");
    }
}