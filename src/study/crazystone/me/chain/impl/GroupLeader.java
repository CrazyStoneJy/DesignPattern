package study.crazystone.me.chain.impl;


import study.crazystone.me.chain.Leader;
import study.crazystone.me.chain.Person;

/**
 * Created by crazystone on 17-7-13.
 */
public class GroupLeader extends Leader {

    public GroupLeader(Person person) {
        super(person);
    }

    @Override
    public boolean dispatchTask() {
        System.out.println("小组长：我看看小王能做不？（真是想一出是一处，@#&%）");
        return super.dispatchTask();
    }

    @Override
    public boolean onInterceptTask() {
        System.out.println("小组长：我擦，这个需求真简单");
        return true;
    }
}
