public class Synchronization_thread {
    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                synchronized (this) {
                    for (int i = 1; i <= 1000; i++) {
                        Synchronization_thread.counter++;
                    }
                }
                System.out.println("The loops in thread1 is over");
            }
        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                synchronized (this) {
                    for (int i = 1; i <= 1000; i++) {
                        Synchronization_thread.counter++;
                    }
                }
                System.out.println("The loops in thread2 is over");
            }
        });
        thread1.start();
        thread2.start();
        Thread.sleep(10);
        System.out.println("The value of counter is " + Synchronization_thread.counter);

    }
}

class seatBookManger {
    static int Total_seat = 20;

    synchronized static void BookSEat(int seat) {
        if (Total_seat >= seat) {
            System.out.println(seat + " your seat book success full");
            Total_seat = Total_seat - seat;
            System.out.println(" seats left : " + Total_seat);
        } else {
            System.out.println(seat +" sorry seats cannot be booked ... !!!");
            System.out.println("seats left : " + Total_seat);
        }

    }
}

class book extends Thread {
    seatBookManger b;
    int seats;

    book(seatBookManger b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.BookSEat(seats);
    }
}

class book1 extends Thread {
    seatBookManger b;
    int seats;

    book1(seatBookManger b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.BookSEat(seats);
    }
}

class MoveBookApp extends Thread {
    static seatBookManger b;
    int seat;

    public void run() {
        b.BookSEat(seat);
    }

    public static void main(String[] args) throws InterruptedException {

        b = new seatBookManger();
        MoveBookApp m1 = new MoveBookApp();
        m1.seat = 3;
        m1.start();
        book b1 = new book(b, 5);
        b1.start();
        book1 b2 = new book1(b, 9);
        b2.start();

        seatBookManger c = new seatBookManger();
        book c1 = new book(c, 7);
        c1.start();
        book1 c2 = new book1(c, 6);
        c2.start();

        seatBookManger se = new seatBookManger();
        MoveBookApp m2 = new MoveBookApp();
        m2.seat = 8;
        m2.start();
        book b3 = new book(se, 3);
        b3.start();

        seatBookManger se1 = new seatBookManger();
        MoveBookApp m3 = new MoveBookApp();
        m3.seat = 8;
        m3.start();
        book b4 = new book(se1, 3);
        b4.start();


    }
}