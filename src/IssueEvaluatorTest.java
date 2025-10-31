/**
 * Test cases for the Issue Evaluator
 * Tests various scenarios to ensure correct evaluation of issue suitability
 */
public class IssueEvaluatorTest {
    
    public static void main(String[] args) {
        IssueEvaluator evaluator = new IssueEvaluator();
        int passed = 0;
        int failed = 0;
        
        System.out.println("Running IssueEvaluator Tests...\n");
        
        // Test 1: Clear feature with acceptance criteria - SUITABLE
        GitHubIssue issue1 = new GitHubIssue(
            1,
            "Add login feature",
            "Implement user login.\nAcceptance Criteria:\n- User can login\n- Invalid credentials show error",
            "open",
            new String[]{"feature"}
        );
        IssueEvaluator.Suitability result1 = evaluator.evaluateIssue(issue1);
        if (result1 == IssueEvaluator.Suitability.SUITABLE) {
            System.out.println("✓ Test 1 PASSED: Feature with acceptance criteria -> SUITABLE");
            passed++;
        } else {
            System.out.println("✗ Test 1 FAILED: Expected SUITABLE, got " + result1);
            failed++;
        }
        
        // Test 2: Investigation task - UNSUITABLE
        GitHubIssue issue2 = new GitHubIssue(
            2,
            "Investigate performance issues",
            "We should investigate what's causing slowness",
            "open",
            new String[]{"investigation"}
        );
        IssueEvaluator.Suitability result2 = evaluator.evaluateIssue(issue2);
        if (result2 == IssueEvaluator.Suitability.UNSUITABLE) {
            System.out.println("✓ Test 2 PASSED: Investigation task -> UNSUITABLE");
            passed++;
        } else {
            System.out.println("✗ Test 2 FAILED: Expected UNSUITABLE, got " + result2);
            failed++;
        }
        
        // Test 3: Bug fix with clear steps - SUITABLE
        GitHubIssue issue3 = new GitHubIssue(
            3,
            "Fix null pointer exception",
            "Bug Report:\nSteps to reproduce:\n1. Click button\n2. Error occurs\nExpected: No error\nActual: NullPointerException",
            "open",
            new String[]{"bug"}
        );
        IssueEvaluator.Suitability result3 = evaluator.evaluateIssue(issue3);
        if (result3 == IssueEvaluator.Suitability.SUITABLE) {
            System.out.println("✓ Test 3 PASSED: Bug fix with steps -> SUITABLE");
            passed++;
        } else {
            System.out.println("✗ Test 3 FAILED: Expected SUITABLE, got " + result3);
            failed++;
        }
        
        // Test 4: Architecture redesign - UNSUITABLE
        GitHubIssue issue4 = new GitHubIssue(
            4,
            "Major architecture redesign",
            "We need to redesign the entire system architecture",
            "open",
            new String[]{"architecture"}
        );
        IssueEvaluator.Suitability result4 = evaluator.evaluateIssue(issue4);
        if (result4 == IssueEvaluator.Suitability.UNSUITABLE) {
            System.out.println("✓ Test 4 PASSED: Architecture redesign -> UNSUITABLE");
            passed++;
        } else {
            System.out.println("✗ Test 4 FAILED: Expected UNSUITABLE, got " + result4);
            failed++;
        }
        
        // Test 5: Simple task without detailed criteria - UNCERTAIN
        GitHubIssue issue5 = new GitHubIssue(
            5,
            "Update documentation",
            "The README needs to be updated",
            "open",
            new String[]{"documentation"}
        );
        IssueEvaluator.Suitability result5 = evaluator.evaluateIssue(issue5);
        if (result5 == IssueEvaluator.Suitability.UNCERTAIN) {
            System.out.println("✓ Test 5 PASSED: Simple task without criteria -> UNCERTAIN");
            passed++;
        } else {
            System.out.println("✗ Test 5 FAILED: Expected UNCERTAIN, got " + result5);
            failed++;
        }
        
        // Test 6: Brainstorming discussion - UNSUITABLE
        GitHubIssue issue6 = new GitHubIssue(
            6,
            "Brainstorm new features",
            "Let's discuss what features to add",
            "open",
            new String[]{"discussion"}
        );
        IssueEvaluator.Suitability result6 = evaluator.evaluateIssue(issue6);
        if (result6 == IssueEvaluator.Suitability.UNSUITABLE) {
            System.out.println("✓ Test 6 PASSED: Brainstorming -> UNSUITABLE");
            passed++;
        } else {
            System.out.println("✗ Test 6 FAILED: Expected UNSUITABLE, got " + result6);
            failed++;
        }
        
        // Test 7: Closed issue - UNSUITABLE
        GitHubIssue issue7 = new GitHubIssue(
            7,
            "Add feature",
            "Requirements: Feature should work",
            "closed",
            new String[]{"feature"}
        );
        IssueEvaluator.Suitability result7 = evaluator.evaluateIssue(issue7);
        if (result7 == IssueEvaluator.Suitability.UNSUITABLE) {
            System.out.println("✓ Test 7 PASSED: Closed issue -> UNSUITABLE");
            passed++;
        } else {
            System.out.println("✗ Test 7 FAILED: Expected UNSUITABLE, got " + result7);
            failed++;
        }
        
        // Test 8: Exploratory task - UNSUITABLE
        GitHubIssue issue8 = new GitHubIssue(
            8,
            "Explore optimization options",
            "Need to explore different approaches for optimization",
            "open",
            new String[]{"enhancement"}
        );
        IssueEvaluator.Suitability result8 = evaluator.evaluateIssue(issue8);
        if (result8 == IssueEvaluator.Suitability.UNSUITABLE) {
            System.out.println("✓ Test 8 PASSED: Exploratory task -> UNSUITABLE");
            passed++;
        } else {
            System.out.println("✗ Test 8 FAILED: Expected UNSUITABLE, got " + result8);
            failed++;
        }
        
        // Test 9: Clear implementation with requirements - SUITABLE
        GitHubIssue issue9 = new GitHubIssue(
            9,
            "Implement validation",
            "Add form validation.\nRequirements:\n- Email must be valid\n- Password must be 8+ chars",
            "open",
            new String[]{"feature"}
        );
        IssueEvaluator.Suitability result9 = evaluator.evaluateIssue(issue9);
        if (result9 == IssueEvaluator.Suitability.SUITABLE) {
            System.out.println("✓ Test 9 PASSED: Implementation with requirements -> SUITABLE");
            passed++;
        } else {
            System.out.println("✗ Test 9 FAILED: Expected SUITABLE, got " + result9);
            failed++;
        }
        
        // Test 10: Simple fix without context - UNCERTAIN
        GitHubIssue issue10 = new GitHubIssue(
            10,
            "Fix typo",
            "There's a typo that needs to be fixed",
            "open",
            new String[]{"bug"}
        );
        IssueEvaluator.Suitability result10 = evaluator.evaluateIssue(issue10);
        if (result10 == IssueEvaluator.Suitability.UNCERTAIN) {
            System.out.println("✓ Test 10 PASSED: Simple fix without context -> UNCERTAIN");
            passed++;
        } else {
            System.out.println("✗ Test 10 FAILED: Expected UNCERTAIN, got " + result10);
            failed++;
        }
        
        // Summary
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Test Results:");
        System.out.println("  Passed: " + passed);
        System.out.println("  Failed: " + failed);
        System.out.println("  Total:  " + (passed + failed));
        System.out.println("=".repeat(50));
        
        if (failed == 0) {
            System.out.println("\n✓ All tests passed!");
            System.exit(0);
        } else {
            System.out.println("\n✗ Some tests failed!");
            System.exit(1);
        }
    }
}
