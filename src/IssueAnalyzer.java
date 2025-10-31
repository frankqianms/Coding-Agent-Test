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
        if (isTooComplex(issue)) {
            return false;
        }
        
        // Check for acceptance criteria indicators
        if (!hasAcceptanceCriteria(issue)) {
            return false;
        }
        
        // Check if it's a coding task (exclude documentation-only tasks)
        return isCodingTask(issue);
    }
    
    /**
     * Checks if issue is too complex
     */
    private boolean isTooComplex(GitHubIssue issue) {
        for (String label : issue.getLabels()) {
            String lowerLabel = label.toLowerCase();
            if (lowerLabel.contains("complex") || 
                lowerLabel.contains("major") ||
                lowerLabel.contains("epic")) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Checks if issue has acceptance criteria indicators
     */
    private boolean hasAcceptanceCriteria(GitHubIssue issue) {
        String desc = issue.getDescription().toLowerCase();
        return desc.contains("acceptance criteria") ||
               desc.contains("expected behavior") ||
               desc.contains("should") ||
               desc.contains("must") ||
               desc.contains("requirements");
    }
    
    /**
     * Checks if issue is a coding task
     */
    private boolean isCodingTask(GitHubIssue issue) {
        String desc = issue.getDescription().toLowerCase();
        
        // Exclude documentation-only tasks
        boolean isDocumentationOnly = 
            hasLabel(issue, "documentation") &&
            !desc.contains("code") &&
            !desc.contains("implement") &&
            !desc.contains("api");
        
        if (isDocumentationOnly) {
            return false;
        }
        
        return desc.contains("implement") ||
               desc.contains("add") ||
               desc.contains("create") ||
               desc.contains("fix") ||
               desc.contains("update") ||
               desc.contains("refactor") ||
               desc.contains("code") ||
               hasLabel(issue, "bug") ||
               hasLabel(issue, "enhancement") ||
               hasLabel(issue, "feature");
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
        
        if (isTooComplex(issue)) {
            return "Issue is too complex (has complexity indicator label)";
        }
        
        if (!hasAcceptanceCriteria(issue)) {
            return "Issue lacks clear acceptance criteria";
        }
        
        if (!isCodingTask(issue)) {
            String desc = issue.getDescription().toLowerCase();
            boolean isDocumentationOnly = 
                hasLabel(issue, "documentation") &&
                !desc.contains("code") &&
                !desc.contains("implement") &&
                !desc.contains("api");
            
            if (isDocumentationOnly) {
                return "Issue is documentation-only, not a coding task";
            }
            return "Issue does not appear to be a coding task";
        }
        
        return "Suitable for AI Coding Agent";
    }
}
