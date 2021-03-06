package byui.cit360.familiarity.http;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.TreeSet;


/**
 * Created by Kristin Newill (aingealfire) on 2/21/2019.
 */

//Display list of First & Last Names, SAM Accounts, and PrincipalName (email), and Member Of from http://www.flameandshadow.net/School/hpdata.html
public class HttpDet {

    String url = "http://www.flameandshadow.net/School/hpdata.html";

    public void detDemo() throws Exception
    {
        HttpDet httpDet = new HttpDet();

        System.out.println("\nRequest for Page Title");
        httpDet.httpGet();

        httpDet.httpToJson();

        PrintWriter pw = new PrintWriter("hpdata.json");
        pw.write(httpToJson());
        pw.flush();
        pw.close();
        System.out.println("\n*** JSON File Written ***\n");

        httpDet.nameSet();

        httpDet.searchJson();

        HttpDemo http = new HttpDemo();
        http.httpMenu();

    }

    // Page Title
    public void httpGet() throws Exception {

        Document doc = Jsoup.connect(url).get();
        String title = doc.title();
        System.out.println("The Page title is: " + title);

    }

    //create a set of last names to use in search
    public void nameSet () throws Exception {

        //String url = "http://www.flameandshadow.net/School/hpdata.html";

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
        System.out.println("Search for one of the previous to see Details: (Case Sensitive)\n");
    }

    //Port HTML to JSON for Search
    public String httpToJson() throws Exception {

        Document doc = Jsoup.connect(url).get();

        JSONObject jpObj = new JSONObject();

        for (Element table : doc.select("table")) {

            for (Element row : table.select("tr")) {
                JSONObject jObj = new JSONObject();
                Elements tds = row.select("td");
                String SAM = tds.get(4).text();
                String Name = tds.get(2).text();
                String MemOf = tds.get(3).text();
                String SN = tds.get(5).text();
                String GN = tds.get(6).text();
                String PN = tds.get(7).text();
                jObj.put("SAM ID", SAM);
                jObj.put("Name", Name);
                jObj.put("Group", MemOf);
                jObj.put("Last Name", SN);
                jObj.put("First Name", GN);
                jObj.put("Email", PN);
                jpObj.put(SAM, jObj);
            }

        }
        return jpObj.toString();

    }


    //Search
    private void searchJson() throws Exception {

        //System.out.println("\nRequest for Details that match criteria\n");

        HttpJackMap hjm = new HttpJackMap();
        hjm.httpSearch();


        //System.out.println("\nJSON RESULTS SHOULD BE HERE!\n");

        //Display Menu options
        System.out.println("\n*** Back to Menu ***");
        HttpDemo http = new HttpDemo();
        http.httpMenu();

    }

}

