// Nathan Thomas
// p. 71

import java.util.Scanner;

public class ArithmeticDemo2
{
    public static void main(String[] args)
    {
        double firstNumber;
        double secondNumber;
        double sum;
        double difference;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter double >> ");
        firstNumber = input.nextDouble();
        System.out.print("Please enter another double >> ");
        secondNumber = input.nextDouble();

        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        average = sum / 2;

        System.out.printf("%f + %f is %f.%n", firstNumber, secondNumber, sum);
        System.out.printf("%f - %f is %f.%n", firstNumber, secondNumber, difference);
        System.out.printf("The average of %f and %f is %f.%n", firstNumber, secondNumber, average);
    }
}
