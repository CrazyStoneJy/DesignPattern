package study.crazystone.me.responsibility_chain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crazystone on 17-11-29.
 */
public class TestInterceptor {

    public static void main(String... args) {
        List<Interceptor> interceptors = new ArrayList<>();
        interceptors.add(new WorkIntercept());
        interceptors.add(new LeaderIntercept());
        interceptors.add(new BossIntercept());

//        interceptors.clear();
        Interceptor.Chain chain = new HandleChain(0, interceptors);
        String message = chain.process();
        System.out.println(message);
    }


}
