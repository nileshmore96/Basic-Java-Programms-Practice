package Java_Basics;

public class L_14_Hirechicalnheritance {
    void m1() {
        System.out.println("Enter you name");
    }
}

class sub_1 extends L_14_Hirechicalnheritance {
    void m2() {
        System.out.println("my name is nilesh");
    }

}

class sub_2 extends L_14_Hirechicalnheritance {
    void m3() {
        System.out.println("this is sparta");

    }
}

class sub_final {

    public static void main(String[] args) {


        sub_1 obj = new sub_1();
        sub_2 obj2 = new sub_2();

        obj.m1();       // from method 1
        obj.m2();   //      from method 2
        obj2.m3();   //    from method 3
    }
}