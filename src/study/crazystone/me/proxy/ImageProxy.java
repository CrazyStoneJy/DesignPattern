package study.crazystone.me.proxy;

/**
 * Created by crazystone on 18-2-14.
 */
public class ImageProxy implements Image {

    Image realImage = null;

    public ImageProxy() {
        realImage = new RealImage();
    }


    @Override
    public void load() {
        realImage.load();
    }

    @Override
    public void display() {
        realImage.display();
    }
}
