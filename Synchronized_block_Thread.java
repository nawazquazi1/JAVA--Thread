import java.util.Scanner;

// Synchronized block
public class Synchronized_block_Thread {
    public static void main(String[] args) {
        Brakets2 braket = new Brakets2();
        new Thread(new Runnable() {

            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for (int i = 1; i <= 5; i++) {
                    braket.generate("Thread 1");
                }
                long endtTime = System.currentTimeMillis();
                System.out.println("Time required for thread 1 was:" + (endtTime - startTime));
            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                long startTime = System.currentTimeMillis();
                for (int i = 1; i <= 5; i++) {
                    braket.generate("Thread 1");
                }
                long endtTime = System.currentTimeMillis();
                System.out.println("Time required for thread 2 was:" + (endtTime - startTime));
            }
        }).start();
    }
}

class Brakets2 {
    private final Object lock = "lock";

    public void generate(String s) {
        synchronized (lock) {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i <= 5) {
                    System.out.print("[");
                } else {
                    System.out.print("]");
                }
            }
            System.out.println();
        }

        for (int j = 0; j <= 10; j++) {
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/* Synchronized method approach
 * Time required: 5750
 *
 * Synchronized block approach
 * Time required: 3950
 */
class TotalEarning extends Thread {
    int total = 0;

    public void count(int rs) {
        synchronized (this) {
            for (int i = 1; i <= rs; i++) {
                total = total + 100;
            }
        }
        System.out.println("Total earning " + Thread.currentThread().getName() +"  " + total + " Rs");
    }

    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();

    public void run() {
        count(i);
    }
}

class MovieBookApp {
    public static void main(String[] args) throws InterruptedException {
        TotalEarning t1 = new TotalEarning();
        TotalEarning t2 = new TotalEarning();
        TotalEarning t3 = new TotalEarning();

        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        t1.start();
        t2.start();
        t3.start();

    }
}