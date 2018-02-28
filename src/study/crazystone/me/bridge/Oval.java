package study.crazystone.me.bridge;

import utils.Logs;

/**
 * Created by crazystone on 18-2-8.
 */
public class Oval extends Shape {

    @Override
    public void draw(Paint paint) {
        Logs.l((paint.getColor() == null ? "" : paint.getColor()) + " draw a oval");
    }
}
