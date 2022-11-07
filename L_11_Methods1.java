package Java_Basics;

public class L_11_Methods1 {
public static void main (String args[]) {

    s_method();                                 // 1. Static Method in same class

    L_11_Methods1 object = new L_11_Methods1();          // this is object to call non static method
    object.n_method();                              //  2. Non Static method in same class

    object.p_method(50,20);            // 3. Methhod with parameters

  int result = object.r_method(40,10);                // 4 Method with return type
   System.out.println("This method has return type :" + result); //4. Method with return type

}
    public static void s_method (){
    System.out.println("this is static method in method 1 class : 1");
    }
    public void n_method(){
    System.out.println("This is non static method in method 1 class : 2 ");
    }
    void p_method(int a , int b ){
    int c = a+b;
    System.out.println("This is method with parameters is in method  1 class: " +c);
    }
    public int r_method (int a, int b ){
            int c = a-b;
           System.out.println("Below method has return type in method 1 classs");
            return c;
    }

}
