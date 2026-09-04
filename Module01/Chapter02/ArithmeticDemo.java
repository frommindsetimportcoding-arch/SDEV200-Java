// Nathan Thomas
// p. 71

import java.util.Scanner;

public class ArithmeticDemo
{
    public static void main(String[] args)
    {
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        int average;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer >> ");
        firstNumber = input.nextInt();
        System.out.print("Please enter another integer >> ");
        secondNumber = input.nextInt();

        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum / 2;

        System.out.printf("%d + %d is %d.%n", firstNumber, secondNumber, sum);
        System.out.printf("%d - %d is %d.%n", firstNumber, secondNumber, difference);
        System.out.printf("The average of %d and %d is %d.%n", firstNumber, secondNumber, average);
    }
}
