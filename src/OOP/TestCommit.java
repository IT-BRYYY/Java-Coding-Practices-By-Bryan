package OOP;

// TestCommit.java - Main program
public class TestCommit {
    public static void main(String[] args) {
        // Create a commit message
        CommitMessage commit = new CommitMessage("Fixed bug in calculator", "Daniel");
        commit.display();
    }
}