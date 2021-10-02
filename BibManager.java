import java.util.ArrayList;
//since we're making it simple, arraylists should be fine, right?
import java.util.Scanner;
public class BibManager {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //initialize scanner
		Scanner scanInside = new Scanner(System.in); //a second scanner variable to not confuse things
		char option = ' ';
		String xyz = "";
		
		String title = ""; //more variables to be added
		
		do {
		displaymenu(); //call the menu
		xyz = scan.nextLine(); //scans user input
		if (xyz.length() > 0) { //takes the user input and validates it
			option = xyz.charAt(0); //if more than one items are entered than the first character is implemented
		}
		else { option = ' '; }
		switch (option) {
		case 'A' : //Add a new entry
			println("Title:");// print and ask user for details about the entry they are making, name, author, date, etc
			title = scanInside.nextLine(); //store it in variable and so on
			//once the user has completed the entry, use toString method to compile their responses in APA format and store it in arraylist
		case 'B' : //Search
			//not sure how to implement a search, might have to do it after arraylist is implemented
		case 'C' : //Export
			//put off until everything else is done
		case 'D' : //View all
			//
		case 'E' : //quit
			println("Byeee!");
			break;
		default: //in case the user inputs something other than the mentioned options
			println("Please enter a valid option!");
			break;
		}
		
		
		} while (option != 'E');
		
		
		
	}
	
	private static void displaymenu() { //tentative menu options
		println("Select an Option:");
		println("[A] Add a new entry");
		println("[B] Search");
		println("[C] Export");
		println("[D] View all");
		println("[E] Quit");
	}
	private static void println(String s) {
		System.out.println(s); //to make life easier and not type too much
	}
	public String toString() {
		return "";
		//toString method with APA format
	}

}
