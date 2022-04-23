package array;

import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
runGame();	}
	public static void runGame()
	{
		String winner="";
		boolean xTurn=true;
		int theRow=0;
		int theCol=0;
		String[][] gameBoard=new String[3][3];
		initializeGameBoard(gameBoard);
		printCurrentBoard(gameBoard);
		while(winner.equals(""))
		{
			if(xTurn) {
				System.out.println("It is X's turn");
							}
			else {
				System.out.println("It is 0's turn");
			}
			getUserInput(xTurn,gameBoard);
			System.out.println();
			printCurrentBoard(gameBoard);
			winner=getWinner(gameBoard);
			xTurn=!xTurn;
			if(winner.equals("")&&isBoardFull(gameBoard))
			{
				winner="C";
					
			}
					}
		System.out.println();
		if(winner.equals("C")) {
			System.out.println("It was the cat's game!NO WINNER!");
		}
		else {
			System.out.println("The winner is"+winner);

		}
			}
public static void initializeGameBoard(String[][] gameBoard) {
	for(int i=0;i<gameBoard.length;i++)
	{
		for(int j=0;j<gameBoard[i].length;j++) {
			gameBoard[i][j]="";
		}
	}
}
public static void printCurrentBoard(String[][] gameBoard) {
	for(int i=0;i<gameBoard.length;i++)
	{
		for(int j=0;j<gameBoard[i].length;j++) {
			System.out.println(gameBoard[i][j]);
			if(j<2) {
			System.out.print(" | ");	
			}
			}
		System.out.println();
		if(i<2) {
			System.out.print("-----");
		}
		System.out.println();
		}
		}
public static void getUserInput(boolean xTurn,String[][] gameBoard)
{
	Scanner sc=new Scanner(System.in);
	int row=-1;
	int col=-1;
	boolean keepAsking=true;
	while(keepAsking) {
		System.out.println("plz enter the row THEN"+"the column,each from 0,1,or 2,"+"seperated by a space");
		row=sc.nextInt();
		col=sc.nextInt();
		sc.next();
		if(row>=0&&row<=2&&col>=0&&col<=2) {
			if(!cellAlreadyOccupied(row,col,gameBoard)) {
				keepAsking=false;
			}
			else {
				System.out.println("that cell is already occupied");
			}
		}

	}
	if(xTurn) {
		gameBoard[row][col]="X";
	}
	else {
		gameBoard[row][col]="0";
	}
	}
public static boolean cellAlreadyOccupied(int row,int col,String[][] gameBoard) {
	return !gameBoard[row][col].equals("");
	}
public static String getWinner(String[][] gameBoard) {
	final int ROWS=gameBoard.length;
	final int COLS=gameBoard[0].length;
	for(int i=0;i<ROWS;i++) {
		if(!gameBoard[i][0].equals("")&&gameBoard[i][0].equals(gameBoard[i][1])&&gameBoard[i][1].equals(gameBoard[i][2]))
		{
			return gameBoard[i][0];
		}
	}
	for(int i=0;i<COLS;i++) {
		if(!gameBoard[0][i].equals(" ")&&gameBoard[0][i].equals(gameBoard[1][i])&&gameBoard[1][i].equals(gameBoard[2][i]))
		{
			return gameBoard[0][i];
		}
	}
	if(!gameBoard[0][0].equals(" ")&&gameBoard[0][0].equals(gameBoard[1][1])&&gameBoard[1][1].equals(gameBoard[2][2])) {
		return gameBoard[0][0];
	}
	return "";
}
public static boolean isBoardFull(String[][] gameBoard)
{
	int countFill=0;
	for(int i=0;i<gameBoard.length;i++) {
		for(int j=0;j<gameBoard[i].length;j++)
		{
			if(!gameBoard[i][j].equals("")) {
				countFill++;
			}
		}
	}
	return countFill==9;
	}
}
