package intlinst;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Deze klasse slaat een lijst int-waarden op.
 * TODO is dus mutable
 * @invar | 0<= getLength()
 * @invar | getArray() != null
 * @invar | getArray().length == getLength()
 * @invar | IntStream.range(0, getLength()).allMatch(
 * 			| i -> getArray()[i] == getElement(i))
 */
public class IntList {
	
	private class Node {
		int value;
		Node next;
		
		Node(int element, Node next) {
			this.value = element;
			this.next = next;
		}
	}
	
	private Node[] getNodes() {
		Node[] result = new Node[length];
		Node k = head;
		for (int i = 0; i < length; i++) {
			if (k==null) {
				return null;
			}
			result[i] = k;
			k = k.next;
		}
		// return null als het onbject langer is dan 'length'
		if (k!= null) {
			return null;
		}
		return result;
	}
	
	/**
	 * @invar | 0 <= length
	 * @invar | getNodes() != null
	 * TODO die laatste begrijp ik niet helemaal
	 */
	private Node head;
	private int length;
	
	public int getLength() {
		Node next = this.next;
		int counter = 1;
		while (next != null) {
			next = this.next;
			counter++;
		};
	}
	/**
	 * @pre | 0 <= index && index <= getLength()
	 */
	public int getElement(int index) {
		Node k = head;
		for (int i=0; i<index;i++) {
			k = k.next;
		};
		return k.value;
	}
	
	/**
	 * TODO !!
	 * @creates | result
	 * @post | result != null
	 */
	public int[] getArray() {
		int[] result = new int[length];
		Node k = head;
		for (int i=0; i<length;i++) {
			result[i] = k.value;
			k = k.next;
		};
		return result.clone();
	}
	
	
	/**
	 * @creates | this
	 * @post | getLength() == 0
	 * @post | getArray() == new int[] {}
	 */
	public IntList() {
		this.head = null;
	}
	
	/**
	 * @mutates | this
	 * @post getLength() == old(getLength) + 1
	 * @post | Arrays.equals(old(getArray()), 0, old(getLength()),
	 * 	     | getArray(), 0, old(getLength()))
	 * @post Het laatste element van de nieuwe lijst is b
	 */
	public void add(int b) {
		Node k = this.head;
		int counter = 1;
		while (k != null) {
			k = k.next;
			counter++;
		};
		k.next = new Node(0, null);
	}
	
	/**
	 * cf add
	 */
	public void remove(int c) {
		Node next = this.next;
		int counter = 1;
		while (next != null) {
			next = this.next;
			counter++;
		};
		next = new Node(0, null);
	}
	
}
