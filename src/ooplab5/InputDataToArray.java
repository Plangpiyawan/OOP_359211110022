package ooplab5;

import java.util.Scanner;

//1.daclare array as Integer
//2.allow user to input data into array
//3.show data in arrary
public class InputDataToArray {
    private static int MAX =5;

    public static void main(String[] args) {
        Integer []num =new Integer[MAX];
        //int []num2 =new Integer [MAX]
        num= inputDAta (num);

        showData(num);


    }//main

    private static void showData(Integer[] num) {
        //enhance loop
        for (int i : num) {
            System.out.println(i + "");
        }
        System.out.println();
    }
    private static Integer[] inputDAta(Integer[]num){
        Scanner scanner= new Scanner(System.in);

        System.out.println("please enter an integer:");
        for (int i=0;i<num.length;i++) {
            System.out.print("num[" + i + "]:");
            num[i] = scanner.nextInt();
        }
        return num ;
}//inputdata

}// class
