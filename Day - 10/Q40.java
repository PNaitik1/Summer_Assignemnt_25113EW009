// Write a program to Print character pyramid.
// A
// ABA
// ABCBA
// ABCDCBA
// ABCDEDCBA    

package Summer_Assignment_25113EW009;

public class Q40 {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            for (int k = 1; k <= i; k++) {
                System.out.print(ch);
                ch++;
            }

            ch -= 2;

            for (int l = i - 1; l >= 1; l--) {
                System.out.print(ch);
                ch--;
            }

            System.out.println();
        }
    }
}
