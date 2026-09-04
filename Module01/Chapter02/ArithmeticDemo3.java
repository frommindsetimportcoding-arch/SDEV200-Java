// Nathan Thomas
// p.75

import java.util.Scanner;

public class ArithmeticDemo3
{
    public static void main(String[] args)
    {
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer >> ");
        firstNumber = input.nextInt();
        System.out.print("Please enter another integer >> ");
        secondNumber = input.nextInt();

        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = (double) sum / 2; // Could just divide by a double (2.0) to get a double as a result, but explicit
                                    // type casting is good to understand.

        System.out.printf("%d + %d is %d.%n", firstNumber, secondNumber, sum);
        System.out.printf("%d - %d is %d.%n", firstNumber, secondNumber, difference);
        System.out.printf("The average of %d and %d is %.1f.%n", firstNumber, secondNumber, average);
    }
}
