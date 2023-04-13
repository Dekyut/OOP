package Honrubia;

import java.util.Scanner;



public class WarnUpHonrubia {
	public static void main(String[] args) {
		Book book = new Book();
		System.out.println("-----------------------------");
		System.out.println("ELECTRONIC BOOK RENTAL SYSTEM");
		System.out.println("-----------------------------");

		for (int x = 0; x < book.name.length; x++) {
			System.out.print(x);
			System.out.print(" - " + book.name[x] + " - " + book.author[x]);
			System.out.println();
		}

		Scanner in = new Scanner(System.in);
		boolean end = false;

		while (end == false) {
			System.out.println("---------------------------");
			System.out.print("CHOOSE A NUMBER TO RENT YOUR FAVORITE BOOK: ");
			int choice = in.nextInt();
			String s = in.nextLine();
			try {
				if (book.copies[choice] > 0) {
					System.out.println("YOU RENTED: " + book.name[choice] + " by "+ book.author[choice]);
					book.copies[choice] -= 1;
				}
				else {
					System.out.println("THERE ARE NO MORE COPIES IN STOCK");
				}

				System.out.println("RENT AGAIN? Y/N");
				String YESNO = in.nextLine();
				if (YESNO.equals("Y")) {
					end = false;
				} else if (YESNO.equals("N")) {
					end = true;
				}
			} catch (Exception e) {
				System.out.println("INVALID INPUT");
			}
		}
		System.out.println("EXITING SYSTEM");
	}

}




