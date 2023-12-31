import java.util.ArrayList;

public class Exam {
    private Subject subject;
    private int AverageMark;
    private ArrayList<Level> levels;

    public Exam(Subject subject, int mark, Level level){
        this.subject = subject;
        this.AverageMark = mark;
        this.levels = new ArrayList<Level>();
    }

    public Subject getSubject(){
        return this.subject;
    }

    public int getMark(){
        return this.AverageMark;
    }

    public ArrayList<Level> getLevel(){
        return this.levels;
    }

    public void showExam(){
        System.out.println("Exam subject: " + this.subject.getSubjectName());
        System.out.println("Exam average mark: " + this.AverageMark);
        for (Level l : this.levels){
            System.out.println("Exam level: " + l.getLevelNumber() + l.getLevelSpeciality());
        }
    }



}
