package study.crazystone.me.chain;

import utils.Logs;

/**
 * Created by crazystone on 18-3-6.
 */
public class Boss extends ChargePerson {

    public Boss(String name) {
        super(name);
    }

    public Boss(String name, boolean root) {
        super(name, root);
    }

    @Override
    public void dispatchTask() {
        Logs.l(name + "说:我想造个飞机");
        super.dispatchTask();
    }

    @Override
    protected void dispatchTaskWithMessage() {

    }

    @Override
    protected void doSomethingBySelf() {
        Logs.l(name + ":我自己做了???");
    }

    @Override
    public boolean intercept() {
        return false;
    }
}
