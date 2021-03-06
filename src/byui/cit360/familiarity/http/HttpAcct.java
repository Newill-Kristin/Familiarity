package byui.cit360.familiarity.http;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Kristin Newill (aingealfire) on 2/21/2019.
 */

//Display list of First & Last Names and SAM Accounts from http://www.flameandshadow.net/School/hpdata.html

public class HttpAcct {

    public void acctDemo() throws Exception
    {
        HttpAcct httpAcct = new HttpAcct();

        System.out.println("\nRequest for Page Title");
        httpAcct.httpGet();

        httpAcct.nameSet();

        httpAcct.httpSearch();

        HttpDemo http = new HttpDemo();
        http.httpMenu();

     }

        // Page Title
        private void httpGet() throws Exception {

        String url = "http://www.flameandshadow.net/School/hpdata.html";

        Document doc = Jsoup.connect(url).get();
        String title = doc.title();
        System.out.println("The Page title is: " + title);

        }

    //create a set of last names to use in search
    private void nameSet () throws Exception {

        String url = "http://www.flameandshadow.net/School/hpdata.html";

        Document doc = Jsoup.connect(url).get();

        TreeSet<String> nameSet = new TreeSet<>();

        Element table = doc.select("table").get(0); //select the first table.
        Elements rows = table.select("tr");

        for (int i = 1; i < rows.size(); i++) { //first row is the col names
            Element row = rows.get(i);
            Elements cols = row.select("td");
            nameSet.add(cols.get(5).text());
        }
        int p = 0;

        Iterator<String> itr = nameSet.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Search for one of the previous to see Name and SAM ID: (Case Sensitive)\n");
    }


    //Search
    private void httpSearch() throws Exception {

        System.out.println("\nRequest for Names, and SAM ID that match criteria");

        String url = "http://www.flameandshadow.net/School/hpdata.html";

        Document doc = Jsoup.connect(url).get();

        HashMap<String, String> demomap2 = new HashMap<>();

        Element table = doc.select("table").get(0); //select the first table.
        Elements rows = table.select("tr");

        Scanner input = new Scanner(System.in);
        String namepick = input.nextLine();

        for (int i = 1; i < rows.size(); i++) { //first row is the col names
            Element row = rows.get(i);
            Elements cols = row.select("td");

            String key = cols.get(4).text();
            String name1 = cols.get(2).text();

            if (cols.get(5).text().equals(namepick)) {
                demomap2.put(key, name1);
            }
        }

        int num = demomap2.size();
        System.out.println("Your search for " + namepick + " from the list resulted in " + num + " users. \n");
        System.out.println("The results are:");
        for (String keys : demomap2.keySet()) {
            System.out.println("SAM ID: " + keys + "    Name: " + demomap2.get(keys));
        }

    }
}


