package study.crazystone.me.test;

import study.crazystone.me.singleton.Foo;
import utils.Logs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by crazystone on 18-2-8.
 */
public class SingletonTest {

    public static void main(String... args) {

//        study.crazystone.me.singleton.Foo@487040b1
//        study.crazystone.me.singleton.Foo@487040b1
//        study.crazystone.me.singleton.Foo@487040b1
        // 双重检查锁在多线程中,单例模式还是同一个对象.

        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 3; i++) {
            service.execute(() -> {
                Logs.l(Foo.getInstance());
            });
        }
        service.shutdown();

    }


}
