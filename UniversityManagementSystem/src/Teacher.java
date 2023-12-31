
import java.util.ArrayList;
public class Teacher extends Employee{
    protected Subject subject;
    protected ArrayList<Course> coursesGiven;

    public Teacher(int id , String fn , String ln , double s , int yoj , Subject sub){
        super(id , fn , ln , s , yoj);
        this.subject = sub;
        this.coursesGiven = new ArrayList<Course>();
    }

    public Subject getSubject(){
        return(this.subject);
    }

    public ArrayList<Course> getCoursesGiven(){
        return(this.coursesGiven);
    }

    public void addCourse(Course c){
        this.coursesGiven.add(c);
    }

    public void removeCourse(Course c){
        this.coursesGiven.remove(c);
    }

public void showTeacher(){
        System.out.println("Teacher ID: " + this.ID);
        System.out.println("Teacher Name: " + this.firstName + " " + this.lastName);
        System.out.println("Teacher Salary: " + this.salary);
        System.out.println("Teacher Year of Joining: " + this.yearOfJoining);
        System.out.println("Teacher Subject: " + this.subject.getSubjectName());
        System.out.println("Teacher Courses Given: ");
        for(Course c : coursesGiven){
            c.showCourse();
        }
    }
}
