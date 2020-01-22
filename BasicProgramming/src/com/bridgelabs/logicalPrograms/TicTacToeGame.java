package com.bridgelabs.logicalPrograms;

import com.bridgelabs.utility.Utility;

/**
 * Purpose : Entertainment of User with TicTacToeGame
 * 
 * @author Nikunj Balar
 *
 */
public class TicTacToeGame {

	// function to check player is win or not
	static boolean isWin(char[][] board) { // defining all winning possibilities of both user
		boolean win = false;
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
				win = true;
			} else if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
				win = true;
			} else if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
				win = true;
			} else if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
				win = true;
			}
		}
		return win;
	}

	// function to check for draw case
	static boolean isDraw(char[][] board) {
		boolean draw = false;
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if ((board[i][j] == 'X' || board[i][j] == 'O') && board[i][j] != ' ')
					count++;
			}
		}
		if (count == 9) {
			draw = true;
		}
		return draw;

	}

	// function for dispplaying board with user input
	static void displayBoard(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (j != board[i].length - 1)
					System.out.print(board[i][j] + " | ");
				else
					System.out.println(board[i][j]);
			}
			if (i < 2)
				System.out.println("---------");
		}
	}

	private static void position(char[][] board, char player) {

		int row, column;
		while (!isWin(board) == true || !isDraw(board) == true) {

			// get input for row/column
			System.out.println("Enter a row and column (0, 1, or 2); for player " + player + ":");
			row = Utility.integerInput();
			column = Utility.integerInput();
			// cheaking for valid position
			if (row < 0 || row > 2) {
				System.out.println("enter valid position");
				position(board, player);
			} else if (column < 0 || column > 2) {
				System.out.println("enter valid position");
				position(board, player);
			} else {
				// check spot is occupied or not
				while (board[row][column] == 'X' || board[row][column] == 'O') {
					System.out.println("This spot is occupied. Please try again");
					position(board, player);
					break;
				}
				// place the X in 2D array at board[row][column] position
				board[row][column] = player;
				displayBoard(board);

				// check player is win or not
				if (isWin(board)) {
					System.out.println("Player " + player + " is the winner!");
					break;
				}
				// check gaem id draw or not
				if (isDraw(board)) {
					System.out.println("Draw");
					break;
				}

				// swap players after the terms.
				if (player == 'O') {
					player = 'X';

				} else {
					player = 'O';
				}
			}
		}
	}

	public static void main(String[] args) {

		char[][] board = new char[3][3];
		char ch = ' ';
		char player = 'X';

		// initialise position of array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ch;
			}
		}
		// displaying board
		displayBoard(board);

		position(board, player);
	}
}