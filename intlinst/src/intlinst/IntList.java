package intlinst;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Deze klasse slaat een lijst int-waarden op.
 * TODO is dus mutable
 * @invar | 0<= getLength()
 * @invar | getLength() == getArray().length
 * @invar | getArray() != null
 * @invar | getArray().length == getLength()
 * @invar | IntStream.range(0, getLength()).allMatch(
 * 			| i -> getArray()[i] == getElement(i))
 * TODO die laatste moet niet per se met een for-loop
 */
public class IntList {
	
	/**
	 * @creates | result	
	 */
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
	 * 		| getElement(old(getLength())) == b
	 */
	public void add(int b) {
		;
	}
	
	/**
	 * TODO niet vergeten!
	 * @pre | 0 < getLength()
	 * cf add
	 */
	public void remove(int c) {
		;
	}
	
}
