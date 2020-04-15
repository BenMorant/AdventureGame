package model.entity.utils;

import java.util.Random;

public class ModelEntityHelper {

    public static int getRandomNumberBetweenTwoBounds(int min, int max) {
        return min + new Random().nextInt(Math.abs(max - min + 1));
    }
}
