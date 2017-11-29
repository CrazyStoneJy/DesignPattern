package study.crazystone.me.responsibility_chain;

/**
 * Created by crazystone on 17-11-29.
 */
public class WorkIntercept implements Interceptor {
    @Override
    public String intercept(Chain chain) {
        return "work->" + chain.process();
    }
}
