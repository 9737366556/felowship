package com.bridgelabs.Oops.deckOfCards;

import java.util.Random;

import com.bridgelabs.utility.QueueLinkedList;

public class DeckOfCards {
	public static void main(String[] args) {

		QueueLinkedList<String> quList = new QueueLinkedList<String>();
		String[] suit = { "C", "D", "H", "S" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		String deck[] = new String[suit.length * rank.length];
		String[] playere = { "nikunj", "nik", "kunj", "balar" };

		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < suit.length; j++) {
				deck[suit.length * i + j] = suit[j] + rank[i] ;
			}
		}
		System.out.println("card befor suffering");
		for (int i = 0; i < deck.length; i++) {
			System.out.print(deck[i] + " ");
		}
		System.out.println();
		System.out.println("card after suffering");
		Random random = new Random();
		for (int i = 0; i < deck.length; i++) {
			int r = i + random.nextInt(deck.length - i);
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}

		for (int i = 0; i < deck.length; i++) {
			System.out.print(deck[i] + " ");
		}

		System.out.println();
		int k = 0;
		String []player;
		for (int i = 0; i < playere.length; i++) {
			player  = new String[9];
			for (int j = 0; j < player.length; j++) {
				player[j] = deck[k];
				k++;
			}
			String []sPlayer=sortCard(player);
			for (int j = 0; j < 9; j++) {
				quList.inserst(sPlayer[j]);
			}
			System.out.print("player " + playere[i] + " cards :");
			for (int j = 0; j < 9; j++) {
				System.out.print(quList.removeFirst() + " ");
			}
			System.out.println();
		}
	}

	private static String[] sortCard(String[] player) {
		String temp;
		for (int i = 0; i < player.length; i++) {
			for (int j = 0; j < player.length; j++) {
				if(player[i].compareTo(player[j]) < 0) {
					temp = player[i];
					player[i] = player[j];
					player[j] = temp;
				}
			}
		}
		return player;
	}

	
}