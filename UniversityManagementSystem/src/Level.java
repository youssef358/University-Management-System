import java.util.ArrayList;

public class Level {
    private int levelId;
    private int levelNumber;
    private String levelSpeciality;
    private int levelDuration;
    private ArrayList<Course> courses;
    private ArrayList<Exam> exams;
    private ArrayList<Student> students;

    public Level(int levelId, int levelNumber, String levelSpeciality, int levelDuration){
        this.levelId = levelId;
        this.levelNumber = levelNumber;
        this.levelSpeciality = levelSpeciality;
        this.levelDuration = levelDuration;
        this.courses = new ArrayList<Course>();
        this.exams = new ArrayList<Exam>();
        this.students = new ArrayList<Student>();
    }

    public int getLevelId(){
        return this.levelId;
    }

    public int getLevelNumber(){
        return this.levelNumber;
    }

    public String getLevelSpeciality(){
        return this.levelSpeciality;
    }

    public int getLevelDuration(){
        return this.levelDuration;
    }

    public ArrayList<Course> getCourses(){
        return this.courses;
    }

    public ArrayList<Exam> getExams(){
        return this.exams;
    }

    public ArrayList<Student> getStudents(){
        return this.students;
    }

    public void addCourse(Course c){
        this.courses.add(c);
    }

    public void removeCourse(Course c){
        this.courses.remove(c);
    }

    public void addExam(Exam e){
        this.exams.add(e);
    }

    public void removeExam(Exam e){
        this.exams.remove(e);
    }

    public void addStudent(Student s){
        this.students.add(s);
    }

    public void removeStudent(Student s){
        this.students.remove(s);
    }

    public void showLevel(){
        System.out.println("Level ID: " + this.levelId);
        System.out.println("Level Number: " + this.levelNumber);
        System.out.println("Level Speciality: " + this.levelSpeciality);
        System.out.println("Level Duration: " + this.levelDuration);
        System.out.println("Courses: ");
        for(Course c : this.courses){
            c.showCourse();
        }
        System.out.println("Exams: ");
        for(Exam e : this.exams){
            e.showExam();
        }
        System.out.println("Students: ");
        for(Student s : this.students){
            s.showStudent();
        }
    }
}
