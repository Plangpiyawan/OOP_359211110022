package ooplab2;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators;

public class TestVariable {

    public static void main(String[] args) {
//        Integer
        int i;
        i = 10;
        System.out.println("i=" + i);
        int j = 20;
        System.out.println("j=" + j);
        System.out.println("i+j" + (i + j));

//        Double
        double v;
        v = 5.5;
        System.out.println("v=" + v);
        i = (int) v;
        System.out.println("i= " + i);
//                char
        char c = 'X';
        System.out.println("c=" + c);
//        String
                String s;
        String S1 = "Hello world";
        System.out.println(S1+"I'm PLANG");
        int X = S1.length();
        System.out.println("x="+X);
        System.out.println(S1.toUpperCase());
        System.out.println(S1.toLowerCase());
        System.out.println(S1.concat("piyawan"));

//        String to int
        String number = "50";
        int y = Integer.parseInt(number);
        System.out.println(y);
//        Boolean

        boolean b = true;
        System.out.println(b);
        b=false;
        System.out.println(b);

//        Short cut Operators
        int Z = 10;
        int t = ++Z;
        System.out.println(Z);
        System.out.println(t);





    }


}//class
