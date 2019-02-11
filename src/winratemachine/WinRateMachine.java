/*
 * Last Updated: 0/0/2017
 * Class description:
 */
package winratemachine;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.sql.SQLException;
/**
 *
 * @author Pussy Whisperer
 */
public class WinRateMachine {
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     * @throws java.net.MalformedURLException
     * @throws java.net.ProtocolException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException, MalformedURLException, ProtocolException, IOException {

        // Create and display the form
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new WRView().setVisible(true);
                
            } catch (IOException ex) {
                
            }
        });
        
        
        
        }// End Main class
    }// End WinRateMachine class
  
  

        
    
    

