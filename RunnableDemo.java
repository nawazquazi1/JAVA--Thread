public class RunnableDemo implements Runnable {
    Thread t;

    RunnableDemo(String name) {
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        for (int i=1;i<=10;i++) {
            System.out.println(t.getName() + " : " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RunnableDemo t1=new RunnableDemo("Thread  one ");
        RunnableDemo t2=new RunnableDemo("Thread  two ");
        RunnableDemo t3=new RunnableDemo("Thread  three ");
        for (int i=1;i<=10;i++){
            System.out.println("Main thread  : " +i);
            Thread.sleep(300);
        }
    }
}
