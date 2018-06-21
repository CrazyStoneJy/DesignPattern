package study.crazystone.me.responsibility_chain;

import utils.Logs;

/**
 * Created by crazystone on 17-11-29.
 */
public class WorkerIntercept implements Interceptor {
    @Override
    public String intercept(Chain chain) {

        Logs.l("worker do");
        String string = "work>" + chain.process();
        return string;
    }
}
