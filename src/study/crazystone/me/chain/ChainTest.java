package study.crazystone.me.chain;


import study.crazystone.me.chain.impl.Boss;
import study.crazystone.me.chain.impl.GroupLeader;
import study.crazystone.me.chain.impl.Programmer;
import study.crazystone.me.chain.impl.ProjectManager;

/**
 * Created by crazystone on 17-7-13.
 */
public class ChainTest {

    public static void main(String... args) {
        Person programmer = new Programmer();
        Leader gl = new GroupLeader(programmer);
        Leader pm = new ProjectManager(gl);
        Leader boss = new Boss(pm);
        boss.dispatchTask();

    }


}
