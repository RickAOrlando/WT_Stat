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
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Pussy Whisperer
 */
public class WRController {
    
    // Variables
    StringBuffer response;
    WRView view;
    
    WRController() throws IOException{
        
        // Send Get request
        this.httpGetRequest();
        
        
        // Create and display the form
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new WRView().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(WinRateMachine.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        // Parse the string
        this.parseString();
        

    }// End WRController constructor
    
    // Methods
    public void httpGetRequest() throws MalformedURLException, IOException{
        String url = "http://localhost:8111/state";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()))) {
            String inputLine;
            response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);        
            }
        }
    }
    
    public void parseString(){
        JsonParser parser = new JsonParser();
        String json = response.toString();
        JsonElement jsonTree = parser.parse(json);
        JsonObject jsonObject = jsonTree.getAsJsonObject();

        JsonElement pitch = jsonObject.get("pitch 1, deg");
        JsonElement aileron = jsonObject.get("aileron, %");
        JsonElement maxFuel = jsonObject.get("Mfuel0, kg");

        System.out.println("The ailerons are currently at: " + aileron + "%" 
                +"\nThe max fuel is set to: " + maxFuel + "kg"
                +"\nThe pitch is currently: " + pitch + " degrees"
        ); 
                
    }

    
}// End controller class
