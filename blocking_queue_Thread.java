import java.util.concurrent.ArrayBlockingQueue;

public class blocking_queue_Thread {
    static int counter;
//    blocking queue
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(arrayBlockingQueue);
        Thread thread = new Thread(producer);
        thread.start();

        consumer consumer = new consumer(arrayBlockingQueue);
        Thread thread1 = new Thread(consumer);
        thread1.start();

    }
}
class Producer implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    Producer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(5000);
                queue.put(blocking_queue_Thread.counter++);
                System.out.println("Value added in the queue : " + blocking_queue_Thread.counter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

class consumer implements Runnable {
    private ArrayBlockingQueue<Integer> queue;

    consumer(ArrayBlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(1000);
                queue.take();
                blocking_queue_Thread.counter--;
                System.out.println("Value removed in te queue : " +blocking_queue_Thread.counter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
