/*
 * Last Updated: 0/0/2017
 * Class description:
 */
package files;

import java.io.IOException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import winratemachine.WRView;

/**
 *
 * @author Pussy Whisperer
 */
public class SpareCode {
//     public void initializeTimerOnState(
//            JLabel labelHPValue, JLabel labelThrottle, JPanel aircraftUpdatePanel){
//    TimerTask repeatedTask;
//        repeatedTask = new TimerTask() {
//            @Override
//            public void run() {
//                
//                try {
//                    controller.bufferedReader(controller.httpGetRequestState());
//                } catch (IOException ex) {
//                    Logger.getLogger(WRView.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            // This is where you use the argument to set the label
//            // Horsepower
//            labelHPValue.setText(controller.parseString("power 1, hp").getAsString());
//            
//                // Check throttle for WEP
//                switch (controller.parseString("throttle 1, %").getAsInt()) {
//                    case 103:
//                        labelThrottle.setText("WEP Stage 1");
//                        break;
//                    case 105:
//                        labelThrottle.setText("WEP Stage 2");
//                        break;
//                    case 108:
//                        labelThrottle.setText("WEP Stage 3");
//                        break;
//                    case 110:
//                        labelThrottle.setText("WEP MAX POWER");
//                        break;
//                    default:
//                        labelThrottle.setText(controller.parseString("throttle 1, %").getAsString());
//                        break;
//                }
//            
//            // Update the panel to show changes
//            aircraftUpdatePanel.revalidate();
//
//            System.out.println("Task performed on " + new Date());
//            }
//        };
//    Timer timer2 = new Timer("Timer");
//     
//    // Timer start delay
//    long delay  = 500L;
//    // Timer repeat interval 
//    long period = 50L;
//    timer2.scheduleAtFixedRate(repeatedTask, delay, period);
//    }

}
