package byui.cit360.familiarity.JSON;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * Created by Kristin Newill (aingealfire) on 2/20/2019.
 */
public class JsonWrite {

    public void writeDemo() throws Exception
    {
        // creating JSONObject
        JSONObject jo = new JSONObject();

        // putting data to JSONObject
        jo.put("firstName", "Dudley");
        jo.put("lastName", "Dursley");
        jo.put("add1", "4 Privet Dr");
        jo.put("city", "Little Whinging");
        jo.put("state", "Surrey");
        jo.put("zip", "10101");
        jo.put("tele", "212 555-1234");

        // writing JSON to file
        PrintWriter pw = new PrintWriter("contact.json");
        pw.write(jo.toJSONString());

        pw.flush();
        pw.close();
        System.out.println("\n*** JSON File Written ***");
        System.out.println("\n*** Back to Menu ***");
        JsonDemo jd = new JsonDemo();
        jd.jsonMenu();
    }
}


