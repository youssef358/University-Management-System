import java.util.ArrayList;

public class Group {
    private int groupId;
    private String groupName;
    private ArrayList<Student> students;

    public Group(int groupId, String groupName){
        this.groupId = groupId;
        this.groupName = groupName;
        this.students = new ArrayList<Student>();
    }

    public int getGroupId(){
        return this.groupId;
    }

    public String getGroupName(){
        return this.groupName;
    }

    public ArrayList<Student> getStudents(){
        return this.students;
    }

    public void addStudent(Student s){
        this.students.add(s);
    }

    public void removeStudent(Student s){
        this.students.remove(s);
    }

    public void showGroup(){
        System.out.println("Group ID: " + this.groupId);
        System.out.println("Group Name: " + this.groupName);
        System.out.println("Students: ");
        for(Student s : this.students){
            s.showStudent();
        }
    }


}
