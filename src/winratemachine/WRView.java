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
public class WRView extends javax.swing.JFrame implements ActionListener {

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
        initializeTimerOn(this.labelHPValue, this.labelThrottleValue, 
                this.labelPitchValue, this.labelAileronValue, 
                this.aircraftUpdatePanel);
        }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        buttonWin = new javax.swing.JButton();
        buttonLoss = new javax.swing.JButton();
        labelWinCounter = new javax.swing.JLabel();
        labelLossCounter = new javax.swing.JLabel();
        labelCalculateWinRate = new javax.swing.JLabel();
        buttonWinSubtract = new javax.swing.JButton();
        buttonCalculate = new javax.swing.JButton();
        buttonWinSubtract1 = new javax.swing.JButton();
        removeThisValue = new javax.swing.JLabel();
        aircraftUpdatePanel = new javax.swing.JPanel();
        labelAileronText = new javax.swing.JLabel();
        labelAileronValue = new javax.swing.JLabel();
        labelPitch = new javax.swing.JLabel();
        labelPitchValue = new javax.swing.JLabel();
        labelThrottleText = new javax.swing.JLabel();
        labelThrottleValue = new javax.swing.JLabel();
        labelHPText = new javax.swing.JLabel();
        labelHPValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        buttonWin.setText("Win");
        buttonWin.addActionListener(this);

        buttonLoss.setText("Loss");
        buttonLoss.addActionListener(this);

        labelWinCounter.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        labelWinCounter.setText("0");

        labelLossCounter.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        labelLossCounter.setText("0");

        labelCalculateWinRate.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        labelCalculateWinRate.setText("0");

        buttonWinSubtract.setText("-");
        buttonWinSubtract.addActionListener(this);

        buttonCalculate.setText("Calculate WinRate");
        buttonCalculate.addActionListener(this);

        buttonWinSubtract1.setText("-");
        buttonWinSubtract1.addActionListener(this);

        aircraftUpdatePanel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        labelAileronText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelAileronText.setText("Aileron: ");

        labelAileronValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelAileronValue.setText("0");

        labelPitch.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPitch.setText("Pitch: ");

        labelPitchValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPitchValue.setText("0");

        labelThrottleText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelThrottleText.setText("Throttle: ");

        labelThrottleValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelThrottleValue.setText("0");

        labelHPText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelHPText.setText("HorsePower: ");

        labelHPValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelHPValue.setText("0");

        javax.swing.GroupLayout aircraftUpdatePanelLayout = new javax.swing.GroupLayout(aircraftUpdatePanel);
        aircraftUpdatePanel.setLayout(aircraftUpdatePanelLayout);
        aircraftUpdatePanelLayout.setHorizontalGroup(
            aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                        .addComponent(labelAileronText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelAileronValue))
                    .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                        .addComponent(labelPitch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelPitchValue))
                    .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                        .addComponent(labelThrottleText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelThrottleValue))
                    .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                        .addComponent(labelHPText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelHPValue)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        aircraftUpdatePanelLayout.setVerticalGroup(
            aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAileronText)
                    .addComponent(labelAileronValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPitch)
                    .addComponent(labelPitchValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelThrottleText)
                    .addComponent(labelThrottleValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHPText)
                    .addComponent(labelHPValue))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(removeThisValue))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonWin)
                            .addComponent(buttonWinSubtract1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonLoss)
                            .addComponent(labelWinCounter))
                        .addGap(266, 266, 266)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLossCounter)
                            .addComponent(buttonWinSubtract)))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonCalculate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCalculateWinRate)
                            .addComponent(aircraftUpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(removeThisValue)
                .addGap(114, 114, 114)
                .addComponent(aircraftUpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonWinSubtract1)
                    .addComponent(buttonWinSubtract))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonWin)
                            .addComponent(buttonLoss)
                            .addComponent(labelLossCounter))
                        .addGap(18, 18, 18)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCalculateWinRate)
                            .addComponent(buttonCalculate)))
                    .addComponent(labelWinCounter))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == buttonWin) {
            WRView.this.buttonWinActionPerformed(evt);
        }
        else if (evt.getSource() == buttonLoss) {
            WRView.this.buttonLossActionPerformed(evt);
        }
        else if (evt.getSource() == buttonWinSubtract) {
            WRView.this.buttonLossSubtractActionPerformed(evt);
        }
        else if (evt.getSource() == buttonCalculate) {
            WRView.this.buttonCalculateActionPerformed(evt);
        }
        else if (evt.getSource() == buttonWinSubtract1) {
            WRView.this.buttonWinSubtract1ActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents
    
    private void buttonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculateActionPerformed
        double wc = Integer.parseInt(this.labelWinCounter.getText());
        double lc = Integer.parseInt(this.labelLossCounter.getText());
        double total = wc + lc;
        double calc = wc / total;
        this.labelCalculateWinRate.setText(calc + "");
    }//GEN-LAST:event_buttonCalculateActionPerformed

    private void buttonWinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWinActionPerformed
        winCounter = winCounter += 1;
        this.labelWinCounter.setText("" + winCounter);
    }//GEN-LAST:event_buttonWinActionPerformed

    private void buttonLossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLossActionPerformed
        lossCounter = lossCounter += 1;
        this.labelLossCounter.setText("" + lossCounter);
    }//GEN-LAST:event_buttonLossActionPerformed

    private void buttonLossSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLossSubtractActionPerformed
        if (lossCounter <= 0) {
            // do nothing
        } else {
            lossCounter = lossCounter -= 1;
            this.labelLossCounter.setText("" + lossCounter);
        }
    }//GEN-LAST:event_buttonLossSubtractActionPerformed

    private void buttonWinSubtract1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWinSubtract1ActionPerformed
        if (winCounter <= 0) {
            // do nothing
        } else {
            winCounter = winCounter -= 1;
            this.labelWinCounter.setText("" + winCounter);
        }
    }//GEN-LAST:event_buttonWinSubtract1ActionPerformed

    // Timer task method
    // This method is where you add arguments as JLabels, then use that argument
    // to set the text on that label
    public void initializeTimerOn(
            JLabel labelHPValue, JLabel labelThrottleValue, 
            JLabel labelPitchValue, JLabel labelAileronValue, 
            JPanel aircraftUpdatePanel){
        
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
            labelThrottleValue.setText(controller.parseString("RPM throttle 1, %").getAsString());
            labelPitchValue.setText(controller.parseString("pitch 1, deg").getAsString());
            labelAileronValue.setText(controller.parseString("aileron, %").getAsString());
            aircraftUpdatePanel.revalidate();

            System.out.println("Task performed on " + new Date());
            }
        };
    Timer timer = new Timer("Timer");
     
    // Timer start delay
    long delay  = 500L;
    // Timer repeat interval 
    long period = 150L;
    timer.scheduleAtFixedRate(repeatedTask, delay, period);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aircraftUpdatePanel;
    private javax.swing.JButton buttonCalculate;
    private javax.swing.JButton buttonLoss;
    private javax.swing.JButton buttonWin;
    private javax.swing.JButton buttonWinSubtract;
    private javax.swing.JButton buttonWinSubtract1;
    private javax.swing.JLabel labelAileronText;
    public javax.swing.JLabel labelAileronValue;
    private javax.swing.JLabel labelCalculateWinRate;
    private javax.swing.JLabel labelHPText;
    private javax.swing.JLabel labelHPValue;
    private javax.swing.JLabel labelLossCounter;
    private javax.swing.JLabel labelPitch;
    private javax.swing.JLabel labelPitchValue;
    private javax.swing.JLabel labelThrottleText;
    private javax.swing.JLabel labelThrottleValue;
    private javax.swing.JLabel labelWinCounter;
    private javax.swing.JPanel panelMain;
    private javax.swing.JLabel removeThisValue;
    // End of variables declaration//GEN-END:variables

    // Manual variable declaration   
    int winCounter;
    int lossCounter;
    WRController controller;
}   // End of Manual variable declaration   
