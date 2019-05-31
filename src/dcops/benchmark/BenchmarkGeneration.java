/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcops.benchmark;

import javax.swing.text.NumberFormatter;
import java.io.File;
import javax.swing.JOptionPane;
        
/**
 *
 * @author BAICONGEI
 */
public class BenchmarkGeneration extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public BenchmarkGeneration() {
        initComponents();
        File f1 = new File("ConstraintSet.txt");
        File f2 = new File("ConstraintSet.csv");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NumberOfChanges = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NumberOfRuns = new javax.swing.JTextField();
        NumberOfDimensions = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LowerBounds = new javax.swing.JTextField();
        UpperBounds = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Sphere = new javax.swing.JCheckBox();
        Ackley = new javax.swing.JCheckBox();
        Rastrigin = new javax.swing.JCheckBox();
        Rosenbrock = new javax.swing.JCheckBox();
        bEqualToZero = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        bSet = new javax.swing.JRadioButton();
        bStartsFrom = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LowerK = new javax.swing.JTextField();
        UpperK = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        HiperplaneTranslationRadio = new javax.swing.JRadioButton();
        HiperplaneRatationRadio = new javax.swing.JRadioButton();
        CombinedRadio = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        MaxEvaluations = new javax.swing.JTextField();
        RunTimes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("DCOPs Benchmark");
        jLabel1.setRequestFocusEnabled(false);
        jLabel1.setSize(new java.awt.Dimension(50, 36));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel2.setText("Global Settings");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Function Settings");

        jLabel4.setText("Numer of Changes:");

        NumberOfChanges.setText("200");
        NumberOfChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberOfChangesActionPerformed(evt);
            }
        });

        jLabel5.setText("Number of Dimensions:");

        jLabel6.setText("Number of Runs:");

        NumberOfRuns.setText("30");
        NumberOfRuns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberOfRunsActionPerformed(evt);
            }
        });

        NumberOfDimensions.setText("30");
        NumberOfDimensions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberOfDimensionsActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setText("Search Space Settings");

        jLabel9.setText("Lower Bounds:");

        jLabel10.setText("Upper Bounds:");

        LowerBounds.setText("-5");
        LowerBounds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LowerBoundsActionPerformed(evt);
            }
        });

        UpperBounds.setText("5");
        UpperBounds.setToolTipText("");
        UpperBounds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpperBoundsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NumberOfRuns, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                    .addComponent(NumberOfDimensions, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(NumberOfChanges, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(76, 76, 76))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LowerBounds, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UpperBounds, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(NumberOfChanges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NumberOfDimensions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumberOfRuns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(LowerBounds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(UpperBounds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel12.setText("Function Selection");

        Sphere.setSelected(true);
        Sphere.setText("Sphere");
        Sphere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SphereActionPerformed(evt);
            }
        });

        Ackley.setSelected(true);
        Ackley.setText("Ackley");

        Rastrigin.setSelected(true);
        Rastrigin.setText("Rastrigin");
        Rastrigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RastriginActionPerformed(evt);
            }
        });

        Rosenbrock.setSelected(true);
        Rosenbrock.setText("Rosenbrock");

        buttonGroup3.add(bEqualToZero);
        bEqualToZero.setText("b=0");
        bEqualToZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEqualToZeroActionPerformed(evt);
            }
        });

        jLabel14.setText("or");

        buttonGroup3.add(bSet);
        bSet.setSelected(true);
        bSet.setText("b starts");
        bSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSetActionPerformed(evt);
            }
        });

        bStartsFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStartsFromActionPerformed(evt);
            }
        });

        jLabel15.setText("Lower_k:");

        jLabel16.setText("Upper_k:");

        LowerK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LowerKActionPerformed(evt);
            }
        });

        UpperK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpperKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Rastrigin)
                            .addComponent(Sphere))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ackley)
                            .addComponent(Rosenbrock)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bEqualToZero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSet, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bStartsFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UpperK, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(LowerK))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sphere)
                    .addComponent(Ackley))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rastrigin)
                    .addComponent(Rosenbrock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bEqualToZero)
                    .addComponent(jLabel14)
                    .addComponent(bSet)
                    .addComponent(bStartsFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(LowerK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(UpperK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel11.setText("Benchmark Settings");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup4.add(HiperplaneTranslationRadio);
        HiperplaneTranslationRadio.setText("Hyperplane Translation");
        HiperplaneTranslationRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HiperplaneTranslationRadioActionPerformed(evt);
            }
        });

        buttonGroup4.add(HiperplaneRatationRadio);
        HiperplaneRatationRadio.setText("Hyperplane Rotation");

        buttonGroup4.add(CombinedRadio);
        CombinedRadio.setSelected(true);
        CombinedRadio.setText("Combined");

        jLabel7.setText("Evaluations Max:");

        jLabel13.setText("Time of Runs:");

        MaxEvaluations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaxEvaluationsActionPerformed(evt);
            }
        });

        RunTimes.setText("1");
        RunTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunTimesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CombinedRadio)
                    .addComponent(HiperplaneRatationRadio)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(RunTimes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MaxEvaluations, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HiperplaneTranslationRadio)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HiperplaneTranslationRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HiperplaneRatationRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CombinedRadio)
                .addGap(85, 85, 85)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(MaxEvaluations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(RunTimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Run");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(333, 333, 333))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumberOfChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberOfChangesActionPerformed
        // TODO add your handling code here:
        if(NumberOfChanges.getText().equals("")){
            NumberOfChanges.setText("1");
        }
    }//GEN-LAST:event_NumberOfChangesActionPerformed

    private void bEqualToZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEqualToZeroActionPerformed
        // TODO add your handling code here:
        bStartsFrom.setEnabled(false);
    }//GEN-LAST:event_bEqualToZeroActionPerformed

    private void bSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSetActionPerformed
        // TODO add your handling code here:
        if(bSet.isSelected())
        {
            bStartsFrom.setEnabled(true);
        }
    }//GEN-LAST:event_bSetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//            ConstraintGenerator.main(changesParam, dimensionParam, runsParam, constraintParam, lowerParam, upperParam, functionParam, algorithmParam, frequencyParam, freqDistParam, accuracyParam, solverRunsParam);
        // TODO add your handling code here:
//       bStartsFrom.setEnabled(false);
       int changesParam = Integer.parseInt(NumberOfChanges.getText().trim());
       int dimensionParam = Integer.parseInt(NumberOfDimensions.getText().trim());
       int runsParam = Integer.parseInt(NumberOfRuns.getText().trim());
       
       int constraintParam = 0;
       /*if (buttonGroup1.getSelection().equals(GenerateConstraints.getModel())) {
                constraintParam = 0;
            }
       else
       {
           constraintParam = 1;
       }*/
       
        double lowerParam = Double.parseDouble(LowerBounds.getText().trim());
        double upperParam = Double.parseDouble(UpperBounds.getText().trim());
        
        int functionParam[] = {0,0,0,0,0,0};
        if (Sphere.isSelected()) {
            functionParam[0] = 1;
            }
        if (Rastrigin.isSelected()) {
            functionParam[1] = 1;
            }
        if (Ackley.isSelected()) {
            functionParam[2] = 1;
            }
        if (Rosenbrock.isSelected()) {
            functionParam[3] = 1;
            }
        
        int freqDistParam = 0;
        /*if (buttonGroup2.getSelection().equals(StaticFrequency.getModel())) {
                freqDistParam = 0;
            }
        else{
            freqDistParam = 1;
        }*/
        
        //t
        //new one
        double bSetting = 0;
        if(buttonGroup3.getSelection().equals(bSet.getModel())){
            bSetting = Double.parseDouble(bStartsFrom.getText().trim());
        }
        else{
            bSetting = 0;
        }
        
        double lk = Double.parseDouble(LowerK.getText().trim());
        double uk = Double.parseDouble(UpperK.getText().trim());
        
        int Max_EvalParam = Integer.parseInt(MaxEvaluations.getText().trim());
        
        int RunsParam = Integer.parseInt(RunTimes.getText().trim());
        
        //
        //unshown in GUI
        JOptionPane.showMessageDialog(null,"Constrains and Optimal per change Files sucessfully generate.");
        //int algorithmParam[] = {0,0,0,1};
        //int accuracyParam = 100;
        //int frequencyParam = 0 ;
        //int solverRunsParam = 0;
        //DE_Best_knowAdd.main(changesParam, dimensionParam, runsParam, constraintParam, lowerParam, upperParam, functionParam, algorithmParam, frequencyParam, freqDistParam, accuracyParam, solverRunsParam); 
        ConstraintGeneratorAdd.main(changesParam, dimensionParam, constraintParam, lk, uk, lowerParam, upperParam, bSetting);
        DE_Best_knowAdd.main(changesParam,dimensionParam,functionParam,Max_EvalParam,RunsParam);
        

        
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void HiperplaneTranslationRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HiperplaneTranslationRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HiperplaneTranslationRadioActionPerformed

    private void NumberOfDimensionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberOfDimensionsActionPerformed
        // TODO add your handling code here:
        if(NumberOfDimensions.getText().equals("")){
            NumberOfDimensions.setText("1");
        }
    }//GEN-LAST:event_NumberOfDimensionsActionPerformed

    private void NumberOfRunsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberOfRunsActionPerformed
        // TODO add your handling code here:
        if(NumberOfRuns.getText().equals("")){
            NumberOfRuns.setText("1");
        }
    }//GEN-LAST:event_NumberOfRunsActionPerformed

    private void LowerBoundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LowerBoundsActionPerformed
        // TODO add your handling code here:
        if(LowerBounds.getText().equals("")){
            LowerBounds.setText("-5");
        }
    }//GEN-LAST:event_LowerBoundsActionPerformed

    private void UpperBoundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpperBoundsActionPerformed
        // TODO add your handling code here:
        if(UpperBounds.getText().equals("")){
            UpperBounds.setText("5");
        }
    }//GEN-LAST:event_UpperBoundsActionPerformed

    private void SphereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SphereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SphereActionPerformed

    private void bStartsFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bStartsFromActionPerformed
        // TODO add your handling code here:
        //

        if(bStartsFrom.getText().equals("")){
            bStartsFrom.setText("0");
        }
    }//GEN-LAST:event_bStartsFromActionPerformed

    private void LowerKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LowerKActionPerformed
        // TODO add your handling code here:
        if(LowerK.getText().equals("")){
            LowerK.setText("0");
        }
    }//GEN-LAST:event_LowerKActionPerformed

    private void UpperKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpperKActionPerformed
        // TODO add your handling code here:
        if(UpperK.getText().equals("")){
            UpperK.setText("0");
        }
    }//GEN-LAST:event_UpperKActionPerformed

    private void MaxEvaluationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaxEvaluationsActionPerformed
        // TODO add your handling code here:
        if(MaxEvaluations.getText().equals("")){
            MaxEvaluations.setText("1");
        }
    }//GEN-LAST:event_MaxEvaluationsActionPerformed

    private void RunTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunTimesActionPerformed
        // TODO add your handling code here:
        if(RunTimes.getText().equals("")){
        RunTimes.setText("1");
        }
    }//GEN-LAST:event_RunTimesActionPerformed

    private void RastriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RastriginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RastriginActionPerformed

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
            java.util.logging.Logger.getLogger(BenchmarkGeneration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BenchmarkGeneration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BenchmarkGeneration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BenchmarkGeneration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BenchmarkGeneration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Ackley;
    private javax.swing.JRadioButton CombinedRadio;
    private javax.swing.JRadioButton HiperplaneRatationRadio;
    private javax.swing.JRadioButton HiperplaneTranslationRadio;
    private javax.swing.JTextField LowerBounds;
    private javax.swing.JTextField LowerK;
    private javax.swing.JTextField MaxEvaluations;
    private javax.swing.JTextField NumberOfChanges;
    private javax.swing.JTextField NumberOfDimensions;
    private javax.swing.JTextField NumberOfRuns;
    private javax.swing.JCheckBox Rastrigin;
    private javax.swing.JCheckBox Rosenbrock;
    private javax.swing.JTextField RunTimes;
    private javax.swing.JCheckBox Sphere;
    private javax.swing.JTextField UpperBounds;
    private javax.swing.JTextField UpperK;
    private javax.swing.JRadioButton bEqualToZero;
    private javax.swing.JRadioButton bSet;
    private javax.swing.JTextField bStartsFrom;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    // End of variables declaration//GEN-END:variables
}
