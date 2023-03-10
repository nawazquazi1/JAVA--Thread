import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_pools {


    //Thread pools
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(8);


        someThread thread1 = new someThread("Thread 1");
        someThread thread2 = new someThread("Thread 2");
        someThread thread3 = new someThread("Thread 3");
        someThread thread4 = new someThread("Thread 4");
        someThread thread5 = new someThread("Thread 5");
        someThread thread6 = new someThread("Thread 6");
        someThread thread7 = new someThread("Thread 7");
        someThread thread8 = new someThread("Thread 8");
        someThread thread9 = new someThread("Thread 9");
        someThread thread10 = new someThread("Thread 10");
        someThread thread11 = new someThread("Thread 11");
        someThread thread12 = new someThread("Thread 12");
        someThread thread13 = new someThread("Thread 13");
        someThread thread14 = new someThread("Thread 14");
        someThread thread15 = new someThread("Thread 15");
        someThread thread16 = new someThread("Thread 16");


        executorService.execute(thread1);
        executorService.execute(thread2);
        executorService.execute(thread3);
        executorService.execute(thread4);

        executorService.execute(thread5);
        executorService.execute(thread6);
        executorService.execute(thread7);
        executorService.execute(thread8);
        executorService.execute(thread9);
        executorService.execute(thread10);
        executorService.execute(thread11);
        executorService.execute(thread12);
        executorService.execute(thread13);
        executorService.execute(thread14);
        executorService.execute(thread15);
        executorService.execute(thread16);

        executorService.shutdown();

        int a=10+20;
        String str="nawaz";
        String str2="aoned";
        int a1= 0x134;
        System.out.println(a1);



    }
}

class someThread extends Thread {
    private String name;

    public someThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Starting thread: " + name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended: " + name);
    }

}

// jhoot  bola
// interview me cheating ki
// daily call nhi kiya
// google history delete ki
// kisi ko explain nhi kiya
// bina permission bhar gaya
// drama dekha
// mobile use kiya
// aap s transparent nhi rha
 class nb{

    public static void main(String[] args) {
        System.out.println("akib");


    }
}










































