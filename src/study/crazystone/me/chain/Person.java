package study.crazystone.me.chain;

/**
 * Created by crazystone on 18-3-6.
 */
public class Person {

    protected String name;
    protected boolean isRoot;

    public Person(String name) {
        this.name = name;
        this.isRoot = false;
    }

    public Person(String name, boolean isRoot) {
        this.name = name;
        this.isRoot = isRoot;
    }

    public Person setRoot(boolean root) {
        isRoot = root;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }
}
