import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AliveDEmo extends Thread {
    AliveDEmo() {
    //    start();
    }

    public void run() {
        try {
            System.out.println(getName() + " says....hello");
            Thread.sleep(500);
            System.out.println(getName() + " Says..... Bye Bye ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        AliveDEmo alv0 = new AliveDEmo();
        AliveDEmo alv1 = new AliveDEmo();
        AliveDEmo alv2 = new AliveDEmo();
        alv0.start();
        alv1.start();
        alv2.start();
        System.out.println(alv0.getName() + " : Alive Status : " + alv0.isAlive());
        System.out.println(alv1.getName() + " : Alive Status : " + alv1.isAlive());
        System.out.println(alv2.getName() + " : Alive Status : " + alv2.isAlive());
        System.out.println("main sleeping for 2000ms ");

        try {
            Thread.sleep(2000);
            System.out.println(alv0.getName() + " : Alive Status : " + alv0.isAlive());
            System.out.println(alv1.getName() + " : Alive Status : " + alv1.isAlive());
            System.out.println(alv2.getName() + " : Alive Status : " + alv2.isAlive());
        } catch (InterruptedException ie) {
        }



//        System.out.println(alv0);
//        System.out.println(alv1);
//        System.out.println(alv2);

    }
}