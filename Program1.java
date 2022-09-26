import java.util.Scanner;

public class Program_1 {

	public static void main(String[] args) {
		double a, b, result;
		String typeOfOperation = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number.");
		a = scan.nextDouble();
		
		System.out.println("Enter the second number.");
		b = scan.nextDouble();
		
		System.out.println("Enter operation to be performed:- Addition, Subtraction, Multiplication, Division");
		typeOfOperation = scan.next();
		
		if(typeOfOperation.equals("Addition")){
			result = a + b;
			System.out.println("Addition of"+a+" and "+b+" = "+result);
		}
		else if(typeOfOperation.equals("Subtraction")){
			result = a - b;
			System.out.println("Subtraction of"+a+" and "+b+" = "+result);
		}
		else if(typeOfOperation.equals("Multiplication")){
			result = a * b;
			System.out.println("Multiplication of"+a+" and "+b+" = "+result);
		}
		else{
			result = a / b;
			System.out.println("Multiplication of"+a+" and "+b+" = "+result);
		}
	}

}

