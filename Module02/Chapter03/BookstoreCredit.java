// Nathan Thomas
// Chapter03 Exercise05
// p. 112

import java.util.Scanner;

public class BookstoreCredit
{
    public static void main(String[] args)
    {
        double gpa;
        String name;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name >> ");
        name = input.nextLine();
        System.out.print("Please enter your GPA >> ");
        gpa = input.nextDouble();

        creditEvaluation(name, gpa);

    }

    public static void creditEvaluation(String name, double gpa)
    {
        final int multiplier = 10;
        double credit = gpa * multiplier;
        System.out.printf("Hello %s, we have decided to award you with a $%.2f credit for your GPA of %.2f.", name,
                credit, gpa);
    }
}
