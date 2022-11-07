package Java_Basics;
/*
            Polymorphism : -

            Polymorphism in Java is a concept by which we can perform a single action in different ways.
            Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many
            and "morphs" means forms. So polymorphism means many forms.

            Types of polymorphism

            1.  Compile-time Polymorphism : Static polymorphism.  Achieved by Method Overloading
                A polymorphism exist at the time of compilation which is called compile time polymorphism

                Method Overlaring : When a class contain more than one method wth same name
                and different parameter is call Method Overoading

            2.  Runtime Polymorphism    : Dynamic  :  Achived By Method Overriding
*/



public class L_16_Polymorphism {
    void add() {

        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);

    }
//overloading
    void add(int x, int y) {
        int c = x + y;
        System.out.println(c);
    }

    void add(int x, double y) {
        double c = x + y;
        System.out.println(c);
    }

    public static void main(String[] args) {
        L_16_Polymorphism obj = new L_16_Polymorphism ();
        obj.add();
        obj.add(55,78);
obj.add(112,5.2);

    }

}

// Method overrriding // Runtime Polymorphism //

class L_16_Polymorphism_overriding  {

    void Animal(){
        System.out.println("Animal is dead");
    }
}

class L_16_Polymorphism_overriding02 extends L_16_Polymorphism_overriding {

    void Animal()
     //   super.Animal(); // using super keyword

    { System.out.println("Animal is alive"); }


    public static void main(String[] args) {

        L_16_Polymorphism_overriding obj = new L_16_Polymorphism_overriding();
        obj.Animal();
    }
}
