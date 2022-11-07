package Java_Basics;

public class L_06_Operators {

    public static void main(String args[]) {


        // 1.   Arithmatic Operators --- ( +,-,*,/)

        int a = 10;
        int b = 20;

        System.out.println("Substraction of b-a :" + (b - a));
        System.out.println("Addition of a+b :" + (a + b));
        System.out.println("Multipication of a*b :" + (b * a));
        System.out.println("Division of a/b :" + (b / a));

        relational(); // relational operator
        Logical();    // Logical Operator
        Assignmental(); //Assignment Operator
    }


    // 2. Relational Operators: (  > , < , <= , >= , == , != )


    public static void relational() {

        int c = 11;
        int d = 12;

        System.out.println("relational oprator 12 is greater thann 11:"+ (c < d));
        System.out.println("relatonal oprator 11 is greateer than 12:"+(c > d));
        System.out.println("relational oprator 11 is eqal to 12:"+    (c == d));
        System.out.println("relationla oprator 11 is not eqal to 12:"+(c != d));


    }

    /* 3. Logical Operators:

        Logical AND && Returns True if both the  conditions mentioned are true
        Logical OR || Returns True if one or both the conditions mentioned are true
        Logical NOT ! Returns True if the condition  mentioned is False                */

    public static void Logical() {

        int a = 10;
        int b = 21;

        if (a > 5 && b < 25) // Is true when both conditions are true else false.

            System.out.println("valuess of a is greater than 5 and b is less than 25");
        else
            System.out.println("Values are falseee");

    }

/*              4.    Assignment Operators:

    Operator        Example             Meaning/Use

            +=      X += 5                  X = X+5
            -=      X -= 5                  X = X-5
            *=      X *= 5                  X = X*5
            /=      X /= 5                  X = X/5
            %=      X %= 5                  X = X%5  //modulo operator // reminder
            ^=      X ^= 5                  X = X^5
            =       X = 5                   X = 5                    */


            public static void Assignmental  (){
             int x = 10 ;
             int y= 20;
             int z = x+y;
             System.out.println(" assignmemntal oprator  x+ y is z 10+20 :"+z);
             System.out.println(" assignmemntal oprator 30-10 :"+(z-10));





            }

}

