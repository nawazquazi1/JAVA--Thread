public class customthread extends Thread {
    public customthread(String name) {
        super(name);
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + ":" + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("chek the error");
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        customthread c1=new customthread("Thread one ");
        customthread c2=new customthread("Thread two ");
        customthread c3=new customthread("Thread three ");
        c1.start();
        c3.start();
        c2.start();
        for (int i=1;i<=10;i++){
            System.out.println("Main thread : "+ i);
        }
        Thread.sleep(300);

    }

}
