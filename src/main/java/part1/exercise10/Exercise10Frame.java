package part1.exercise10;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.border.Border;

public class Exercise10Frame extends javax.swing.JFrame {

    private double patrimonio = 0;
    private short estrato = -1;
    private JCheckBox currentSelected = null;

    public Exercise10Frame() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtInscriptionNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNames = new javax.swing.JTextField();
        txtPatrimonio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnExecute = new javax.swing.JButton();
        chb1 = new javax.swing.JCheckBox();
        chb2 = new javax.swing.JCheckBox();
        chb3 = new javax.swing.JCheckBox();
        chb4 = new javax.swing.JCheckBox();
        chb5 = new javax.swing.JCheckBox();
        chb6 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblInscriptionNumber = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblNames = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setText("Ejercicio 10");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("Calculadora de matricula para estudiantes. ");

        txtInscriptionNumber.setText("0");
        txtInscriptionNumber.setToolTipText("");
        txtInscriptionNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInscriptionNumberKeyTyped(evt);
            }
        });

        jLabel4.setText("Número de inscripción:");

        jLabel5.setText("Nombres:");

        txtNames.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamesKeyTyped(evt);
            }
        });

        txtPatrimonio.setText("0");
        txtPatrimonio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPatrimonioKeyTyped(evt);
            }
        });

        jLabel6.setText("Patrimonio:");

        jLabel7.setText("Estrato social:");

        btnExecute.setText("Calcular");
        btnExecute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExecuteMouseClicked(evt);
            }
        });

        chb1.setText("1");
        chb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chb1MouseClicked(evt);
            }
        });

        chb2.setText("2");
        chb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chb2MouseClicked(evt);
            }
        });

        chb3.setText("3");
        chb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chb3MouseClicked(evt);
            }
        });

        chb4.setText("4");
        chb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chb4MouseClicked(evt);
            }
        });

        chb5.setText("5");
        chb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chb5MouseClicked(evt);
            }
        });

        chb6.setText("6");
        chb6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chb6MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Informe de matrícula");

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel9.setText("Número de inscripción:");

        lblInscriptionNumber.setText("0");

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel11.setText("Usuario:");

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel14.setText("Total de matrícula:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInscriptionNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNames, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInscriptionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNames, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(chb1)
                        .addGap(18, 18, 18)
                        .addComponent(chb2)
                        .addGap(18, 18, 18)
                        .addComponent(chb3)
                        .addGap(18, 18, 18)
                        .addComponent(chb4)
                        .addGap(18, 18, 18)
                        .addComponent(chb5)
                        .addGap(18, 18, 18)
                        .addComponent(chb6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnExecute, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPatrimonio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                .addComponent(txtNames, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtInscriptionNumber, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInscriptionNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addComponent(txtNames, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addComponent(txtPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chb1)
                    .addComponent(chb2)
                    .addComponent(chb3)
                    .addComponent(chb4)
                    .addComponent(chb5)
                    .addComponent(chb6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExecute, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInscriptionNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInscriptionNumberKeyTyped
        try {
            char character = evt.getKeyChar();
            if (character == 32) {
                return;
            }
            String texto = txtInscriptionNumber.getText() + character;
            int number = Integer.parseInt(texto);
            lblInscriptionNumber.setText(String.valueOf(number));
        } catch (NumberFormatException e) {
            evt.consume();
        }
    }//GEN-LAST:event_txtInscriptionNumberKeyTyped

    private void txtNamesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamesKeyTyped
        char character = evt.getKeyChar();
        if (txtNames.getText().length() > 22) {
            evt.consume();
            return;
        }

        boolean mayusculas = character >= 65 && character <= 90;
        boolean minusculas = character >= 97 && character <= 122;

        if (character == 32 || mayusculas || minusculas) {
            txtNames.setText(txtNames.getText() + character);
        }
        String text = txtNames.getText();
        lblNames.setText(text);
        evt.consume();
    }//GEN-LAST:event_txtNamesKeyTyped

    private void txtPatrimonioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatrimonioKeyTyped
        try {
            char character = evt.getKeyChar();
            if (character == 32) {
                return;
            }
            String texto = txtPatrimonio.getText() + character;
            this.patrimonio = Double.parseDouble(texto);
        } catch (NumberFormatException e) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPatrimonioKeyTyped

    private void chb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chb1MouseClicked
        this.clickCheckBox(this.chb1, (short) 1);

    }//GEN-LAST:event_chb1MouseClicked

    private void chb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chb2MouseClicked
        this.clickCheckBox(this.chb2, (short) 2);
    }//GEN-LAST:event_chb2MouseClicked

    private void chb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chb3MouseClicked
        this.clickCheckBox(this.chb3, (short) 3);
    }//GEN-LAST:event_chb3MouseClicked

    private void chb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chb4MouseClicked
        this.clickCheckBox(this.chb4, (short) 4);
    }//GEN-LAST:event_chb4MouseClicked

    private void chb5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chb5MouseClicked
        this.clickCheckBox(this.chb5, (short) 5);
    }//GEN-LAST:event_chb5MouseClicked

    private void chb6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chb6MouseClicked
        this.clickCheckBox(this.chb6, (short) 6);
    }//GEN-LAST:event_chb6MouseClicked

    private void btnExecuteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExecuteMouseClicked
        int fails = 0;

        Border grayBorder = BorderFactory.createLineBorder(Color.GRAY, 1);
        Border redBorder = BorderFactory.createLineBorder(Color.RED, 1);
        txtInscriptionNumber.setBorder(grayBorder);
        txtNames.setBorder(grayBorder);
        txtPatrimonio.setBorder(grayBorder);
        chb1.setBorderPainted(false);
        chb2.setBorderPainted(false);
        chb3.setBorderPainted(false);
        chb4.setBorderPainted(false);
        chb5.setBorderPainted(false);
        chb6.setBorderPainted(false);

        lblTotal.setText("");

        if (txtInscriptionNumber.getText().length() == 0) {
            txtInscriptionNumber.setBorder(redBorder);
            fails++;
        }

        if (txtNames.getText().length() == 0) {
            txtNames.setBorder(redBorder);
            fails++;
        }

        if (txtPatrimonio.getText().length() == 0) {
            txtPatrimonio.setBorder(redBorder);
            fails++;
        }

        if (!chb1.isSelected() && !chb2.isSelected() && !chb3.isSelected() && !chb4.isSelected()
                && !chb5.isSelected() && !chb6.isSelected()) {
            chb1.setBorder(redBorder);
            chb1.setBorderPainted(true);
            chb2.setBorder(redBorder);
            chb2.setBorderPainted(true);
            chb3.setBorder(redBorder);
            chb3.setBorderPainted(true);
            chb4.setBorder(redBorder);
            chb4.setBorderPainted(true);
            chb5.setBorder(redBorder);
            chb5.setBorderPainted(true);
            chb6.setBorder(redBorder);
            chb6.setBorderPainted(true);
            fails++;
        }

        if (fails > 0) {
            evt.consume();
            return;
        }

        double matricula = Exercise10.getMatricula(this.patrimonio, this.estrato);
        lblTotal.setText(String.valueOf(matricula));
    }//GEN-LAST:event_btnExecuteMouseClicked

    private void clickCheckBox(JCheckBox checkbox, short estrato) {
        if (checkbox.isSelected()) {
            this.estrato = estrato;
            if (this.currentSelected != null) {
                this.currentSelected.setSelected(false);
            }
            this.currentSelected = checkbox;
        } else {
            this.estrato = -1;
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercise10Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecute;
    private javax.swing.JCheckBox chb1;
    private javax.swing.JCheckBox chb2;
    private javax.swing.JCheckBox chb3;
    private javax.swing.JCheckBox chb4;
    private javax.swing.JCheckBox chb5;
    private javax.swing.JCheckBox chb6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInscriptionNumber;
    private javax.swing.JLabel lblNames;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtInscriptionNumber;
    private javax.swing.JTextField txtNames;
    private javax.swing.JTextField txtPatrimonio;
    // End of variables declaration//GEN-END:variables
}
