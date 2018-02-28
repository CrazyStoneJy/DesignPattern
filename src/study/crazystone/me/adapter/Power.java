package study.crazystone.me.adapter;

import utils.Logs;

/**
 * Created by crazystone on 18-2-8.
 */
public class Power {

    public void supply() {
        Logs.l("我们只提供" + getPower() + "v的电压");
    }

    protected int getPower() {
        return 380;
    }


}
