package byui.cit360.familiarity.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Kristin Newill (aingealfire) on 1/25/2019.
 */
public class ExecutorDemoRun {
        // Maximum number of threads in thread pool
        static final int MAX_T = 3;

        public void main()
        {
            // create <iteration number> of threads
            Runnable r1 = new ExecutorDemo("Thread 1");
            Runnable r2 = new ExecutorDemo("Thread 2");
            Runnable r3 = new ExecutorDemo("Thread 3");
            Runnable r4 = new ExecutorDemo("Thread 4");
            Runnable r5 = new ExecutorDemo("Thread 5");

            // create a thread pool with MAX_T no. of threads as the fixed pool size(Step 2)
            ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

            // passes the Task objects to the pool to execute (Step 3)
            pool.execute(r1);
            pool.execute(r2);
            pool.execute(r3);
            pool.execute(r4);
            pool.execute(r5);

            // pool shutdown ( Step 4)
            pool.shutdown();

        }


}





