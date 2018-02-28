package study.crazystone.me.chain.impl;

import study.crazystone.me.chain.Leader;
import study.crazystone.me.chain.Person;

/**
 * Created by crazystone on 17-7-13.
 */
public class ProjectManager extends Leader {

    public ProjectManager(Person person) {
        super(person);
    }

    @Override
    public boolean dispatchTask() {
        System.out.println("项目经理：我看看android组能做不？（我擦，是啥搞啥子啊）");
        return super.dispatchTask();
    }
}
