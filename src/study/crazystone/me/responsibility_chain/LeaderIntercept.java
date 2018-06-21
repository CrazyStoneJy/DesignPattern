package study.crazystone.me.responsibility_chain;

import utils.Logs;

/**
 * Created by crazystone on 17-11-29.
 */
public class LeaderIntercept implements Interceptor {
    @Override
    public String intercept(Chain chain) {
        Logs.l("leader do");
        String string = "leader->" + chain.process();
        return string;
    }
}
