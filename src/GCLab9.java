//I really was lost with this one :(

import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GCLab9 {

	private static Map<String, Double> menu = new TreeMap<>();

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String userWantsToPlay = "y";
		while (userWantsToPlay.startsWith("y")) {

			printMenu();
			// populateMenu();

			//List<String> cartNames = Arrays.asList("apple", "pear", "lemon", "berries", "kiwi", "banana", "grapes","figs");
			//List<Double> cartPrices = Arrays.asList(1.25, 1.46, 0.99, 2.25, 1.54, 0.87, 3.75, 2.98);

			// this is not correct; feeling lost in terms of how to proceed
			System.out.println("What item would you like?");
			String order = scnr.nextLine();
			System.out.println("Adding " + order + " to cart at: ");
			System.out.println("Would you like to add another item? (y/n)");
			userWantsToPlay = scnr.nextLine();

		}
		System.out.println("Thanks for your order!");
	}

	private static void populateMenu() {
		menu.put("apple", 1.25);
		menu.put("pear", 1.46);
		menu.put("lemon", 0.99);
		menu.put("berries", 2.25);
		menu.put("kiwi", 1.54);
		menu.put("banana", 0.87);
		menu.put("grapes", 3.75);
		menu.put("figs", 2.98);
	}

	private static void printMenu() {
		System.out.println("Welcome to the Awesome Fruit Market!");
		System.out.println();
		System.out.println("Item\t\tPrice");
		System.out.println("=====================");
		System.out.println("apple\t\t$1.25");
		System.out.println("pear\t\t$1.46");
		System.out.println("lemon\t\t$0.99");
		System.out.println("berries\t\t$2.25");
		System.out.println("kiwi\t\t$1.54");
		System.out.println("banana\t\t$0.87");
		System.out.println("grapes\t\t$3.75");
		System.out.println("figs\t\t$2.98");
		System.out.println();
		System.out.println("(you can only add the items listed above)");
	}
}



