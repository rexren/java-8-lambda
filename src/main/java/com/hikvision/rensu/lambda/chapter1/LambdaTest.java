package com.hikvision.rensu.lambda.chapter1;

import java.time.Clock;

/**
 * Created by rensu on 17/3/10.
 */
public class LambdaTest {
    public static void main(String[] args) {
        Runnable noAugment = () -> System.out.println("hello");
        new Thread(noAugment).start();

        Runnable multiStatement = () -> {
            System.out.println("hello world");
            System.out.println("this is a multi state runnable.");
        };

        new Thread(multiStatement).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("fdsafsa");
            }
        }).start();

        new Thread(() -> System.out.println("efsa")).start();

        new Thread(() -> {
            System.out.println();
        }).start();



        final Clock clock = Clock.systemUTC();
        System.out.println( clock.instant() );
        System.out.println( clock.millis() );
    }
}
