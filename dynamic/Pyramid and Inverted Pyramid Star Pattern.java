import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row: ");
		int number = sc.nextInt();
		
		for(int i = 1;i <= (number*2)-1 ; i++){
		    int col = i>=number?(number*2)-i:i;
		 
		    for(int j = 1 ; j <= col ; j++){
		       
		        System.out.print("*");
		    }		        System.out.println();

		}
	}
}
Enter the row : 5
*
**
***
****
*****
****
***
**
*
