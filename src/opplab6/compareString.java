package opplab6;

public class compareString {
    public static void main(String[] args) {

        //compare string
        String m = "Helloooooooo ";
        String n = "Hello";
        //type 1 (==)
        if (m==n)System.out.println("yes.");
        else System.out.println("no.");

        //type 2 (equal())
        if (m.equals(n))System.out.println("yes.");
        else System.out.println("no.");

        //type (compareTo())
        if (m.compareTo(n)==0)System.out.println("yes.");
        else if (m.compareTo(n)>=1)
            System.out.println("no.+");
        else System.out.println("no.-");


    }//main

}//class
