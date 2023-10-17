package src.hw8;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public void showPersonInfo() {
        System.out.printf("First Name: %s%n", firstName);
        System.out.printf("Last Name: %s%n", lastName);
        System.out.printf("Age: %d%n", age);
        System.out.printf("Gender: %s%n", gender);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
