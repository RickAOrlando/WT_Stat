/*
 * Last Updated: 0/0/2017
 * Class description:
 */
package winratemachine;
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
        
        /*
        Uncomment out two lables below to test values
        */
        //this.labeLossValue.setText("5");
        //this.labeWinValue.setText("10");
        this.initializeTimerOnMission(this.labelStatusValue, this.labeWinValue, 
                this.labeLossValue, this.labeWRValue);
        }   
      
    /**
     * @return the winRatePercent
     */
    public float getWinRatePercent() {
        return winRatePercent;
    }

    /**
     * @param winRatePercent the winRatePercent to set
     */
    public void setWinRatePercent(float winRatePercent) {
        this.winRatePercent = winRatePercent;
    }
      
        /**
     * @return the onOffSwitch
     */
    public int getOnOffSwitch() {
        return onOffSwitch;
    }

    /**
     * @param onOffSwitch the onOffSwitch to set
     */
    public void setOnOffSwitch(int onOffSwitch) {
        this.onOffSwitch = onOffSwitch;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        removeThisValue = new javax.swing.JLabel();
        aircraftUpdatePanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        labelStatus = new javax.swing.JLabel();
        labelStatusValue = new javax.swing.JLabel();
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

        labelStatus.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelStatus.setForeground(new java.awt.Color(255, 255, 255));
        labelStatus.setText("Status:  ");

        labelStatusValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelStatusValue.setForeground(new java.awt.Color(255, 0, 0));
        labelStatusValue.setText("0");

        labelWinText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelWinText.setText("Win: ");

        labeWinValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labeWinValue.setText("0");

        labelLossText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelLossText.setText("Loss: ");

        labeLossValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labeLossValue.setText("0");

        labelWRText.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelWRText.setText("WinRate: ");

        labeWRValue.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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
                                .addGap(58, 58, 58)
                                .addComponent(labelStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelStatusValue)
                                .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGap(0, 152, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(aircraftUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStatus)
                    .addComponent(labelStatusValue))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(aircraftUpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(removeThisValue))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(removeThisValue)
                .addContainerGap(110, Short.MAX_VALUE))
            .addComponent(aircraftUpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );

        setBounds(0, 500, 448, 116);
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

                if (lvInt == 0 && wvInt == 0){
                    winRateText.setText("No games played");
                    statusValue.setText("Play first game");
                }
                else{
                    float totalGames = wvInt + lvInt;
                    winRatePercent = (wvInt / totalGames);
                    winRateText.setText(String.format("%.2f", winRatePercent*100) + "%");
                }

                // Set labels to show values
                String status = controller.parseString("status").getAsString();
                if ("running".equals(status)){
                    statusValue.setText("Game is running");
                    onOffSwitch = 1;
                }
                if ("fail".equals(status) && onOffSwitch == 1){
                    statusValue.setText("Failed last game");
                    onOffSwitch = 0;
                    float lossCount = lvInt += 1;
                    lossValue.setText("" + lossCount);
                }
                if ("success".equals(status) && onOffSwitch == 1){
                    statusValue.setText("Succeeded last game");
                    onOffSwitch = 0;
                    float winCount = wvInt += 1;
                    winValue.setText("" + winCount);
                }
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
    private javax.swing.JLabel labelLossText;
    private javax.swing.JLabel labelStatus;
    public javax.swing.JLabel labelStatusValue;
    private javax.swing.JLabel labelWRText;
    private javax.swing.JLabel labelWinText;
    private javax.swing.JPanel panelMain;
    private javax.swing.JLabel removeThisValue;
    // End of variables declaration//GEN-END:variables

    // Manual variable declaration   
    int winCounter;
    int lossCounter;
    private int onOffSwitch = 0; 
    private float winRatePercent;
    WRController controller;
}   // End of Manual variable declaration   
