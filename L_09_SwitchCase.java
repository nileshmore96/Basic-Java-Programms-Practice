package Java_Basics;

/*Java Switch Statements
Use the switch statement to select one of many code blocks to be executed                  */

public class L_09_SwitchCase {
public static void main (String args[]) {


    int Atomic_Number = 4;
switch (Atomic_Number)

    {
        case 1:
            System.out.println("Hydrogen");
            break;
        case 2:
            System.out.println("Helium");
            break;
        case 3:
            System.out.println("Lithium");
            break;
        case 4:
            System.out.println("Berilium");
            break;
        case 5:
            System.out.println("Boron");
            break;
        case 6:
            System.out.println("Carbon");
            break;
        case 7:
            System.out.println("Nitrogen");
            break;
        default: System.out.println("Invalid Choice"); break;
    }}}