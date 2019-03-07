package byui.cit360.familiarity.acp;

import java.util.HashMap;

/**
 * Created by Kristin Newill (aingealfire) on 3/6/2019.
 */
public class AcpController {

    private HashMap<String,AcpHandler> handlerMap = new HashMap();

    public void handleRequest(String command, HashMap<String,Object> data) throws Exception {
        AcpHandler aCommandHandler = handlerMap.get(command);
        if (aCommandHandler != null){
            aCommandHandler.handleIt(data);
        }
    }

    public void mapCommand(String aCommand, AcpHandler acHandler){
        handlerMap.put(aCommand,acHandler);
    }
}
