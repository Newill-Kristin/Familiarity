package byui.cit360.familiarity.Threads;

/**
 * Created by Kristin Newill (aingealfire) on 1/23/2019.
 */
public class RunnableDemo implements Runnable {

    public static void runTest() {

        System.out.println("Starting inside : " + Thread.currentThread().getName() + "\n");

        System.out.println("I start by createing a Runnable...\n");
        Runnable runnable = new RunnableDemo();

        System.out.println("Next I create a Thread...\n");
        Thread thread = new Thread(runnable);

        System.out.println("Then the Thread is started...\n");
        thread.start();

        for (int threadCnt = 0; threadCnt < 3; threadCnt++) {
            RunnableDemo runningDemo = new RunnableDemo();
            Thread aRunnable = new Thread(runningDemo);
            aRunnable.start();
        }

    }

    public void run() {

        System.out.println("This thread is : " + Thread.currentThread().getName());

    }

}
