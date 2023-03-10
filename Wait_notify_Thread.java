public class Wait_notify_Thread {

    //  Wait and notify
    public static void main(String[] args) {
        App6 app = new App6();

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                app.withdraw(1000);

            }
        });
        thread1.setName("Thread1");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                app.deposit(2000);
            }
        });
        thread2.setName("Thread");
        thread2.start();
    }
}

class App6 {
    static public int balance = 0;

    public void withdraw(int amount) {
        synchronized (this) {
            if (balance <= 0) {
                try {
                    System.out.println("Waiting for balance updation");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        balance = balance - amount;
        System.out.println("Withdrawal successful and the current balance is: " + balance);
    }

    public void deposit(int amount) {
        System.out.println("We are deposting the amount");
        balance = balance + amount;
        synchronized (this) {
            notify();
        }
    }
}

    class Company {
        int n;
        boolean f = false;

        // f=false: chance: producer
        //f=true: chance :consumer
        synchronized public void produce_item(int n) throws Exception {
            if (f) {
                wait();
            }
            this.n = n;
            System.out.println("Produced : " + this.n);
            f = true;
            notify();
        }

        synchronized public int consume_item() throws Exception {
            if (!f) {
                wait();
            }
            System.out.println("Consumed : " + this.n);
            f = false;
            notify();
            return this.n;
        }
    }

    class producer1 extends Thread {

        Company c;

        producer1(Company c) {
            this.c = c;
        }

        public void run() {
            int i = 1;
            while (true) {
                try {
                    this.c.produce_item(i);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                i++;
            }
        }
    }

    class consumer1 extends Thread {
        Company c;

        consumer1(Company c) {
            this.c = c;
        }

        public void run() {
            while (true) {
                try {
                    this.c.consume_item();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
            }
        }

    }

    class waiit {
        public static void main(String[] args) {
            Company comp = new Company();
            producer1 p = new producer1(comp);
            consumer1 c = new consumer1(comp);
            p.start();
            c.start();

        }
    }
