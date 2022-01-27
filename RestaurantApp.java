package RestaurantApp;

import java.util.Scanner;

public class RestaurantApp {
	
	static void bill() {
		System.out.println("********************************");
		System.out.println("Biryani total "+ Biryani.biryani_total);
		System.out.println("Ice Cream total "+ IceCream.ice_total);
		System.out.println("Drinks total is "+ Hotdrinks.hot_total+ColdDrinks.cd_total);
		
		int final_bill = Biryani.biryani_total+IceCream.ice_total+Hotdrinks.hot_total+ColdDrinks.cd_total;
		System.out.println("Your total for all order is "+ final_bill);
		System.out.println("Thank you for visiting");
		System.out.println("********************************");
		
	}//end of bill

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.println("********************************");
		System.out.println("        1. Biryani        ");
		System.out.println("        2. Ice Creams     ");
		System.out.println("        3. Drinks         ");
		System.out.println("        4. Bill           ");
		System.out.println("        5. Exit           ");
		System.out.println("********************************");
		
		
		System.out.println("Enter your choice :");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			Biryani details = new Biryani();
			details.Biryani_menu();
			break;
		
		case 2:
			IceCream menu = new IceCream();
			menu.IceCream_menu();
			break;
		case 3:
			Drinks d = new Drinks();
			d.drinks();
			break;
		case 4:
			bill();
			break;
		case 5:
			System.out.println("thank you for visiting");
			System.exit(0);
			default:
		System.out.println("enter numbers between 1 and 5 ");
		}//end of switch	
		} //end of while

	}//end of main

}
