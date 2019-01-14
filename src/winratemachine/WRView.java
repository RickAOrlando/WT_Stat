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
        initializeTimerOn(this.labelHPValue, this.labelPitchValue, this.labelAileronValue, 
                this.labelThrottleValue, this.aircraftUpdatePanel);
        }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        removeThisValue = new javax.swing.JLabel();
        aircraftUpdatePanel = new javax.swing.JPanel();
        labelAileronText = new javax.swing.JLabel();
        labelAileronValue = new javax.swing.JLabel();
        labelPitch = new javax.swing.JLabel();
        labelPitchValue = new javax.swing.JLabel();
        labelHPText = new javax.swing.JLabel();
        labelHPValue = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelRPMThrottle = new javax.swing.JLabel();
        labelThrottleValue = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

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

        labelAileronText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelAileronText.setForeground(new java.awt.Color(102, 0, 0));
        labelAileronText.setText("Aileron: ");

        labelAileronValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelAileronValue.setForeground(new java.awt.Color(255, 0, 0));
        labelAileronValue.setText("0");

        labelPitch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPitch.setForeground(new java.awt.Color(102, 0, 0));
        labelPitch.setText("Pitch: ");

        labelPitchValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPitchValue.setForeground(new java.awt.Color(255, 0, 0));
        labelPitchValue.setText("0");

        labelHPText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelHPText.setForeground(new java.awt.Color(102, 0, 0));
        labelHPText.setText("HorsePower: ");

        labelHPValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelHPValue.setForeground(new java.awt.Color(255, 0, 0));
        labelHPValue.setText("0");

        labelRPMThrottle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelRPMThrottle.setForeground(new java.awt.Color(102, 0, 0));
        labelRPMThrottle.setText("Throttle: ");

        labelThrottleValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelThrottleValue.setForeground(new java.awt.Color(255, 0, 0));
        labelThrottleValue.setText("0");

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
                                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                                        .addComponent(labelPitch)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelPitchValue))
                                    .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                                        .addComponent(labelHPText)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelHPValue))
                                    .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                                            .addComponent(labelRPMThrottle)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(labelThrottleValue))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, aircraftUpdatePanelLayout.createSequentialGroup()
                                            .addComponent(labelAileronText)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(labelAileronValue))))
                                .addGap(0, 134, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        aircraftUpdatePanelLayout.setVerticalGroup(
            aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAileronText)
                    .addComponent(labelAileronValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPitch)
                    .addComponent(labelPitchValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRPMThrottle)
                    .addComponent(labelThrottleValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHPText)
                    .addComponent(labelHPValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addContainerGap(185, Short.MAX_VALUE))
            .addComponent(aircraftUpdatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 282, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
        );

        setBounds(0, 500, 282, 191);
    }// </editor-fold>//GEN-END:initComponents
    
    // Timer task method
    // This method is where you add arguments as JLabels, then use that argument
    // to set the text on that label
    public void initializeTimerOn(
            JLabel labelHPValue, JLabel labelPitchValue, JLabel labelAileronValue, 
            JLabel labelThrottle, JPanel aircraftUpdatePanel){
        
    TimerTask repeatedTask;
        repeatedTask = new TimerTask() {
            @Override
            public void run() {
                
                try {
                    controller.bufferedReader(controller.httpGetRequest());
                }   catch (IOException ex) {
                            Logger.getLogger(WRView.class.getName()).log(Level.SEVERE, null, ex);
                    }
            // This is where you use the argument to set the label
            labelHPValue.setText(controller.parseString("power 1, hp").getAsString());
            labelPitchValue.setText(controller.parseString("pitch 1, deg").getAsString());
            labelAileronValue.setText(controller.parseString("aileron, %").getAsString());
            labelThrottle.setText(controller.parseString("throttle 1, %").getAsString());
            aircraftUpdatePanel.revalidate();

            System.out.println("Task performed on " + new Date());
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
    private javax.swing.JLabel labelAileronText;
    public javax.swing.JLabel labelAileronValue;
    private javax.swing.JLabel labelHPText;
    private javax.swing.JLabel labelHPValue;
    private javax.swing.JLabel labelPitch;
    private javax.swing.JLabel labelPitchValue;
    private javax.swing.JLabel labelRPMThrottle;
    private javax.swing.JLabel labelThrottleValue;
    private javax.swing.JPanel panelMain;
    private javax.swing.JLabel removeThisValue;
    // End of variables declaration//GEN-END:variables

    // Manual variable declaration   
    int winCounter;
    int lossCounter;
    WRController controller;
}   // End of Manual variable declaration   
