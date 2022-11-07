//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Java_Basics;

public class L_13_ConstructorP01 {
    int a = 10;
    int b;

    public L_13_ConstructorP01() {
        this.b = 20;
        int w = 78;
        int var10001 = this.b + w;
        System.out.println("addition of b and w :" + var10001);
    }

    public L_13_ConstructorP01(int x) {
        this.b = 20 + x;
    }

    public L_13_ConstructorP01(boolean w) {
        if (w) {
            this.b = 20;
        } else {
            this.b = 10;
        }

    }

    public static void main(String[] args) {
        L_13_ConstructorP01 obj1 = new L_13_ConstructorP01(10);
        int d = obj1.b;
        System.out.println(d);
        L_13_ConstructorP01 obj = new L_13_ConstructorP01();
        int e = obj.b;
        System.out.println(e);
    }
}

