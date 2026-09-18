// Nathan Thomas
// p. 126, 130, 133

import java.util.Scanner;

public class CreateSpaServices2
{
    public static void main(String[] args)
    {
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        SpaService thirdService = new SpaService("facial", 22.99);

        firstService = getData(firstService);
        // secondService = getData(secondService);

        /*
         * String service;
         * double price;
         * 
         * SpaService firstService = new SpaService();
         * SpaService secondService = new SpaService();
         * Scanner keyboard = new Scanner(System.in);
         * 
         * System.out.print("Enter service >> ");
         * service = keyboard.nextLine();
         * System.out.print("Enter price >> ");
         * price = keyboard.nextDouble();
         * 
         * firstService.setServiceDescription(service);
         * firstService.setPrice(price);
         * keyboard.nextLine();
         * 
         * System.out.print("Enter service >> ");
         * service = keyboard.nextLine();
         * System.out.print("Enter price >> ");
         * price = keyboard.nextDouble();
         * 
         * 
         * 
         * secondService.setServiceDescription(service);
         * secondService.setPrice(price);
         */

        System.out.println("First service details: ");
        System.out.println(firstService.getServiceDescripton() + " $" + firstService.getPrice());

        System.out.println("Second service details: ");
        System.out.println(secondService.getServiceDescripton() + " $" + secondService.getPrice());

        System.out.println("Third service details: ");
        System.out.println(thirdService.getServiceDescripton() + " $" + thirdService.getPrice());
    }

    public static SpaService getData(SpaService service)
    {
        String serviceDescription;
        double price;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter service >> ");
        serviceDescription = keyboard.nextLine();
        System.out.print("Enter price >> ");
        price = keyboard.nextDouble();
        keyboard.nextLine();
        // keyboard.close();

        service.setServiceDescription(serviceDescription);
        service.setPrice(price);

        return service;
    }
}
