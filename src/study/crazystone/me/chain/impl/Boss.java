package study.crazystone.me.chain.impl;


import study.crazystone.me.chain.Leader;
import study.crazystone.me.chain.Person;

/**
 * Created by crazystone on 17-7-13.
 */
public class Boss extends Leader {

    public Boss(Person person) {
        super(person);
    }

    @Override
    public boolean dispatchTask() {
        System.out.println("boss:我现在想造一个地球");
        return super.dispatchTask();
    }
}
