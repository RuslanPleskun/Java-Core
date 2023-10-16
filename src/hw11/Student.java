package src.hw11;

public class Student {
    private String name;
    private String[] files;
    private int score;

    public Student(String name, String[] files) {
        this.name = name;
        this.files = files;
        this.score = 0;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void updateScore(int points) {
        score += points;
    }

    public String[] getFiles() {
        return files;
    }

    public int checkFileExtension(String fileName) throws InvalidFileException {
        if (fileName == null || fileName.isEmpty()) {
            throw new InvalidFileException("File name is null or empty.");
        } else if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }
}
