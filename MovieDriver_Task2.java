import java.util.Scanner;

public class MovieDriver_Task2 {

	public static void main(String[] args) {
//String used to help the loop run		
		String d = "y";
		
//Creates Scanner and Movie instance		
		Scanner scn = new Scanner(System.in);
		Movie first = new Movie();
		
//Loop Starts		
		while(d.equals("y")){
			
//Requests and gets name of the Movie instance			
		System.out.println("What is the name of the movie?");
		String a = scn.nextLine();
		first.setTitle(a);
//Requests and gets the rating of the Movie instance		
		System.out.println("What is the movie's rating?");
		String b = scn.nextLine();
		first.setRating(b);

//Requests and gets, and sets the amount of tickets sold at the theatre		
		System.out.println("How many tickets were sold at the theatre?");
		int c = scn.nextInt();
		first.setSoldTickets(c);

//toString print to display the info input by the user	
		System.out.println(first);
		
//Asks the user if they want to enter info for another movie and the loop either continues or ends
		System.out.println("Do you want to enter another? (y or n)");
		d = scn.next().toLowerCase();
		scn.nextLine();
	}
//Good bye print to end the program	
		System.out.println("Goodbye");
		
	scn.close();
	} 

}
