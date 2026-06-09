// Write a program to Print reverse star pattern.
// *****
// ****
// ***
// **
// *

package Summer_Assignment_25113EW009;

public class Q33 {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
