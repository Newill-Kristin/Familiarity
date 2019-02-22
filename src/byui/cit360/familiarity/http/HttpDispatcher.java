package byui.cit360.familiarity.http;

import byui.cit360.familiarity.view.MainMenu;

/**
 * Created by Kristin Newill (aingealfire) on 2/21/2019.
 */
public class HttpDispatcher {
    private HttpNames httpNames;
    private HttpAcct httpAcct;
    private HttpDet httpDet;

    public HttpDispatcher() {
        httpNames = new HttpNames();
        httpAcct = new HttpAcct();
        httpDet = new HttpDet();
    }

    public void dispatch(String request) throws Exception {
        if (request.equalsIgnoreCase("N")) {
            httpNames.nameDemo();
        }
        if (request.equalsIgnoreCase("A")) {
            httpAcct.acctDemo();
        }
        if (request.equalsIgnoreCase("D")) {
            httpDet.detDemo();
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
            HttpDemo http = new HttpDemo();
            http.httpMenu();
        }
    }

}
