/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcops.benchmark;

import static dcops.benchmark.ConstraintGeneratorAdd.getaverage;
import static dcops.benchmark.EpsilonConstrained.ListMError;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author BAICONGEI
 */

public class AlgorithmCompare extends javax.swing.JFrame {

    /**
     * Creates new form AlgorithmCompare
     */
    public static int[][] algMatrix = new int[3][4];
    public static double[] rankMatrix = new double[12];
    
    public AlgorithmCompare() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        EpsilonSelect = new javax.swing.JCheckBox();
        PenaltySelect = new javax.swing.JCheckBox();
        FeasibilitySelect = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NPsetting = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FPsetting = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        runsSetting = new javax.swing.JTextField();
        CRsetting = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Sphere = new javax.swing.JCheckBox();
        Ackley = new javax.swing.JCheckBox();
        Rastrigin = new javax.swing.JCheckBox();
        Rosenbrock = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        CombinedRadio = new javax.swing.JRadioButton();
        HiperplaneRatationRadio = new javax.swing.JRadioButton();
        HiperplaneTranslationRadio = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        AcceptBotton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        upperSetting = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lowerSetting = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CompareTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EpsilonSelect.setText("Epsilon");
        EpsilonSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EpsilonSelectActionPerformed(evt);
            }
        });

        PenaltySelect.setText("Penalty");

        FeasibilitySelect.setText("Feasibility");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FeasibilitySelect)
                    .addComponent(EpsilonSelect)
                    .addComponent(PenaltySelect))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FeasibilitySelect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EpsilonSelect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PenaltySelect)
                .addGap(0, 53, Short.MAX_VALUE))
        );

        jLabel2.setLabelFor(NPsetting);
        jLabel2.setText("NP");

        jLabel3.setLabelFor(FPsetting);
        jLabel3.setText("F");

        NPsetting.setText("20");
        NPsetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NPsettingActionPerformed(evt);
            }
        });

        jLabel4.setLabelFor(CRsetting);
        jLabel4.setText("CR");

        FPsetting.setText("0.2");
        FPsetting.setToolTipText("");
        FPsetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPsettingActionPerformed(evt);
            }
        });

        jLabel5.setLabelFor(runsSetting);
        jLabel5.setText("Runs");

        runsSetting.setText("10");
        runsSetting.setToolTipText("");
        runsSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runsSettingActionPerformed(evt);
            }
        });

        CRsetting.setText("0.2");
        CRsetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRsettingActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Parameter DE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(runsSetting))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CRsetting)
                            .addComponent(FPsetting)
                            .addComponent(NPsetting, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(NPsetting, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FPsetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CRsetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(runsSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("Function Selection");

        Sphere.setText("Sphere");
        Sphere.setActionCommand("");
        Sphere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SphereActionPerformed(evt);
            }
        });

        Ackley.setText("Ackley");
        Ackley.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AckleyActionPerformed(evt);
            }
        });

        Rastrigin.setText("Rastrigin");
        Rastrigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RastriginActionPerformed(evt);
            }
        });

        Rosenbrock.setText("Rosenbrock");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(Sphere)
                    .addComponent(Ackley)
                    .addComponent(Rastrigin)
                    .addComponent(Rosenbrock))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sphere)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rastrigin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ackley)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Rosenbrock)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        buttonGroup1.add(CombinedRadio);
        CombinedRadio.setSelected(true);
        CombinedRadio.setText("Combined");

        buttonGroup1.add(HiperplaneRatationRadio);
        HiperplaneRatationRadio.setText("Hyperplane Rotation");
        HiperplaneRatationRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HiperplaneRatationRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(HiperplaneTranslationRadio);
        HiperplaneTranslationRadio.setText("Hyperplane Translation");
        HiperplaneTranslationRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HiperplaneTranslationRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CombinedRadio)
                    .addComponent(HiperplaneRatationRadio)
                    .addComponent(HiperplaneTranslationRadio))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HiperplaneTranslationRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HiperplaneRatationRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CombinedRadio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        AcceptBotton.setText("Accept");
        AcceptBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptBottonActionPerformed(evt);
            }
        });

        upperSetting.setText("5");
        upperSetting.setToolTipText("");
        upperSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upperSettingActionPerformed(evt);
            }
        });

        jLabel8.setText("Boundaries variables ");

        lowerSetting.setText("-5");
        lowerSetting.setToolTipText("");
        lowerSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowerSettingActionPerformed(evt);
            }
        });

        jLabel9.setText("Lower");

        jLabel7.setText("Upper");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lowerSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upperSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(34, 34, 34))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lowerSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(upperSetting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        CompareTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Algorithm", "Function", "Offine error", "Rank"
            }
        ));
        CompareTable.setToolTipText("");
        jScrollPane2.setViewportView(CompareTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(AcceptBotton)))))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AcceptBotton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EpsilonSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EpsilonSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EpsilonSelectActionPerformed

    private void HiperplaneTranslationRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HiperplaneTranslationRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HiperplaneTranslationRadioActionPerformed

    private void AcceptBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptBottonActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                algMatrix[i][j] = 0;
            }
        }
        
        for (int j = 0; j<12;j++){
            rankMatrix[j] = -1;
        }
        
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 12; j++){
               CompareTable.setValueAt(" ", j, i);
            }
        }
        
        double average=0;
        CompareTable.setValueAt("test",0,0);
        if(NPsetting.getText().equals("") || FPsetting.getText().equals("") || runsSetting.getText().equals("") || CRsetting.getText().equals("") || lowerSetting.getText().equals("") || upperSetting.getText().equals("")) {
            JOptionPane.showMessageDialog(null,"Parameter can't be empty");
        }
        
        else if(Sphere.isSelected() == false && Ackley.isSelected() == false && Rosenbrock.isSelected() == false && Rastrigin.isSelected() == false){
            JOptionPane.showMessageDialog(null,"At least choose one function");
        }
        
        else if ((FeasibilitySelect.isSelected() == false ) && (EpsilonSelect.isSelected() == false) && (PenaltySelect.isSelected() == false)){
            JOptionPane.showMessageDialog(null,"At least choice one algorithm");
        }
        
        else{
            int NpParams = Integer.parseInt(NPsetting.getText().trim());
            double FParams = Double.parseDouble(FPsetting.getText().trim());
            double CRParams = Double.parseDouble(CRsetting.getText().trim());
            int runsParam = Integer.parseInt(runsSetting.getText().trim());
            int lowerParam = Integer.parseInt(lowerSetting.getText().trim());
            int upperParam = Integer.parseInt(upperSetting.getText().trim());
            int frequencyParam = 100;
            int changesParam = 200;
            int dimensionParam = 30;
            
            if (FeasibilitySelect.isSelected()){
                for(int i = 0; i <4; i++){
                    algMatrix[0][i] = 1;
                }
                if(Sphere.isSelected() == false){
                   algMatrix[0][0] = 0;
                }
                if(Rastrigin.isSelected()== false){
                   algMatrix[0][1] = 0;
                }
                if(Ackley.isSelected() == false){
                    algMatrix[0][2] = 0;
                }
                if(Rosenbrock.isSelected() == false){
                    algMatrix[0][3] = 0;
                }
            }
            
            if (EpsilonSelect.isSelected()){
                for(int i = 0; i <4; i++){
                    algMatrix[1][i] = 1;
                }
                if(Sphere.isSelected() == false){
                   algMatrix[1][0] = 0;
                }
                if(Rastrigin.isSelected()== false){
                   algMatrix[1][1] = 0;
                }
                if(Ackley.isSelected() == false){
                    algMatrix[1][2] = 0;
                }
                if(Rosenbrock.isSelected() == false){
                    algMatrix[1][3] = 0;
                }
            }
            
            if (PenaltySelect.isSelected()){
                for(int i = 0; i <4; i++){
                    algMatrix[2][i] = 1;
                }
                if(Sphere.isSelected() == false){
                   algMatrix[2][0] = 0;
                }
                if(Rastrigin.isSelected()== false){
                   algMatrix[2][1] = 0;
                }
                if(Ackley.isSelected() == false){
                    algMatrix[2][2] = 0;
                }
                if(Rosenbrock.isSelected() == false){
                    algMatrix[2][3] = 0;
                }
            }
            
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 4; j++){
                    System.out.println("Test "+algMatrix[i][j]);
                }
                System.out.println("End ");
            }
//            System.out.println("Test "+algMatrix[0][0]);
//            System.out.println("Test "+algMatrix[0][1]);
//            System.out.println("Test "+algMatrix[0][2]);
//            System.out.println("Test "+algMatrix[0][3]);

            int rankCount = 0;
            int functionParam[] = {0,0,0,0};
                if (Sphere.isSelected()) {
                     functionParam[0] = 1;
                     rankCount++;
                     }
                if (Rastrigin.isSelected()) {
                    functionParam[1] = 1;
                    rankCount++;
                    }
                if (Ackley.isSelected()) {
                    functionParam[2] = 1;
                    rankCount++;
                    }
                if (Rosenbrock.isSelected()) {
                    functionParam[3] = 1;
                    rankCount++;
                    }
            int rankMult = 0;
            if (FeasibilitySelect.isSelected()){
                FeasibilityRules.main(changesParam, dimensionParam, NpParams, FParams, CRParams,runsParam, lowerParam, upperParam, functionParam, frequencyParam);
                //FeasibilityRules.main(HAND_CURSOR, SOMEBITS, NORMAL, ERROR, ERROR, functionParam, FRAMEBITS);
                rankMult++;
            }
            if (EpsilonSelect.isSelected()){
                EpsilonConstrained.main(changesParam, dimensionParam, NpParams, FParams, CRParams, runsParam, lowerParam, upperParam, functionParam, frequencyParam);
                //EpsilonConstrained.main(HAND_CURSOR, SOMEBITS, NORMAL, ERROR, ERROR, functionParam, FRAMEBITS);
                rankMult++;
            }
            if (PenaltySelect.isSelected()){  
                Penalty.main(changesParam, dimensionParam, NpParams, FParams, CRParams,runsParam, lowerParam, upperParam, functionParam, frequencyParam);
                //Penalty.main(HAND_CURSOR, SOMEBITS, NORMAL, ERROR, ERROR, functionParam, FRAMEBITS);
                rankMult++;
            }
            //print average offline-error 
            for(int i = 0;i<12;i++){
                AlgorithmCompare.jTextArea1.append(Double.toString(rankMatrix[i])+",");
            }
            
            
//            double[] rank = new double[rankMult];
            for(int count = 0; count < rankCount;count++){
                double[] rank = new double[rankMult];
                int countTemp = count;
                for(int i =0; i< rankMult;i++){
                    rank[i] = rankMatrix[countTemp];
                    countTemp+=rankCount;
                    AlgorithmCompare.jTextArea1.append(Double.toString(rank[i])+",");
                }
                double[] rankTemp = new double[rankMult];
                rankTemp = Arrays.copyOf(rank, rankMult);
                Arrays.sort(rankTemp);

                int rowCount = 0;
                for(int i = 0; i < rankMult; i++){
                    for(int j = 0; j< rankMult;j++){
                        if(Double.valueOf(rank[i]).equals(Double.valueOf(rankTemp[j]))){
                            CompareTable.setValueAt(j+1, rowCount+count, 3);
                            rowCount += rankCount;
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_AcceptBottonActionPerformed

    private void upperSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upperSettingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upperSettingActionPerformed

    private void FPsettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FPsettingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FPsettingActionPerformed

    private void NPsettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NPsettingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NPsettingActionPerformed

    private void CRsettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRsettingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CRsettingActionPerformed

    private void runsSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runsSettingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_runsSettingActionPerformed

    private void lowerSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowerSettingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lowerSettingActionPerformed

    private void SphereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SphereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SphereActionPerformed

    private void AckleyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AckleyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AckleyActionPerformed

    private void RastriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RastriginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RastriginActionPerformed

    private void HiperplaneRatationRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HiperplaneRatationRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HiperplaneRatationRadioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlgorithmCompare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlgorithmCompare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlgorithmCompare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlgorithmCompare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlgorithmCompare().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptBotton;
    private javax.swing.JCheckBox Ackley;
    private javax.swing.JTextField CRsetting;
    private javax.swing.JRadioButton CombinedRadio;
    public static javax.swing.JTable CompareTable;
    private javax.swing.JCheckBox EpsilonSelect;
    private javax.swing.JTextField FPsetting;
    private javax.swing.JCheckBox FeasibilitySelect;
    private javax.swing.JRadioButton HiperplaneRatationRadio;
    private javax.swing.JRadioButton HiperplaneTranslationRadio;
    private javax.swing.JTextField NPsetting;
    private javax.swing.JCheckBox PenaltySelect;
    private javax.swing.JCheckBox Rastrigin;
    private javax.swing.JCheckBox Rosenbrock;
    private javax.swing.JCheckBox Sphere;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField lowerSetting;
    private javax.swing.JTextField runsSetting;
    private javax.swing.JTextField upperSetting;
    // End of variables declaration//GEN-END:variables
}
