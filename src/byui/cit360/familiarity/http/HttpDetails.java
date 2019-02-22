package byui.cit360.familiarity.http;

import java.util.*;

import org.jsoup.*;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * Created by Kristin Newill (aingealfire) on 2/21/2019.
 */

//Display list of First & Last Names and SAM Accounts from http://www.flameandshadow.net/School/hpdata.html
public class HttpDetails {

    public void detDemo() throws Exception
    {
        HttpDetails httpDetails = new HttpDetails();

        System.out.println("\nRequest for Page Title");
        httpDetails.httpGet();

        httpDetails.nameSet();

        System.out.println("\nRequest for Names, and SAM Account that match criteria");
        httpDetails.httpSearch();

        HttpDemo http = new HttpDemo();
        http.httpMenu();

     }

        // Page Title
        private void httpGet() throws Exception {

        String url = "byui.cit360.familiarity.http://www.flameandshadow.net/School/hpdata.html";

        Document doc = Jsoup.connect(url).get();
        String title = doc.title();
        System.out.println("The Page title is: " + title);

        }

    //create a set of last names to use in search
    private void nameSet () throws Exception {

        String url = "byui.cit360.familiarity.http://www.flameandshadow.net/School/hpdata.html";

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
        System.out.println("Search for one of the following to see Name and SAM Account: \n");
        Iterator<String> itr = nameSet.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }


    //Search
    private void httpSearch() throws Exception {

        String url = "byui.cit360.familiarity.http://www.flameandshadow.net/School/hpdata.html";

        Document doc = Jsoup.connect(url).get();

        Map<String, List<String>> demomap2 = new HashMap<String, List<String>>();
        ArrayList<String> det = new ArrayList<>();

        Element table = doc.select("table").get(0); //select the first table.
        Elements rows = table.select("tr");

        Scanner input = new Scanner(System.in);
        String namepick = input.nextLine();

        for (int i = 1; i < rows.size(); i++) { //first row is the col names
            Element row = rows.get(i);
            Elements cols = row.select("td");

            String key = cols.get(4).text();
            String name1 = cols.get(2).text();
            String pn = cols.get(7).text();
            String mo = cols.get(3).text();

            if (cols.get(5).text().equals(namepick)) {
                det.add(cols.get(2).text());
                det.add(cols.get(7).text());
                det.add(cols.get(3).text());
            }

            if (cols.get(5).text().equals(namepick)) {
                demomap2.put(key, det);
            }
        }

        int num = demomap2.size();
        System.out.println("Your search for " + namepick + " from the list resulted in " + num + " users. \n");
        System.out.println("The results are:");
        for (String keys : demomap2.keySet()) {
            System.out.println("SAM Account: " + keys + " Name: " + demomap2.get(keys));
        }

    }
}


