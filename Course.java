
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private int marks;

    public Course(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getMarks() {
        return marks;
    }
}

class Semester {
    private int semesterNumber;
    private List<Course> courses;

    public Semester(int semesterNumber) {
        this.semesterNumber = semesterNumber;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displaySemesterInfo() {
        System.out.println("Semester " + semesterNumber + ":");
        for (Course course : courses) {
            System.out.println("  Course: " + course.getCourseName() + ", Marks: " + course.getMarks());
        }
    }
}

public class StudentCourse {
    public static void main(String[] args) {
        Semester sem1 = new Semester(1);
        sem1.addCourse(new Course("Mathematics", 85));
        sem1.addCourse(new Course("Computer Science", 90));
        sem1.addCourse(new Course("English", 78));

        Semester sem2 = new Semester(2);
        sem2.addCourse(new Course("Data Structures", 88));
        sem2.addCourse(new Course("Operating Systems", 82));
        sem2.addCourse(new Course("Physics", 75));

        System.out.println("Student Course Information:");
        sem1.displaySemesterInfo();
        sem2.displaySemesterInfo();
    }
    
}
