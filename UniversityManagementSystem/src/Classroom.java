import java.util.ArrayList;

public class Classroom {
    private int classroomNumber;
    private int capacity;
    private ArrayList<Course> courses;

    public Classroom(int classroomNumber, int capacity) {
        this.classroomNumber = classroomNumber;
        this.capacity = capacity;
        this.courses = new ArrayList<Course>();
    }

    public int getClassroomNumber() {
        return this.classroomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addCourse(Course c) {
        this.courses.add(c);
    }

    public void removeCourse(Course c) {
        this.courses.remove(c);
    }

    public void showClassroom() {
        System.out.println("Classroom Number: " + this.classroomNumber);
        System.out.println("Classroom Capacity: " + this.capacity);
        System.out.println("Courses: ");
        for (Course c : this.courses) {
            c.showCourse();
        }
    }
}


