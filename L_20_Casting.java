package Java_Basics;

public class L_20_Casting {
    public static void main (String args[]){


        int m=65;
        char c=(char)m;
        System.out.println(m);




        int i = 100;


        // Implicit Typecasting //
     /*

     Widening Casting (automatically) - converting a smaller type to a larger type size
       byte -> short -> char -> int -> long -> float -> double

     Implicit casting is performed to convert a lower data type into a higher data type.
     It is also known as automatic type promotion in Java.

     int x = 20;
    long y = x; // Automatic conversion

     */



        // Automatic type conversion
        // Integer to long type
        long l = i;

        // Automatic type conversion
        // long to float type
        float f = l;

        // Print and display commands
        System.out.println("Int value " + i);
        System.out.println("Long value " + l);
        System.out.println("Float value " + f);

        System.out.println();
        System.out.println();

        byte p=127;
       System.out.println("byte value : "+p);
    // Implicit Typecasting
    short q = p;
      System.out.println("short value : "+q);
    int r = q;
      System.out.println("int value : "+r);
    long s = r;
      System.out.println("long value : "+s);
    float t = s;
      System.out.println("float value : "+t);
    double u = t;
      System.out.println("double value : "+u);



        // Explicit Typecasting //
/*
Narrowing Casting
Narrowing casting must be done manually by placing the type in parentheses in front of the value:

 */


        double a = 9.78d;
        int b = (int) a; // Manual casting: double to int

        System.out.println(a);   // Outputs 9.78
        System.out.println(b);      // Outputs 9



}
}

