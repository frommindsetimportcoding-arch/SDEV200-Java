// Nathan Thomas
// p.62

import java.util.Scanner;

public class IntegerDemoInteractiveWithName {
     public static void main(String[] args) 
    {
        int anInt;
        byte aByte;
        short aShort;
        long aLong;
        String name;


        Scanner input = new Scanner (System.in);

        System.out.print("Please enter an integer >> ");
        anInt = input.nextInt();
        System.out.print("Please enter a byte integer >> ");
        aByte = input.nextByte();
        System.out.print("Please enter a short integer >> ");
        aShort = input.nextShort();
        System.out.print("Please enter a long integer >> ");
        aLong = input.nextLong();

        System.out.print("Please enter your name >> ");
        input.nextLine();
        name = input.nextLine();
        System.out.printf("Thank you, %s.%n", name);

        System.out.printf("The int is %d.%n", anInt);
        System.out.printf("The byte is %d.%n", aByte);
        System.out.printf("The short is %d.%n", aShort);
        System.out.printf("The long is %d.%n", aLong);
    }
}
