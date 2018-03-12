package study.crazystone.me.chain;

/**
 * Created by crazystone on 18-3-6.
 */
public interface ITask {

    void dispatchTask();

    boolean intercept();

    void next(ITask task);

}
