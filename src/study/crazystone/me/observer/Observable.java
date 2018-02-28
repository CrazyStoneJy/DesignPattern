package study.crazystone.me.observer;

import utils.Logs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crazystone on 18-2-8.
 */
public class Observable {

    private List<Observer> observers = new ArrayList<>();
    /* 控制让不让观察者接收到 */
    private boolean canReceive;

    public void addObserver(Observer observer) {
        if (!observers.contains(observer))
            observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        if (observers.contains(observer))
            observers.remove(observer);
    }

    public void notifyMessage(String message) {
        if (!canReceive)
            return;
        for (Observer observer : observers) {
            observer.getMessage(message);
        }

    }

    public void canReceive() {
        canReceive = true;
    }


}
