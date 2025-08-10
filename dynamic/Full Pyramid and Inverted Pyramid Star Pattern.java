import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number * 2 - 1; i++) {
            int rowChange = i > number ? (number * 2) - i : i;

            // Print spaces
            for (int j = 1; j <= number - rowChange; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= rowChange * 2 - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
Enter the row : 5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
