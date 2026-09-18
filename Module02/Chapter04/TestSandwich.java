// Nathan Thomas
// p. 156
// Programming Exercises 1A and 1B

import java.util.Scanner;

public class TestSandwich
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Sandwich mySandwich = new Sandwich();
        mySandwich = sammyOrder(mySandwich, input);

        System.out.println("===== Your Sandwich Order =====");
        System.out.println("Protein: " + mySandwich.getProtein());
        System.out.println("Bread: " + mySandwich.getBread());
        System.out.println("Cheese: " + mySandwich.getCheese());
        System.out.println("Condiment: " + mySandwich.getCondiment());
        System.out.println("Price $" + mySandwich.getPrice());

        input.close();
    }

    public static Sandwich sammyOrder(Sandwich sandwich, Scanner input)
    {
        String protein;
        String bread;
        String cheese;
        String condiment;

        System.out.print("Enter protein choice >> ");
        protein = input.nextLine();
        System.out.print("Enter bread choice >> ");
        bread = input.nextLine();
        System.out.print("Enter choice of cheese >> ");
        cheese = input.nextLine();
        System.out.print("Enter choice of condiment >> ");
        condiment = input.nextLine();

        sandwich.setProtein(protein);
        sandwich.setBread(bread);
        sandwich.setCheese(cheese);
        sandwich.setCondiment(condiment);

        return sandwich;

    }
}
