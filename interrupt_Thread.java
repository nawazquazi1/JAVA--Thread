public class interrupt_Thread {

    //// - Interrupts

    public static void main(String[] args) {
        App8 app = new App8();

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                app.withdraw(1000);

            }
        });
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
                thread1.interrupt();
            }
        });
        thread2.start();

    }
}
class App8 {
    static public int balance = 00;

    public void withdraw(int amount) {
        synchronized (this) {
            if (balance <= 0 || balance < amount) {
                try {
                    System.out.println("Waiting for balance updation");
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("original balance: " + balance);
                    System.out.println("Withdrawal amount: " + amount);
                    balance = balance - amount;
                    System.out.println("Withdrawal successful and the current balance is: " + balance);

                }
            } else {
                System.out.println("We are inside else");

            }
        }
    }
    public void deposit(int amount) {
        System.out.println("We are deposting the amount " + amount);
        balance = balance + amount;
    }
}