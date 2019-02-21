package byui.cit360.familiarity.JSON;

import byui.cit360.familiarity.view.MainMenu;

/**
 * Created by Kristin Newill (aingealfire) on 2/20/2019.
 */


public class Dispatcher {

    private JsonRead jsonRead;
    private JsonWrite jsonWrite;

    public Dispatcher() {
        jsonRead = new JsonRead();
        jsonWrite = new JsonWrite();
    }

    public void dispatch(String request) throws Exception {
        if (request.equalsIgnoreCase("W")) {
            jsonWrite.writeDemo();
        }
        if (request.equalsIgnoreCase("R")) {
            jsonRead.readDemo();
        }
        if (request.equalsIgnoreCase("M")) {
            MainMenu mm = new MainMenu();
            mm.mainMenu();
        }
        if (request.equalsIgnoreCase("X")) {
                System.exit(0);
        }
        else {
            System.out.println("\n*** Invalid Selection *** Try Again");
            JsonDemo jd = new JsonDemo();
            jd.jsonMenu();
        }
    }


}