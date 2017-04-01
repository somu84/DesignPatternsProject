package com.dp.ObserverPattern;

/**
 * This interface handles adding, deleting and updating
 * all observers
 * @author Somu
 *
 */
public interface Subject {
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
}
