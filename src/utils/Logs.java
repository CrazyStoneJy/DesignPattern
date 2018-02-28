package utils;

/**
 * Created by crazystone on 18-2-8.
 */
public class Logs {

    public static void log(Object obj, boolean isChangeLine) {
        if (isChangeLine) {
            System.out.println(obj.toString());
        } else {
            System.out.print(obj.toString());
        }
    }

    public static void l(Object obj) {
        log(obj, true);
    }


}
