package Java_Basics;

interface L_18_Interference {

                int a = 20;  // Variable by default public and abstract
                void m1(); void m2(); // method by default public and abstract
}

interface L_18_Interference02{
    void m3(); void m4();

}
     class L_18_Interference_class implements  L_18_Interference, L_18_Interference02 {

// this is how multiple inheritance is achived in java by using interface//
        public void m1() {
            System.out.println("method 1 was incomplete in interfacce class now it comleted here in class ");
        }

        public void m2() {
            System.out.println("this method was also incomplete");

        }
         public void m3() {
             System.out.println("this is sparta");

         }

         public void m4() {
             System.out.println("Wakanda forever");
         }

        public static void main(String[] args) {
            L_18_Interference_class obj = new L_18_Interference_class();
            obj.m1(); obj.m2();
            System.out.println(a);

            obj.m3(); obj.m4();
        }



     }