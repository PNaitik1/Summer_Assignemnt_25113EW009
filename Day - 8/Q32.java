// Write a program to Print repeated-number
// pattern.
// 1
// 22
// 333
// 4444
// 55555

package Summer_Assignment_25113EW009;

public class Q32 {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
