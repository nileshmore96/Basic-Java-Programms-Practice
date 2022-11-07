package Java_Basics;

import java.util.Arrays;
import java.util.Scanner;

public class L_24_Arrey {
    public static void main(String[] args) {

    /*    int size, k;
        Scanner r = new Scanner(System.in);
        System.out.println("Enter size of arrey");
        size = r.nextInt();
        int m[] = new int[size];

        for (k = 0; k < size; k++) {
            m[k] = r.nextInt();
        }
        System.out.println("Printed arrey elements ");
        for (k = 0; k < size; k++) {

            System.out.println(m[k] + "");
        }
   */


        //-------------------------------------------------------------------

        int a[] = {10, 20, 30, 40, 50};    // at thirdp position --> 40
        System.out.println(a[3]);

//------------------------------------------------------------

        int b[] = new int[5];
        b[00] = 10;
        b[01] = 20;
        b[02] = 30;
        b[03] = 40;
        b[04] = 50;


        for (int i = 0; i < 4; i++)
            System.out.println(b[i]);
    }
}

//----------------------------------------------------------------

class L_24_Arrey02{

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        long array2[]={10,11,12,13};
        String array3[]={"Nilesh","More","Sparta"};
     //



        for (int i =0; i<3;i++){
            System.out.println(array3[i]+"");
        }
}

    }
class L_24_Arrey03 {
    // create an array
    public static void main(String[] args) {


    int[] age = {12, 4, 5, 2, 5};



    // access each array elements
   System.out.println("Accessing Elements of Array:");
   System.out.println("First Element: " + age[0]);
   System.out.println("Second Element: " + age[1]);
   System.out.println("Third Element: " + age[2]);
   System.out.println("Fourth Element: " + age[3]);
   System.out.println("Fifth Element: " + age[4]);
}
}
class L_24_Arrey04{

        public static void main(String[] args) {

            // create an array
            int[] age = {12, 4, 5};

            // loop through the array
            // using for loop

            System.out.println("Using for Loop:");
            for(int i = 0; i < age.length; i++) {
                System.out.print(age[i]+" ");
             //   System.out.println(age[i]);  // in line

            }
        }
    }
    class L_24_Arrey05 {
    public static void main(String[] args)
    {

        int[][] arr = new int[10][20];
        arr[0][0] = 1;

        System.out.println("arr[0][0] = " + arr[0][0]);
    }
}

class L_24_Arrey06{

    public static void main(String[] args) {
        int size , i;
        Scanner r= new Scanner(System.in);
        System.out.println("Enter size of arrey");
size=r.nextInt();
int a[]=new int [size];
for(i=0;i<size;i++){
    a[i]=r.nextInt();
}
        System.out.println("Printed array emleemts");
    for(i=0;i<size;i++) {

        System.out.println(a[i]+"");
    }

}}
class L_24_Arrey07 {
    public static void main(String[] args) {
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
class L_24_Arrey08 { // Multidimentianla array


    public static void main(String[] args)
    {

        int[][] arr = { { 1, 2 }, { 3, 4 } };

        System.out.println(Arrays.deepToString(arr));
    }
}