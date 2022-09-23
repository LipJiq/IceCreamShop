package IceCream;
import java.util.Scanner;

public class IceCreamShop {

	private int type, number;
	private static int numOfIceCream;
	private double price1, price2;
	private java.util.Date BuyDate;
	private String str1 = String.valueOf(type);
	Scanner input = new Scanner(System.in);
	
	IceCreamShop()
	{
		System.out.println("-Welcome to Lipjiq IceCream Shop-\n");
		System.out.println(" What type of Ice Cream You Want? ");
		System.out.println(" (1-Cornetto 2-Solero 3-Magnum) ");
		type = input.nextInt();
		
		if (type == 1) {
			System.out.println("You chose Cornetto <3");
		} else if (type == 2) {
			System.out.println("You chose Solero <3");
		} else if (type == 3) {
			System.out.println("You chose Magnum <3");
		} else {
			while (type != 1 || type != 2 || type != 3)
			{
				System.out.println("Your number exceed the limit.\n Please Enter number from 1-3");
				type = input.nextInt();
				if (type == 1) {
					System.out.println("You chose Cornetto!!");
					break;
				} else if (type == 2) {
					System.out.println("You chose Solero!!");
					break;
				} else if (type == 3) {
					System.out.println("You chose Magnum!!");
					break;
				}
			}
		       }
		
		if (type == 1) {
			str1 = "Cornetto";
			System.out.println("How many " + str1 + " do you want to buy?");
		} else if (type == 2) {
			str1 = "Solero";
			System.out.println("How many " + str1 + " do you want to buy?");
		}else if (type == 3) {
			str1 = "Magnum";
			System.out.println("How many " + str1 + " do you want to buy?");
		}
		
		numOfIceCream = input.nextInt();
		 System.out.println("Your total price is"+" "+getPrice(numOfIceCream));
		 
		 System.out.println(" You bought "+ numOfIceCream + " " + str1 + " on " + getDate());
	}
	
	public double getPrice(int numOfIceCream)
	{
		
		if (type == 1) {
			price1 = 1.5;
			price2 = price1 * numOfIceCream;
		}else if (type == 2) {
			price1 = 2.0;
			price2 = price1 * numOfIceCream;
		}else if (type == 3) {
			price1 = 6.0;
			price2 = price1 * numOfIceCream;
		}
		
		return price2;
	}
	
	public java.util.Date getDate()
	{
		BuyDate = new java.util.Date();
		return BuyDate;
	}
	
	
	
		
	
	
	

}
