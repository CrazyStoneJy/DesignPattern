package study.crazystone.me.adapter;

/**
 * Created by crazystone on 18-2-8.
 */
public class ChinaPower extends Power implements Adapter {
    @Override
    public void supply220() {
        supply();
    }

    @Override
    protected int getPower() {
        //经过一系列的操作将电压改为220v
        return 220;
//        return super.getPower();
    }
}
