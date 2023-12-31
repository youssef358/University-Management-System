public class Employee extends Person{
    protected double salary;
    protected int yearOfJoining;

    public Employee(int id , String fn , String ln , double s , int yoj){
        super(id , fn , ln);
        this.salary = s;
        this.yearOfJoining = yoj;
    }

    public double getSalary(){
        return(this.salary);
    }

    public int getYearOfJoining(){
        return(this.yearOfJoining);
    }

    public void setSalary(double s){
        this.salary = s;
    }
    public void showEmployee(){
        System.out.println("Employee ID: " + this.ID);
        System.out.println("Employee Name: " + this.firstName + " " + this.lastName);
        System.out.println("Employee Salary: " + this.salary);
        System.out.println("Employee Year of Joining: " + this.yearOfJoining);
    }
}
