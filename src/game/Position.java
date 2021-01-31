package game;

public class Position 
{
	private int row;
	private int column;
	
	public Position(String str)
	{
		row =  str.charAt(0) - 49;
		column = str.charAt(1) - 49;
		if(row>2 || column>2 || row<0 || column<0)
		{
			throw new GameException("Invalid Position!");
		}
	}

	public int getRow() 
	{
		return row;
	}
	public int getColumn()
	{
		return column;
	}	
}
