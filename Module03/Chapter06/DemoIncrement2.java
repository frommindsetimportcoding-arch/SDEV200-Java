// Nathan Thomas
// p. 213

public class DemoIncrement2
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

        int w = 17, x = 17, y = 18;
        boolean compare1 = (++w == y);
        boolean compare2 = (x++ == y);

        System.out.printf("First compare is %b\n", compare1);
        System.out.printf("Second compare is %b\n", compare2);

    }
}
