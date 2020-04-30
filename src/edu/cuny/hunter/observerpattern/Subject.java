package edu.cuny.hunter.observerpattern;

/**
 * An abstract representation of a subject of interest.
 * 
 * @author <a href="mailto:yourname@myhunter.cuny.edu">YOUR NAME</a>
 */
@SuppressWarnings("rawtypes")
public abstract class Subject {

	/**
	 * Attaches the given {@link Observer} to this subject. The observer will be
	 * notified of state changes.
	 * 
	 * @param o The observer to attach.
	 */
	public void attach(Observer o) {
		// TODO
	}

	/**
	 * Detaches the given {@link Observer} from this subject. The observer will
	 * no longer receive state change updates regarding this subject.
	 * 
	 * @param o The observer to detach.
	 */
	public void detach(Observer o) {
		// TODO
	}

	/**
	 * Notifies all attached {@link Observer}s that the state of this subject
	 * has changed.
	 */
	@SuppressWarnings("unchecked")
	protected void notifyObservers() {
		// TODO
	}
}
