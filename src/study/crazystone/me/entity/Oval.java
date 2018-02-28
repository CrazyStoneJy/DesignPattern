package study.crazystone.me.entity;

import utils.Logs;

/**
 * Created by crazystone on 18-2-8.
 */
public class Oval implements Shape {

    String name;

    public Oval(String name) {
        this.name = name;
    }

    public Oval() {
    }

    @Override
    public void draw() {
        Logs.l("draw oval");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
