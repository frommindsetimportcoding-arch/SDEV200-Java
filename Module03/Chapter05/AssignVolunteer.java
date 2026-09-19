// Nathan Thomas
// p. 166

import java.util.Scanner;

public class AssignVolunteer
{
    public static void main(String[] args)
    {
        int donationType;
        String volunteer;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";

        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.printf("Enter %d for clothing, %d for anything else...\n", CLOTHING_CODE, OTHER_CODE);
        donationType = input.nextInt();

        if (donationType == CLOTHING_CODE)
            volunteer = CLOTHING_PRICER;
        else
            volunteer = OTHER_PRICER;

        System.out.printf("You entered %d\n", donationType);
        System.out.printf("The volunteer who will price this item is %s\n", volunteer);

        input.close();
    }
}
