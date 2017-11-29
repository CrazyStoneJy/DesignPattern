package study.crazystone.me.responsibility_chain;

/**
 * Created by crazystone on 17-11-29.
 */
public class BossIntercept implements Interceptor {
    @Override
    public String intercept(Chain chain) {
        String message = chain.process();
        return "boss->" + message;
    }
}
