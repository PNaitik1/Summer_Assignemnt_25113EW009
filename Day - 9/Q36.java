// Write a program to Print hollow square
// pattern.
// *****
// *   *
// *   *
// *   *
// *****

package Summer_Assignment_25113EW009;

public class Q36 {

    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= size; j++) {

                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("*");
                } else {

                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
