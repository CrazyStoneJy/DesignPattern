package study.crazystone.me.decorator;

import utils.Logs;

/**
 * Created by crazystone on 18-2-8.
 */
public class HotDog extends Hamburger implements Material {

    public HotDog(){}

    public HotDog(Material material) {
        super(material);
    }

    @Override
    public void material() {
        if(material!=null)
            material.material();
        Logs.l("hot dog");
    }
}
