// Alia Dudkin
// COSC 1430 -501
// Project #2
// Due date: 2/28/2018


import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args)
	{
		// create instance of scanner
		Scanner keyboard = new Scanner(System.in);

		// show start message and ask for player one keyboard input
		System.out.println("Let's play Rock, Paper, Scissors!");
		System.out.print("Player One, enter your move (upper or lowercase R, P, or S): ");

		// store keyboard input in p1 variable
		String p1 = keyboard.nextLine();

		// converting input to upper case
		p1 = p1.toUpperCase();

		// if input for player one is more than one character, there will be an error
		if (p1.length() > 1){
			System.out.println("Error, must enter either upper or lowercase R, P, or S.");
			keyboard.close();
			return;
		}

		// if input for player one is any character other than R, S, or P, there will be an error
		switch (p1)
		{
			case "R":
			case "S":
			case "P":
				break;
			default:
				System.out.println("Error, must enter either upper or lowercase R, P, or S.");
				keyboard.close();
				return;
		}

		// ask for player two keyboard input
		System.out.print("Player Two, enter your move (upper or lowercase R, P,or S): ");

		// store keyboard input in variable p2
		String p2 = keyboard.nextLine();

		//convert input to upper case
		p2 = p2.toUpperCase();

		// if input for player two is more than one character, there will be an error
		if (p2.length() > 1){
			System.out.println("Error, must enter either upper or lowercase R, P, or S.");
			keyboard.close();
			return;
		}

		// if input for player two is any character other than R, S, or P, there will be an error
		switch (p2)
		{
			case "R":
			case "S":
			case "P":
				break;
			default:
				System.out.println("Error, must enter either upper or lowercase R, P, or S.");
				keyboard.close();
				return;
		}

		// detect winner
		if ( p1.equals(p2)) {
			System.out.println("It's a draw, play again.");
		} else if ( p1.equals("R") && p2.equals("S")) {
			System.out.println("Rock smashes scissors, Player One wins!");
		} else if ( p1.equals("R") && p2.equals("P")) {
			System.out.println("Paper covers rock, Player Two wins!");
		} else if ( p1.equals("P") && p2.equals("R")) {
			System.out.println("Paper covers rock, Player One wins!");
		} else if ( p1.equals("P") && p2.equals("S")) {
			System.out.println("Scissors cut paper, Player Two wins!");
		} else if ( p1.equals("S") && p2.equals("P")) {
			System.out.println("Scissors cut paper, Player One wins!");
		} else if ( p1.equals("S") && p2.equals("R")) {
			System.out.println("Rock smashes scissors, Player Two wins!");
		}

		keyboard.close();
	}
}

