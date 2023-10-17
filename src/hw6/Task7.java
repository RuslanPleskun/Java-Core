package src.hw6;

public class Task7 {
    public static void main(String[] args) {
        String[] ssnList = {"7523169263", "8032056031", "99001011010"};
        for (String ssn : ssnList) {
            String result = validateBulgarianSSN(ssn);
            System.out.println(ssn + " — " + result);
        }
    }

    public static String validateBulgarianSSN(String ssn) {
        if (ssn.length() != 10) {
            return "invalid";
        }
        int year = Integer.parseInt(ssn.substring(0, 2));
        int month = Integer.parseInt(ssn.substring(2, 4));
        int day = Integer.parseInt(ssn.substring(4, 6));
        int genderNumber = Integer.parseInt(ssn.substring(8, 9));

        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        if (month > 40) {
            month -= 40;
            year += 2000;
        } else if (month > 20) {
            month -= 20;
            year += 1800;
        } else {
            year += 1900;
        }
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return "invalid";
        }
        String gender = (genderNumber % 2 == 0) ? "a male" : "a female";
        String dayString = String.valueOf(day);
        String monthString = monthNames[month - 1];
        String yearString = String.valueOf(year);

        String birthdate = dayString + " " + monthString + " " + yearString;
        return ssn + " — " + gender + ", born on " + birthdate;
    }
}
