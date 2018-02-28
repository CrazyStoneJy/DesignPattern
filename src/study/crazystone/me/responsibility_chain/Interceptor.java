package study.crazystone.me.responsibility_chain;

/**
 * Created by crazystone on 17-11-29.
 */
public interface Interceptor {

    String intercept(Chain chain);

    interface Chain {
        String process();
    }


}
