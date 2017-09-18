/**
 * Eli Heuer, Week 3 -- Exercise 7
 * Brief: Write a java program to swap two variables.
 */
public class SwapTwoVariables {

    public static void main(String[] args) {

        // Set x and y variables.
        int x = 2;
        int y = 4;

        // Swap the x and Y variables, using a temporary int.
        int temp = x;
        x = y;
        y = temp;

        // Print after swap.
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Another way to swap, using math!
        int a = 256;
        int b = 512;

        // Swap the a and b variables, without help from a temporary int.
        a = a + b;
        b = a - b;
        a = a - b;

        // Print after swap.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}
