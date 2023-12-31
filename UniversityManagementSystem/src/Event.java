import java.util.ArrayList;

public class Event {
    protected String title;
    protected String date;
    protected String place;
    protected Club OrganizingClub;
    protected ArrayList<Person> attendees;

    public Event(String title, String date, String place, Club OrganizingClub){
        this.title = title;
        this.date = date;
        this.place = place;
        this.OrganizingClub = OrganizingClub;
        this.attendees = new ArrayList<Person>();
    }

    public String getTitle(){
        return this.title;
    }

    public String getDate(){
        return this.date;
    }

    public String getPlace(){
        return this.place;
    }

    public Club getOrganizingClub(){
        return this.OrganizingClub;
    }

    public ArrayList<Person> getAttendees(){
        return this.attendees;
    }

    public void addAttendee(Person p){
        this.attendees.add(p);
    }

    public void removeAttendee(Person p){
        this.attendees.remove(p);
    }

    public void showEvent(){
        System.out.println("Event Title: " + this.title);
        System.out.println("Event Date: " + this.date);
        System.out.println("Event Place: " + this.place);
        System.out.println("Event Organizing Club: " + this.OrganizingClub.getName());
        System.out.println("Event Attendees: ");
        for(Person p : this.attendees){
            if (p instanceof Student){
                Student s = (Student) p;
                s.showStudent();
            }
            else if (p instanceof Teacher){
                Teacher t = (Teacher) p;
                t.showTeacher();
            }
            else{
                Employee e = (Employee) p;
                e.showEmployee();
            }
        }
    }
}
