import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello \"in quotes\" world!");
		
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int sum;
		
		System.out.println("Primeiro numero:");
		number1 = input.nextInt();
		
		System.out.println("Segundo numero:");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("Sum is %d\n", sum);
		
		if (number1 == number2)
			System.out.printf("%d = %d\n",number1,number2);
		
		if (number1 != number2)
			System.out.printf("%d != %d\n",number1,number2);
		
		if (number1 < number2)
			System.out.printf("%d < %d\n",number1,number2);
		
		if (number1 > number2)
			System.out.printf("%d > %d\n",number1,number2);
		
		if (number1 <= number2)
			System.out.printf("%d <= %d\n",number1,number2);
		
		if (number1 >= number2)
			System.out.printf("%d >= %d",number1,number2);
		
		input.close();
	}

}
