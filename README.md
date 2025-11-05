# GitHub Copilot Issue Assignment Assistant

A Java application that helps users assign tasks to the GitHub Copilot Coding Agent by analyzing GitHub issues for suitability.

## Overview

This personal assistant analyzes GitHub issues to determine if they are suitable for autonomous work by an AI Coding Agent. It checks for:
- Clearly defined coding tasks
- Acceptance criteria
- Low to medium complexity

## Features

- **Issue Fetching**: Retrieves the most recent issues from a GitHub repository
- **Smart Analysis**: Evaluates each issue based on multiple criteria:
  - Must be in open state
  - Must have a clear description
  - Should contain acceptance criteria indicators
  - Should be a coding task (not documentation-only)
  - Should not be overly complex
- **Automatic Assignment**: Automatically assigns suitable issues to Copilot
- **Summary Report**: Provides a detailed summary of all assigned issues

## How It Works

### Issue Suitability Criteria

An issue is considered suitable for the AI Coding Agent if it meets ALL of the following:

1. **Open State**: The issue must be open (not closed)
2. **Clear Description**: Must have a non-empty description
3. **Acceptance Criteria**: Description contains keywords like:
   - "acceptance criteria"
   - "expected behavior"
   - "should"
   - "must"
   - "requirements"
4. **Coding Task**: Must be a programming task (indicated by keywords or labels):
   - Keywords: "implement", "add", "create", "fix", "update", "refactor", "code"
   - Labels: "bug", "enhancement", "feature"
5. **Appropriate Complexity**: Must NOT have complexity indicators:
   - Labels like "complex", "major", or "epic"
6. **Not Documentation-Only**: Pure documentation tasks are excluded

### Example Output

```
Issue #1: Add input validation to user registration
State: open
Labels: enhancement, good-first-issue
Analysis: Suitable for AI Coding Agent
Suitable for Copilot: YES ✓
Action: Auto-assigning to Copilot (clearly defined and suitable)
✓ Assigned issue #1 to Copilot
```

## Building and Running

### Prerequisites

- Java 17 or higher
- JDK with `javac` compiler

### Compile

```bash
javac src/*.java
```

### Run

```bash
java -cp src Main
```

## Project Structure

```
src/
├── Main.java              # Main application entry point
├── GitHubIssue.java       # Issue data model
├── GitHubRepository.java  # Issue fetching (with sample data)
├── IssueAnalyzer.java     # Issue suitability analysis logic
└── CopilotAssigner.java   # Issue assignment management
```

## Components

### GitHubIssue
Data model representing a GitHub issue with properties:
- Issue number
- Title
- Description
- State (open/closed)
- Labels

### GitHubRepository
Handles fetching issues from a repository. Currently uses sample data for demonstration, but can be extended to use the GitHub API.

### IssueAnalyzer
Core analysis logic that evaluates whether an issue is suitable for the Copilot Coding Agent based on multiple criteria.

### CopilotAssigner
Manages the assignment of issues to Copilot and tracks which issues have been assigned.

### Main
Orchestrates the entire workflow:
1. Fetch recent issues
2. Analyze each issue
3. Assign suitable issues
4. Display summary

## Sample Issues

The application includes 10 sample issues demonstrating various scenarios:
- ✓ Issues suitable for assignment (clearly defined, good acceptance criteria)
- ✗ Issues too complex (labeled as "complex" or "major")
- ✗ Issues lacking acceptance criteria
- ✗ Closed issues
- ✗ Documentation-only tasks

## Future Enhancements

- Integration with GitHub REST API for real issue fetching
- OAuth authentication for GitHub
- Interactive mode to ask user before assigning uncertain issues
- Configuration file for customizing analysis criteria
- Support for filtering by repository, labels, or assignees
- Export assigned issues to a file or dashboard

## License

This project is for demonstration purposes as part of the Coding-Agent-Test repository.
