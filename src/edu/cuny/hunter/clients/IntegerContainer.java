package edu.cuny.hunter.clients;

import edu.cuny.hunter.observerpattern.Subject;

/**
 * A wrapper of a single integer.
 * 
 * @author <a href="mailto:your.name@hunter.cuny.edu">YOUR NAME</a>
 */
public class IntegerContainer extends Subject {

	/**
	 * Creates an {@link IntegerContainer} with the given integer value.
	 * 
	 * @param integer The internal integer value.
	 */
	public IntegerContainer(int integer) {
		// TODO
	}

	/**
	 * Returns the internal integer value.
	 * 
	 * @return The internal integer value.
	 */
	public int getInteger() {
		// TODO
		return 0;
	}

	/**
	 * Sets the given integer value to be the internal integer value only if
	 * it differs from the current value. Any attached observers are notified
	 * if the internal value has changed.
	 * 
	 * @param integer The integer for which to set the internal integer.
	 */
	public void setInteger(int integer) {
		// TODO
	}
}
