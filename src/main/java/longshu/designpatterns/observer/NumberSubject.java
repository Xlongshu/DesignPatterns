package longshu.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NumberSubject implements Subject {
	private List<Observer> observers = new ArrayList<Observer>();

	private int num;

	@Override
	public void add(Observer observer) {
		if (!observers.contains(observer))
			observers.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	public void setNum(int num) {
		this.num = num;
		notifyObserver();// notifyObserver
	}

	public int getNum() {
		return num;
	}
}