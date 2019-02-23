package byui.cit360.familiarity.JSON;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
/**
 * Created by Kristin Newill (aingealfire) on 2/20/2019.
 */
public class JsonRead {

    public void readDemo() throws Exception
    {
        // parsing file
        Object obj = new JSONParser().parse(new FileReader("contact.json"));

        // to JSONObject
        JSONObject jo = (JSONObject) obj;

        // get and output data
        String firstName = (String) jo.get("firstName");
        String lastName = (String) jo.get("lastName");
        String add1 = (String) jo.get("add1");
        String city = (String) jo.get("city");
        String state = (String) jo.get("state");
        String zip = (String) jo.get("zip");
        String tele = (String) jo.get("tele");

        System.out.println("\n" + firstName + " " + lastName);
        System.out.println(add1 + "\n" + city + ", " + state + " " + zip + "\n" + tele);

        System.out.println("\n*** Back to Menu ***");
        JsonDemo jd = new JsonDemo();
        jd.jsonMenu();

    }

}
