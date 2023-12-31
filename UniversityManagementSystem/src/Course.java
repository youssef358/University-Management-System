import java.util.ArrayList;

public class Course {
    private String name;
    private int numberOfStudents;
    private Teacher teacher;
    private ArrayList<Student> students;
    private Subject subject;
    private int PresenceMark;
    private Classroom classroom;

    public Course(String name, int numberOfStudents, Teacher teacher, Subject subject, int PresenceMark, Classroom classroom) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.teacher = teacher;
        this.subject = subject;
        this.students = new ArrayList<Student>();
        this.PresenceMark = PresenceMark;
        this.classroom = classroom;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfStudents() {
        return this.numberOfStudents;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public Subject getSubject() {
        return this.subject;
    }

    public int getPresenceMark() {
        return this.PresenceMark;
    }

    public Classroom getClassroom() {
        return this.classroom;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    public void showCourse() {
        System.out.println("Course name: " + this.name);
        System.out.println("Number of students: " + this.numberOfStudents);
        System.out.println("Teacher: " + this.teacher.getName());
        System.out.println("Subject: " + this.subject.getSubjectName());
        System.out.println("Students: ");
        for (Student student : this.students) {
            System.out.println(student.getName());
        }
    }



}

