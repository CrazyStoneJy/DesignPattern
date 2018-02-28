package study.crazystone.me.facade;

import utils.Logs;

/**
 * Created by crazystone on 18-2-8.
 */
public class Computer {

    public void start() {
        powerOn();
        disk();
        memory();
        cpu();
        execute();
    }

    private void powerOn() {
        Logs.l("打开电源");
    }

    private void cpu() {
        Logs.l("cpu运行加载在内存中的程序");
    }

    private void memory() {
        Logs.l("加载程序到内存");
    }

    private void disk() {
        Logs.l("从硬盘中加载程序");
    }

    private void execute() {
        Logs.l("执行后显示效果");
    }

}
