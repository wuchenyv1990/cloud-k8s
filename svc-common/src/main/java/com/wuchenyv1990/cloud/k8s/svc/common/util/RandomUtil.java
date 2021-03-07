package com.wuchenyv1990.cloud.k8s.svc.common.util;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class RandomUtil {

    private static final Random R = new Random();

    private static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(R.nextInt(seconds));
        } catch (InterruptedException ignore) {
        }
    }

    public static <T> T returnAfter(Supplier<T> supplier, int randomSeconds) {
        sleep(randomSeconds);
        return supplier.get();
    }

    public static <T> T returnMayThrowExp(Supplier<T> supplier) {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new RuntimeException();
        }
        return supplier.get();
    }

}
