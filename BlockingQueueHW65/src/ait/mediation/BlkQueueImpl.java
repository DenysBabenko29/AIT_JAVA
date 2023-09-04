package ait.mediation;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BlkQueueImpl<T> implements BlkQueue<T> {
    Lock mutex = new ReentrantLock();
    Condition consumerWaitingCondition = mutex.newCondition();
    Condition producerWaitingCondition = mutex.newCondition();
    private int maxSize;
    private List<T> list;
    public BlkQueueImpl(int maxSize) {
        // TODO
        this.list = new LinkedList<>();
        this.maxSize = maxSize;
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void push(T message) {
        // TODO
        mutex.lock();
        try {
            while (message != null) {
                try {
                    consumerWaitingCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            message = message;
            receiverWaitingCondition.signal();
        } finally {
            mutex.unlock();
        }
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public T pop() {
        while (!list.isEmpty()){

        }
        // TODO
        throw new UnsupportedOperationException("Not implemented");
    }
}
