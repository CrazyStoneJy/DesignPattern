package study.crazystone.me.chain;

/**
 * Created by crazystone on 17-7-13.
 */
public class Leader extends Person implements ILeadTask {

    public Leader() {
    }

    public Leader(Person person) {
        super(person);
    }

    @Override
    public boolean dispatchTask() {
        if (onInterceptTask()) return true;
        return person.dispatchTask();
    }


    @Override
    public boolean onInterceptTask() {
        return false;
    }

}
