package opplab6;

import java.util.StringTokenizer;

public class myStrToken {
    public static void main(String[] args) {

        // StringTokenizer

        String msg ="Welcome to RMUTSV";
        StringTokenizer mytoken = new StringTokenizer(msg);
        System.out.println(mytoken.countTokens());

        while (mytoken.hasMoreElements()){
            StringBuffer myBuff = new StringBuffer(mytoken.nextToken());
            System.out.print(myBuff.reverse()+" ");
        }


    }//main

}//class
