// Write a program to Print number pyramid.
// 1
// 121
// 12321
// 1234321
// 123454321

package Summer_Assignment_25113EW009;

public class Q39 {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }

            System.out.println();
        }
    }
}
