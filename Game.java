import java.util.Scanner;

class Guesser {

	int guessNum;

	public int guessNumber() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser Kindly Guess the Number");
		guessNum=sc.nextInt();
		return guessNum;
	}
}

class Player {

	int pguessNum;
	public int guessNumber() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Player Kindly Guess the Number");
		pguessNum=sc.nextInt();
		return pguessNum;
	}
}

class Umpire {

	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void collectNumberFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNumber();
	}
	
	public void collectNumberFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1=p1.guessNumber();
		numFromPlayer2=p2.guessNumber();
		numFromPlayer3=p3.guessNumber();
	}
	
	void compare()
	{
		if(numFromGuesser==numFromPlayer1) 
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Game tied all won the game");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player1 and Player2 won the game");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player1 and Player3 won the game");
			}
			else {
			System.out.println("Player1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player2 and Player3 won the game");
			}
			else {
			System.out.println("Player2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player3 won the game");
		}
		else if(numFromGuesser>numFromPlayer1 )
		{
			if(numFromGuesser>numFromPlayer2 && numFromGuesser>numFromPlayer3)
			{
				System.out.println("Player1 Player2 and Player3 Number is low enter a high number");
			}
			else if(numFromGuesser<numFromPlayer2 && numFromGuesser<numFromPlayer3)
			{
				System.out.println("Player 1 the no is low enter a high number,Player2 and Player3 the no is high enter a low number");
			}
			else if(numFromGuesser<numFromPlayer2 && numFromGuesser>numFromPlayer3)
			{
				System.out.println("Player1 and Player3 number is low enter a high number, Player2 number is high enter low number");
			}
			else if(numFromGuesser>numFromPlayer2 && numFromGuesser<numFromPlayer3)
			{
				System.out.println("Player1 and Player2 number is low enter a high no,Player3 number is high enter a low number");
			}
			else if(numFromGuesser>numFromPlayer2)
			{
				System.out.println("Player1 and Player2  Number is low enter a high number");
			}
			else if(numFromGuesser<numFromPlayer2)
			{
				System.out.println("Player1 number is low enter a high number ,Player2 number is high enter a low number");
			}
			else if(numFromGuesser>numFromPlayer3)
			{
				System.out.println("Player1 and Player3 Number is low enter a high number");
			}
			else if(numFromGuesser<numFromPlayer3)
			{
				System.out.println("Player1 and Player3 Number is low enter a high number");
			}
			else {
			System.out.println("Player1 Number is low enter a high number ");
			}
		}
		else if(numFromGuesser>numFromPlayer2)
		{
			if(numFromGuesser>numFromPlayer3)
			{
				System.out.println("Player2 and Player3 Number is low enter a high number");
			}
			else if(numFromGuesser<numFromPlayer3)
			{
				System.out.println("Player2 number is low enter a high number, Player3 Number is high enter a low number");
			}
			else {
			System.out.println("Player2 Number is low enter a high number ");
			}
		}
		else if(numFromGuesser>numFromPlayer3)
		{
			System.out.println("Player3 Number is low enter a high number ");
		}
		else if(numFromGuesser<numFromPlayer1 )
		{
			if(numFromGuesser<numFromPlayer2 && numFromGuesser<numFromPlayer3)
			{
				System.out.println("Player1 Player2 and Player3 Number is high enter a low number");
			}
			else if(numFromGuesser>numFromPlayer2 && numFromGuesser>numFromPlayer3)
			{
				System.out.println("Player 1 the no is high enter a low number,Player2 and Player3 the no is low enter a high number");
			}
			else if(numFromGuesser<numFromPlayer2 && numFromGuesser>numFromPlayer3)
			{
				System.out.println("Player 1 and Player2 number is high enter a low number ,Player3 number is low enter a high number");
			}
			else if(numFromGuesser>numFromPlayer2 && numFromGuesser<numFromPlayer3)
			{
				System.out.println("Player1 and Player3 number is high enter a low number , Player2 number is low enter a high number");
			}
			else if(numFromGuesser<numFromPlayer2)
			{
				System.out.println("Player1 and Player2  Number is high enter a low number");
			}
			else if(numFromGuesser>numFromPlayer2)
			{
				System.out.println("Player1 number is high enter a low number,Player2 number is low enter a high number");
			}
			else if(numFromGuesser<numFromPlayer3)
			{
				System.out.println("Player1 and Player3 Number is high enter a low number");
			}
			else if(numFromGuesser>numFromPlayer3)
			{
				System.out.println("Player1 number is high enter a low number,Player3 number is low enter a high number");
			}
			else {
			System.out.println("Player1 Number is high enter a low number ");
			}
		}
		else if(numFromGuesser<numFromPlayer2)
		{
			if(numFromGuesser<numFromPlayer3)
			{
				System.out.println("Player2 and Player3 Number is high enter a low number");
			}
			else if(numFromGuesser>numFromPlayer3)
			{
				System.out.println("Player2 number is high enter a low number, Player3 Number is low enter a high number");
			}
			else {
			System.out.println("Player2 Number is high enter a low number ");
			}
		}
		else if(numFromGuesser<numFromPlayer3)
		{
			System.out.println("Player3 Number is high enter a low number ");
		}
		else
		{
			System.out.println("Game lost ");
		}
	}
}

public class Game {
	public static void main(String[] args) {
		Umpire u=new Umpire();
		u.collectNumberFromGuesser();
		u.collectNumberFromPlayer();
		u.compare();
	}
}
