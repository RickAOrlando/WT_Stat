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
    
    // Contructor
    WRController() throws IOException {

    }
   
    // Http URL connection with MISSION
    public HttpURLConnection httpGetRequestMission() throws MalformedURLException, IOException{
        String url = "http://localhost:8111/mission.json";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        
        return con;
    }
    
    // Http URL connection with STATE
    public HttpURLConnection httpGetRequestState() throws MalformedURLException, IOException{
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
    // This allows for the creation and return of elements
    public JsonElement parseString(String element){
        JsonParser parser = new JsonParser();
        String json = response.toString();
        JsonElement jsonTree = parser.parse(json);
        JsonObject jsonObject = jsonTree.getAsJsonObject();

        JsonElement newElement = jsonObject.get(element);
        
        return newElement;
    }

}// End controller class
