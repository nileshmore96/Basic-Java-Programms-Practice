package Java_Basics;

/*
For static methods, the class name should be specified.
For non Static method , the object of class should be created
 */

public class L_11_Methods2 {
    public static void main(String args[]){
        L_11_Methods1.s_method ();           // this is static method.. We need class name to call

        L_11_Methods1 object = new L_11_Methods1(); // object for non static method in class 1
        object.n_method();                          //calling non static method with help of object

        L_11_Methods1 c = new L_11_Methods1(); // return type method in class 1
        int result = c.r_method(80,50);
        System.out.println("This method has return type :" + result); //4. Method with return type called from 1 class

    }

}

