package study.crazystone.me.chain;

/**
 * Created by crazystone on 17-7-13.
 */
public class Person {

    protected Person person;

    public Person(){}

    public Person(Person person) {
        this.person = person;
    }

    public boolean dispatchTask() {
        return false;
    }
}
