package edu.cuny.hunter.observerpattern;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;


/**
 * An abstract representation of a subject of interest.
 * 
 * @author <a href="mailto:yourname@myhunter.cuny.edu">YOUR NAME</a>
 */
@SuppressWarnings("rawtypes")
public abstract class Subject {

        /**
	 * A collection of {@link Observer}s that are interested in this subject.
	 */
	private Collection<Observer> observerCollection = new HashSet<>();

	/**
	 * Attaches the given {@link Observer} to this subject. The observer will be
	 * notified of state changes.
	 * 
	 * @param o The observer to attach.
	 */
	public void attach(Observer o) {
                this.observerCollection.add(o);
	}

	/**
	 * Detaches the given {@link Observer} from this subject. The observer will
	 * no longer receive state change updates regarding this subject.
	 * 
	 * @param o The observer to detach.
	 */
	public void detach(Observer o) {
                this.observerCollection.remove(o);
	}

	/**
	 * Notifies all attached {@link Observer}s that the state of this subject
	 * has changed.
	 */
	@SuppressWarnings("unchecked")
	protected void notifyObservers() {
                this.observerCollection.stream().filter(Objects::nonNull).forEach(o -> o.update(this));
	}
}
