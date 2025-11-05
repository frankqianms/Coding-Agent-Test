/**
 * Evaluates GitHub issues to determine if they are suitable for AI Coding Agent assignment
 */
public class IssueEvaluator {
    
    public enum Suitability {
        SUITABLE,
        UNSUITABLE,
        UNCERTAIN
    }
    
    /**
     * Evaluates if an issue is suitable for an AI Coding Agent
     * Criteria:
     * - Clearly defined coding task
     * - Has acceptance criteria
     * - Low to medium complexity
     */
    public Suitability evaluateIssue(GitHubIssue issue) {
        if (issue.getState().equals("closed")) {
            return Suitability.UNSUITABLE;
        }
        
        String body = issue.getBody().toLowerCase();
        String title = issue.getTitle().toLowerCase();
        String combined = title + " " + body;
        
        // Check for unclear/vague indicators (check this first)
        boolean isVague = containsAny(combined,
            "investigate", "research", "explore", "discuss", "consider",
            "brainstorm", "tbd", "to be determined", "should we", "need to explore");
        
        if (isVague) {
            return Suitability.UNSUITABLE;
        }
        
        // Check for clear coding task indicators
        boolean hasCodingIndicators = containsAny(combined,
            "implement", "add", "create", "fix", "bug", "feature",
            "update", "refactor", "code", "function", "method", "class");
        
        // Check for acceptance criteria indicators
        boolean hasAcceptanceCriteria = containsAny(body,
            "acceptance criteria", "requirements", "should", "must",
            "expected behavior", "definition of done", "acceptance",
            "expected:", "actual:", "steps to reproduce");
        
        // Check for high complexity indicators (unsuitable if present)
        boolean hasHighComplexity = containsAny(combined,
            "architecture", "redesign", "migration", "breaking change",
            "major refactor", "complex", "multiple components");
        
        // Decision logic
        if (hasHighComplexity) {
            return Suitability.UNSUITABLE;
        }
        
        if (hasCodingIndicators && hasAcceptanceCriteria) {
            return Suitability.SUITABLE;
        }
        
        if (hasCodingIndicators && !hasAcceptanceCriteria) {
            return Suitability.UNCERTAIN;
        }
        
        return Suitability.UNSUITABLE;
    }
    
    /**
     * Provides a reason for the suitability assessment
     */
    public String getEvaluationReason(GitHubIssue issue, Suitability suitability) {
        switch (suitability) {
            case SUITABLE:
                return "Issue has clear coding task and acceptance criteria";
            case UNSUITABLE:
                if (issue.getState().equals("closed")) {
                    return "Issue is already closed";
                }
                return "Issue lacks clarity, acceptance criteria, or is too complex";
            case UNCERTAIN:
                return "Issue needs review - may need more detailed acceptance criteria";
            default:
                return "Unknown suitability";
        }
    }
    
    private boolean containsAny(String text, String... keywords) {
        for (String keyword : keywords) {
            if (text.contains(keyword)) {
                return true;
            }
        }
        return false;
    }
}
