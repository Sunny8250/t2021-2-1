import java.util.Scanner;

public class Program_2 {

	public static void main(String[] args) {
		int i = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers of odd numbers to be printed");
		int a = scan.nextInt();
		while( i <= a) 
		{
			System.out.print(2 * i - 1 + " 10");
			i++;
		}
	}
}
