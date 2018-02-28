package study.crazystone.me.test;

import study.crazystone.me.decorator.KFC;

/**
 * Created by crazystone on 18-2-8.
 */
public class DecoratorTest {

    public static void main(String... args) {
        KFC kfc = new KFC();
        kfc.produceHamburger();
    }

}
