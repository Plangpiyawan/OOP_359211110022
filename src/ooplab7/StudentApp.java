package ooplab7;

import java.util.Scanner;

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
        showData(s2);

        student s3 = new student();
        s3= inputData(s3);

    }//main

    private static student inputData(student s) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter studen info");
        System.out.print("Enter studen ID:");
        s.setId(scanner.nextLine());
        System.out.print("Enter studen name");
        s.setname (scanner.nextLine());
        System.out.print("Enter studen Major:");
        s.setmajor(scanner.nextLine());
        System.out.print("Enter studen group:");
        s.setgroup(scanner.nextLine());

        return s;


    }

    private static void showData(student s) {
        System.out.println("stendent info");
        System.out.println("ID: "+s.getId());
        System.out.println("Name: "+s.getname());
        System.out.println("Major:"+s.getmajor());
        System.out.println("Group:"+s.getgroup());

    }//showData

}//class
