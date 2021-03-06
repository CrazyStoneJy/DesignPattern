package study.crazystone.me.chain;

import utils.Logs;

/**
 * Created by crazystone on 18-3-6.
 */
public class Leader extends ChargePerson {

    public Leader(String name) {
        super(name);
    }


    @Override
    protected void dispatchTaskWithMessage() {
        Logs.l(name + "说:经理想造飞机");
    }

    @Override
    protected void doSomethingBySelf() {
        Logs.l(name + ":我貌似可以实现");
    }

    @Override
    public boolean intercept() {
        return false;
    }
}
