// Nathan Thomas
// p. 173

import java.util.Scanner;

public class AssignVolunteer3
{
    public static void main(String[] args)
    {
        int donationType;
        String volunteer;
        String message;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        final String INVALID_PRICER = "invalid";

        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.printf("Enter %d for clothing, %d for anything else...\n", CLOTHING_CODE, OTHER_CODE);
        donationType = input.nextInt();

        if (donationType == CLOTHING_CODE)
        {
            volunteer = CLOTHING_PRICER;
            message = "a clothing donation";
        }
        else
        {
            if (donationType == OTHER_CODE)
            {
                volunteer = OTHER_PRICER;
                message = "a non-clothing donation";
            }
            else
            {
                volunteer = INVALID_PRICER;
                message = "an invalid donation type";
            }
        }
        System.out.printf("You entered %d\n", donationType);
        System.out.printf("This is %s\n", message);
        System.out.printf("The volunteer who will price this item is %s\n", volunteer);

        input.close();
    }
}
