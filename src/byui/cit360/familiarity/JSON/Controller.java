package byui.cit360.familiarity.JSON;

/**
 * Created by Kristin Newill (aingealfire) on 2/20/2019.
 */
public class Controller {

    private Dispatcher dispatcher;

    public Controller() {
        dispatcher = new Dispatcher();
    }

    private void track(String request) {
        System.out.println("\nRequested: " + request);
    }

    public void dRequest(String request) throws Exception {
        //Log request
        track(request);

        dispatcher.dispatch(request);
    }

}
