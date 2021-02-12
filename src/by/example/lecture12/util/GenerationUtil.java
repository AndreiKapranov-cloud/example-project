package by.example.lecture12.util;

import java.util.Random;

public final class GenerationUtil {

    private static final Random RANDOM = new Random();
    private static final int SAVE_TIME_MAX_BOUND = 10000;
    private static final int SAVE_TIME_MIN_BOUND = 500;

    private GenerationUtil() {

    }

    public static int generateSaveTime() {
        return RANDOM.nextInt(SAVE_TIME_MAX_BOUND - SAVE_TIME_MIN_BOUND) + SAVE_TIME_MIN_BOUND;
    }

}
