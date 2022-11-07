package Java_Basics;                                                                                                                       /*
        Variables :-

       1) A variable is a container which holds the value while the Java program is executed.
          A variable is assigned with a data type.

       2) Variables are nothing but piece of memory use to store information. One variable can store
        single information at a time. To utilize variables in java programming language we need to follow
        below steps:

        1. Variable Declaration (Allocating / Reserving memory)
        2. Variable Initialization (Assigning / Inserting value)
        3. Variable Usage
*/

public class L_05_Variables {


    int d   = 10;                  // Instance Variable

   /* Instance Variable
    Instance variables in Java are non-static variables which are defined in a class outside
    any method, constructor or a block. Each instantiated object of the class has a separate copy or instance
    of that variable. An instance variable belongs to a class.

        1. The variables that are declared inside the class
           but outside the scope of any method are called instance variables in Java.
        2. The instance variable is initialized at the time of the class loading
           or when an object of the class is created.
        3. An instance variable can be declared using different access modifiers
           available in Java like default, private, public, and protected.


*/

         static int e = 10;            // Static Variable
/*
        Static Variable :-

        An instance variable can be declared using different access modifiers available in Java
        like default, private, public, and protected.

        1.We can create static variables at the class level only. See here
        2. static block and static variables are executed in the order they are present in a program.




 */

/*
    _____________Local variable :

    A local variable in Java is a variable that's declared within the body of a method.
    Then you can use the variable only within that method

1.  Local variables are declared in methods, constructors, or blocks.
2.  Local variables are created when the method, constructor or
    block is entered and the variable will be destroyed once it exits the method,
    constructor, or block.
            3.  Access modifiers cannot be used for local variables.
            4.  Local variables are visible only within the declared method, constructor, or block.
            5.  Local variables are implemented at stack level internally
6.  There is no default value for local variables, so local variables should be declared
    and an initial value should be assigned before the first use.
*/


//__ Examples of Local Variables_<_//

        void method_1 () {
            int a = 10;
            System.out.println("This is local variable in first mmethod :" + a);
        }
        void method_2(){
            int a = 20;
            System.out.println("This is 2nd Local Variable in second method :"+a);

        }
        void method_3 (){
            int a = 30;
            System.out.println("This is 3rd local variable in third meth : "+ a);

        }

    public static void main(String args[]) {

        L_05_Variables object_ = new L_05_Variables (); // we need to create object //

        System.out.println(e+25);  // Static Variable ' e ' // is used in static method only

        object_.method_1();      // Local
        object_.method_2();     //  Local
        object_.method_3();     //  Local
        object_.method_4();   //    Instance

        System.out.println(e+25);  // Static Variable ' e ' // is used in static method only


    }
        public void method_4 (){
            System.out.println("This is a static variable :"+d); // d is Instance variable

                            }
}



/* Local Variable - Variable declared inside body of method
*  Instance Variable - Variable declared inside class but outside method
*   Static Vaariable - Variable declared with static keyword
*
*
* */

class L_05_Variables02 {

    static int num2 =30; // static
    int num3 =50;
    public static void main(String[] args) {

    int num1 = 10; // Local varibale

        L_05_Variables02 ref = new L_05_Variables02();

        System.out.println("Local variable:"+ num1);

        System.out.println("static varibale called wiht class name :"+L_05_Variables02.num2);

        System.out.println("instance variable called with class refference:"+ref.num3);
    }
        }

        class L_05_Variables03 {
            public static void main(String[] args) {

                System.out.println(L_05_Variables02.num2); // static variable

            //    System.out.println(num1); // local variable cannot access outside the calss

                L_05_Variables02 ref = new L_05_Variables02();

                System.out.println(ref.num3);
            }

                }