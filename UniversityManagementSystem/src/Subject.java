public class Subject {
    protected int subjectID;
    protected String subjectName;
    protected int subjectHours;
    protected int subjectCoefficient;
    public Subject(int id , String name , int hours , int coefficient){
        this.subjectID = id;
        this.subjectName = name;
        this.subjectHours = hours;
        this.subjectCoefficient = coefficient;
    }
    public int getSubjectID(){
        return this.subjectID;
    }
    public String getSubjectName(){
        return this.subjectName;
    }
    public int getHours(){
        return this.subjectHours;
    }
    public int getCoefficient(){
        return this.subjectCoefficient;
    }
    public void showSubject(){
        System.out.println("Subject ID: " + this.subjectID);
        System.out.println("Subject Name: " + this.subjectName);
        System.out.println("Subject Hours: " + this.subjectHours);
        System.out.println("Subject Coefficient: " + this.subjectCoefficient);
    }
}
