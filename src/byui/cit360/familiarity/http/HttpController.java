package byui.cit360.familiarity.http;

/**
 * Created by Kristin Newill (aingealfire) on 2/21/2019.
 */
public class HttpController {

    private HttpDispatcher httpDispatcher;

    public HttpController() {
        httpDispatcher = new HttpDispatcher();
    }

    private void track(String request) {
        System.out.println("\nRequested: " + request);
    }

    public void dRequest(String request) throws Exception {
        //Log request
        track(request);

        httpDispatcher.dispatch(request);
    }
}
