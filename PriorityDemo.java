public class PriorityDemo extends  Thread{
    public void run(){
        System.out.println("Priority  of the Thread :"+Thread.currentThread());
    }

    public static void main(String[] args) {
        PriorityDemo dm1=new PriorityDemo();
        dm1.setPriority(Thread.NORM_PRIORITY);
        dm1.start();
    }
}
