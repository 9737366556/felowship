package com.bridgelabs.logicalPrograms.programs;

import java.util.Arrays;

import com.bridgelabs.basicProgramming.utility.Utility;

/**
 * Purpose : Entertainment of User with TicTacToeGame
 * 
 * @author Nikunj Balar
 *
 */
public class TicTacToeGame {

	public static final int X = 1, O = -1;
	public static final int EMPTY = 0;
	public int player = X;
	private int[][] board = new int[3][3];
	public boolean isEmpty = false;
	static int n = 0;
	static StringBuffer input = new StringBuffer();

	public TicTacToeGame() {
		// TODO Auto-generated constructor stub
	}

	public boolean isWin(int PLAYER) { // defining all winning possibilities of both user
		return ((board[0][0] + board[0][1] + board[0][2] == PLAYER * 3)
				|| (board[1][0] + board[1][1] + board[1][2] == PLAYER * 3)
				|| (board[2][0] + board[2][1] + board[2][2] == PLAYER * 3)
				|| (board[0][0] + board[1][0] + board[2][0] == PLAYER * 3)
				|| (board[0][1] + board[1][1] + board[2][1] == PLAYER * 3)
				|| (board[0][2] + board[1][2] + board[2][2] == PLAYER * 3)
				|| (board[0][0] + board[1][1] + board[2][2] == PLAYER * 3)
				|| (board[2][0] + board[1][1] + board[0][2] == PLAYER * 3));
	}

	public void displayWinner() {
		if (isWin(X)) { // checking winning positions of X
			System.out.println("\n X wins...!!!");
			isEmpty = false;
		} else if (isWin(O)) { // checking winning positions of O
			System.out.println("\n O wins...!!!");
			isEmpty = false;
		} else {
			if (!isEmpty) // if board is full then its a tie
				System.out.println("Its a tie...!!!");
		}
	}

	public void position(int n) { // Entering the positions by user\

		if (n <= 0 || n >= 10) { // condition to input between 0 to 10
			System.out.println("Enter a valid position!!");
			return;
		}
		if (n != EMPTY) {
			System.out.println("Position is occupied");

		}
		if (n > 0 || n < 10 || n == EMPTY) {
			switch (n) {
			case 1:
				board[0][0] = player;
				break;
			case 2:
				board[0][1] = player;
				break;
			case 3:
				board[0][2] = player;
				break;
			case 4:
				board[1][0] = player;
				break;
			case 5:
				board[1][1] = player;
				break;
			case 6:
				board[1][2] = player;
				break;
			case 7:
				board[2][0] = player;
				break;
			case 8:
				board[2][1] = player;
				break;
			case 9:
				board[2][2] = player;
				break;
			default:
				System.out.println("invalid input!!");
			}
			player = -player; // after first players input changing player
		}
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		isEmpty = false;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				switch (board[i][j]) {
				case X:
					sb.append(" X ");
					break;
				case O:
					sb.append(" O ");
					break;
				case EMPTY:
					sb.append(" ");
					isEmpty = true;
					break;
				}

				if (j < 2) {
					sb.append("|");
				}
			}
			if (i < 2) {
				sb.append("\n------------\n");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		TicTacToeGame t = new TicTacToeGame();
		int i = 0;
		do {
			System.out.println(t.player == X ? "Player X turn" : "Player O turn"); // checking the player
			System.out.print("Enter posotion 1 to 9: ");
			n = Utility.integerInput(); // taking position input from user

			t.position(n);

			System.out.println(t.toString());
			System.out.println("_______________");
			t.displayWinner();
		} while (t.isEmpty); // while position is empty it will execute do

	}
}
