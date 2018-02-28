package study.crazystone.me.singleton;

import utils.Logs;

/**
 * Created by crazystone on 18-2-8.
 */
public class Foo {

    private volatile static Foo foo;

    private Foo() {
    }

    // double-checked locking
    public static Foo getInstance() {
        if (foo == null) {
            synchronized (Foo.class) {
                if (foo == null) {
                    foo = new Foo();
                }
            }
        }
        return foo;
    }

    public void foo() {
        Logs.l(Thread.currentThread().getName() + ">foo");
    }


}
