import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

    public static void main(String[] args) {
        // for scheduling of task2
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        // task to run after 10 seconds delay
        service.schedule(new task2(), 10, TimeUnit.SECONDS);

        // task to run repeatedly every 10 seconds
        service.scheduleAtFixedRate(new task2(), 15, 10, TimeUnit.SECONDS);
        // task to run repeatedly 10 seconds after previous task  completes
        service.scheduleWithFixedDelay(new task2(), 15, 10, TimeUnit.SECONDS);

    }
}

class task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}
