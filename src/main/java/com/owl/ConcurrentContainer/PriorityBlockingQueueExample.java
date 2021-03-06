package com.owl.ConcurrentContainer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by houping wang on 2019/2/15
 *
 * @author houping wang
 */
public class PriorityBlockingQueueExample {

    public static void main(String[] args) {
        BlockingQueue queue = new PriorityBlockingQueue();
        try {
            queue.put(new Object());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
