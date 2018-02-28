package study.crazystone.me.test;

import study.crazystone.me.entity.Circle;
import study.crazystone.me.entity.Oval;
import study.crazystone.me.factory.ShapeFactory;
import study.crazystone.me.entity.Square;
import utils.Logs;

/**
 * Created by crazystone on 18-2-8.
 */
public class FactoryTest {

    public static void main(String... args) {

        ShapeFactory factory = new ShapeFactory();
        Logs.l(factory.getShape("square") instanceof Square);
        Logs.l(factory.getShape("circle").getClass().isInstance(Circle.class));
        Logs.l(factory.getShape("oval").getClass().isInstance(Oval.class));

        Logs.l(factory.getShape(Square.class).getClass().isInstance(Square.class));
        Logs.l(factory.getShape(Circle.class).getClass().isInstance(Circle.class));
        Logs.l(factory.getShape(Oval.class).getClass().isInstance(Oval.class));

        factory.getShape("square").draw();
        factory.getShape("circle").draw();
        factory.getShape("oval").draw();

        factory.getShape(Square.class).draw();
        factory.getShape(Circle.class).draw();
        factory.getShape(Oval.class).draw();
    }


}
