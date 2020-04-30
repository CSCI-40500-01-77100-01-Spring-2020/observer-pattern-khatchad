package edu.cuny.hunter.clients.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cuny.hunter.clients.IntegerContainer;
import edu.cuny.hunter.clients.IntegerObserver;

/**
 * A test of {@link IntegerContainer}s.
 * 
 * @author <a href="mailto:your.name@hunter.cuny.edu">YOUR NAME</a>
 */
public class IntegerContainerTest {

	/**
	 * Test method for
	 * {@link edu.cuny.hunter.clients.IntegerContainer#getInteger()}.
	 */
	@Test
	public void testGetInteger() {
		IntegerContainer integerContainer = new IntegerContainer(5);
		assertEquals(5, integerContainer.getInteger());

		integerContainer.setInteger(-50);
		assertEquals(-50, integerContainer.getInteger());

		integerContainer.setInteger(10);
		assertEquals(10, integerContainer.getInteger());
	}

	/**
	 * Test method for
	 * {@link edu.cuny.hunter.clients.IntegerContainer#setInteger(int)}.
	 */
	@Test
	public void testSetInteger() {
		IntegerContainer integerContainer = new IntegerContainer(5);

		integerContainer.setInteger(52);
		assertEquals(52, integerContainer.getInteger());

		integerContainer.setInteger(-342);
		assertEquals(-342, integerContainer.getInteger());

		integerContainer.setInteger(10);
		assertEquals(10, integerContainer.getInteger());
	}

	@Test
	public void testAttach() {
		IntegerContainer integerContainer = new IntegerContainer(10);

		// try attaching null.
		integerContainer.attach(null);

		// create an observer.
		IntegerObserver observer = new IntegerObserver();

		// nothing attached, so it should start at -1.
		assertEquals(-1, observer.getCachedInteger());

		// change the subject state.
		integerContainer.setInteger(5);

		// not attached, should remain the same.
		assertEquals(-1, observer.getCachedInteger());

		// attach the observer.
		integerContainer.attach(observer);

		// no state change.
		integerContainer.setInteger(5);

		// observer should remain the same.
		assertEquals(-1, observer.getCachedInteger());

		// now, change subject state.
		integerContainer.setInteger(-543);

		// check that the observer has updated.
		assertEquals(-543, observer.getCachedInteger());
	}

	@Test
	public void testDetach() {
		IntegerContainer integerContainer = new IntegerContainer(-110);

		// try detaching null.
		integerContainer.detach(null);

		// create an observer.
		IntegerObserver observer = new IntegerObserver();

		// nothing attached, so it should start at -1.
		assertEquals(-1, observer.getCachedInteger());

		// detach the non-attached observer. This should have no effect.
		integerContainer.detach(observer);

		// attach it to the subject.
		integerContainer.attach(observer);

		// detach it.
		integerContainer.detach(observer);

		// no subject state change.
		integerContainer.setInteger(-110);

		// should remain the same.
		assertEquals(-1, observer.getCachedInteger());

		// actual change.
		integerContainer.setInteger(110);

		// should still remain the same since its detached.
		assertEquals(-1, observer.getCachedInteger());
	}
}
