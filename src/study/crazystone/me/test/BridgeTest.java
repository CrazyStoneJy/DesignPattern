package study.crazystone.me.test;

import study.crazystone.me.bridge.*;

/**
 * Created by crazystone on 18-2-8.
 */
public class BridgeTest {

    public static void main(String... args) {

        Paint red = new RedPaint();
        Paint green = new GreenPaint();
        Paint blod = new BlodPaint();

        Shape square = new Square();
        Shape oval = new Oval();
        Shape circle = new Circle();

        oval.draw(red);
        square.draw(blod);
        circle.draw(green);

    }

}
