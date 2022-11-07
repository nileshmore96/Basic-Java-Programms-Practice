package Java_Basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class L_25_ArrayList {
    public static void main(String[] args) {


        ArrayList<String> Name = new ArrayList<>(); // only accepts stringss
        Name.add("Darkseid");
        Name.add("Thanos");
        Name.add("Doomsday");
        Name.add("Lex Luthor");


        System.out.println(Name); //1
        // This method removes the bracket from the Array_List -> .toString().replace("[","").replace("]","")//
        System.out.println(Name.toString().replace("[", "").replace("]", "")); //1

        Name.remove(1);  // removes the 2nd string from list  // 2
        System.out.println(Name); // out will be -> Darkseid, Doomsday, Lex Luthor

        Name.set(2, "Batman");  // replces the 3rd name in the list  //3
        System.out.println(Name); // output will be -> Darkseid, Doomsday, Batman

        System.out.println(Name.get(2)); // this method will print only 3rd name in the list

        Name.clear(); // this will empty the array //4
        System.out.println(Name); // output will be blank []


        // DJ Saranchi Method


    }
}
    class L_25ArrayList02 {

    // DJ Saranchi file

        public static void main(String[] args) {
            ArrayList ar= new ArrayList();
            ar.add("DJ");
            ar.add("DJ");
            ar.add(35);
            ar.add("E&TC");
            ar.add('A');
            ar.add(null);
            ar.add(70.31);
            ar.add(null);
            System.out.println(ar);
            System.out.println("Size of array = "+ ar.size());
            System.out.println("This is empty array: "+ar.isEmpty());
            System.out.println("Is array contains DJ: "+ar.contains("DJ"));
            System.out.println("Data at index 2: "+ar.get(2));
            System.out.println("Arraylist before deletion/Left shift: "+ar);
            System.out.println("Delete data at index 2: "+ar.remove(2));
            System.out.println("Arraylist after deletion/Left shift: "+ar);
            ar.add(2, 36);
            System.out.println("Arraylist after insertion/Right shift:"+ar);
                    ar.set(2, 35);
            System.out.println("Arraylist after update, No shifting: "+ar);
            System.out.println("-Accessing Arraylist element using Iterator-");
                    Iterator itr = ar.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
            System.out.println("Accessing Arraylist elementusingListIterator");
                    ListIterator litr = ar.listIterator();
            while (litr.hasNext()) {
                System.out.println(litr.next());
            }
        }
    }

