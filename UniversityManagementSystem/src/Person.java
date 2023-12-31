public class Person {
    public int ID;
    public String firstName;
    public String lastName;
    public Person(int id , String fn , String ln){
        this.ID = id;
        this.firstName = fn;
        this.lastName = ln;
    }

    public void joinEvent(Event e){
        if (e.getAttendees().contains(this)){
            System.out.println("You are already participating in this event");
        }
        else{
            e.addAttendee(this);
        }
    }
    public int getID(){
        return(this.ID);
    }
    public String getFirstName(){
        return(this.firstName);
    }
    public String getLastName(){
        return(this.lastName);
    }

    public String getName(){
        return(this.firstName + " " + this.lastName);
    }


}
