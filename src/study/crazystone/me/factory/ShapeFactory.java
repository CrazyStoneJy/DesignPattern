package study.crazystone.me.factory;

import study.crazystone.me.entity.Circle;
import study.crazystone.me.entity.Oval;
import study.crazystone.me.entity.Shape;
import study.crazystone.me.entity.Square;

/**
 * Created by crazystone on 18-2-8.
 */
public class ShapeFactory {

    public Shape getShape(String shapeName) {

        if (shapeName.equals("square")) {
            return new Square("square");
        } else if (shapeName.equals("oval")) {
            return new Oval("oval");
        } else if (shapeName.equals("circle")) {
            return new Circle("circle");
        }
        return null;
    }


    //使用反射减少factory的代码,每次新增类不会再更改factory中的代码了,但是使用反射会降低性能
    public Shape getShape(Class<? extends Shape> cls) {
        try {
            return (Shape) Class.forName(cls.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
