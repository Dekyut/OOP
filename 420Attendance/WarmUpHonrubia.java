package WARMUP;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class WarmUpHonrubia {
	
	public static void main(String[] args) {
		
		ArrayList<Book> books = new ArrayList<>();
		
		Book book1 = new Book();
		book1._name = "System Analysis & Design";
		book1._author = "Gary B. Shelly";
		book1._copy = 2;
		
		Book book2 = new Book();
		book2._name = "Android Application";
		book2._author = "Corrine Hoisington";
		book2._copy = 3;
		
		Book book3 = new Book();
		book3._name = "Programming Concepts and Logic Formulation";
		book3._author = "Rosauro E. Manuel";
		book3._copy = 4;
		

        books.add(book1);
        books.add(book2);
        books.add(book3);
        

        boolean end = false;
        while (end == false) {
            try {
            	System.out.println("------------------------------");
                System.out.println("Electronic Book Rental System");
                System.out.println("------------------------------");
     
                for (int x = 0; x < books.size(); x++) {
                    System.out.print(x);
                  
                    System.out.print(" " + books.get(x).get_name() + ", " +  books.get(x).get_author());
                    System.out.println();
        
                }
                System.out.println("------------------------------");
        
                Scanner scan = new Scanner(System.in);

                System.out.print("Choose a number ");
                int choice = scan.nextInt();

                Book book = books.get(choice);
                int copy = book.get_copy();
                if (copy > 0){
                    System.out.println("You rented: " + books.get(choice).get_name());
                    book.set_copy(copy-=1);
                }
                else{
                    
                    System.out.println("No copies available");
                }


                System.out.println("Rent again? Yes/No");
                String again = scan.next();
                if (again.equals("No")) {
                    end = true;
                }
                else if (again.equals("Yes")){
                    continue;
                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid Choice");
            } catch (InputMismatchException e) {
                System.out.println("Invalid Choice");
            }
        }
        System.out.println("PROGRAM END");
    }
}
		
