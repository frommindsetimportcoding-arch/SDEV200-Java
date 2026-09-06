// Nathan Thomas
// p.81
// Chapter 2 Exercise 8a

import java.util.Scanner;

public class ChiliToGo
{
    public static void main(String[] args)
    {
        final int PRICE_ADULT = 7;
        final int PRICE_CHILD = 4;
        int numAdult;
        int numChild;
        double adultMealTotal;
        double childMealTotal;
        double grandTotal;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of adult meals sold today  >> ");
        numAdult = input.nextInt();
        System.out.print("Please enter the number of child meals sold today >> ");
        numChild = input.nextInt();
        adultMealTotal = numAdult * PRICE_ADULT;
        childMealTotal = numChild * PRICE_CHILD;
        grandTotal = adultMealTotal + childMealTotal;

        System.out.printf("Summary:\nTotal Adult Meals: $%.2f%n", adultMealTotal);
        System.out.printf("Total Child Meals: $%.2f%n", childMealTotal);
        System.out.printf("Grand Total: $%.2f%n", grandTotal);
    }
}
