package src.hw11;

public class Task {

    public static int checkFileExtension(String fileName) throws InvalidFileException {
        if (fileName == null || fileName.isEmpty()) {
            throw new InvalidFileException("File name is null or empty.");
        } else if (fileName.endsWith(".java")) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        try {
            Student student1 = new Student("Mike", new String[]{"code.java", "homework.txt", "program.c", "report.pdf", "assignment.py"});
            Student student2 = new Student("Kevin", new String[]{"code.java", null, "program.java", "report.pdf", "assignment.py"});
            Student student3 = new Student("Alice", new String[]{"code.java", "homework.java", "program.java", "report.java", "assignment.java"});
            Student student4 = new Student("John", new String[]{"code.java", "", "program.java", "report.java", "assignment.java"});

            Student[] students = {student1, student2, student3, student4};

            for (Student student : students) {
                for (String file : student.getFiles()) {
                    try {
                        int points = checkFileExtension(file);
                        student.updateScore(points);
                    } catch (InvalidFileException e) {
                        System.out.printf("Error for student %s: %s%n", student.getName(), e.getMessage());
                        student.updateScore(-1);
                    }
                }
                System.out.printf("Student %s scored %d points.%n", student.getName(), student.getScore());
            }
        } catch (Exception e) {
            System.out.printf("An error occurred: %s%n", e.getMessage());
        }
    }

}
