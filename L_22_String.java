package Java_Basics;

/*
           String:-

          In Java, string is basically an object that represents sequence of char values.
          An array of characters works same as Java string. For example:

     String: String is non primitive data type which is used to store the sequence of characters.
                1. Memory size of string is not fixed.
                2. String is a class which is present on the “java.lang” package.
                3. Objects of string class are immutable in nature
                4. It is a final class. Hence we can’t inherit it in another class
                5. We can declare string by two ways:





        */

public class L_22_String {
public static void main(String[] args) {


    char[] myarray = {'h', 'i'};
    String mystring = new String(myarray);   // string is object that contain sequence of characters //
    System.out.println( mystring );


    String a ="Nilesh"; //String Litral
    System.out.println(a);
    String b =" More    "; //String Litral
    System.out.println(b);

    System.out.println(a.toLowerCase());
    System.out.println(a.toUpperCase());
    System.out.println(a.concat(b)); //  join two words
    System.out.println(a.length());            // lenght of charcter
    System.out.println(b.trim());           // fill in the space
    System.out.println(b.isBlank());         //   check if string is blank


    a=a.concat("More"); // immutaable can not change object

    System.out.println(a);


    L_22_String obj = new L_22_String(); // object for non static m1 method
    obj.m1();                               // reversing string  Maharashtra = arthsarahaM

}
void m1 (){
    String name = "Maharashtra";
    String reverse = "";

    int length = name.length();
    System.out.println(length);

    for (int i=length-1; i>=0; i--){

        reverse =reverse+name.charAt(i);  // reversing string  Maharashtra = arthsarahaM
    }

    System.out.println(reverse);
}
}


/*


char[] toCharArray() –  This function performs the conversion of a string to a character array.

String substring(int beginIndexloc, int endIndexloc) – This function returns a string, which is substring
                                        of the specified string. The substring is determined by the beginning
                                         and ending index.

String toLowerCase(Locale localenew) - This function converts all the characters in the specified string to lower case using given locale rules.
String toLowerCase() - This function converts all the characters in the specified string to
lower case using default locale rules.

String toUpperCase() - This function converts all the characters in the specified string to
upper case using default locale rules.

String toString() – This function returns the string itself.

String toUpperCase(Locale localenew) – This function converts all the characters in the
specified string to upper case using locale rules.

static String valueOf(primitive data type x) – A string representation is returned by this
function.

String trim() – Omits the whitespace









 */