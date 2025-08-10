import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row: ");
		int number = sc.nextInt();
		
		for(int i = number;i >= 1; i--){
		    for(int j = 1 ; j <= number- i; j++){
		       
		        System.out.print(" ");
		    }
		    for(int k =1; k <= (i*2)-1 ;k++){
		        System.out.print("*");
		    }   System.out.println();
		    }		     

		}
	}
Enter the row : 5
*********
 *******
  *****
   ***
    *
