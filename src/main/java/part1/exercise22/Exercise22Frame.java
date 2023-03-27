package part1.exercise22;

import part1.exercise18.*;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Exercise22Frame extends javax.swing.JFrame {

    private double hours = 0;
    private double hoursPrice = 0;
    private String names = "";
    
    public Exercise22Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNames = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHours = new javax.swing.JTextField();
        btnExecute = new javax.swing.JButton();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Ejercicio18"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setText("Ejercicio 22");

        txtNames.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamesKeyTyped(evt);
            }
        });

        jLabel3.setText("Nombres");

        jLabel4.setText("Horas trabajadas:");

        txtHours.setText("0");
        txtHours.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoursKeyTyped(evt);
            }
        });

        btnExecute.setText("Registrar");
        btnExecute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExecuteMouseClicked(evt);
            }
        });

        txtPrice.setText("0");
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });

        jLabel5.setText("Valor por hora:");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel6.setText("Registro de salarios mensuales.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnExecute, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(txtNames, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                .addComponent(txtHours)
                                .addComponent(txtPrice)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(txtNames, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExecute, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExecuteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExecuteMouseClicked
        int fails = 0;

        Border grayBorder = BorderFactory.createLineBorder(Color.GRAY, 1);
        Border redBorder = BorderFactory.createLineBorder(Color.RED, 1);
        txtNames.setBorder(grayBorder);
        txtHours.setBorder(grayBorder);
        txtPrice.setBorder(grayBorder);

        if (txtNames.getText().length() == 0) {
            txtNames.setBorder(redBorder);
            fails++;
        }
        
        if (txtHours.getText().length() == 0){
            txtHours.setBorder(redBorder);
            fails++;
        }
        
        if (txtPrice.getText().length() == 0){
            txtPrice.setBorder(redBorder);
            fails++;
        }
                
        if (fails > 0) {
            evt.consume();
            return;
        }
        
        double salary = Exercise22.getSalary(this.hours, this.hoursPrice);
        if(salary > 450000){
            JOptionPane.showMessageDialog(null, "Se registro el salario del usuario: " + this.names);
        }else{
            JOptionPane.showMessageDialog(null, "Se registro el salario del usuario: " + this.names + ", con salario: " + salary);
        }
    }//GEN-LAST:event_btnExecuteMouseClicked

    private void txtNamesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamesKeyTyped
        char character = evt.getKeyChar();
        if (txtNames.getText().length() > 22) {
            evt.consume();
            return;
        }

        boolean mayusculas = character >= 65 && character <= 90;
        boolean minusculas = character >= 97 && character <= 122;

        if (character == 32 || (mayusculas || minusculas)) {
            txtNames.setText(txtNames.getText() + character);
        }
        String text = txtNames.getText();
        this.names = text;
        evt.consume();
    }//GEN-LAST:event_txtNamesKeyTyped

    private void txtHoursKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoursKeyTyped
        try {
            char character = evt.getKeyChar();
            if (character == 32) {
                return;
            }
            String texto = txtHours.getText() + character;
            this.hours = Double.parseDouble(texto);
        } catch (NumberFormatException e) {
            evt.consume();
        }
    }//GEN-LAST:event_txtHoursKeyTyped

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        try {
            char character = evt.getKeyChar();
            if (character == 32) {
                return;
            }
            String texto = txtPrice.getText() + character;
            this.hoursPrice = Double.parseDouble(texto);
        } catch (NumberFormatException e) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPriceKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercise22Frame().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecute;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtHours;
    private javax.swing.JTextField txtNames;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
