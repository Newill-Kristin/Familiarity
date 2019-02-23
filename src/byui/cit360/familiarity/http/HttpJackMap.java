package byui.cit360.familiarity.http;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Kristin Newill (aingealfire) on 2/22/2019.
 */
public class HttpJackMap {

    Scanner input = new Scanner(System.in);
    String namepick = input.nextLine();
    String url = "http://www.flameandshadow.net/School/hpdata.html";


    public void httpSearch() throws Exception {

        System.out.println("\nRequest for Names, and SAM Account that match criteria");

        System.out.print("\n"
                + "\nWhat detail would you like to show? "
                + "\nS: SAM ID"
                + "\nE: E-Mail"
                + "\nG: Group"
                + "\n"
                + "\nPlease choose an Option: ");

        //Get response
        String choice = input.nextLine();
        choice = choice.toUpperCase();

        // Case switch for choice
        switch (choice) {
            case "S": {
                this.sam(); // Trigger List
            }
            break;
            case "E": {
                this.email(); // Trigger Set
            }
            break;
            case "G": {
                this.grp(); // Trigger Queue
            }
            break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                this.httpSearch();
                break;
        }
    }


    private void sam() throws Exception {

        Document doc = Jsoup.connect(url).get();

        HashMap<String, String> demomap = new HashMap<>();

        Element table = doc.select("table").get(0); //select the first table.
        Elements rows = table.select("tr");

        for (int i = 1; i < rows.size(); i++) { //first row is the col names
            Element row = rows.get(i);
            Elements cols = row.select("td");

            String key = cols.get(2).text();
            String name1 = cols.get(4).text();

            if (cols.get(5).text().equals(namepick)) {
                demomap.put(key, name1);
            }
        }

        int num = demomap.size();
        System.out.println("Your search for " + namepick + " from the list resulted in " + num + " users. \n");
        System.out.println("The details are:");
        for (String keys : demomap.keySet()) {
            System.out.println("Name: " + keys + "   SAM ID: " + demomap.get(keys));
        }

    }

    private void email() throws Exception {

        Document doc = Jsoup.connect(url).get();

        HashMap<String, String> demomap = new HashMap<>();

        Element table = doc.select("table").get(0); //select the first table.
        Elements rows = table.select("tr");

        for (int i = 1; i < rows.size(); i++) { //first row is the col names
            Element row = rows.get(i);
            Elements cols = row.select("td");

            String key = cols.get(2).text();
            String name1 = cols.get(7).text();

            if (cols.get(5).text().equals(namepick)) {
                demomap.put(key, name1);
            }
        }

        int num = demomap.size();
        System.out.println("Your search for " + namepick + " from the list resulted in " + num + " users. \n");
        System.out.println("The details are:");
        for (String keys : demomap.keySet()) {
            System.out.println("Name: " + keys + "   Email: " + demomap.get(keys));
        }

    }

    private void grp() throws Exception {

        Document doc = Jsoup.connect(url).get();

        HashMap<String, String> demomap = new HashMap<>();

        Element table = doc.select("table").get(0); //select the first table.
        Elements rows = table.select("tr");

        for (int i = 1; i < rows.size(); i++) { //first row is the col names
            Element row = rows.get(i);
            Elements cols = row.select("td");

            String key = cols.get(2).text();
            String name1 = cols.get(3).text();

            if (cols.get(5).text().equals(namepick)) {
                demomap.put(key, name1);
            }
        }

        int num = demomap.size();
        System.out.println("Your search for " + namepick + " from the list resulted in " + num + " users. \n");
        System.out.println("The details are:");
        for (String keys : demomap.keySet()) {
            System.out.println("Name: " + keys + "   Group: " + demomap.get(keys));
        }

    }


}
