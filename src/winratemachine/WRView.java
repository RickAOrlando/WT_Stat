/*
 * Last Updated: 0/0/2017
 * Class description:
 */
package winratemachine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
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
        

        // Establish the connection and updating field
        controller.bufferedReader(controller.httpGetRequest());
        this.lableAileronValue.setText(controller.parseString("aileron, %").getAsString()); 

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        buttonWin = new javax.swing.JButton();
        buttonLoss = new javax.swing.JButton();
        lableWinCounter = new javax.swing.JLabel();
        lableLossCounter = new javax.swing.JLabel();
        lableCalculateWinRate = new javax.swing.JLabel();
        buttonWinSubtract = new javax.swing.JButton();
        buttonCalculate = new javax.swing.JButton();
        buttonWinSubtract1 = new javax.swing.JButton();
        labelAileronValue = new javax.swing.JLabel();
        aircraftUpdatePanel = new javax.swing.JPanel();
        labelAileronText = new javax.swing.JLabel();
        lableAileronValue = new javax.swing.JLabel();
        buttonTestActionListener = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonWin.setText("Win");
        buttonWin.addActionListener(this);

        buttonLoss.setText("Loss");
        buttonLoss.addActionListener(this);

        lableWinCounter.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lableWinCounter.setText("0");

        lableLossCounter.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lableLossCounter.setText("0");

        lableCalculateWinRate.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lableCalculateWinRate.setText("0");

        buttonWinSubtract.setText("-");
        buttonWinSubtract.addActionListener(this);

        buttonCalculate.setText("Calculate WinRate");
        buttonCalculate.addActionListener(this);

        buttonWinSubtract1.setText("-");
        buttonWinSubtract1.addActionListener(this);

        labelAileronText.setText("Aileron: ");

        lableAileronValue.setText("0");

        javax.swing.GroupLayout aircraftUpdatePanelLayout = new javax.swing.GroupLayout(aircraftUpdatePanel);
        aircraftUpdatePanel.setLayout(aircraftUpdatePanelLayout);
        aircraftUpdatePanelLayout.setHorizontalGroup(
            aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAileronText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lableAileronValue)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        aircraftUpdatePanelLayout.setVerticalGroup(
            aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAileronText)
                    .addComponent(lableAileronValue))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        buttonTestActionListener.setText("Test Update Panel");
        buttonTestActionListener.addActionListener(this);

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonCalculate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lableCalculateWinRate))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMainLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(labelAileronValue))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMainLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonWin)
                                    .addComponent(buttonWinSubtract1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lableWinCounter)))
                        .addGap(18, 18, 18)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(buttonLoss)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lableLossCounter))
                            .addComponent(buttonWinSubtract)))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(aircraftUpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(buttonTestActionListener)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAileronValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aircraftUpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTestActionListener))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonWinSubtract1)
                    .addComponent(buttonWinSubtract))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonWin)
                            .addComponent(buttonLoss)
                            .addComponent(lableLossCounter))
                        .addGap(18, 18, 18)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lableCalculateWinRate)
                            .addComponent(buttonCalculate)))
                    .addComponent(lableWinCounter))
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
        else if (evt.getSource() == buttonTestActionListener) {
            WRView.this.buttonTestActionListenerActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    
    private void buttonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculateActionPerformed
        double wc = Integer.parseInt(this.lableWinCounter.getText());
        double lc = Integer.parseInt(this.lableLossCounter.getText());
        double total = wc + lc;
        double calc = wc / total;
        this.lableCalculateWinRate.setText(calc + "");
    }//GEN-LAST:event_buttonCalculateActionPerformed

    private void buttonWinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWinActionPerformed
        winCounter = winCounter += 1;
        this.lableWinCounter.setText("" + winCounter);
    }//GEN-LAST:event_buttonWinActionPerformed

    private void buttonLossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLossActionPerformed
        lossCounter = lossCounter += 1;
        this.lableLossCounter.setText("" + lossCounter);
    }//GEN-LAST:event_buttonLossActionPerformed

    private void buttonLossSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLossSubtractActionPerformed
        if (lossCounter <= 0) {
            // do nothing
        } else {
            lossCounter = lossCounter -= 1;
            this.lableLossCounter.setText("" + lossCounter);
        }
    }//GEN-LAST:event_buttonLossSubtractActionPerformed

    private void buttonWinSubtract1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWinSubtract1ActionPerformed
        if (winCounter <= 0) {
            // do nothing
        } else {
            winCounter = winCounter -= 1;
            this.lableWinCounter.setText("" + winCounter);
        }
    }//GEN-LAST:event_buttonWinSubtract1ActionPerformed

    private void buttonTestActionListenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTestActionListenerActionPerformed
        try {
            controller.bufferedReader(controller.httpGetRequest());
        } catch (IOException ex) {
            Logger.getLogger(WRView.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.lableAileronValue.setText(controller.parseString("aileron, %").getAsString()); 
        this.aircraftUpdatePanel.revalidate();
    }//GEN-LAST:event_buttonTestActionListenerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aircraftUpdatePanel;
    private javax.swing.JButton buttonCalculate;
    private javax.swing.JButton buttonLoss;
    private javax.swing.JButton buttonTestActionListener;
    private javax.swing.JButton buttonWin;
    private javax.swing.JButton buttonWinSubtract;
    private javax.swing.JButton buttonWinSubtract1;
    private javax.swing.JLabel labelAileronText;
    private javax.swing.JLabel labelAileronValue;
    public javax.swing.JLabel lableAileronValue;
    private javax.swing.JLabel lableCalculateWinRate;
    private javax.swing.JLabel lableLossCounter;
    private javax.swing.JLabel lableWinCounter;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables

    // Manual variable declaration   
    int winCounter;
    int lossCounter;
    WRController controller;
}   // End of Manual variable declaration   
