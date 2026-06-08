
// Write a program to Print character triangle.
// A
// AB
// ABC
// ABCD
// ABCDE

package Summer_Assignment_25113EW009;

public class Q31 {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            char ch = 'A';

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }
    }
}
