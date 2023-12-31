import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person{
    private timeTable timeTable;
    private ArrayList<Club> clubs;
    private ArrayList<Group> groups;
    private Level level;
    private int mark;

    private ArrayList <Exam> exams;

    public Student(int ID, String firstName, String lastName, timeTable timeTable, ArrayList<Club> clubs, ArrayList<Group> groups, Level level){
        super(ID, firstName, lastName);
        this.timeTable = timeTable;
        this.clubs = clubs;
        this.groups = groups;
        this.level = level;
        this.level.addStudent(this);
        this.mark = 0;
    }

    public timeTable getTimeTable(){
        return(this.timeTable);
    }

    public ArrayList<Club> getClubs(){
        return(this.clubs);
    }

    public ArrayList<Group> getGroups(){
        return(this.groups);
    }

    public Level getLevel(){
        return(this.level);
    }

    public void joinClub(Club c){
        for(Student s : c.getStudents()){
            if(s.getID() == this.getID()){
                System.out.println("Student already in club");
                return;
            }
        }
    }

    public void joinGroup(Group g){
        for (Student s : g.getStudents()){
            if(s.getID() == this.getID()){
                System.out.println("Student already in group");
                return;
            }
        }

    }
    public void joinCourse(Course c){
        for (Student s : c.getStudents()){
            if(s.getID() == this.getID()){
                System.out.println("Student already in course");
                return;
            }
        }
        this.mark += c.getPresenceMark();
    }

    public void passExam(Exam e){
        for (Level l : e.getLevel()){
            if(l.getLevelId() == this.level.getLevelId()){
                this.mark += e.getMark();
                return;
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark: ");
        int mark = sc.nextInt();
        this.mark += mark;
    }

    public void showStudent(){
        System.out.println("Student ID: " + this.ID);
        System.out.println("Student Name: " + this.firstName + " " + this.lastName);
        System.out.println("Student TimeTable: ");
        System.out.println("Student Level: " + this.level.getLevelNumber() + this.level.getLevelSpeciality());
        this.timeTable.showTimeTable();
        System.out.println("Student Clubs: ");
        for(Club c : this.clubs){
            c.showClub();
        }
        System.out.println("Student Groups: ");
        for (Group g : this.groups){
            g.showGroup();
        }
    }


}
