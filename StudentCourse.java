/**
 * The StudentCourse class stores an array of courses and an array of marks obtained by a student, and
 * provides methods to display the courses and marks.
 */
class StudentCourse {
    private String[] courses = { "C#", "Software Testing ", "Machine Learning", "DEVOPS", "Minor Project" };
    private int[] marks = { 88, 92, 95, 98, 91 };

/**
 * The function "displayStudentcourses" prints out the list of student courses.
 */
    public void displayStudentcourses() {

        for (int i = 0; i < courses.length; i++) {
            System.out.println(courses[i] + "\t\t\t");
        }
    }
    /**
     * The function "displayStudentMarks" prints out the courses and marks obtained by a student.
     */
    
    public void displayStudentMarks() {

            System.out.println("Courses and  Marks Obtained");

            for (int i = 0; i < courses.length; i++) {
                System.out.println(courses[i] + " :  " + marks[i]);
            }
        }
    }
