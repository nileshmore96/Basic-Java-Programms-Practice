package Java_Basics;
/*

            Abstraction :-

            It is the process of hiding certain details and showing only essential information to the user.
            Abstraction can be achieved with either abstract classes or interfaces

        -   The abstract keyword is a non-access modifier, used for classes and methods:
        -   Abstract class: is a restricted class that cannot be used to create objects (to access it,
            it must be inherited from another class).



 */
abstract class L_18_Abstract {
    void m1(){      // compete method / regular method
        System.out.println("m1 this is regular method in abstract class");
    }
    abstract void m2(); // abstract method / dosent have body

}
class abstract2 extends L_18_Abstract {
    public void m2() { // both the abstract method and regular method have same name
        System.out.println("abstract method from abstract class which was incomplete here it is completed ");
    }

    void m3() {
        System.out.println("this is method 3 in sub class");
    }

    public static void main(String[] args) {

        abstract2 obj = new abstract2();

        obj.m1();
        obj.m3();
        obj.m2();
    }
}
abstract class Car { //Abstract class

    public abstract void Accelaration(); // Abstract method (does not have a body)

    public void Speed() { // Regular method


        System.out.println("270 miles Per hour");
    }
}

class Venom_GT extends Car { //Subclass (inherit from Car)

    public void Accelaration() {  // The body of Accelaration() is provided here

        System.out.println("Veno gt accelarates in 2.7 seconds ");
    }
}

class Main {

    public static void main(String[] args) {

        Venom_GT obj = new Venom_GT(); // Create object

        obj.Accelaration();

        obj.Speed();
    }
}