package byui.cit360.familiarity.acp;

import java.util.HashMap;

/**
 * Created by Kristin Newill (aingealfire) on 3/6/2019.
 */
public class AcpOne implements AcpHandler {

    @Override
    public void handleIt(HashMap<String, Object> data) throws Exception {

        System.out.println("This is the result of selecting choice A \n\n");

        AcpDemo acp = new AcpDemo();
        acp.acpDemo();

    }


}
