package study.crazystone.me.decorator;

/**
 * Created by crazystone on 18-2-8.
 */
public class KFC {

    public void produceHamburger(){


        Material egg = new Egg();
        Material spicy = new Spicy(egg);
        Material lettuce = new Lettuce(spicy);
        Material hamburger = new Hamburger(lettuce);
        hamburger.material();

        Material lettuce2 = new Lettuce(egg);
        Material hamburger2 = new Hamburger(lettuce2);
        hamburger2.material();

    }

}
