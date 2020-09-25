package stopwatch;

public class gui extends javax.swing.JFrame {
    timer time;
    Thread t;
    int flag=0;
    public gui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hourTF = new javax.swing.JTextField();
        minTF = new javax.swing.JTextField();
        secTF = new javax.swing.JTextField();
        StartBT = new javax.swing.JButton();
        pauseBT = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lapTA = new javax.swing.JTextArea();
        lapBT = new javax.swing.JButton();
        stopBT = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Stop Watch");

        jLabel5.setText("Minutes");

        jLabel6.setText("Hours");

        jLabel7.setText("Seconds");

        hourTF.setText("0");
        hourTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourTFActionPerformed(evt);
            }
        });

        minTF.setText("0");

        secTF.setText("0");

        StartBT.setText("Start");
        StartBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartBTActionPerformed(evt);
            }
        });

        pauseBT.setText("Pause");
        pauseBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseBTActionPerformed(evt);
            }
        });

        lapTA.setColumns(20);
        lapTA.setRows(5);
        jScrollPane2.setViewportView(lapTA);

        lapBT.setText("Lap");
        lapBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapBTActionPerformed(evt);
            }
        });

        stopBT.setText("Stop");
        stopBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(hourTF, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 23, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel7)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pauseBT)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(StartBT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(stopBT))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(minTF, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(secTF, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81))))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(lapBT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StartBT)
                    .addComponent(stopBT))
                .addGap(29, 29, 29)
                .addComponent(pauseBT)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lapBT)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hourTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hourTFActionPerformed

    private void StartBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartBTActionPerformed
        // TODO add your handling code here:
        time = new timer(this);// "this" is referring to current ui object
        t =new Thread( time,"Rishi");// rishi is just a thread name
        t.start();
    }//GEN-LAST:event_StartBTActionPerformed

    private void pauseBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseBTActionPerformed
        // TODO add your handling code here:
        if(flag==0){
        t.suspend();// to stop the thread
        pauseBT.setText("Resume");
        flag=1;
        }
        else if (flag==1){
            t.resume();// to resume the stopped thread
            pauseBT.setText("Pause");
            flag=0;
            
        }
    }//GEN-LAST:event_pauseBTActionPerformed

    private void lapBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapBTActionPerformed
        // TODO add your handling code here:
        String lap= hourTF.getText()+" "+minTF.getText()+" "+secTF.getText()+"\n";
        lapTA.append(lap);
    }//GEN-LAST:event_lapBTActionPerformed

    private void stopBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopBTActionPerformed
        // TODO add your handling code here:
        time.stop();
    }//GEN-LAST:event_stopBTActionPerformed
public void setTimer(int hr,int min, int sec){
    hourTF.setText(""+hr);
    minTF.setText(""+min);
    secTF.setText(""+sec);
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StartBT;
    private javax.swing.JTextField hourTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton lapBT;
    private javax.swing.JTextArea lapTA;
    private javax.swing.JTextField minTF;
    private javax.swing.JButton pauseBT;
    private javax.swing.JTextField secTF;
    private javax.swing.JButton stopBT;
    // End of variables declaration//GEN-END:variables
}
