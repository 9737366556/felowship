package com.bridgelabs.Oops.deckOfCards;

import java.util.Random;

import com.bridgelabs.utility.QueueLinkedList;

/**
 * Purpose : To distribute the card between player and sort each player card
 * 
 * @author Nikunj Balar
 *
 */
public class DeckOfCards {
	public static void main(String[] args) {

		// creating QueueLinkedList implemented by author
		QueueLinkedList<String> quList = new QueueLinkedList<String>();
		String[] suit = { "C", "D", "H", "S" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		String deck[] = new String[suit.length * rank.length];
		String[] playere = { "nikunj", "nik", "kunj", "balar" };

		// entering all card into array
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < suit.length; j++) {
				deck[suit.length * i + j] = suit[j] + rank[i];
			}
		}
		// printing all card
		System.out.println("card befor suffering");
		for (int i = 0; i < deck.length; i++) {
			System.out.print(deck[i] + " ");
		}
		// suffering all cards
		System.out.println();
		System.out.println("card after suffering");
		Random random = new Random();
		// changing the position of the card
		for (int i = 0; i < deck.length; i++) {
			int r = i + random.nextInt(deck.length - i);
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		// printing all card after suffering
		for (int i = 0; i < deck.length; i++) {
			System.out.print(deck[i] + " ");
		}

		System.out.println();
		int k = 0;
		String[] player;
		// distribute 9 card to 4 player
		for (int i = 0; i < playere.length; i++) {
			player = new String[9];
			for (int j = 0; j < player.length; j++) {
				player[j] = deck[k]; // giving the card to the user
				k++;
			}
			// sorting all cards
			String[] sPlayer = sortCard(player);
			// inserting all 9 card into queue
			for (int j = 0; j < 9; j++) {
				quList.inserst(sPlayer[j]);
			}
			// printing the card of each player
			System.out.print("player " + playere[i] + " cards :");
			// removing card from queue for user
			for (int j = 0; j < 9; j++) {
				System.out.print(quList.removeFirst() + " ");
			}
			System.out.println();
		}
	}

	// function for sort the card
	private static String[] sortCard(String[] player) {
		String temp;
		for (int i = 0; i < player.length; i++) {
			for (int j = 0; j < player.length; j++) {
				if (player[i].compareTo(player[j]) < 0) {
					temp = player[i];
					player[i] = player[j];
					player[j] = temp;
				}
			}
		}
		return player;
	}
}