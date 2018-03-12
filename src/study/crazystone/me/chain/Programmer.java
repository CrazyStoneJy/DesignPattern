package study.crazystone.me.chain;

import sun.rmi.runtime.Log;
import utils.Logs;

/**
 * Created by crazystone on 18-3-6.
 */
public class Programmer extends ChargePerson {

    public Programmer(String name) {
        super(name);
    }

    @Override
    protected void dispatchTaskWithMessage() {
        Logs.l("我搞不定啊,组长");
    }

    @Override
    protected void doSomethingBySelf() {
        Logs.l(name + ":我可以实现呦");
    }

    @Override
    public boolean intercept() {
        return false;
    }
}
