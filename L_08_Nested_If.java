package Java_Basics;

public class L_08_Nested_If {
    public static void main(String args[]) {

        int Melting = 690;

        if (Melting > 600 && Melting < 700) {
            System.out.println("Metal is Aluminium");
        }
        if (Melting > 927 && Melting > 700) {
            System.out.println("Metal is Bras");
        }
        else if (Melting > 913 && Melting < 900) {
            System.out.println("Metal is Bronze");
        }
        else if (Melting > 1204 && Melting < 1100) {
            System.out.println("Metal is Cast Iron");
        }
        else
        {
            System.out.println("Lowest melting point metal ");
        }
        if (Melting > 1063) {
            System.out.println("Metal is Gold");
        }
    }
}


// whenever we define if else block,
// in side this if else block define another if else block is called nested if

   class  L_08_Nested_If01 {

       public static void main(String[] args) {

           int age=25;
           int weight=48;
           if(age>=90){

               if(weight>50){
                   System.out.println("You are Batman");
               } else{
                   System.out.println("You are ironman");
               }
           } else{
               System.out.println("Age must be greater than 18");
           }
       }  }