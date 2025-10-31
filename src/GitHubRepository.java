import java.util.ArrayList;
import java.util.List;

/**
 * Simulates fetching issues from a GitHub repository
 * In a real implementation, this would use the GitHub API
 */
public class GitHubRepository {
    private final String owner;
    private final String repoName;
    
    public GitHubRepository(String owner, String repoName) {
        this.owner = owner;
        this.repoName = repoName;
    }
    
    /**
     * Fetches the most recent issues from the repository
     * 
     * @param limit Maximum number of issues to fetch
     * @return List of GitHub issues
     */
    public List<GitHubIssue> fetchRecentIssues(int limit) {
        System.out.println("Fetching " + limit + " most recent issues from " + owner + "/" + repoName + "...");
        
        // In a real implementation, this would call the GitHub API
        // For demonstration, we'll create sample issues
        List<GitHubIssue> issues = new ArrayList<>();
        
        // Sample issue 1: Suitable for coding agent
        issues.add(new GitHubIssue(
            1,
            "Add input validation to user registration",
            "Implement input validation for the user registration form. " +
            "Requirements:\n" +
            "- Email should be validated\n" +
            "- Password must be at least 8 characters\n" +
            "- Username must be alphanumeric\n" +
            "Expected behavior: Invalid inputs should show appropriate error messages.",
            "open",
            new String[]{"enhancement", "good-first-issue"}
        ));
        
        // Sample issue 2: Too complex
        issues.add(new GitHubIssue(
            2,
            "Redesign the entire authentication system",
            "Need to completely redesign our authentication architecture to support OAuth2, SAML, and custom providers. " +
            "This is a major undertaking that will require significant architectural changes.",
            "open",
            new String[]{"enhancement", "complex", "major"}
        ));
        
        // Sample issue 3: Suitable for coding agent
        issues.add(new GitHubIssue(
            3,
            "Fix null pointer exception in data processor",
            "Bug: NullPointerException occurs when processing empty datasets. " +
            "Expected behavior: Should handle empty datasets gracefully without throwing exceptions. " +
            "Steps to reproduce:\n" +
            "1. Call processData() with empty list\n" +
            "2. Exception is thrown\n" +
            "Fix should add null/empty checks.",
            "open",
            new String[]{"bug", "high-priority"}
        ));
        
        // Sample issue 4: Lacks acceptance criteria
        issues.add(new GitHubIssue(
            4,
            "Improve performance",
            "The system is slow. Make it faster.",
            "open",
            new String[]{"enhancement"}
        ));
        
        // Sample issue 5: Suitable for coding agent
        issues.add(new GitHubIssue(
            5,
            "Create unit tests for StringUtils class",
            "Add comprehensive unit tests for the StringUtils class. " +
            "Requirements:\n" +
            "- Test isEmpty() method\n" +
            "- Test trimWhitespace() method\n" +
            "- Test capitalize() method\n" +
            "- Should achieve at least 90% code coverage\n" +
            "Expected: All methods should have corresponding test cases with edge cases covered.",
            "open",
            new String[]{"testing", "enhancement"}
        ));
        
        // Sample issue 6: Already closed
        issues.add(new GitHubIssue(
            6,
            "Update dependencies to latest versions",
            "Update all project dependencies to their latest stable versions. " +
            "Should update package.json and verify all tests pass.",
            "closed",
            new String[]{"maintenance"}
        ));
        
        // Sample issue 7: Suitable for coding agent
        issues.add(new GitHubIssue(
            7,
            "Implement dark mode toggle",
            "Add a dark mode toggle button to the settings page. " +
            "Requirements:\n" +
            "- Button should be in the settings menu\n" +
            "- Should toggle between light and dark themes\n" +
            "- Preference should be saved to localStorage\n" +
            "Expected behavior: Theme changes immediately when toggle is clicked and persists across sessions.",
            "open",
            new String[]{"feature", "UI"}
        ));
        
        // Sample issue 8: Documentation task, not coding
        issues.add(new GitHubIssue(
            8,
            "Update README documentation",
            "The README needs to be updated with new installation instructions. " +
            "Should include:\n" +
            "- Updated prerequisites\n" +
            "- New configuration options\n" +
            "- Examples of usage",
            "open",
            new String[]{"documentation"}
        ));
        
        // Sample issue 9: Suitable for coding agent
        issues.add(new GitHubIssue(
            9,
            "Refactor database connection handling",
            "Refactor the database connection code to use connection pooling. " +
            "Requirements:\n" +
            "- Implement connection pool with max 10 connections\n" +
            "- Add proper connection cleanup\n" +
            "- Update all database access code to use the pool\n" +
            "Expected: Improved performance and no connection leaks.",
            "open",
            new String[]{"enhancement", "refactoring"}
        ));
        
        // Sample issue 10: Suitable for coding agent
        issues.add(new GitHubIssue(
            10,
            "Add logging to error handling paths",
            "Add proper logging statements to all error handling blocks. " +
            "Requirements:\n" +
            "- Use appropriate log levels (ERROR, WARN)\n" +
            "- Include relevant context in log messages\n" +
            "- Ensure no sensitive data is logged\n" +
            "Expected: Better debugging capability with clear error logs.",
            "open",
            new String[]{"enhancement", "logging"}
        ));
        
        // Return only the requested number of issues
        return issues.subList(0, Math.min(limit, issues.size()));
    }
    
    public String getFullName() {
        return owner + "/" + repoName;
    }
}
