package Java_Basics;
/*
The this keyword refers to the current object in a method or constructor.

The most common use of the this keyword is to eliminate the confusion between class attributes
and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter).

this can also be used to:

    1.  Invoke current class constructor
    2.  Invoke current class method
    3.  Return the current class object
    4.  Pass an argument in the method call
    5.  Pass an argument in the constructor call

 */


public class L_15_This {
    void m1() {
        System.out.println(this);  // 'This' keyword prints Java Object's Refence ID
    }

    public static void main(String[] args) {
        L_15_This obj = new L_15_This();
        System.out.println(obj);

        obj.m1();

        // output :     This@7699a589
        //              This@7699a589
    }
}
class this_2{

    /*      Note: local variable hides the instance variable,
            so we have to use this keyword explicitly.

            When a local variable has the same name as an instance variable, the local
            variables hides the instance variable. But this keyword allows us to refer to instance
            variables even if local variable hides it.                                                      */

    int a=10; // instance variable

    this_2 (int a)  // parameterized constructor ina (a) is local variable
    {
            this.a=a;      //If we didn't write 'this' keyword complier gets confused
    }                   // It will give '0' output :- default value of int

    void m1(){

        System.out.println(a);

    }

    public static void main(String[] args) {
        this_2 obj = new this_2(196);
        obj.m1();

    }
}