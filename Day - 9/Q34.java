// Write a program to Print reverse number
// triangle.
// 12345
// 1234
// 123
// 12
// 1

package Summer_Assignment_25113EW009;

public class Q34 {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
