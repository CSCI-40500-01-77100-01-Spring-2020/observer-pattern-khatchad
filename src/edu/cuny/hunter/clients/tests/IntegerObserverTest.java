package edu.cuny.hunter.clients.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.cuny.hunter.clients.IntegerContainer;
import edu.cuny.hunter.clients.IntegerObserver;

/**
 * Tests {@link IntegerObserver}s.
 * 
 * @author <a href="mailto:your.name@myhunter.cuny.edu">YOUR NAME</a>
 */
public class IntegerObserverTest {

	/**
	 * Test method for
	 * {@link edu.cuny.hunter.clients.IntegerObserver#update(edu.cuny.hunter.clients.IntegerContainer)}.
	 */
	@Test
	public void testUpdate() {

		// The IntegerObserver under test.
		IntegerObserver observer = new IntegerObserver();

		// ensure that it starts at -1.
		assertEquals(-1, observer.getCachedInteger());

		// create a subject.
		IntegerContainer subject = new IntegerContainer(5);

		// tell the observe that the given subject's state has changed.
		observer.update(subject);

		// check that it's state is consistent with that of the subject's.
		assertEquals(5, observer.getCachedInteger());
	}

	/**
	 * Test method for
	 * {@link edu.cuny.hunter.clients.IntegerObserver#getCachedInteger()}.
	 */
	@Test
	public void testGetCachedInteger() {
		IntegerObserver observer = new IntegerObserver();

		// should start at -1.
		assertEquals(-1, observer.getCachedInteger());
	}
}
