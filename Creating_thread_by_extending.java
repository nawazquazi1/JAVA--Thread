// Creating thread by extending the thread class
class MyCounter extends Thread {
    private int threadNo;

    public MyCounter(int threadNo) {
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        countMe();
    }

    public void countMe() {
        for (int i = 1; i <= 9; i++) {
            System.out.println("The value if i is: " + i + " and the thread number is: " + threadNo);
        }
    }
}

class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            Thread.currentThread().setName("akib");
            System.out.println("Task  " + i + " Start " + Thread.currentThread().getName());
        }
        System.out.println();
    }

}


class MyThread2 extends Thread {
    public void run() {
        for (int i = 6; i <= 10; i++) {
            Thread.currentThread().setName("nawaz");
            System.out.println("Task " + i + " Start " + Thread.currentThread().getName());
        }

    }
}

class MyThread3 extends Thread {
    public void run() {
        for (int i = 10; i <= 15; i++) {
//            Thread.currentThread().setName("quazi");
            System.out.println("Task " + i + " Start " + Thread.currentThread().getName());
        }
    }
}

public class Creating_thread_by_extending {

    public static void main(String[] args) throws InterruptedException {
        MyCounter counter1 = new MyCounter(1);
        MyCounter counter2 = new MyCounter(2);

        long startTime = System.currentTimeMillis();
        counter1.start(); //Run should be called by JVM
        System.out.println("**************************");
        counter2.start(); //Run should be called by JVM
        Thread.sleep(4505);
        long endTime = System.currentTimeMillis();
        System.out.println("Total time required to process: " + (endTime - startTime));

        System.out.println("Child Thread : " + Thread.currentThread().getName());
        MyThread m1 = new MyThread();
        MyThread2 m2 = new MyThread2();
        MyThread3 m3 = new MyThread3();
        m1.start();
        m2.start();
        m3.start();
    }

}
