package ooplab7;

public class StudentApp {
    public static void main(String[] args) {
        //create object as Student
        student s1 = new student();
        s1.setId("111111111111");
        s1.setname("Boy Saiyai");
        s1.setmajor("Information System");
        s1.setgroup("IS221");

        student s2 =new student("222222222222",
                "Gril Saiyai",
                "Maketing",
                "MK221");

        showData (s1);

    }//main

    private static void showData(student s) {
        System.out.println("stendent info");
        System.out.println("ID: "+s.getId());
        System.out.println("Name: "+s.getname());
        System.out.println("Major:"+s.getmajor());
        System.out.println("Group:"+s.getgroup());

    }//showData

}//class
