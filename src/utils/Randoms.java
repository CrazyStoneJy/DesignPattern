package utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by crazystone on 18-2-9.
 */
public class Randoms {

    private static Random random = null;

    static {
        random = new Random();
    }

    public static <E> E choice(E[] array) {
        return choice(Arrays.asList(array));
    }

    public static <E> E choice(List<E> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("数组不能为空,且数组的长度大于零");
        }
        int size = list.size();
        int randomIndex = random.nextInt(size);
        return list.get(randomIndex);
    }


}
