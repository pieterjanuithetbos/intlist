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
	
		
	public int getLength() {
		;
	}
	/**
	 * @pre | 0 <= index && index <= getLength()
	 */
	public int getElement(int index) {
		;
	}
	public int[] getArray() {
		;
	}
	
	/**
	 * @creates | this
	 * @post | getLength() == 0
	 * @post | getArray() == new int[] {}
	 */
	public IntList() {
		;
	}
	
	/**
	 * @mutates | this
	 * @post getLength() == old(getLength) + 1
	 * @post | Arrays.equals(old(getArray()), 0, old(getLength()),
	 * 	     | getArray(), 0, old(getLength()))
	 * @post Het laatste element van de nieuwe lijst is b
	 */
	public void add(int b) {
		;
	}
	
	/**
	 * cf add
	 */
	public void remove(int c) {
		;
	}
	
}
