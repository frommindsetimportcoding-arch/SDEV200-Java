// Nathan Thomas
// p. 222

public class DivideEvenly2
{
    public static void main(String[] args)
    {
        final int LIMIT = 100;
        int var;
        int number;

        System.out.printf("%d is evenly divisible by ", LIMIT);

        for (number = 1; number <= LIMIT; ++number)
        {
            System.out.printf("%d is evenly divisible by ", number);
            for (var = 1; var <= number; ++var)
            {
                if (number % var == 0)
                    System.out.print(var + " ");
            }
            System.out.println();
        }
    }
}
