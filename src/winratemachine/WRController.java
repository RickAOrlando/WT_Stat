/*
 * Last Updated: 0/0/2017
 * Class description:
 */
package winratemachine;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
/**
 *
 * @author Pussy Whisperer
 */

public class WRController {
    
    // Variables
    StringBuffer response;
    
    WRController() throws IOException {
    
    this.bufferedReader(this.httpGetRequest());

    // Test passing in parsing argument
    System.out.println("The parsed argument shows: " + this.parseString("pitch 1, deg"));
    
    WRView view = new WRView();

    }// End WRController constructor
    
    // Methods
    // Http URL connection established
    public HttpURLConnection httpGetRequest() throws MalformedURLException, IOException{
        String url = "http://localhost:8111/state";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        
        return con;
    }
    
    // Buffered Reader that take httpGetRequest as argument
    public void bufferedReader(HttpURLConnection connection) throws IOException{
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()))) {
            String inputLine;
            response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);        
            }
        }
    }
    // Parse the string and create a tree and JSON object
    public JsonElement parseString(String element){
        JsonParser parser = new JsonParser();
        String json = response.toString();
        JsonElement jsonTree = parser.parse(json);
        JsonObject jsonObject = jsonTree.getAsJsonObject();

        JsonElement newElement = jsonObject.get(element);

        System.out.println("\nThe pitch is currently: " + newElement + " degrees");
        
        return newElement;
    }

}// End controller class
