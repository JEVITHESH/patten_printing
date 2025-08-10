import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row: ");
		int number = sc.nextInt();
		int printval;
		for(int i = 1;i <= number ; i++){
		    printval = i%2 == 0 ? 1:0; 
		    for(int j = 1 ; j <= i ; j++){
		        printval = printval %2 == 0 ?1:0;
		        System.out.print(printval);
		    }		        System.out.println();

		}
	}
}
