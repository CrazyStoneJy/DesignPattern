package study.crazystone.me.composite;

import utils.Logs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crazystone on 18-2-8.
 */
public class View {

    private String name;
    private List<View> children = new ArrayList<>();

    public View(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public View setName(String name) {
        this.name = name;
        return this;
    }

    public void addChild(View child) {
        children.add(child);
    }

    public void removeChild(View child) {
        children.remove(child);
    }

    public void showStructure() {
        show(this);
    }

    public void show(View view) {
        Logs.l(view.getName());
        for (View v : view.children) {
            show(v);
        }
    }

}
