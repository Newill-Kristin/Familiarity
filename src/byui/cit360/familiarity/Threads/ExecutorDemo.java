package byui.cit360.familiarity.Threads;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by Kristin Newill (aingealfire) on 1/23/2019.
 */
public class ExecutorDemo implements Runnable {

    private String test1;

    public ExecutorDemo(String s)
    {
        test1 = s;
    }

    // Prints thread name and sleeps for 1s
    // Process is repeated <iteration number> times
    public void run()
    {
        try
        {
            for (int i = 0; i<=5; i++)
            {
                if (i==0)
                {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("The initialization time for"
                            + " thread name - "+ test1 +" is: " +ft.format(d));
                    //prints the initialization time for every thread
                }
                else
                {
                    Date d = new Date();
                    SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("The execution Time for thread name - "+
                            test1 +" is: " +ft.format(d));
                    // prints the execution time for every thread
                }
                Thread.sleep(1000);
                //make the thread take a nap
            }
            System.out.println(test1+" complete");
            //list completion
        }

        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}


