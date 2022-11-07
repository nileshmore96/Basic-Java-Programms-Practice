package Java_Basics;
/*
      Encapsulation : Encapsulation in Java is a process of wrapping code and data together into a single unit,
                      for example, a capsule which is mixed of several medicines.

                    It prevents outer classes from accessing and changing fields and methods of a class.
                    This also helps to achieve data hiding.


                      Encapsulation is one of the four fundamental OOP concepts.
                      The other three are inheritance, polymorphism, and abstraction.

                      To achieve encapsulation in Java −

                      1.    Declare the variables of a class as private.
                      2.    Provide public setter and getter methods to modify and view the variables values

                                                                                               */
    public class L_23_Encapsulation {
    private int value; //data hiding
    public void setValue(int x){
        value= x ;

    }
    public int getValue(){
        return value;

    }}

     class Capsule_2 {
    public static void main(String[] args) {
        L_23_Encapsulation obj = new L_23_Encapsulation();
        obj.setValue(100);
        System.out.println(obj.getValue());
    }
}

class capsule_3 {
        int roll_no;
        String name;

        // Getters and Setters

    public void setRoll_no(int r) {
        roll_no = r;
    }
    public int getRoll_no() {
       return roll_no;
    }
}
class capsule_4 {
    public static void main(String[] args) {
        capsule_3 obj = new capsule_3();
        obj.setRoll_no(98);

        System.out.println(obj.getRoll_no());

    }
}

class capsule_5 {
        private String movie ;
    public void setMovie (String newmovie){
             movie=newmovie;
    }
    public String getMovie(){
            return movie;
    }
}
class capsule_6 {
    public static void main(String[] args) {
        capsule_5 obj= new capsule_5();
obj.setMovie("Batman");
        System.out.println(obj.getMovie());
    }
}