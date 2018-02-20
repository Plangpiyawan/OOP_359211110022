package ooplab9;

public class Job {

    private String Position;
    private String Salary;

    public Job (String Position, String Salary) {
        this.Position = Position;
        this.Salary = Salary;

    }
    //toString

    @Override
    public String toString() {
        return "Job{" +
                "Position='" + Position + '\'' +
                ", Salary='" + Salary + '\'' +
                '}';
    }
    //getter and setter method

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

}