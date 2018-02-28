package study.crazystone.me.test;

import utils.Logs;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by crazystone on 18-2-8.
 */
public class ObserverTest {

    public static void main(String... args) {
//        testJavaObserver();
        testObserver();
    }

    private static void testObserver() {
        study.crazystone.me.observer.Observable observable
                = new study.crazystone.me.observer.Observable();
        observable.canReceive();
        study.crazystone.me.observer.Observer observer1 = new MyObserver();
        study.crazystone.me.observer.Observer observer2 = new MyObserver();
        study.crazystone.me.observer.Observer observer3 = new MyObserver();
        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.addObserver(observer3);
        observable.removeObserver(observer2);
        observable.removeObserver(observer3);

        observable.notifyMessage("test");
    }

    private static void testJavaObserver() {
        NPC observable = new NPC();
        for (int i = 0; i < 3; i++) {
            Observer observer = new Observer() {
                @Override
                public void update(Observable o, Object arg) {
                    Logs.l(arg.toString());
                }
            };
            observable.addObserver(observer);
        }

        observable.notifyEvery("hello");

    }

    static class MyObserver implements study.crazystone.me.observer.Observer {

        @Override
        public void getMessage(String message) {
            Logs.l(message);
        }
    }

    private static class NPC extends Observable {

        private void notifyEvery(Object obj) {
            setChanged();
            notifyObservers(obj);
        }

    }


}
