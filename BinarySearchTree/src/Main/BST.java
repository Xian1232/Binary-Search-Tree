package Main;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

//Christian Young, CSC 130, 11/8/22
public class BST {
	public static void main(String[] args) {
		BinarySearchTree access2 = new BinarySearchTree();
		
		try {
			File fileData = new File("pokemon.txt");  //Scans the file
			Scanner kb = new Scanner(fileData); //Opens scanner
			
			System.out.println(access2.about()); //Me :D
			
			String str = kb.nextLine();
			int digits = Integer.parseInt(str);  //Counts the digits in first line,
			System.out.println(digits);          //stores it for later, and then
				                                 //prints it
		while(kb.hasNext()) {
			String y = kb.nextLine();
			
			if (y.equals("END")) {  //If we've reached "END", it breaks the while loop
				break;
			}
			
			Entry e = new Entry();
			e.Key = Integer.valueOf(y.split(",")[0]); //Parsing Key into an array (Key-Value)
			e.lineOfText = y.split(",")[1];    //Parsing lineOfText into array (Key-Value)
			
			access2.add(e);          //Adds Key-Values to access2 so I can use the BST methods 

		}

		access2.print(); //Prints out the Tree
		System.out.println(access2.find(0)); //Prints to terminal the lineOfText of the wanted Key
		System.out.println(access2.find(151));
		System.out.println(access2.find(1));
		System.out.println(access2.find(75));
		kb.close();	
		} catch (FileNotFoundException e) {
    		System.out.println("FileNotFound Exception");  //Just a catch statement in case of no existing file
			e.printStackTrace();
		}
		System.out.println("END");  //Iterated END just bc it makes it easier
	
	}

}