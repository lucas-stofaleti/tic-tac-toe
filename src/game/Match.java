package game;

public class Match 
{
	private Mark[][] board;
	private Mark turn;
	private boolean endgame;
	
	public Match() 
	{
		board = new Mark[3][3];
		turn = Mark.X;
		endgame = false;
	}
	
	public void nextTurn()
	{
		if(turn==Mark.O)
		{
			turn = Mark.X;
		}
		else
		{
			turn = Mark.O;
		}
	}
	
	public void performTurn(Position position)
	{
		if(board[position.getRow()][position.getColumn()]!=null)
		{
			throw new GameException("Occupied Position!");
		}
		board[position.getRow()][position.getColumn()] = turn;
		nextTurn();
	}
	
	public void checkWinner()
	{
		if( (board[0][0]==board[0][1] && board[0][0]==board[0][2] && board[0][0]!=null) || (board[1][0]==board[1][1] && board[1][0]==board[1][2] && board[1][0]!=null) || board[2][0]==board[2][1] && board[2][0]==board[2][2]  && board[2][0]!=null)
		{
			endgame = true;
		}
		else if( (board[0][0]==board[1][0] && board[0][0]==board[2][0]  && board[1][0]!=null) || (board[0][1]==board[1][1] && board[0][1]==board[2][1]  && board[1][1]!=null) || board[0][2]==board[1][2] && board[0][2]==board[2][2]  && board[2][2]!=null)
		{
			endgame = true;
		}
		else if( (board[0][0]==board[1][1] && board[0][0]==board[2][2]  && board[0][0]!=null) || (board[0][2]==board[1][1] && board[0][2]==board[2][0]  && board[1][1]!=null) )
		{
			endgame = true;
		}
	}

	public Mark[][] getBoard() 
	{
		return board;
	}
	public Mark getTurn() 
	{
		return turn;
	}
	public boolean getEndGame() 
	{
		return endgame;
	}
}
