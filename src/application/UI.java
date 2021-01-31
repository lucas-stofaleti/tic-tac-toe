package application;

import game.Mark;
import game.Match;

public class UI 
{
	public static void printBoard(Match match)
	{
		System.out.println("  1 2 3");
		for (int i=0; i<match.getBoard().length; i++)
		{
			System.out.print((i+1) + " ");
			for (int j=0; j<match.getBoard()[i].length; j++)
			{
				if(match.getBoard()[i][j]==null)
				{
					System.out.print("- ");
				}
				else if(match.getBoard()[i][j]==Mark.O)
				{
					System.out.print("O ");
				}
				else
				{
					System.out.print("X ");
				}
			}
			System.out.println("");
		}
		if(!match.getEndGame())
		{
			System.out.println("\nTurn: " + match.getTurn());
		}
	}
	
	public static void clearScreen() 
	{
		 System.out.print("\033[H\033[2J");
		 System.out.flush();
	} 
}
