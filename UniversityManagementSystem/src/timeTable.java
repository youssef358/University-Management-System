import java.util.ArrayList;

public class timeTable {
    private ArrayList<Pair> courses;
    public timeTable(){
        this.courses = new ArrayList<Pair>();
    }
    public void add(Course c, String d){
        Pair p = new Pair(c,d);
        this.courses.add(p);
    }

    public void showTimeTable(){
        for(Pair p : this.courses){
            System.out.println("Course: " + p.getCourse().getName() + " Day: " + p.getDay());
        }
    }

    public void remove(Course c){
        for(Pair p : this.courses){
            if(p.getCourse().getName() == c.getName()){
                this.courses.remove(p);
            }
        }
    }


}



class Pair{
    private Course course;
    private String day;
    public Pair(Course c, String d){
        this.course = c;
        this.day = d;
    }
    public Course getCourse(){
        return this.course;
    }
    public String getDay() {
        return this.day;
    }
}