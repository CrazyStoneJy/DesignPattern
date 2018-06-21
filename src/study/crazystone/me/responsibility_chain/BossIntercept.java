package study.crazystone.me.responsibility_chain;

import utils.Logs;

/**
 * Created by crazystone on 17-11-29.
 */
public class BossIntercept implements Interceptor {
    @Override
    public String intercept(Chain chain) {
        Logs.l("boss do");
        String string = "boss->" + chain.process();
        return string;
    }
}
