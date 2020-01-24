package com.bridgelabs.dataStructure;

import com.bridgelabs.utility.QueueLinkedList;

public class BankingCashCounter {
	public static void main(String[] args) {

		QueueLinkedList<Integer> queuelist = new QueueLinkedList<Integer>();
		queuelist.inserst(12);
		queuelist.inserst(20);
		queuelist.inserst(12);
		queuelist.inserst(20);
		queuelist.inserst(12);
		queuelist.inserst(20);
		queuelist.inserst(12);
		queuelist.inserst(20);
		queuelist.show();
		
		System.out.println(queuelist.size());
		queuelist.show();

	}
}