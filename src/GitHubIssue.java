/**
 * Represents a GitHub issue with relevant metadata
 */
public class GitHubIssue {
    private final int number;
    private final String title;
    private final String description;
    private final String state;
    private final String[] labels;
    
    public GitHubIssue(int number, String title, String description, String state, String[] labels) {
        this.number = number;
        this.title = title;
        this.description = description;
        this.state = state;
        this.labels = labels;
    }
    
    public int getNumber() {
        return number;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getState() {
        return state;
    }
    
    public String[] getLabels() {
        return labels;
    }
    
    @Override
    public String toString() {
        return String.format("#%d: %s [%s]", number, title, state);
    }
}
