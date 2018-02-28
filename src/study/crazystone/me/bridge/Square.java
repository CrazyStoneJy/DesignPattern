package study.crazystone.me.bridge;

import utils.Logs;

/**
 * Created by crazystone on 18-2-8.
 */
public class Square extends Shape {

    @Override
    public void draw(Paint paint) {
        Logs.l(paint.width() == null ? "" : paint.width());
        Logs.l((paint.getColor() == null ? "" : paint.getColor()) + " draw a square");
    }
}
