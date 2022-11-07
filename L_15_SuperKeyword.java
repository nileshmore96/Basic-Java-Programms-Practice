package Java_Basics;
/*
        It is used to differentiate the members of superclass from the
        members of subclass, if they have same names.
        It is used to invoke the superclass constructor from subclass. */
/*
Super Keyword:

        Super keyword is used to refer the instance of global variable declared in the super/parent class.
        Super keyword is always used in the non-static method. We can’t use super keyword in static
        methods. Super keyword is used for non-static global variable. To use static global variable we have
        to follow static approach.

The super keyword refers to superclass (parent) objects.

1.  It is used to call superclass methods, and to access the superclass constructor.
2.  The most common use of the super keyword is to eliminate the confusion between superclasses
    and subclasses that have methods with the same name.
3.  To understand the super keyword, you should have a basic understanding of Inheritance and Polymorphism.


*/

public class L_15_SuperKeyword {


    int a= 20;      //class 1 instance variable
    void m2(){
        System.out.println("This is Spartaa...");
    }
}
class L_15_SuperKeyword01 extends L_15_SuperKeyword {
    int a = 255; //class 2 variablle with same name

    void m1() {
        System.out.println(super.a); //Super differenciate member of superclass from subclass
        System.out.println(a); // subclass variable

    }
    void m2(){
        super.m2();                            // superclass method with same
        System.out.println("This is Themiskira");// subclass method with same
    }
    public static void main(String[] args) {

        L_15_SuperKeyword01 obj = new L_15_SuperKeyword01 ();
        obj.m1();

        obj.m2(); //s uper class method
    }
 }

