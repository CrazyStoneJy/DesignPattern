package study.crazystone.me.decorator;

import utils.Logs;

/**
 * Created by crazystone on 18-2-8.
 */
public class Lettuce extends Hamburger implements Material {

    public Lettuce() {
    }

    public Lettuce(Material material) {
        super(material);
    }

    @Override
    public void material() {
        if(material!=null)
            material.material();
        Logs.l("lettuce");
    }
}
