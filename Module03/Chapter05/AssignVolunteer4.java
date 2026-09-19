// Nathan Thomas
// p. 185

import java.util.Scanner;

public class AssignVolunteer4
{
    public static void main(String[] args)
    {
        int donationType;
        String volunteer;
        String message;
        final int CLOTHING_CODE = 1;
        final int FURNITURE_CODE = 2;
        final int ELECTRONICS_CODE = 3;
        final int OTHER_CODE = 4;
        final String CLOTHING_PRICER = "Regina";
        final String FURNITURE_PRICER = "Wei";
        final String ELECTRONICS_PRICER = "Lydia";
        final String OTHER_PRICER = "Marco";
        final String INVALID_PRICER = "invalid";

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer... ");
        donationType = input.nextInt();

        switch (donationType)
        {
            case (CLOTHING_CODE):
            {
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation";
                break;
            }
            case (FURNITURE_CODE):
            {
                volunteer = FURNITURE_PRICER;
                message = "a furniture donation";
                break;
            }
            case (ELECTRONICS_CODE):
            {
                volunteer = ELECTRONICS_PRICER;
                message = "an electronics donation";
                break;
            }
            case (OTHER_CODE):
            {
                volunteer = OTHER_PRICER;
                message = "another donation type";
                break;
            }
            default:
            {
                volunteer = "invalid";
                message = "an invalid donation type";
            }
        }
        System.out.printf("You entered %d\n", donationType);
        System.out.printf("This is %s\n", message);
        System.out.printf("The volunteer who will price this item is %s\n", volunteer);

        input.close();
    }
}
