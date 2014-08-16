package com.learning.jdp.observerPattern;

public interface Subject {
	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
