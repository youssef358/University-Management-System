import java.util.ArrayList;

public class Club {
    private String name;
    private int ClubID;
    private int foundationYear;
    private String Activity;
    private ArrayList<Student> students;

    public Club(String name, int ClubID, int foundationYear, String Activity){
        this.name = name;
        this.ClubID = ClubID;
        this.foundationYear = foundationYear;
        this.Activity = Activity;
        this.students = new ArrayList<Student>();
    }

    public String getName(){
        return this.name;
    }

    public int getClubID(){
        return this.ClubID;
    }

    public int getFoundationYear(){
        return this.foundationYear;
    }

    public String getActivity(){
        return this.Activity;
    }

    public void addStudent(Student s){
        this.students.add(s);
    }

    public void removeStudent(Student s){
        this.students.remove(s);
    }

    public void showClub(){
        System.out.println("Club Name: " + this.name);
        System.out.println("Club ID: " + this.ClubID);
        System.out.println("Club Foundation Year: " + this.foundationYear);
        System.out.println("Club Activity: " + this.Activity);
        System.out.println("Club Students: ");
        for(Student s : this.students){
            s.showStudent();
        }
    }


    public ArrayList<Student> getStudents() {
        return this.students;
    }
}
