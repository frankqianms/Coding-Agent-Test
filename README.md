# GitHub Copilot Issue Assignment Tool

A Java application that helps identify and assign suitable GitHub issues to the Copilot Coding Agent for autonomous work.

## Overview

This tool automates the process of reviewing GitHub issues and determining which ones are appropriate for assignment to an AI Coding Agent. It evaluates issues based on:

- **Clarity**: Is the issue clearly defined as a coding task?
- **Acceptance Criteria**: Does the issue have clear requirements or acceptance criteria?
- **Complexity**: Is the issue low to medium complexity (not high complexity like architecture redesigns)?

## Features

- **Automated Issue Retrieval**: Fetches the most recent issues from a specified GitHub repository
- **Intelligent Evaluation**: Uses heuristics to determine issue suitability
- **User Confirmation**: Asks for user input on uncertain issues before assignment
- **Batch Processing**: Evaluates and assigns multiple issues in one run
- **Detailed Reporting**: Provides summary statistics of the assignment process

## Components

### GitHubClient
Handles communication with GitHub API for:
- Listing recent issues from a repository
- Assigning Copilot to specific issues

### IssueEvaluator
Evaluates issues for suitability based on:
- Presence of coding task indicators (implement, add, fix, etc.)
- Presence of acceptance criteria (requirements, should, must, expected behavior)
- Absence of vague terms (investigate, research, explore, brainstorm)
- Absence of high complexity indicators (architecture, redesign, migration)

### GitHubIssue
Data model representing a GitHub issue with:
- Issue number
- Title
- Description/body
- State (open/closed)
- Labels

### Main
Orchestrates the workflow:
1. Retrieves recent issues
2. Evaluates each issue
3. Assigns suitable issues automatically
4. Requests user confirmation for uncertain issues
5. Skips unsuitable issues
6. Provides summary report

## Usage

### Compilation

```bash
cd src
javac *.java
```

### Running

```bash
java Main
```

The application will:
1. Fetch the 10 most recent issues
2. Evaluate each issue
3. For SUITABLE issues: Automatically assign to Copilot
4. For UNCERTAIN issues: Ask for user confirmation
5. For UNSUITABLE issues: Skip assignment
6. Display a summary of actions taken

### Interactive Mode

When an uncertain issue is encountered, the application will prompt:

```
⚠ Uncertain - requesting user confirmation...
Assign this issue to Copilot? (y/n): 
```

Enter `y` or `yes` to assign, or `n` or `no` to skip.

## Evaluation Criteria

### SUITABLE Issues
Issues that are automatically assigned:
- Have clear coding task indicators (implement, add, fix, create, etc.)
- Have acceptance criteria or clear requirements
- Are not high complexity
- Are not vague or exploratory

**Examples:**
- "Add user authentication with login form and password validation"
- "Fix NullPointerException in UserService with steps to reproduce"
- "Implement search functionality with defined acceptance criteria"

### UNCERTAIN Issues
Issues that require user review:
- Have coding task indicators
- Lack clear acceptance criteria
- Are not vague or high complexity

**Examples:**
- "Update documentation" (clear task but needs more specific requirements)
- "Add validation to form" (clear but could use more detail)

### UNSUITABLE Issues
Issues that are automatically skipped:
- Investigation or research tasks
- Discussion or brainstorming sessions
- High complexity architecture changes
- Vague or exploratory tasks
- Already closed issues

**Examples:**
- "Investigate performance issues"
- "Brainstorm ideas for new features"
- "Major architecture redesign for scalability"
- "Should we consider optimizing database queries?"

## Configuration

In a production implementation, configure the following:

```java
String owner = "your-github-org";        // GitHub organization/owner
String repo = "your-repo-name";          // Repository name
String token = System.getenv("GITHUB_TOKEN"); // GitHub API token
```

## Future Enhancements

- Integration with actual GitHub REST API
- Configuration file support (JSON/YAML)
- Command-line argument parsing
- Support for custom evaluation criteria
- Machine learning-based issue classification
- Support for GitHub GraphQL API
- Batch assignment with rate limiting
- Issue preview before assignment
- Assignment rollback functionality

## License

This is a demonstration project for GitHub Copilot issue assignment workflows.
