public class Thread_sleep {
    public static void main(String[] args) {
        Sleep sleep = new Sleep();
        sleep.start();

        Sleep sleep1 = new Sleep();
        sleep1.start();
    }
}

//sleep method
class Sleep extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " : " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
    class Timer extends Thread {
        public void run() {
            int k = 1;
            for (int j = 1; j <= 10; j++) {
                for (int i = 0; i <= 59; i++) {
                    System.out.println(k + " : : " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (i == 59) {
                        k++;
                    }
                }
            }
        }
        public static void main(String[] args) {
            Timer t = new Timer();
            t.start();

        }
    }
