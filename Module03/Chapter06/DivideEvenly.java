// Nathan Thomas
// p. 216

public class DivideEvenly
{
    public static void main(String[] args)
    {
        final int LIMIT = 100;
        int var;

        System.out.printf("%d is evenly divisible by ", LIMIT);

        for (var = 1; var <= LIMIT; ++var)
        {
            if (LIMIT % var == 0)
                System.out.print(var + " ");
        }
        System.out.println();
    }
}
