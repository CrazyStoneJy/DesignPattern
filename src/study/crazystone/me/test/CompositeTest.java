package study.crazystone.me.test;

import study.crazystone.me.composite.View;
import study.crazystone.me.composite.ViewGroup;

/**
 * Created by crazystone on 18-2-8.
 */
public class CompositeTest {

    public static void main(String... args) {

        View parent = new ViewGroup("parent");
        View childA = new ViewGroup("A");
        View childB = new ViewGroup("B");
        View childa = new View("a");
        View childb = new View("b");
        View childc = new View("c");
        View childd = new View("d");

        parent.addChild(childA);
        parent.addChild(childB);
        childA.addChild(childa);
        childA.addChild(childb);
        childA.addChild(childc);
        childB.addChild(childd);

        parent.showStructure();



    }

}
