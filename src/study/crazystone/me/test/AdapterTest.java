package study.crazystone.me.test;

import study.crazystone.me.adapter.Adapter;
import study.crazystone.me.adapter.ChinaPower;

/**
 * Created by crazystone on 18-2-8.
 */
public class AdapterTest {

    public static void main(String... args){

        Adapter power = new ChinaPower();
        power.supply220();

    }


}
