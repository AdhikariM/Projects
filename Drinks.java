package RestaurantApp;

import java.util.Scanner;

public class Drinks {
	
	
	public void drinks() {
		while(true) {
		System.out.println("********************************");
		System.out.println("         1. Hot           ");
		System.out.println("         2. Cold          ");
		System.out.println("         3. Back          ");
		System.out.println("********************************");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			Hotdrinks h = new Hotdrinks();
			h.hotdrinks();
			break;
		case 2:
			ColdDrinks cd = new ColdDrinks();
			cd.CDrinks();
			
			break;
		case 3:
			RestaurantApp.main(null);
			default:
				
		}//end of switch
		scan.close();
		}//end of while
	}
	
	
	
}
