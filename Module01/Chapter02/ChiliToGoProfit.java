// Nathan Thomas
// p.81
// Chapter 2 Exercise 8a

import java.util.Scanner;

public class ChiliToGoProfit
{
    public static void main(String[] args)
    {
        final int PRICE_ADULT = 7;
        final int PRICE_CHILD = 4;
        final double COST_ADULT = 4.35;
        final double COST_CHILD = 3.10;
        int numAdult;
        int numChild;
        double adultMealTotal;
        double childMealTotal;
        double grandTotal;
        double adultMealProfit;
        double childMealProfit;
        double adultMealTotalProfit;
        double childMealTotalProfit;
        double grandTotalProfit;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of adult meals sold today  >> ");
        numAdult = input.nextInt();
        System.out.print("Please enter the number of child meals sold today >> ");
        numChild = input.nextInt();

        adultMealTotal = numAdult * PRICE_ADULT;
        childMealTotal = numChild * PRICE_CHILD;
        grandTotal = adultMealTotal + childMealTotal;
        adultMealProfit = PRICE_ADULT - COST_ADULT;
        childMealProfit = PRICE_CHILD - COST_CHILD;
        adultMealTotalProfit = numAdult * adultMealProfit;
        childMealTotalProfit = numChild * childMealProfit;
        grandTotalProfit = adultMealTotalProfit + childMealTotalProfit;

        System.out.print(
                "==================================\n             SUMMARY             \n==================================\n");
        System.out.printf("Total Adult Meals: $%.2f%n", adultMealTotal);
        System.out.printf("Total Child Meals: $%.2f%n", childMealTotal);
        System.out.printf("Grand Total: $%.2f%n", grandTotal);
        System.out.print(
                "==================================\n             PROFITS             \n==================================\n");
        System.out.printf("Total Adult Meals Profit: $%.2f%n", adultMealTotalProfit);
        System.out.printf("Total Child Meals Profit: $%.2f%n", childMealTotalProfit);
        System.out.printf("Grand Total Profit: $%.2f%n", grandTotalProfit);
    }
}
