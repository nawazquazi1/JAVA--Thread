public class Join_Methode_Thread {
    public int counter = 0;

    public static void main(String[] args) {
        Join_Methode_Thread app = new Join_Methode_Thread();

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {

                for (int i = 0; i < 1000; i++) {
                    app.counter++;
                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    thread1.join(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 1000; i++) {
                    app.counter++;
                }

            }
        });
        thread1.start();
        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The value of counter: " + app.counter);
    }
}

class join extends Thread {
    static Thread main;

    public void run() {
        try {
            main.join();
            for (int i = 1; i <= 5; i++) {
                System.out.println(" child Thread : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        main = Thread.currentThread();
        join j1 = new join();
        j1.start();
//         j1.join();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

        // program to join method
class Medical1 extends Thread {

    public void run() {
        try {
            System.out.println("Medical starts ");
            Thread.sleep(3000);
            System.out.println("Medical completed ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class TestDriver1 extends Thread {
    public void run() {
        try {
            System.out.println("Test Driver starts");
            Thread.sleep(5000);
            System.out.println("Test Drive completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class OfficerSign1 extends Thread {
    public void run() {
        try {
            System.out.println("officer takes the files ");
            Thread.sleep(3000);
            System.out.println("Officer work completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class run1 {
    public static void main(String[] args) throws InterruptedException {
        Medical1 m1 = new Medical1();
        m1.start();
        m1.join();
        TestDriver1 t1 = new TestDriver1();
        t1.start();
        t1.join();
        OfficerSign1 of1 = new OfficerSign1();
        of1.start();
    }
}




