package clg_programs;

class newthread implements Runnable {
    Thread t;
    newthread() {
        t = new Thread(this,"Demothread");
        System.out.println("child thread"+t);
        t.start();
    }
    public void run() {
        try {
            for(int i=5;i>0;i--) {
                System.out.println("child thread"+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e) {
            System.out.println("child interrupted");
        }
        System.out.println("exit child thread");
    }
}
public class demoThread {
    public static void main(String ab[]) {
        new newthread();
        try {
            for(int i=5;i>0;i--) {
                System.out.println("main thread"+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e) {
            System.out.println("main Thread interrupted");
        }
        System.out.println("main thread exit");
    }
}