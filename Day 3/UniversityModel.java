


//Student: Has attributes like studentID (unique integer),
// name (String), major (String), coursesEnrolled (a list of Course objects),
// and gpa (double). Include methods to enroll in a course (enrollCourse()),
// drop a course (dropCourse()), and calculate the GPA (calculateGPA()).

import java.util.ArrayList;
import java.util.List;

class Student{
    private int studentID;
    private String name;
    private String major;
    private List<Course> coursesEnrolled;
    private double gpa;
    public Student(int studentID, String name, String major) {
        this.studentID = studentID;
        this.name = name;
        this.major = major;
        this.coursesEnrolled = new ArrayList<Course>();
        this.gpa = 0.0;
    }
 public void enrollCourse(Course course) {
        if(!coursesEnrolled.contains(course)){
            coursesEnrolled.add(course);
           course.addStudent(this);
            System.out.println(name +" enrolled in "+ course.getCourseName());
        }
        else{
            System.out.println(name +"is already enrolled in "+ course.getCourseName());
        }
 }
 public void dropCourse(Course course) {
        if(coursesEnrolled.contains(course)){
            coursesEnrolled.remove(course);
            course.removeStudent(this);
            System.out.println(name +" dropped" + course.getCourseName());
        }
 }

 public void calculateGPA(List<Double> grades) {

        double totalPoints = 0.0;
        int totalCredits =0;

        for(int  i=0 ;i<coursesEnrolled.size();i++){
            Course course = coursesEnrolled.get(i);
            totalPoints += grades.get(i) * course.getCredits();
            totalCredits+=course.getCredits();
        }
        this.gpa = totalPoints/totalCredits;
     System.out.println("GPA of "+ name +" is "+ this.gpa);
 }

}
//Course: Has attributes like courseCode (String, e.g., "CS101"),
//courseName (String), credits (integer), instructor (an Instructor object),
//and enrolledStudents (a list of Student objects). Include methods to add a student (addStudent())
//and remove a student (removeStudent()).
class Course{
    private String courseCode;
    private String courseName;
    private int credits;
    private Instructor instructor;
    private List<Student> enrolledStudents;


    public Course(String courseCode, String courseName, int credits, Instructor instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }
    public int getCredits() {
        return credits;
    }

    public void addStudent(Student student) {
        if(!enrolledStudents.contains(student)){
            enrolledStudents.add(student);
        }
    }
    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }


}

//Instructor: Has attributes like instructorID (unique integer),
//name (String), department (String), and coursesTaught (a list of Course objects).
//Include a method to assign a course (assignCourse()).
//Create at least two instances of each class, populate them with sample data,
//and demonstrate enrolling a student in a course, dropping a course, and calculating a
//        student's GPA (you can use placeholder grades for this calculation).
class Instructor{
   private int instructorID;
   private String name;
   private String department;
   private List<Course> coursesTaught;
   public Instructor(int instructorID, String name, String department) {
       this.instructorID = instructorID;
       this.name = name;
       this.department = department;
       this.coursesTaught = new ArrayList<>();
   }

   public void assignCourse(Course course) {
       if(coursesTaught.contains(course)==false){
           coursesTaught.add(course);
           System.out.println(name +" assigned to teach "+ course.getCourseName());
       }
   }

}


public class UniversityModel {
    public static void main(String[] args) {
        System.out.println("building university model");
        Instructor profDrSmith = new Instructor(1, "Dr Smith ", "Computer Science");
        Instructor profDrJon = new Instructor(2, "Dr Jon ", "Maths");

        Course cs101 = new Course("CS101", "Java Full Stack", 4, profDrSmith);
        Course math201 = new Course("MATH201", "Linear Algebra", 4, profDrJon);

        profDrSmith.assignCourse(cs101);
        profDrJon.assignCourse(math201);

        Student Jaspreet = new Student(101, "Jaspreet", "Computer Science");
        Student Soumya = new Student(102, "Soumya", "Maths");

       Jaspreet.enrollCourse(cs101);
       Jaspreet.enrollCourse(math201);
       Soumya.enrollCourse(math201);

     //  Jaspreet.dropCourse(math201);

      Jaspreet.calculateGPA(List.of(3.5,4.0));
      Soumya.calculateGPA(List.of(3.8));



    }
}