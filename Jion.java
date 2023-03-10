public class Jion extends Thread {
    int time;
    Jion(int time) {
        this.time=time;
        start();
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Jion j1 = new Jion(200);
        Jion j2 = new Jion(200);
        Jion j3 = new Jion(200);

        try {
            j1.join();
            j2.join();
            j3.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main list Exiting");
    }
}
