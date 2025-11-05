import java.util.ArrayList;
import java.util.List;

/**
 * Simulates GitHub API interactions for listing and assigning issues
 * In a real implementation, this would use GitHub REST API or GraphQL API
 */
public class GitHubClient {
    private final String owner;
    private final String repo;
    private final String token;
    
    public GitHubClient(String owner, String repo, String token) {
        this.owner = owner;
        this.repo = repo;
        this.token = token;
    }
    
    /**
     * Lists the most recent issues from the repository
     * @param count Number of issues to retrieve
     * @return List of GitHub issues
     */
    public List<GitHubIssue> listIssues(int count) {
        System.out.println(String.format("Fetching %d most recent issues from %s/%s...", count, owner, repo));
        
        // In a real implementation, this would call:
        // GET https://api.github.com/repos/{owner}/{repo}/issues?state=open&sort=created&direction=desc&per_page={count}
        
        // For demonstration, return mock issues
        List<GitHubIssue> issues = new ArrayList<>();
        
        // Mock issue examples showing different scenarios
        issues.add(new GitHubIssue(
            1,
            "Add user authentication feature",
            "Implement user login functionality.\n\nAcceptance Criteria:\n- Users can log in with username and password\n- Invalid credentials show error message\n- Successful login redirects to dashboard",
            "open",
            new String[]{"feature", "enhancement"}
        ));
        
        issues.add(new GitHubIssue(
            2,
            "Investigate performance issues",
            "The application seems slow. We should investigate what's causing the performance degradation.",
            "open",
            new String[]{"investigation"}
        ));
        
        issues.add(new GitHubIssue(
            3,
            "Fix null pointer exception in UserService",
            "Bug Report:\nSteps to reproduce:\n1. Navigate to user profile\n2. Click edit button\n3. App crashes\n\nExpected: Profile should be editable\nActual: NullPointerException thrown",
            "open",
            new String[]{"bug"}
        ));
        
        issues.add(new GitHubIssue(
            4,
            "Major architecture redesign for scalability",
            "We need to completely redesign the system architecture to support millions of users. This involves breaking changes across multiple components.",
            "open",
            new String[]{"architecture", "breaking-change"}
        ));
        
        issues.add(new GitHubIssue(
            5,
            "Add input validation to registration form",
            "Requirements:\n- Email field must validate email format\n- Password must be at least 8 characters\n- Show inline validation errors",
            "open",
            new String[]{"feature", "validation"}
        ));
        
        issues.add(new GitHubIssue(
            6,
            "Update documentation",
            "The README needs to be updated with new API endpoints",
            "open",
            new String[]{"documentation"}
        ));
        
        issues.add(new GitHubIssue(
            7,
            "Refactor database queries",
            "Should we consider optimizing the database queries? Need to explore different approaches.",
            "open",
            new String[]{"refactoring"}
        ));
        
        issues.add(new GitHubIssue(
            8,
            "Implement search functionality",
            "Add search feature to allow users to find products.\n\nDefinition of Done:\n- Search bar in header\n- Results display as user types\n- Search by product name and description",
            "open",
            new String[]{"feature"}
        ));
        
        issues.add(new GitHubIssue(
            9,
            "Fix typo in welcome message",
            "The welcome message says 'Welcom' instead of 'Welcome'. Should be fixed in Main.java line 7.",
            "open",
            new String[]{"bug", "good-first-issue"}
        ));
        
        issues.add(new GitHubIssue(
            10,
            "Brainstorm ideas for new features",
            "Let's discuss what features we should add next quarter",
            "open",
            new String[]{"discussion"}
        ));
        
        System.out.println(String.format("Retrieved %d issues", issues.size()));
        return issues;
    }
    
    /**
     * Assigns Copilot to a specific issue
     * @param issueNumber The issue number to assign
     * @return true if assignment was successful
     */
    public boolean assignCopilotToIssue(int issueNumber) {
        System.out.println(String.format("Assigning Copilot to issue #%d in %s/%s", issueNumber, owner, repo));
        
        // In a real implementation, this would:
        // 1. Add assignee "copilot" to the issue
        // 2. Possibly add a label like "copilot-assigned"
        // 3. Add a comment indicating Copilot has been assigned
        // POST https://api.github.com/repos/{owner}/{repo}/issues/{issueNumber}/assignees
        
        // For demonstration, simulate success
        System.out.println(String.format("✓ Successfully assigned Copilot to issue #%d", issueNumber));
        return true;
    }
}
