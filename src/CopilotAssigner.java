import java.util.ArrayList;
import java.util.List;

/**
 * Handles assignment of GitHub issues to Copilot
 */
public class CopilotAssigner {
    private final List<GitHubIssue> assignedIssues;
    
    public CopilotAssigner() {
        this.assignedIssues = new ArrayList<>();
    }
    
    /**
     * Assigns an issue to Copilot
     * 
     * @param issue The issue to assign
     * @return true if successfully assigned, false otherwise
     */
    public boolean assignToCopilot(GitHubIssue issue) {
        if (issue == null) {
            return false;
        }
        
        // Check if already assigned
        for (GitHubIssue assigned : assignedIssues) {
            if (assigned.getNumber() == issue.getNumber()) {
                System.out.println("Issue #" + issue.getNumber() + " is already assigned to Copilot");
                return false;
            }
        }
        
        assignedIssues.add(issue);
        System.out.println("✓ Assigned issue #" + issue.getNumber() + " to Copilot: " + issue.getTitle());
        return true;
    }
    
    /**
     * Gets all issues assigned to Copilot
     */
    public List<GitHubIssue> getAssignedIssues() {
        return new ArrayList<>(assignedIssues);
    }
    
    /**
     * Prints a summary of all assigned issues
     */
    public void printAssignedSummary() {
        System.out.println("\n=== Summary of Issues Assigned to Copilot ===");
        if (assignedIssues.isEmpty()) {
            System.out.println("No issues have been assigned yet.");
        } else {
            System.out.println("Total assigned: " + assignedIssues.size());
            for (GitHubIssue issue : assignedIssues) {
                System.out.println("  - " + issue);
            }
        }
        System.out.println("===========================================\n");
    }
}
