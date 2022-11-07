package Java_Basics;

public class L_15_Thisclass04 {
    static int x;
    public L_15_Thisclass04 (int x) {     // Constructor with a parameter
        this.x=10;

        System.out.println("Value of x = " +x);


        x = x;
    }
   public static void main(String[] args) {
        L_15_Thisclass04 myObj = new L_15_Thisclass04(155);
        System.out.println("Value of x = " + myObj.x);


    }
}