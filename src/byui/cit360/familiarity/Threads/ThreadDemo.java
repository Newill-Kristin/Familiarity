package byui.cit360.familiarity.Threads;

/**
 * Created by Kristin Newill (aingealfire) on 1/23/2019.
 */
public class ThreadDemo extends Thread{

    // run() method contains the code that is executed by the thread.

    public void run() {
        System.out.println("Currently in : " + Thread.currentThread().getName());

        switch (Thread.currentThread().getName()) {
            case "main": {
                System.out.println("I am still in " + Thread.currentThread().getName() + " because I was run from Familiarity/Main");
            }
            break;
            default:
                System.out.println("I am now in " + Thread.currentThread().getName() + " because I was run from ThreadDemo directly.");
            break;
        }

    }

    public static void main(String[] args) {
        System.out.println("Because I ran this from ThreadDemo, I start in : " + Thread.currentThread().getName());

        System.out.println("Then I create a new thread...");
        Thread thread = new ThreadDemo();

        System.out.println("And start the thread...");
        thread.start();
    }

}


