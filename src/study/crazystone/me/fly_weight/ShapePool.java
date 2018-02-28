package study.crazystone.me.fly_weight;

import study.crazystone.me.entity.Shape;
import study.crazystone.me.entity.Square;
import study.crazystone.me.factory.ShapeFactory;

import java.util.*;

/**
 * Created by crazystone on 18-2-9.
 */
public class ShapePool {

    private Map<String, Shape> map = new HashMap<>();

    public Shape getShape(String shapeName) {
        Shape shape = null;
        if ((shape = map.get(shapeName)) == null) {
            // 这里先借用一下工厂模式生成对象
            ShapeFactory factory = new ShapeFactory();
            shape = factory.getShape(shapeName);
            map.put(shapeName, shape);
        }
        return shape;
    }

    public int size() {
        return map.size();
    }

}
