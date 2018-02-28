package study.crazystone.me.decorator;

import utils.Logs;

/**
 * Created by crazystone on 18-2-8.
 */
public class Hamburger implements Material {

    protected Material material;

    public Hamburger() {

    }

    public Hamburger(Material material) {
        this.material = material;
    }

    @Override
    public void material() {
        if (material != null)
            material.material();
        Logs.l("面包片");
    }
}
