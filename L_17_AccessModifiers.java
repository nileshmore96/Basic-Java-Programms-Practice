package Java_Basics;

/*
        Access Modifiers

        The access modifiers in Java specifies the accessibility or scope of a field, method,
        constructor, or class. We can change the access level of fields, constructors, methods, and
        class by applying the access modifier on it

1.  Private:        The access level only within the class.
2.  Default:        The access level only within the package.
3.  Protected:      Wopithin the package and outside the package through child class.
4.  Public:         The access level of a public modifier is everywhere.

        */

public class L_17_AccessModifiers {

    public static int a = 10; //  The access level of a public modifier is everywhere.
    protected int b = 20; // Within the package and outside the package through child class.
    private int c = 30; // The access level only within the class.
    int d = 40; // The access level only within the package

    public static void main(String[] args) {
        System.out.println(a);

    }
}

