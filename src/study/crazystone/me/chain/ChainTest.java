package study.crazystone.me.chain;

/**
 * Created by crazystone on 18-3-6.
 */
public class ChainTest {

    public static void main(String... args) {
        ChargePerson p1 = new Programmer("程序员张三");
        ChargePerson p2 = new Leader("小组长");
        ChargePerson p3 = new Manger("经理");
        ChargePerson p4 = new Boss("老板", true);
        p4.next(p3);
        p3.next(p2);
        p2.next(p1);
        p4.dispatchTask();


    }

}
