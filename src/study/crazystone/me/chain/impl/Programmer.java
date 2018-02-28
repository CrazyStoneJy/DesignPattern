package study.crazystone.me.chain.impl;


import study.crazystone.me.chain.Person;

/**
 * Created by crazystone on 17-7-13.
 */
public class Programmer extends Person {


    public Programmer() {
    }

    public Programmer(Person person) {
        super(person);
    }

    @Override
    public boolean dispatchTask() {
        System.out.println("小王：老大做不了啊（我他吗还造原子弹呢）");
        return false;
    }
}
