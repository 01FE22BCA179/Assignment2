/**
 * The Student class in Java represents a student with a name and date of birth, and provides methods
 * to display the student's name and age.
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * The Student class extends the StudentCourse class and has properties for name and date of birth, as
 * well as a method to display the student's name.
 */
public class Student extends StudentCourse {
    public String name;
    public String dob;

    /**
     * The function "displayName" prints the name of a student.
     */
    public void displayName() {
        System.out.println("Student Name: " + name);
    }

   /**
    * The function takes a date of birth as input and calculates the age of a student in years.
    * 
    * @param dob The parameter "dob" stands for "date of birth". It is a string that represents the
    * date of birth of a student in the format "dd-MM-yyyy".
    */
    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of student: " + age +"years");


    }

    /**
     * The main function creates a new Student object, sets the name, and calls methods to display the
     * name and age of the student.
     */
    public static void main(String[] args) {
        Student s=new Student();
        // StudentCourse s1 = new StudentCourse();
        s.name = "Sangeetha.M";
        s.displayName();
        s.displayAge("09-02-2004");
        // s1.displayStudentcourses();
        // s1.displayStudentMarks();

    }
}