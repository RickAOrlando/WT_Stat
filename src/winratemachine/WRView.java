/*
 * Last Updated: 0/0/2017
 * Class description:
 */
package winratemachine;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author Pussy Whisperer
 */
public class WRView extends javax.swing.JFrame {

    /**
     * Creates new form WRView
     *
     * @throws java.io.IOException
     */
    public WRView() throws IOException {

        // Initialize GUI visual components
        initComponents();
        
        // Instantiate the controller
        controller = new WRController();
        
        // Calling timer task method using arguments to pass in the labels 
        // and panels to be changed and updated
        //initializeTimerOnState(this.labelHPValue,this.labelThrottleValue, this.aircraftUpdatePanel);
        this.initializeTimerOnMission();
        }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        removeThisValue = new javax.swing.JLabel();
        aircraftUpdatePanel = new javax.swing.JPanel();
        labelHPText = new javax.swing.JLabel();
        labelHPValue = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelRPMThrottle = new javax.swing.JLabel();
        labelThrottleValue = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        labelWinText = new javax.swing.JLabel();
        labeWinValue = new javax.swing.JLabel();
        labelLossText = new javax.swing.JLabel();
        labeLossValue = new javax.swing.JLabel();
        labelWRText = new javax.swing.JLabel();
        labeWRValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);
        setOpacity(0.55F);

        panelMain.setBackground(new java.awt.Color(102, 102, 102));
        panelMain.setForeground(new java.awt.Color(102, 0, 0));
        panelMain.setPreferredSize(new java.awt.Dimension(250, 250));

        aircraftUpdatePanel.setBackground(new java.awt.Color(102, 102, 102));
        aircraftUpdatePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        aircraftUpdatePanel.setForeground(new java.awt.Color(102, 0, 0));
        aircraftUpdatePanel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        labelHPText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelHPText.setForeground(new java.awt.Color(255, 255, 255));
        labelHPText.setText("HorsePower: ");

        labelHPValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelHPValue.setForeground(new java.awt.Color(255, 0, 0));
        labelHPValue.setText("0");

        labelRPMThrottle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelRPMThrottle.setForeground(new java.awt.Color(255, 255, 255));
        labelRPMThrottle.setText("Throttle: ");

        labelThrottleValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelThrottleValue.setForeground(new java.awt.Color(255, 0, 0));
        labelThrottleValue.setText("0");

        labelWinText.setText("Win: ");

        labeWinValue.setText("0");

        labelLossText.setText("Loss: ");

        labeLossValue.setText("0");

        labelWRText.setText("WinRate: ");

        labeWRValue.setText("0");

        javax.swing.GroupLayout aircraftUpdatePanelLayout = new javax.swing.GroupLayout(aircraftUpdatePanel);
        aircraftUpdatePanel.setLayout(aircraftUpdatePanelLayout);
        aircraftUpdatePanelLayout.setHorizontalGroup(
            aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                        .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelRPMThrottle, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelHPText, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelThrottleValue)
                                    .addComponent(labelHPValue))
                                .addGap(0, 126, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(labelWinText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labeWinValue)
                .addGap(18, 18, 18)
                .addComponent(labelLossText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labeLossValue)
                .addGap(18, 18, 18)
                .addComponent(labelWRText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labeWRValue)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        aircraftUpdatePanelLayout.setVerticalGroup(
            aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWinText)
                    .addComponent(labeWinValue)
                    .addComponent(labelLossText)
                    .addComponent(labeLossValue)
                    .addComponent(labelWRText)
                    .addComponent(labeWRValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRPMThrottle)
                    .addComponent(labelThrottleValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHPText)
                    .addComponent(labelHPValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(aircraftUpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(removeThisValue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(removeThisValue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(aircraftUpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 282, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        );

        setBounds(0, 500, 282, 116);
    }// </editor-fold>//GEN-END:initComponents
    
    // Timer task method
    // This method is where you add arguments as JLabels, then use that argument
    // to set the text on that label
    public void initializeTimerOnState(
            JLabel labelHPValue, JLabel labelThrottle, JPanel aircraftUpdatePanel){
    TimerTask repeatedTask;
        repeatedTask = new TimerTask() {
            @Override
            public void run() {
                
                try {
                    controller.bufferedReader(controller.httpGetRequestState());
                } catch (IOException ex) {
                    Logger.getLogger(WRView.class.getName()).log(Level.SEVERE, null, ex);
                }
            // This is where you use the argument to set the label
            // Horsepower
            labelHPValue.setText(controller.parseString("power 1, hp").getAsString());
            
                // Check throttle for WEP
                switch (controller.parseString("throttle 1, %").getAsInt()) {
                    case 103:
                        labelThrottle.setText("WEP Stage 1");
                        break;
                    case 105:
                        labelThrottle.setText("WEP Stage 2");
                        break;
                    case 108:
                        labelThrottle.setText("WEP Stage 3");
                        break;
                    case 110:
                        labelThrottle.setText("WEP MAX POWER");
                        break;
                    default:
                        labelThrottle.setText(controller.parseString("throttle 1, %").getAsString());
                        break;
                }
            
            // Update the panel to show changes
            aircraftUpdatePanel.revalidate();

            System.out.println("Task performed on " + new Date());
            }
        };
    Timer timer2 = new Timer("Timer");
     
    // Timer start delay
    long delay  = 500L;
    // Timer repeat interval 
    long period = 50L;
    timer2.scheduleAtFixedRate(repeatedTask, delay, period);
    }
    
    public void initializeTimerOnMission()
    {
    TimerTask repeatedTask;
        repeatedTask = new TimerTask() 
        {
            @Override
            public void run() 
            {
                try {
                    controller.bufferedReader(controller.httpGetRequestMission());
                } catch (IOException ex) {
                    Logger.getLogger(WRView.class.getName()).log(Level.SEVERE, null, ex);
                }
                    // Set labels to show values
                    labelHPValue.setText(controller.parseString("status").getAsString());
                    
                    // Update panel and print tests
                    aircraftUpdatePanel.revalidate();
                    System.out.println("Got mission information on " + new Date());
            }
        };
                    Timer timer = new Timer("Timer");
     
    // Timer start delay
    long delay  = 500L;
    // Timer repeat interval 
    long period = 50L;
    timer.scheduleAtFixedRate(repeatedTask, delay, period);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aircraftUpdatePanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labeLossValue;
    public javax.swing.JLabel labeWRValue;
    private javax.swing.JLabel labeWinValue;
    private javax.swing.JLabel labelHPText;
    private javax.swing.JLabel labelHPValue;
    private javax.swing.JLabel labelLossText;
    private javax.swing.JLabel labelRPMThrottle;
    private javax.swing.JLabel labelThrottleValue;
    private javax.swing.JLabel labelWRText;
    private javax.swing.JLabel labelWinText;
    private javax.swing.JPanel panelMain;
    private javax.swing.JLabel removeThisValue;
    // End of variables declaration//GEN-END:variables

    // Manual variable declaration   
    int winCounter;
    int lossCounter;
    WRController controller;
}   // End of Manual variable declaration   
