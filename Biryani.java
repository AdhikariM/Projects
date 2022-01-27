package RestaurantApp;

import java.util.Scanner;

public class Biryani {

	int chicken_price = 100;
	int veg_price = 50;
	int mutton_price = 125;
	static int biryani_total = 0;
	int chicken_biryani_total = 0;
	int veg_total = 0;
	int mutton_total = 0;
	Scanner scan = new Scanner(System.in);

	void chicken() {
		System.out.println("Enter the number of plates:");
		int plates = scan.nextInt();
		chicken_biryani_total += plates * chicken_price;
		biryani_total += chicken_biryani_total;
		System.out.println("your total for " + plates + " chicken biryani is " + chicken_biryani_total);
	}// end of chicken

	void vegeterian() {
		System.out.println("Enter the number of plates");
		int plates = scan.nextInt();
		veg_total += plates * veg_price;
		biryani_total += veg_total;
		System.out.println("your total for " + plates + " veg biryani is " + veg_total);
	}// end of vegeterian

	void mutton() {
		System.out.println("Enter the number of plates");
		int plates = scan.nextInt();
		mutton_total += plates * mutton_price;
		biryani_total += mutton_total;
		System.out.println("your total for " + plates + " mutton biryani is " + mutton_total);
	}

	public void Biryani_menu() {
		while (true) {
			System.out.println("********************************");
			System.out.println("           1. Chicken           ");
			System.out.println("           2. Vegeterian        ");
			System.out.println("           3. Mutton            ");
			System.out.println("           4. Back              ");
			System.out.println("********************************");
			
			System.out.println("Please make a selection of Biryani ");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				chicken();
				Biryani_menu();
				break;
			case 2:
				vegeterian();
				Biryani_menu();
				break;
			case 3:
				mutton();
				Biryani_menu();
				break;
			case 4:
				RestaurantApp.main(null);
			default:
				System.out.println("Enter a number for corresponding choices");

			}

		} // end of while

	}// end of biryani menu

}// end of biryani
