package Java_Basics;

public class L_15_Thisclass03 {
    int x =20;
    static int y= 10;


    public void m1 () {

        int x=30;  // local variable

        System.out.println("Local variable x from method 1 :" +x);
        System.out.println("gloabal variable x from method 1 :" +this.x);



    }
    public static void main(String[] args) {

        System.out.println("Main method started ");

        L_15_Thisclass03 obj= new L_15_Thisclass03();
        obj.m1();
        System.out.println("Main method ended ");


    }

}
