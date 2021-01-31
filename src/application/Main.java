package application;

import java.util.Scanner;

import game.GameException;
import game.Match;
import game.Position;

public class Main 
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		Match match = new Match();
		
		while(!match.getEndGame())
		{
			try
			{
				UI.clearScreen();
				UI.printBoard(match);
				System.out.print("\nPosition: ");
				Position position = new Position(sc.next());
				match.performTurn(position);
				match.checkWinner();
			}
			catch(GameException e)
			{
				System.out.println(e.getMessage());
				sc.nextLine();
				sc.nextLine();
			}
		}
		UI.clearScreen();
		UI.printBoard(match);
		System.out.print("\nEnd Game!");
		sc.nextLine();
		sc.nextLine();
		
		sc.close();
	}
}
