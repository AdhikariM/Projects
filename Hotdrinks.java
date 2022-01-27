package RestaurantApp;

import java.util.Scanner;

public class Hotdrinks {
	int tea =10;
	int tea_total =0;
	int coffee =15;
	int co_total=0;
	static int hot_total = 0;
	void tea() {
		System.out.println("Enter number of cups ");
		Scanner scan = new Scanner(System.in);
		int cups = scan.nextInt();
		tea_total+=cups*tea;
		hot_total+=tea_total;
		System.out.println("your total for "+ cups+" of tea is "+ tea_total);
		scan.close();
		}
	
	void coffee() {
		System.out.println("Enter the number of coffee:");
		Scanner scan = new Scanner(System.in);
		int cups =scan.nextInt();
		co_total+=cups*coffee;
		hot_total+=co_total;
		System.out.println("your total for "+cups+" of coffee is "+ co_total);
		scan.close();
	}
	public void hotdrinks() {
		while(true) {
		System.out.println("********************************");
		System.out.println("         1. Tea        ");
		System.out.println("         2. Coffee     ");
		System.out.println("         3. Back       ");
		System.out.println("********************************");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please make a selection");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			tea();
			hotdrinks();
			break;
		case 2:
			coffee();
			hotdrinks();
			break;
		case 3:
			
			Drinks d = new Drinks();
			d.drinks();
			default:
				System.out.println("Please make a valid selection");
		}
		scan.close();
		}//while end
	}

}
