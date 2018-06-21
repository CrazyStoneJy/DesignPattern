package study.crazystone.me.chain;

import sun.rmi.runtime.Log;
import utils.Logs;

/**
 * Created by crazystone on 18-3-6.
 */
public class Manger extends ChargePerson {


    public Manger(String name) {
        super(name);
    }

    @Override
    protected void dispatchTaskWithMessage() {
        Logs.l(name + "说:老板想做个飞机");
    }

    @Override
    protected void doSomethingBySelf() {
        Logs.l(name + ":我能搞定");
    }

    @Override
    public boolean intercept() {
        return false;
    }

}
