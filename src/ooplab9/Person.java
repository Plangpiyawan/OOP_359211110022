package ooplab9;

public class Person {

    private String Name;
    private String Personid;
    private Address Address;
    private Job Job;

    public Person (String Name, String Personid, Address Address, Job Job) {
        this.Name = Name;
        this.Personid = Personid;
        this.Address = Address;
        this.Job = Job;
    }
    //toString

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Person ID='" + Personid + '\'' +
                ", Address='" + Address + '\'' +
                ", Job=" + Job +
                '}';
    }
    //getter and setter method

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPersonid() {
        return Personid;
    }

    public void setPersonid(String Personid) {
        this.Personid = Personid;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address Address) {
        this.Address = Address;
    }

    public Job getJob() {
        return Job;
    }

    public void setJob(Job Job) {
        this.Job = Job;
    }

}