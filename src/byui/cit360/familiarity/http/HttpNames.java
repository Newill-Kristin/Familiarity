package byui.cit360.familiarity.http;

import java.util.*;

import org.jsoup.*;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * Created by Kristin Newill (aingealfire) on 2/21/2019.
 */

//Display list of First & Last Names from http://www.flameandshadow.net/School/hpdata.html
public class HttpNames {

    private final String USER_AGENT = "Mozilla/5.0"; //"Chrome/72.0"

    public void nameDemo() throws Exception
    {

        HttpNames httpNames = new HttpNames();

        System.out.println("\nRequest for Page Title");
        httpNames.httpGet();

        httpNames.nameSet();

        System.out.println("\nRequest for Names that match criteria");
        httpNames.httpSearch();

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
        System.out.println("Search for one of the following to see Names: \n");
        Iterator<String> itr = nameSet.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    //Names matching
    private void httpSearch() throws Exception {

        String url = "byui.cit360.familiarity.http://www.flameandshadow.net/School/hpdata.html";

        Document doc = Jsoup.connect(url).get();

        ArrayList<String> names = new ArrayList<>();

        Element table = doc.select("table").get(0); //select the first table.
        Elements rows = table.select("tr");

        Scanner input = new Scanner(System.in);
        String namepick = input.nextLine();

        for (int i = 1; i < rows.size(); i++) { //first row is the col names
            Element row = rows.get(i);
            Elements cols = row.select("td");

            if (cols.get(5).text().equals(namepick)) {
                names.add(cols.get(2).text());
            }
        }

        System.out.println("The users with the last name " + namepick + " from the list are:");
        names.forEach(l -> System.out.println(names.indexOf(l) + ": " + l));

    }

}
