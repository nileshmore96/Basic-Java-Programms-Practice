package Java_Basics;  /* Simple Inheritance , Single Level Inheritance */

public class L_14_Inheritance01 { // super class
    int roll_no, marks; String name;   //stored in super classs

    int money= 50000;
    void house (){
        System.out.println("Father has Big house");
    }
    void car(){
        System.out.println("Father has a big car");
    }

    void m1() {
        System.out.println("Enter Roll no, Name and Marks");

    }
}

class L_14_Inheritance02 extends L_14_Inheritance01 { // sub class

    int childmoney =10000;
    static void mobile (){
        System.out.println("child has new mobile");
    }
    static void bike(){
        System.out.println("child has a bike");
    }

    void m2() {
        roll_no = 127;
        name = "Nilesh More";
        marks = 138;

        System.out.println(name + " " + roll_no + " " + marks);
    }

    public static void main(String[] args) {
        L_14_Inheritance02 obj = new L_14_Inheritance02();   // We have create object of sub class in
        obj.m1();                                             // in order to call super class members
        obj.m2();   // methods from super class

        obj.house();
        obj.car(); // non static method need object call
        mobile();
        bike();

        System.out.println("Father money "+obj.money);
        int totalmoney= obj.money+obj.childmoney;

        System.out.println("Child totle money = 50000+10000 :"+ totalmoney );
        System.out.println("maiin method finished from child class");
    }
}