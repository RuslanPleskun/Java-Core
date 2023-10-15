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
        return this.score;
    }

    public String getName() {
        return name;
    }

    public void updateScore(int points) {
        this.score += points;
    }

    public String[] getFiles() {
        return files;
    }
}
