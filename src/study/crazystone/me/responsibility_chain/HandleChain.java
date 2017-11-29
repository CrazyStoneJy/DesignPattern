package study.crazystone.me.responsibility_chain;

import java.util.List;

/**
 * Created by crazystone on 17-11-29.
 */
public class HandleChain implements Interceptor.Chain {

    int index = 0;
    List<Interceptor> interceptors;

    public HandleChain(int index, List<Interceptor> interceptors) {
        this.interceptors = interceptors;
        this.index = index;
    }

    @Override
    public String process() {
        if (index < interceptors.size()) {
            Interceptor interceptor = interceptors.get(index);
            Interceptor.Chain chain = new HandleChain(index + 1, interceptors);
            String message = interceptor.intercept(chain);
//            System.out.println(message);
            return message;
        }
        return "finished";
    }


}
