package study.crazystone.me.chain;

/**
 * Created by crazystone on 18-3-6.
 */
public abstract class ChargePerson extends Person implements ITask {

    ITask next;

    public ChargePerson(String name) {
        super(name);
    }

    public ChargePerson(String name, boolean root) {
        super(name, root);
    }

    @Override
    public void dispatchTask() {
        if (!isRoot && intercept()) {
            doSomethingBySelf();
        } else {
            dispatchTaskWithMessage();
            if (next != null) {
                next.dispatchTask();
            }
        }
    }

    protected abstract void dispatchTaskWithMessage();

    protected abstract void doSomethingBySelf();

    @Override
    public boolean intercept() {
        return false;
    }

    @Override
    public void next(ITask task) {
        this.next = task;
    }
}
