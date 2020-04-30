package edu.cuny.hunter.clients;

import edu.cuny.hunter.observerpattern.Observer;
import edu.cuny.hunter.observerpattern.Subject;

/**
 * Interested in {@link IntegerContainer}s. An uninitialized
 * {@link IntegerObserver} has a cached integer value of -1.
 * 
 * @author <a href="mailto:your.name@hunter.cuny.edu">YOUR NAME</a>
 */
public class IntegerObserver implements Observer<IntegerContainer> {

	/**
	 * Updates this observers internal state with that of the given
	 * {@link Subject}'s.
	 */
	@Override
	public void update(IntegerContainer subject) {
		// TODO
	}

	/**
	 * Return the cached integer value.
	 * 
	 * @return The cached integer value.
	 */
	public int getCachedInteger() {
		// TODO
		return 0;
	}
}