// Student.java

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student {
    private String name;
    private LocalDate dateOfBirth;

    public Student(String name, String dob) {
        this.name = name;
        // Accepts DOB in format: DD-MM-YYYY
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.dateOfBirth = LocalDate.parse(dob, formatter);
    }

    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + calculateAge() + " years");
    }

    public static void main(String[] args) {
        // Example usage
        Student student = new Student("Abhishek Pagadi", "08-06-2002");
        student.displayStudentInfo();
    }
}
