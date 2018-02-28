package study.crazystone.me.test;

import study.crazystone.me.proxy.*;
import utils.Logs;

import java.lang.reflect.Proxy;

/**
 *
 * Created by crazystone on 18-2-9.
 */
public class ProxyTest {

    public static void main(String... args) {
//        staticProxy();
//        dynamicTest();
        foolish();
        javaModify();
    }

    private static void javaModify() {


    }

    private static void foolish() {
        try {
            Class<?> imageClass = Class.forName("study.crazystone.me.proxy.RealImage");
//            Method method = imageClass.getDeclaredMethod("load");
            RealImage realImage = (RealImage) imageClass.newInstance();
//            method.setAccessible(true);
//            Object obj = method.invoke(realImage);
            Image image = (Image) Proxy.newProxyInstance(imageClass.getClassLoader(), imageClass.getInterfaces(), (obj, method, args) -> {
                if (method.getName().equals("load")) {
                    Logs.l("load from net");
                } else {
                    Object target = method.invoke(realImage, args);
                    return target;
                }
                return null;
            });
            image.load();
            image.display();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static void staticProxy() {
        Image image = new ImageProxy();
        image.load();
        image.display();
    }

    private static void dynamicTest() {
        Foo image = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(), new Class<?>[]{Image.class, Foo.class}, new ImageHandler(new RealImage()));
//        image.load();
//        image.display();
        image.foo();
    }


}
