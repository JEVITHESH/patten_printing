import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row: ");
		int number = sc.nextInt();
		
		for(int i = 1;i <= number ; i++){
		 
		    for(int j = 1 ; j <= number - i + 1; j++){
		       
		        System.out.print(number-i+1);
		    }		        System.out.println();

		}
	}
}
Enter the row: 5
55555
4444
333
22
1
