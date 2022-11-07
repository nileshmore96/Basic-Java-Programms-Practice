//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Java_Basics;

public class L_13_ConstructorP02 {
    String car;
    int speed;

    public L_13_ConstructorP02(String s, int h) {
        this.car = s;
        this.speed = h;
    }

    public void details() {
        System.out.println("name of car:" + this.car);
        System.out.println("Highest speed is :" + this.speed);
    }

    public static void main(String[] args) {
        System.out.println("Fastest car");
        L_13_ConstructorP02 obj = new L_13_ConstructorP02("Venom", 270);
        obj.details();
    }
}

