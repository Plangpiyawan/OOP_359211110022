package ooplab9;

public class PersonApp {

    public static void main(String[] args) {
        Person person = new Person("Kwang", "1234",
                new Address("123/123","Suratthani","84000"),
                new Job("IT", "50000"));

        System.out.println(person.toString());

        person.getJob().setSalary("30000");

        System.out.println(person.toString());
    }

}
