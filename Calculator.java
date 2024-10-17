// class Calculator{
// public static void main(String[] args){
// int a=10;
// int b=20;
// int c;
// c=a+b;

// System.out.println("Welcome");
// System.out.println(c);
// c=a-b;
// System.out.println(c);
// c=a/b;
// System.out.println(c);
// c=a*b;
// System.out.println(c);
// }
// }
// Java program for simple calculator
import java.lang.*;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args)
	{
		double num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers:");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();

		System.out.println("Enter operator (+,-,*,/):");

		char op = sc.next().charAt(0);
		double o = 0;

		switch (op) {
		case '+':
			o = num1 + num2;
			break;
		case '-':
			o = num1 - num2;
			break;
		case '*':
			o = num1 * num2;
			break;
		case '/':
			o = num1 / num2;
			break;

		
		}

		System.out.println("result:");
		System.out.println();

	
		System.out.println(num1 + " " + op + " " + num2
						+ " = " + o);
	}
}
