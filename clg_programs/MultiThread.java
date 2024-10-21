package clg_programs;

class mythread implements Runnable {
    String name;
    Thread t;
    mythread(String Threadname) {
        name = Threadname;
        t = new Thread(this,name);
        System.out.println("new thread: " + t);
        t.start();
    }
    public void run() {
        try {
            for(int i=5;i>0;i--) {
                System.out.println(name + " " + i);
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e) {
            System.out.println(name + " Interrupted");
        }
        System.out.println(name + " Existing");
    }
}
class MultiThread {
    public static void main(String ab[]) {
        new mythread("one");
        new mythread("two");
        new mythread("three");
        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException e) {
            System.out.println("Mainthread Interupted");
        }
        System.out.println("Mainthread Existing");
        }
}