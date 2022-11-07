package Java_Basics;

//  Multileve Inheritance

public class L_14_MultilevelInheritance { //superclass
    int a,b,c;
    void add(){
        a=10; b=20; c= a+b;
        System.out.println("Sum of a=10 and b=20 = ... in class 1 "+ c);
    }
}
class subclass_1 extends L_14_MultilevelInheritance { //subclass 1
    void sub(){
        a=44; b=33; c=a-b;
        System.out.println("Subtraction of a=44 - b= 33 : .. in class 2 :"+ c);

    }

}
class subclass_2 extends subclass_1 {    // subclas 2

;

    void multi() {
        a = 100;b = 250;c=a*b;
        System.out.println("Multiplication of a =100 and b=250 : ..... in class 3" + c);

    }
}
class final_class extends subclass_2{  // we will create object of this class
    public static void main(String[] args) {
        System.out.println("This is final class which is calling all classes");
        final_class obj = new final_class();
        obj.add();
        obj.sub();
        obj.multi();

    }

}