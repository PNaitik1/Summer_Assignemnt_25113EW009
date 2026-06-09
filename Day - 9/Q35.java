// Write a program to Print repeated character pattern.
// A
// BB
// CCC
// DDDD
// EEEEE

package Summer_Assignment_25113EW009;

public class Q35 {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print((char) ('A' + i - 1));
            }

            System.out.println();
        }
    }
}
