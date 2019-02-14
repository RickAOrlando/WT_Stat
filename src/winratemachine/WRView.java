/*
 * Last Updated: 0/0/2017
 * Class description:
 */
package winratemachine;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
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
        
        /*
        Uncomment out two lables below to test values
        */
//        this.labelLossValue.setText("5");
//        this.labelWinValue.setText("10");
        this.initializeTimerOnMission(this.labelStatusValue, this.labelWinValue, 
                this.labelLossValue, this.labelWRValue);
        }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        removeThisValue = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        aircraftUpdatePanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        labelStatus = new javax.swing.JLabel();
        labelStatusValue = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        labelWinText = new javax.swing.JLabel();
        labelWinValue = new javax.swing.JLabel();
        labelLossText = new javax.swing.JLabel();
        labelLossValue = new javax.swing.JLabel();
        labelWRText = new javax.swing.JLabel();
        labelWRValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);
        setOpacity(0.55F);

        panelMain.setBackground(new java.awt.Color(102, 102, 102));
        panelMain.setForeground(new java.awt.Color(102, 0, 0));
        panelMain.setPreferredSize(new java.awt.Dimension(250, 250));

        jButton1.setText("jButton1");

        saveButton.setBackground(new java.awt.Color(51, 51, 51));
        saveButton.setForeground(new java.awt.Color(204, 204, 204));
        saveButton.setText("Save");
        saveButton.addActionListener(this);

        aircraftUpdatePanel.setBackground(new java.awt.Color(102, 102, 102));
        aircraftUpdatePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        aircraftUpdatePanel.setForeground(new java.awt.Color(102, 0, 0));
        aircraftUpdatePanel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        labelStatus.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelStatus.setForeground(new java.awt.Color(255, 255, 255));
        labelStatus.setText("Status:  ");

        labelStatusValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelStatusValue.setForeground(new java.awt.Color(255, 0, 0));
        labelStatusValue.setText("0");

        labelWinText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelWinText.setText("Win: ");

        labelWinValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelWinValue.setText("0");

        labelLossText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelLossText.setText("Loss: ");

        labelLossValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelLossValue.setText("0");

        labelWRText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelWRText.setText("WinRate: ");

        labelWRValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelWRValue.setText("0");

        javax.swing.GroupLayout aircraftUpdatePanelLayout = new javax.swing.GroupLayout(aircraftUpdatePanel);
        aircraftUpdatePanel.setLayout(aircraftUpdatePanelLayout);
        aircraftUpdatePanelLayout.setHorizontalGroup(
            aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(labelStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelStatusValue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, aircraftUpdatePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelWinText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelWinValue)
                        .addGap(18, 18, 18)
                        .addComponent(labelLossText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelLossValue)
                        .addGap(18, 18, 18)
                        .addComponent(labelWRText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelWRValue))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        aircraftUpdatePanelLayout.setVerticalGroup(
            aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aircraftUpdatePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelWinText)
                    .addComponent(labelWinValue)
                    .addComponent(labelLossText)
                    .addComponent(labelLossValue)
                    .addComponent(labelWRText)
                    .addComponent(labelWRValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStatus)
                    .addComponent(labelStatusValue))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(aircraftUpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(aircraftUpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(removeThisValue))
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton)
                .addGap(8, 8, 8)
                .addComponent(removeThisValue)
                .addGap(44, 44, 44)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
        );

        setBounds(0, 500, 435, 182);
    }

    // Code for dispatching events from components to event handlers.

    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == saveButton) {
            WRView.this.saveButtonActionPerformed(evt);
        }
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
    }//GEN-LAST:event_saveButtonActionPerformed

    /*
    Winrate logic pulled for Mission.json on timer
    */
    public void initializeTimerOnMission(JLabel statusValue, JLabel winValue, 
            JLabel lossValue, JLabel winRateText)
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

                //Local variables
                float lvInt = Integer.parseInt(lossValue.getText());
                float wvInt = Integer.parseInt(winValue.getText());

                // Checking for division by 0
                if (lvInt == 0 && wvInt == 0){
                    winRateText.setText("No games played");
                    statusValue.setText("Play first game");
                }
                else 
                {
                    float totalGames = wvInt + lvInt;
                    winRatePercent = (wvInt / totalGames);
                    winRateText.setText(String.format("%.2f", winRatePercent*100) + "%");
                }

                // Checking Status
                String status = controller.parseString("status").getAsString();
                
                // Running
                if ("running".equals(status)){
                    statusValue.setText("Game is running");
                    onOffSwitch = 1;
                }
                // Fail
                if ("fail".equals(status) && onOffSwitch == 1){
                    statusValue.setText("Failed last game");
                    onOffSwitch = 0;
                    float lossCount = lvInt += 1;
                    lossValue.setText("" + lossCount);
                }
                // Success
                if ("success".equals(status) && onOffSwitch == 1){
                    statusValue.setText("Succeeded last game");
                    onOffSwitch = 0;
                    double winCount = wvInt += 1;
                    winValue.setText("" + winCount);
                }
                    // Update panel and print tests
                    aircraftUpdatePanel.revalidate();
                    System.out.println("Got mission information on " + new Date());
            }
        };
    Timer timer = new Timer("Timer");
     
    // Timer start delay
    long delay  = 250L;
    // Timer repeat interval 
    long period = 1000L;
    timer.scheduleAtFixedRate(repeatedTask, delay, period);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aircraftUpdatePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelLossText;
    private javax.swing.JLabel labelLossValue;
    private javax.swing.JLabel labelStatus;
    public javax.swing.JLabel labelStatusValue;
    private javax.swing.JLabel labelWRText;
    public javax.swing.JLabel labelWRValue;
    private javax.swing.JLabel labelWinText;
    private javax.swing.JLabel labelWinValue;
    private javax.swing.JPanel panelMain;
    private javax.swing.JLabel removeThisValue;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables

    // Manual variable declaration   
    int winCounter;
    int lossCounter;
    private int onOffSwitch = 0; 
    private float winRatePercent;
    WRController controller;
}   // End of Manual variable declaration   
