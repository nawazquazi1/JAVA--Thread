public class Synchronized_method_Thread {
    public static void main(String[] args) {
        Brackets braket = new Brackets();
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    braket.generate("Thread 1");
                }
                System.out.println("Loop one is comp");

            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    braket.generate("Thread 1");
                }

            System.out.println("Loop Two is comp");

            }
        }).start();
    }
}

class Brackets {
    synchronized public void generate(String s) {
        for (int i = 1; i <= 10; i++) {
            if (i <= 5) {
                System.out.print("[");
            } else {
                System.out.print("]");
            }
        }
        System.out.println();
    }

}

