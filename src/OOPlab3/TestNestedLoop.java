package OOPlab3;

public class TestNestedLoop {
    public static void main(String[] args) {

        //Nested Loop
        int x=1;
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                if (i==8 || j==i||j==1)
                    System.out.print("*\t");
                else {
                    System.out.print(x + "\t");
                    x++;
                }

            } //j
            System.out.println();
        }//i

    }
}