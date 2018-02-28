package study.crazystone.me.entity;

import utils.Logs;

/**
 * Created by crazystone on 18-2-8.
 */
public class Circle implements Shape {
    String name;

    public Circle(String name) {
        this.name = name;
    }

    public Circle(){}

    @Override
    public void draw() {
        Logs.l("draw circle");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
