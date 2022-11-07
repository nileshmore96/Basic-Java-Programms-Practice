package Java_Basics;

import java.util.Scanner;

public class L_07_DecisionMaking {

 /*   Control statements are the statements that change the flow of execution of statement
    1.  If Else If
                                                                                                              */
    public static void main (String args []) {

        int speed = 155;

        if (speed == 120) {
            System.out.println("The Car is Jaguar");
        }
        else if (speed <= 130 && speed >= 140) {
            System.out.println("The Car is Mecedese");
        }
        else if (speed <= 140 && speed >= 150) {
            System.out.println("The Car is Mecedese");
        }
        else if (speed <= 150 && speed >= 160) {
            System.out.println("The Car is Aston Martin");
        }
        else if (speed <= 160 && speed >= 170) {
            System.out.println("The Car is Iso Grifo");
        }
        else if (speed <= 170 && speed >= 180) {
            System.out.println("The Car is AC Cobra");
        }
        else if (speed <= 180 && speed >= 190) {
            System.out.println("The Car is Lamborghini");
        }
        else {
                System.out.println("Its Supercar ");
            }
        }
    }

   class L_07_DecisionMaking02 {
// if else with scanner class

       public static void main(String args[]) {

           int age;
           System.out.println("Enter your age...!");

           Scanner r = new Scanner(System.in);
           age = r.nextInt();
           if (age >= 18) {
               System.out.println("Eligible for vote");

               }
           else {
               System.out.println("not eligible for vote ");
           }
           }

       }

       class L_07_DecisionMaking03 {
           public static void main(String[] args) {
               Scanner r = new Scanner(System.in);




           }
        }