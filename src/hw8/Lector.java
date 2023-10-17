package src.hw8;

public class Lector extends Person {
    private double dailySalary;

    public Lector(String firstName, String lastName, int age, String gender, double dailySalary) {
        super(firstName, lastName, age, gender);
        this.dailySalary = dailySalary;
    }

    public void showLectorInfo() {
        super.showPersonInfo();
        System.out.printf("Daily Salary: %.2f%n", dailySalary);
    }

    public double calculateOvertime(double hours) {
        if (getAge() > 30) {
            return hours * (dailySalary / 8) * 2;
        } else {
            return 0;
        }
    }
}
