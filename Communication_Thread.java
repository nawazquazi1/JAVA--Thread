public class Communication_Thread {
    int item1;
    boolean busy = false;

    synchronized int get() {
        if (!busy) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Get: " + item1);
        busy = false;
        notify();
        return item1;
    }

    synchronized void put(int item1) {
        this.item1 = item1;
        System.out.println("Put : " + item1);
    }

    class Producer extends Thread {
        Communication_Thread c;

        Producer(Communication_Thread c) {
            this.c = c;
        }

        public void run() {
            int i = 0;
            while (true) {
                c.put(i++);
            }
        }
    }

    class Consumer extends Thread {
        Communication_Thread c;

        Consumer(Communication_Thread c) {
            this.c = c;
        }

        public void run() {
            while (true) {
                c.get();
            }
        }
    }

    class InterThread_Communication {
        public void main(String[] args) {
            Communication_Thread c = new Communication_Thread();
            Producer p = new Producer(c);
            Consumer ce = new Consumer(c);
            System.out.println("Press Ctrl+C To Stop  ");
            p.start();
            ce.start();
        }
    }
}

