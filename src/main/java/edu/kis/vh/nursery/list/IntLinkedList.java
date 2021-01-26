package edu.kis.vh.nursery.list;

public class IntLinkedList {
	/**
	 * Klasa reprezentuje listę dwukierunkową
	 * zawierającą elementy typu int.
	 */

	Node last;
	/**
	 * last to ostatni element listy
	 */


	//int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}
	/**
	 *	push dodaje element na koniec listy
	 */

	public boolean isEmpty() {
		return last == null;
	}

	/**
	 * isEmpty sprawdza, czy lista jest pusta
	 * Jeśli jest, zwraca 1, jeśli nie, 0
	 */


	public boolean isFull() {
		return false;
	}
	/**
	 * isFull sprawdza, czy lista jest pełna
	 * Jeśli jest, zwraca 1, jeśli nie, 0
	 */


	public int top() {
		if (isEmpty())
			return -1;
		return last.value;
	}
	/**
	 * top zwraca ostatni element listy
	 * lub -1, gdy ta jest pusta
	 */

	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.value;
		last = last.prev;
		return ret;
	}
	/**
	 * pop zwraca ostatni element listy
	 * lub -1, gdy ta jest pusta.
	 * Dodatkowo usuwa ten element.
	 */

}
