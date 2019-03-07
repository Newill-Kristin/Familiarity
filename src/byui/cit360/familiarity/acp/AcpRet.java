package byui.cit360.familiarity.acp;

import byui.cit360.familiarity.view.MainMenu;

import java.util.HashMap;

/**
 * Created by Kristin Newill (aingealfire) on 3/6/2019.
 */
public class AcpRet implements AcpHandler {

    public void handleIt(HashMap<String, Object> data) throws Exception {

        MainMenu mm = new MainMenu();

        mm.mainMenu();

    }
}
