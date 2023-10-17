package src.hw8;

public class Demo {
    public static void main(String[] args) {
        Person[] people = new Person[10];

        people[0] = new Person("John", "Doe", 25, "Male");
        people[1] = new Person("Jane", "Smith", 32, "Female");
        people[2] = new Person("Mike", "Johnson", 40, "Male");

        people[3] = new Student("Alice", "Brown", 20, "Female", 85.5);
        people[4] = new Student("Bob", "Wilson", 22, "Male", 92.0);
        people[5] = new Student("Eve", "Jones", 19, "Female", 78.0);

        people[6] = new Lector("David", "White", 45, "Male", 150.0);
        people[7] = new Lector("Sarah", "Miller", 28, "Female", 130.0);
        people[8] = new Lector("Michael", "Davis", 35, "Male", 140.0);

        for (Person person : people) {
            if (person instanceof Student) {
                ((Student) person).showStudentInfo();
            } else if (person instanceof Lector) {
                ((Lector) person).showLectorInfo();
            } else if (person != null) {
                person.showPersonInfo();
            }
        }

        double overtimeHours = 4.0;
        for (Person person : people) {
            if (person instanceof Lector) {
                double overtimePay = ((Lector) person).calculateOvertime(overtimeHours);
                System.out.printf("%s %s: Overtime Pay: %.2f%n", person.getFirstName(), person.getLastName(), overtimePay);
            }
        }
    }
}
