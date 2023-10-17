package src.hw8;

public class Student extends Person {
    private double grade;

    public Student(String firstName, String lastName, int age, String gender, double grade) {
        super(firstName, lastName, age, gender);
        this.grade = grade;
    }

    public void showStudentInfo() {
        super.showPersonInfo();
        System.out.printf("Grade: %.2f%n", grade);
    }
}
