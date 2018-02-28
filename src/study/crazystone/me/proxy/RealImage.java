package study.crazystone.me.proxy;

import utils.Logs;

/**
 * Created by crazystone on 18-2-14.
 */
public class RealImage implements Image, Foo {
    @Override
    public void load() {
        Logs.l("load from disk");
    }

    @Override
    public void display() {
        Logs.l("display image");
    }

    @Override
    public void foo() {
        Logs.l("foo");
    }
}
