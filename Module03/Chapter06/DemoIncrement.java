// Nathan Thomas
// p. 213

public class DemoIncrement
{
    public static void main(String[] args)
    {
        int v = 4;
        int plusPlusV = ++v;

        v = 4;
        int vPlusPlus = v++;

        System.out.printf("v is %d\n", v);
        System.out.printf("++v is %d\n", plusPlusV);
        System.out.printf("v++ is %d\n", vPlusPlus);

    }
}
