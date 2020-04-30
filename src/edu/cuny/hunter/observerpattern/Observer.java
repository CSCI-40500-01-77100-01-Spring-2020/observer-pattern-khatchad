package edu.cuny.hunter.observerpattern;

/**
 * An observer is interested in {@link Subject} changes.
 * @param <T> The subject type being observed.
 * 
 * @author <a href="mailto:yourname@myhunter.cuny.edu">YOUR NAME</a>
 */
public interface Observer<T extends Subject> {

	/**
	 * Notifies this observer that given {@link Subject} has changed.
	 */
	void update(T subject);
}
