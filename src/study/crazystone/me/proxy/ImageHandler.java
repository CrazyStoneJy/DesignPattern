package study.crazystone.me.proxy;


import utils.Logs;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by crazystone on 18-2-14.
 */
public class ImageHandler implements InvocationHandler {

    Object object = null;

    public ImageHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(java.lang.Object proxy, Method method, java.lang.Object[] args) throws Throwable {
//        Logs.l(proxy);
        Logs.l(">>>");
        Object obj = (Object) method.invoke(object, args);
        Logs.l(args);
        return obj;
    }
}
