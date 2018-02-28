package study.crazystone.me.entity;

import utils.Logs;

/**
 * Created by crazystone on 18-2-8.
 */
public class Square implements Shape {

    String name;

    public Square(String name) {
        this.name = name;
    }

    public Square(){}

    @Override
    public void draw() {
        Logs.l("draw square");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
