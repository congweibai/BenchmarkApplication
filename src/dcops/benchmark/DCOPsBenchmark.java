package dcops.benchmark;
import javax.swing.text.NumberFormatter;
import java.io.File;

// @author wilso
public class DCOPsBenchmark extends javax.swing.JFrame {

    public DCOPsBenchmark() {
        initComponents();
        
        try {
            CustomFunction.calculate(0.0);
        } catch(RuntimeException e) {
            custom.setEnabled(false);
        }
        
        int largeArrParam[] = {0,0,0,0,0,0};
        int smallArrParam[] = {0,0,0,0};
        
        try {
            CustomAlgorithm.main(0, 0, 0, 0, 0, 0, largeArrParam, smallArrParam, 0, 0, 0, 0);
        } catch(Exception e) {
            cSelect.setEnabled(false);
        }
        
        File f1 = new File("ConstraintSet.txt");
        File f2 = new File("ConstraintSet.csv");
        if(f1.isFile() && f2.isFile()) {
            existingConstraints.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        numChanges = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numVariables = new javax.swing.JFormattedTextField();
        generateConstraints = new javax.swing.JRadioButton();
        existingConstraints = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        nRuns = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        lowerBounds = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        upperBounds = new javax.swing.JFormattedTextField();
        defaultBounds = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        sphere = new javax.swing.JCheckBox();
        rastrigin = new javax.swing.JCheckBox();
        ackley = new javax.swing.JCheckBox();
        rosenbrock = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        frSelect = new javax.swing.JCheckBox();
        ecSelect = new javax.swing.JCheckBox();
        pmSelect = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        frequency = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        freqStatic = new javax.swing.JRadioButton();
        freqVaried = new javax.swing.JRadioButton();
        cSelect = new javax.swing.JCheckBox();
        custom = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        quick = new javax.swing.JRadioButton();
        accuracy = new javax.swing.JRadioButton();
        adaptive = new javax.swing.JRadioButton();
        balanced = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        bestKnownRuns = new javax.swing.JFormattedTextField();
        runButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DCOPs Benchmark v0.8.0");
        setBounds(new java.awt.Rectangle(0, 0, 900, 600));
        setMaximumSize(new java.awt.Dimension(900, 550));
        setMinimumSize(new java.awt.Dimension(900, 550));
        setPreferredSize(new java.awt.Dimension(900, 550));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DE DCOPs Benchmark");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(new java.awt.Dimension(260, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(260, 400));
        jPanel1.setName("Function Settings"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(260, 400));

        numChanges.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0"))));
        numChanges.setText("200");

        jLabel2.setText("Number of Changes:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Function Settings");

        jLabel4.setText("Number of Dimensions:");

        numVariables.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0"))));
        numVariables.setText("30");
        numVariables.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numVariablesFocusLost(evt);
            }
        });

        buttonGroup1.add(generateConstraints);
        generateConstraints.setSelected(true);
        generateConstraints.setText("Generate Constraints");

        buttonGroup1.add(existingConstraints);
        existingConstraints.setText("Use Existing Constraint Set");
        existingConstraints.setActionCommand("existingConstraints");
        existingConstraints.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Constraint Generation");

        nRuns.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0"))));
        nRuns.setText("30");

        jLabel13.setText("Number of Runs:");

        lowerBounds.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        lowerBounds.setText("-5");
        lowerBounds.setPreferredSize(new java.awt.Dimension(33, 26));
        lowerBounds.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lowerBoundsFocusLost(evt);
            }
        });

        jLabel7.setText("Upper Bounds:");

        upperBounds.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.###"))));
        upperBounds.setText("5");
        upperBounds.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                upperBoundsFocusLost(evt);
            }
        });

        defaultBounds.setText("Function Default");
        defaultBounds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultBoundsActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Search Space Settings");

        jLabel6.setText("Lower Bounds:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numVariables)
                            .addComponent(numChanges, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(nRuns)))
                    .addComponent(generateConstraints)
                    .addComponent(existingConstraints)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(upperBounds, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lowerBounds, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(defaultBounds))
                    .addComponent(jLabel5))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(numChanges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(numVariables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nRuns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateConstraints)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(existingConstraints)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lowerBounds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upperBounds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(defaultBounds)
                .addGap(0, 0, 0))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMaximumSize(new java.awt.Dimension(260, 400));
        jPanel2.setMinimumSize(new java.awt.Dimension(260, 400));
        jPanel2.setName("Function Settings"); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(260, 400));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Function Selection");

        sphere.setSelected(true);
        sphere.setText("Sphere");
        sphere.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sphereStateChanged(evt);
            }
        });

        rastrigin.setText("Rastrigin");
        rastrigin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rastriginStateChanged(evt);
            }
        });

        ackley.setText("Ackley");
        ackley.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ackleyStateChanged(evt);
            }
        });

        rosenbrock.setText("Rosenbrock");
        rosenbrock.setToolTipText("");
        rosenbrock.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rosenbrockStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Algorithm Selection");

        frSelect.setSelected(true);
        frSelect.setText("Feasibility");
        frSelect.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                frSelectStateChanged(evt);
            }
        });

        ecSelect.setText("Epsilon");
        ecSelect.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ecSelectStateChanged(evt);
            }
        });

        pmSelect.setText("Penalty");
        pmSelect.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pmSelectStateChanged(evt);
            }
        });

        jLabel11.setText("Frequency:");

        frequency.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0"))));
        frequency.setText("1000");
        frequency.setDoubleBuffered(true);
        frequency.setPreferredSize(new java.awt.Dimension(48, 26));
        frequency.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                frequencyFocusLost(evt);
            }
        });
        frequency.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                frequencyPropertyChange(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Frequency Distribution");

        buttonGroup3.add(freqStatic);
        freqStatic.setSelected(true);
        freqStatic.setText("Static");

        buttonGroup3.add(freqVaried);
        freqVaried.setText("Frequency Variance");

        cSelect.setText("Custom");

        custom.setText("Custom");
        custom.setToolTipText("");
        custom.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                customStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(pmSelect)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cSelect))
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(frSelect)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ecSelect)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(custom)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sphere)
                                    .addComponent(rastrigin))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ackley)
                                    .addComponent(rosenbrock)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(freqVaried)
                            .addComponent(freqStatic)
                            .addComponent(jLabel12))
                        .addGap(0, 24, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sphere)
                    .addComponent(ackley))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rastrigin)
                    .addComponent(rosenbrock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(custom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frSelect)
                    .addComponent(ecSelect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pmSelect)
                    .addComponent(cSelect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(frequency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(freqStatic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(freqVaried)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setMaximumSize(new java.awt.Dimension(260, 400));
        jPanel4.setMinimumSize(new java.awt.Dimension(260, 400));
        jPanel4.setName("Function Settings"); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(260, 400));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Solution Accuracy");

        buttonGroup2.add(quick);
        quick.setText("Quick");
        quick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickActionPerformed(evt);
            }
        });

        buttonGroup2.add(accuracy);
        accuracy.setText("High Accuracy");

        buttonGroup2.add(adaptive);
        adaptive.setText("Adaptive");

        buttonGroup2.add(balanced);
        balanced.setSelected(true);
        balanced.setText("Balanced");

        jLabel18.setText("Number of Runs:");

        bestKnownRuns.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0"))));
        bestKnownRuns.setText("1");

        runButton.setText("Run");
        runButton.setActionCommand("");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(balanced)
                    .addComponent(adaptive)
                    .addComponent(accuracy)
                    .addComponent(jLabel17)
                    .addComponent(quick)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bestKnownRuns, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)))
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(runButton)
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quick)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balanced)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accuracy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adaptive)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(bestKnownRuns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(runButton)
                .addGap(20, 20, 20))
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Global Settings");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Function Solver Settings");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("Benchmark Settings");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel16)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel15))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int changesParam = Integer.parseInt(numChanges.getText());
        int dimensionParam = Integer.parseInt(numVariables.getText());
        int runsParam = Integer.parseInt(nRuns.getText());
        int constraintParam = 0;
            if (existingConstraints.isSelected()) {
                constraintParam = 1;
            }
        
        int lowerParam = Integer.parseInt(lowerBounds.getText());
        int upperParam = Integer.parseInt(upperBounds.getText());
        int functionParam[] = {0,0,0,0,0,0};
        //Sphere, Rastrigin, Ackley, Rosenbrock, Custom
            if (sphere.isSelected()) {
                functionParam[0] = 1;
            }
            if (rastrigin.isSelected()) {
                functionParam[1] = 1;
            }
            if (ackley.isSelected()) {
                functionParam[2] = 1;
            }
            if (rosenbrock.isSelected()) {
                functionParam[3] = 1;
            }
            if (custom.isSelected()) {
                functionParam[5] = 1;
            }
            
        int algorithmParam[] = {0,0,0,0};
            if (frSelect.isSelected()) {
                algorithmParam[0] = 1;
            }
            if (ecSelect.isSelected()) {
                algorithmParam[1] = 1;
            }
            if (pmSelect.isSelected()) {
                algorithmParam[2] = 1;
            }
            if (cSelect.isSelected()) {
                algorithmParam[3] = 1;
            }
        
        int frequencyParam = Integer.parseInt(frequency.getText());
        int freqDistParam = 0;
            if (freqVaried.isSelected()) {
                freqDistParam = 1;
            }
        int accuracyParam = 0;
            if (quick.isSelected()) {
                accuracyParam = 10000;
            }
            if (balanced.isSelected()) {
                accuracyParam = 100000;
            }
            if (accuracy.isSelected()) {
                accuracyParam = 1000000;
            }
            if (adaptive.isSelected()) {
                accuracyParam = 1000001;
            }
            
        int solverRunsParam = Integer.parseInt(bestKnownRuns.getText());
        if (constraintParam == 0) {
            ConstraintGenerator.main(changesParam, dimensionParam, runsParam, constraintParam, lowerParam, upperParam, functionParam, algorithmParam, frequencyParam, freqDistParam, accuracyParam, solverRunsParam);
        }
        DE_Best_know.main(changesParam, dimensionParam, runsParam, constraintParam, lowerParam, upperParam, functionParam, algorithmParam, frequencyParam, freqDistParam, accuracyParam, solverRunsParam); 
        if (frSelect.isSelected()) {
//            FeasibilityRules.main(changesParam, dimensionParam, runsParam, constraintParam, lowerParam, upperParam, functionParam, algorithmParam, frequencyParam, freqDistParam, accuracyParam, solverRunsParam);
              FeasibilityRules.main(changesParam, dimensionParam, NpParams, FParams, CRParams,runsParam, lowerParam, upperParam, functionParam, frequencyParam);
              //int changesParam, int dimensionParam, int runsParam, int lowerParam, int upperParam, int functionParam[], int frequencyParam
      }
        if (ecSelect.isSelected()) {
            //int changesParam, int dimensionParam, int runsParam, int lowerParam, int upperParam, int functionParam[]
            EpsilonConstrained.main(changesParam, dimensionParam, NpParams, FParams, CRParams, runsParam, lowerParam, upperParam, functionParam,frequencyParam);
            //EpsilonConstrained.main(changesParam, dimensionParam, runsParam, constraintParam, lowerParam, upperParam, functionParam, algorithmParam, frequencyParam, freqDistParam, accuracyParam, solverRunsParam);
        }
        if (pmSelect.isSelected()) {
            //int changesParam, int dimensionParam, int runsParam, int lowerParam, int upperParam, int functionParam[], int frequencyParam)
            //Penalty.main(changesParam, dimensionParam, runsParam, constraintParam, lowerParam, upperParam, functionParam, algorithmParam, frequencyParam, freqDistParam, accuracyParam, solverRunsParam);
            Penalty.main(changesParam, dimensionParam, NpParams, FParams, CRParams,runsParam, lowerParam, upperParam, functionParam, frequencyParam);
        }
        if (cSelect.isSelected()) {
            //CustomFunction.main(changesParam, dimensionParam, runsParam, constraintParam, lowerParam, upperParam, functionParam, algorithmParam, frequencyParam, freqDistParam, accuracyParam, solverRunsParam);
        }
        
        System.exit(0);
    }                                         

    private void defaultBoundsActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        if (defaultBounds.isSelected()) {
            lowerBounds.setEnabled(false);
            lowerBounds.setText("-5");
            upperBounds.setEnabled(false);
            upperBounds.setText("5");
        } else {
            lowerBounds.setEnabled(true);
            upperBounds.setEnabled(true);
        }
    }                                             

    private void sphereStateChanged(javax.swing.event.ChangeEvent evt) {                                    
        // TODO add your handling code here:
        if ((sphere.isSelected() || rastrigin.isSelected() || ackley.isSelected() || rosenbrock.isSelected() || custom.isSelected()) && (frSelect.isSelected() || ecSelect.isSelected() || pmSelect.isSelected())) {
            runButton.setEnabled(true);
        } else {
            runButton.setEnabled(false);
        }
    }                                   

    private void ackleyStateChanged(javax.swing.event.ChangeEvent evt) {                                    
        // TODO add your handling code here:
        if ((sphere.isSelected() || rastrigin.isSelected() || ackley.isSelected() || rosenbrock.isSelected() || custom.isSelected()) && (frSelect.isSelected() || ecSelect.isSelected() || pmSelect.isSelected())) {
            runButton.setEnabled(true);
        } else {
            runButton.setEnabled(false);
        }
    }                                   

    private void rastriginStateChanged(javax.swing.event.ChangeEvent evt) {                                       
        // TODO add your handling code here:
        if ((sphere.isSelected() || rastrigin.isSelected() || ackley.isSelected() || rosenbrock.isSelected() || custom.isSelected()) && (frSelect.isSelected() || ecSelect.isSelected() || pmSelect.isSelected())) {
            runButton.setEnabled(true);
        } else {
            runButton.setEnabled(false);
        }
    }                                      

    private void rosenbrockStateChanged(javax.swing.event.ChangeEvent evt) {                                        
        // TODO add your handling code here:
        if ((sphere.isSelected() || rastrigin.isSelected() || ackley.isSelected() || rosenbrock.isSelected() || custom.isSelected()) && (frSelect.isSelected() || ecSelect.isSelected() || pmSelect.isSelected())) {
            runButton.setEnabled(true);
        } else {
            runButton.setEnabled(false);
        }
    }                                       

    private void frSelectStateChanged(javax.swing.event.ChangeEvent evt) {                                      
        // TODO add your handling code here:
        if ((sphere.isSelected() || rastrigin.isSelected() || ackley.isSelected() || rosenbrock.isSelected() || custom.isSelected()) && (frSelect.isSelected() || ecSelect.isSelected() || pmSelect.isSelected())) {
            runButton.setEnabled(true);
        } else {
            runButton.setEnabled(false);
        }
    }                                     

    private void ecSelectStateChanged(javax.swing.event.ChangeEvent evt) {                                      
        // TODO add your handling code here:
        if ((sphere.isSelected() || rastrigin.isSelected() || ackley.isSelected() || rosenbrock.isSelected() || custom.isSelected()) && (frSelect.isSelected() || ecSelect.isSelected() || pmSelect.isSelected())) {
            runButton.setEnabled(true);
        } else {
            runButton.setEnabled(false);
        }
    }                                     

    private void pmSelectStateChanged(javax.swing.event.ChangeEvent evt) {                                      
        // TODO add your handling code here:
        if ((sphere.isSelected() || rastrigin.isSelected() || ackley.isSelected() || rosenbrock.isSelected() || custom.isSelected()) && (frSelect.isSelected() || ecSelect.isSelected() || pmSelect.isSelected())) {
            runButton.setEnabled(true);
        } else {
            runButton.setEnabled(false);
        }
    }                                     

    private void frequencyPropertyChange(java.beans.PropertyChangeEvent evt) {                                         
        // TODO add your handling code here:
        if(!frequency.getText().equals("")){
            int val = Integer.parseInt(frequency.getText());
            if (val < 1) {
                frequency.setText("1");
            }
        }
    }                                        

    private void frequencyFocusLost(java.awt.event.FocusEvent evt) {                                    
        // TODO add your handling code here:
        if(frequency.getText().equals("")){
            frequency.setText("1");
        }
    }                                   

    private void numVariablesFocusLost(java.awt.event.FocusEvent evt) {                                       
        // TODO add your handling code here:
        if(numChanges.getText().equals("")){
            numChanges.setText("1");
        }
    }                                      

    private void upperBoundsFocusLost(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
        if(upperBounds.getText().equals("")){
            upperBounds.setText("5");
        }
    }                                     

    private void lowerBoundsFocusLost(java.awt.event.FocusEvent evt) {                                      
        // TODO add your handling code here:
        if(lowerBounds.getText().equals("")){
            lowerBounds.setText("-5");
        }
    }                                     

    private void quickActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void customStateChanged(javax.swing.event.ChangeEvent evt) {                                    
        // TODO add your handling code here:
        if ((sphere.isSelected() || rastrigin.isSelected() || ackley.isSelected() || rosenbrock.isSelected() || custom.isSelected()) && (frSelect.isSelected() || ecSelect.isSelected() || pmSelect.isSelected())) {
            runButton.setEnabled(true);
        } else {
            runButton.setEnabled(false);
        }
    }                                   

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
            java.util.logging.Logger.getLogger(DCOPsBenchmark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DCOPsBenchmark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DCOPsBenchmark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DCOPsBenchmark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DCOPsBenchmark().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JRadioButton accuracy;
    private javax.swing.JCheckBox ackley;
    private javax.swing.JRadioButton adaptive;
    private javax.swing.JRadioButton balanced;
    private javax.swing.JFormattedTextField bestKnownRuns;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JCheckBox cSelect;
    private javax.swing.JCheckBox custom;
    private javax.swing.JCheckBox defaultBounds;
    private javax.swing.JCheckBox ecSelect;
    private javax.swing.JRadioButton existingConstraints;
    private javax.swing.JCheckBox frSelect;
    private javax.swing.JRadioButton freqStatic;
    private javax.swing.JRadioButton freqVaried;
    private javax.swing.JFormattedTextField frequency;
    private javax.swing.JRadioButton generateConstraints;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JFormattedTextField lowerBounds;
    private javax.swing.JFormattedTextField nRuns;
    private javax.swing.JFormattedTextField numChanges;
    private javax.swing.JFormattedTextField numVariables;
    private javax.swing.JCheckBox pmSelect;
    private javax.swing.JRadioButton quick;
    private javax.swing.JCheckBox rastrigin;
    private javax.swing.JCheckBox rosenbrock;
    private javax.swing.JButton runButton;
    private javax.swing.JCheckBox sphere;
    private javax.swing.JFormattedTextField upperBounds;
    // End of variables declaration                   
}