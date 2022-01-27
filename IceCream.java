package RestaurantApp;

import java.util.Scanner;

public class IceCream {
	int sb_price =25;
	int v_price =30;
	int ch_price = 35;
	static int ice_total =0;
	int sb_total=0;
	int v_total=0;
	int ch_total=0;
	Scanner scan = new Scanner(System.in);
	
	void strawberry() {
		System.out.println("Enter the number of cones ");
		int cones = scan.nextInt();
		sb_total+=cones*sb_price;
		ice_total+=sb_total;
		System.out.println("The total for "+ cones +" ice creams is "+ ice_total);
	}
	
	void vanilla() {
		System.out.println("Enter the number of cones");
		int cones = scan.nextInt();
		v_total+= cones*v_price;
		ice_total+=v_total;
		System.out.println("the total for " + cones+" ice creams is" + ice_total);
	}
	void chocolate() {
		System.out.println("Enter the number of cones");
		int cones =scan.nextInt();
		ch_total+=cones*ch_price;
		ice_total+=ch_total;
		System.out.println("the total for "+ cones+" ice creams is"+ice_total);
	}
	
	public void IceCream_menu() {
		while(true) {
		System.out.println("********************************");
		System.out.println("          1. Strawberry        ");
		System.out.println("          2. Vanilla           ");
		System.out.println("          3. Chocolate         ");
		System.out.println("          4. Back              ");
		System.out.println("********************************");
		System.out.println("Make a selection of Ice Cream");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			strawberry();
			IceCream_menu();
			break;
		case 2:
			vanilla();
			IceCream_menu();
			break;
		case 3:
			chocolate();
			IceCream_menu();
			break;
		case 4:
			RestaurantApp.main(null);
			default:
				System.out.println("Please make a vaid selection between 1 and 4");
			
		}//end of switch
		scan.close();
	}//end of while
	}//end of menu
}
