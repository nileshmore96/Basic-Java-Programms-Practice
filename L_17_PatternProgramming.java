package Java_Basics;
/*

 *
 * *
 * * *
 * * * *
 * * * * *


  */
public class L_17_PatternProgramming {

    public static void main(String[] args) {
        m1();

        for (int i = 1; i <= 5; i++) { // Rows

            for (int j = 1; j <= i; j++) {  // Coloum

                //for (int j = 5; j >= i; j--) {  // upside down reverse condition

                System.out.print("* ");
            }
            System.out.println();

        }
    }
        public static void m1 () {
            int n = 5;
            //Outer Loop for number of Rows
            for (int i = 0; i < n; i++) {
                // Inner loop for printing '*' in each column.
                for (int j = 0; j < n; j++) {
                    // We add two spaces to match shape of a square.
                    System.out.print("*  ");
                }
                System.out.println();
            }
        }
    }