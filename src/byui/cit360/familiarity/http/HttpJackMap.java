package byui.cit360.familiarity.http;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

/**
 * Created by Kristin Newill (aingealfire) on 2/22/2019.
 */
public class HttpJackMap {

    public void httpJackMap() throws IOException {

        ObjectMapper obMap = new ObjectMapper();

        File file = new File("hpdata.json");

        HttpUser sam = obMap.readValue(file, HttpUser.class);

    }

}
