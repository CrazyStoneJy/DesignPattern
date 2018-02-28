package study.crazystone.me.test;

import study.crazystone.me.entity.Shape;
import study.crazystone.me.fly_weight.ShapePool;
import utils.Logs;
import utils.Randoms;

/**
 * Created by crazystone on 18-2-9.
 */
public class FlyWeightTest {

    public static void main(String... args) {

        String[] strings = {"square", "oval", "circle"};
//        Logs.l(Randoms.choice(strings));

        ShapePool pool = new ShapePool();
        for (int i = 0; i < 20; i++) {
            String shapeName = Randoms.choice(strings);
            Shape shape = pool.getShape(shapeName);
            Logs.l(shape.getName());
        }
        Logs.l("pool size:" + pool.size());


    }


}
