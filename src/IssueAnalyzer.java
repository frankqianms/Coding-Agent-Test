/**
 * Analyzes GitHub issues to determine if they are suitable for an AI Coding Agent
 */
public class IssueAnalyzer {
    
    /**
     * Checks if an issue is suitable for an AI Coding Agent.
     * 
     * Criteria:
     * - Must be open
     * - Must have a clear description
     * - Should have acceptance criteria indicators
     * - Should not be too complex (no "complex" or "major" labels)
     * 
     * @param issue The issue to analyze
     * @return true if suitable for AI Coding Agent, false otherwise
     */
    public boolean isSuitableForCodingAgent(GitHubIssue issue) {
        // Must be open
        if (!"open".equalsIgnoreCase(issue.getState())) {
            return false;
        }
        
        // Must have a description
        if (issue.getDescription() == null || issue.getDescription().trim().isEmpty()) {
            return false;
        }
        
        // Check for complexity indicators in labels
        for (String label : issue.getLabels()) {
            String lowerLabel = label.toLowerCase();
            if (lowerLabel.contains("complex") || 
                lowerLabel.contains("major") ||
                lowerLabel.contains("epic")) {
                return false;
            }
        }
        
        // Check for acceptance criteria indicators
        String desc = issue.getDescription().toLowerCase();
        boolean hasAcceptanceCriteria = 
            desc.contains("acceptance criteria") ||
            desc.contains("expected behavior") ||
            desc.contains("should") ||
            desc.contains("must") ||
            desc.contains("requirements");
        
        // Check if it's a coding task (exclude documentation-only tasks)
        boolean isDocumentationOnly = 
            hasLabel(issue, "documentation") &&
            !desc.contains("code") &&
            !desc.contains("implement") &&
            !desc.contains("api");
        
        boolean isCodingTask = 
            !isDocumentationOnly && (
                desc.contains("implement") ||
                desc.contains("add") ||
                desc.contains("create") ||
                desc.contains("fix") ||
                desc.contains("update") ||
                desc.contains("refactor") ||
                desc.contains("code") ||
                hasLabel(issue, "bug") ||
                hasLabel(issue, "enhancement") ||
                hasLabel(issue, "feature")
            );
        
        return hasAcceptanceCriteria && isCodingTask;
    }
    
    /**
     * Checks if an issue has a specific label
     */
    private boolean hasLabel(GitHubIssue issue, String targetLabel) {
        for (String label : issue.getLabels()) {
            if (label.equalsIgnoreCase(targetLabel)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Provides a reason why an issue is or isn't suitable
     */
    public String getSuitabilityReason(GitHubIssue issue) {
        if (!"open".equalsIgnoreCase(issue.getState())) {
            return "Issue is not open";
        }
        
        if (issue.getDescription() == null || issue.getDescription().trim().isEmpty()) {
            return "Issue lacks a description";
        }
        
        for (String label : issue.getLabels()) {
            String lowerLabel = label.toLowerCase();
            if (lowerLabel.contains("complex") || 
                lowerLabel.contains("major") ||
                lowerLabel.contains("epic")) {
                return "Issue is too complex (has complexity indicator label)";
            }
        }
        
        String desc = issue.getDescription().toLowerCase();
        boolean hasAcceptanceCriteria = 
            desc.contains("acceptance criteria") ||
            desc.contains("expected behavior") ||
            desc.contains("should") ||
            desc.contains("must") ||
            desc.contains("requirements");
        
        if (!hasAcceptanceCriteria) {
            return "Issue lacks clear acceptance criteria";
        }
        
        boolean isDocumentationOnly = 
            hasLabel(issue, "documentation") &&
            !desc.contains("code") &&
            !desc.contains("implement") &&
            !desc.contains("api");
        
        boolean isCodingTask = 
            !isDocumentationOnly && (
                desc.contains("implement") ||
                desc.contains("add") ||
                desc.contains("create") ||
                desc.contains("fix") ||
                desc.contains("update") ||
                desc.contains("refactor") ||
                desc.contains("code") ||
                hasLabel(issue, "bug") ||
                hasLabel(issue, "enhancement") ||
                hasLabel(issue, "feature")
            );
        
        if (!isCodingTask) {
            if (isDocumentationOnly) {
                return "Issue is documentation-only, not a coding task";
            }
            return "Issue does not appear to be a coding task";
        }
        
        return "Suitable for AI Coding Agent";
    }
}
