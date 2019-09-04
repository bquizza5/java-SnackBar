package snackbar;

import java.util.*;

public class Main 
{
	public static void main(String[] args)
	{
		// Dogs dogArr[];
		// dogArr = new Dogs[5];


		Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);


        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());

        Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

        c1.buy(s4.returnTotalCost(3));
        System.out.println(s4.getQuantity());

        c1.buy(s3.buySnack(1));
        System.out.println(s3.getQuantity());

        c2.buy(s4.returnTotalCost(2));
        System.out.println(s4.getQuantity());

        c1.addCash(10.00);
        System.out.println(c1.getCashOnHand());

        c1.buy(s2.buySnack(1));
        System.out.println(c1.getCashOnHand());
        System.out.println(s2.getQuantity());

        s3.addQuantity(12);
        System.out.println(s3.getQuantity());

        c2.buy(s3.returnTotalCost(3));
        System.out.println(c2.getCashOnHand());
        System.out.println(s3.getQuantity());

        // stretch

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        System.out.println(s4.toString());
        System.out.println(s5.toString());


    }
}