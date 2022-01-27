package RestaurantApp;

import java.util.Scanner;

public class ColdDrinks {
	int coke =30;
	int sprite =25;
	int c_total=0;
	int s_total =0;
	static int cd_total=0;
	void coke() {
		System.out.println("how many drinks would you like?");
		Scanner scan = new Scanner(System.in);
		int bottle = scan.nextInt();
		c_total+=bottle*coke;
		cd_total+=c_total;
		System.out.println("Your total for "+ bottle + "cokes is "+ cd_total);
		scan.close();
		}
	
	void sprite() {
		System.out.println("how many drinks would you like?");
		Scanner scan = new Scanner(System.in);
		int bottle = scan.nextInt();
		s_total+=bottle*sprite;
		cd_total+=s_total;
		System.out.println("Your total for "+ bottle + "sprite is "+ cd_total);
		scan.close();
	}

	public void CDrinks() {
		while(true) {
		System.out.println("********************************");
		System.out.println("         1. Coke       ");
		System.out.println("         2. Sprite     ");
		System.out.println("         3. Back       ");
		System.out.println("********************************");
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a choice");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			coke();
			break;
		case 2:
			sprite();
			break;
		case 3:
			Drinks d = new Drinks();
			d.drinks();
			
			default:
				System.out.println("Please make valid selection");
		}//switch ends
		scan.close();
		}//where ends
	}
		}

