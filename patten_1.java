import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int a = sc.nextInt();
		for(int i =1; i <= a ; i++){
		    for(int j = 1 ; j <= a; j++){
		        System.out.print("*");
		    }System.out.print("\n");
		}
	}
}
#output
Enter the number : 5
*****
*****
*****
*****
*****
