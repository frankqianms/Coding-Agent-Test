/**
 * Represents a GitHub issue with relevant metadata for evaluation
 */
public class GitHubIssue {
    private final int number;
    private final String title;
    private final String body;
    private final String state;
    private final String[] labels;
    
    public GitHubIssue(int number, String title, String body, String state, String[] labels) {
        this.number = number;
        this.title = title;
        this.body = body != null ? body : "";
        this.state = state;
        this.labels = labels != null ? labels : new String[0];
    }
    
    public int getNumber() {
        return number;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getBody() {
        return body;
    }
    
    public String getState() {
        return state;
    }
    
    public String[] getLabels() {
        return labels;
    }
    
    @Override
    public String toString() {
        return String.format("Issue #%d: %s (State: %s)", number, title, state);
    }
}
