// Nathan Thomas
// p. 232

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenEntryLoop
{
    public static void main(String[] args)
    {
        int number;
        final int SENTINEL = 999;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an even number or 999 to quit >> ");
        try
        {
            number = input.nextInt();
            while (number != SENTINEL)
            {
                if (number % 2 == 0)
                {
                    System.out.println("Good job!");
                }
                else
                {
                    System.out.println("Hmmm... that's odd...");
                }
                System.out.println("Enter an even number or 999 to quit >> ");
                number = input.nextInt();
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error: That is not a valid integer!");
        }
        finally
        {
            input.close();
        }
    }
}
