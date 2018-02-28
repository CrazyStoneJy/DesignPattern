package study.crazystone.me.decorator;

import utils.Logs;

/**
 * Created by crazystone on 18-2-8.
 */
public class Egg extends Hamburger implements Material {

    public Egg(){}

    public Egg(Material material) {
        super(material);
    }

    @Override
    public void material() {
        if(material!=null)
            material.material();
        Logs.l("egg");
    }
}
