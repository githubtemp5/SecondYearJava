package lab2;

import java.util.ArrayList;

/**
 *
 * @author up826133
 */
public class Course {

    private String courseName;
    private ArrayList<Student> Students;
    private int noOfStudents;

    public Course(String _courseName) {
        Students = new ArrayList<Student>();
        courseName = _courseName;
        noOfStudents = 0;
    }

    public void addStudent(Student stud) {
        Students.add(stud);
        updateNoOfStudents();
    }

    public void addStudent(ArrayList<Student> _stud) {
        Students.addAll(_stud);
        updateNoOfStudents();
    }

    private void updateNoOfStudents() {
        noOfStudents = Students.size();
    }

    public void removeStudent(Student stud) {
        /* Student tempToRemove = new Student();
        for(Student tempStud : Students){
            if(stud == tempStud){
                tempToRemove = tempStud;
            }
        }
     
        tempToRemove.printOut();*/
        Students.remove(stud);
        //System.out.println("Student Removed.");

        updateNoOfStudents();

    }

    public void removeStudent(ArrayList<Student> studs) {
        ArrayList<Student> studsToRemove = new ArrayList<Student>();
        for (Student stud : studs) {
            if (Students.contains(stud)) {
                studsToRemove.add(stud);
            }
        }
        for (Student stud : studsToRemove) {
            stud.printOut();
            Students.remove(stud);

        }
        System.out.println("Students Removed.");

        updateNoOfStudents();
    }

    public void changeCourse(Course newCourse, Student stud) {
        if (Students.contains(stud)) {
            this.removeStudent(stud);
            newCourse.addStudent(stud);
        } else {
            System.out.println("Student not found in the course.");
        }
    }

    public double courseAverage() {
        double courseAvScore = 0;
        for (Student currStudent : Students) {
            courseAvScore += currStudent.avScore();
        }
        courseAvScore /= Students.size();

        return courseAvScore;
    }

    public int getNoOfStudents() {
        return Students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void printAllStudentInfo() {
        for (Student st : Students) {
            st.printOut();
        }
    }

    public void printAllStudentsName() {
        for (Student st : Students) {
            System.out.println(st.getName());
        }
    }

    public void printHighestScorerInfo(){
        Student highestScorer = new Student();
        highestScorer = Students.get(0);
        for (Student temp : Students) {
            if (temp.avScore() > highestScorer.avScore()) {
                highestScorer = temp;
            }
        }
        highestScorer.printOut();
    }

    public void printCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Enrolled student(s) count: " + noOfStudents);
        System.out.println("Average Course Marks: " + this.courseAverage());
        System.out.println("Enrolled Student(s): ");
        this.printAllStudentsName();
        System.out.println("Highest Scorer: ");
        this.printHighestScorerInfo();
        System.out.println();

    }
}
