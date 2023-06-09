/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Programa;

import bd.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author alumnoT
 */
public class PIN extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public PIN() {
        initComponents();
        initVentana();
        initBD();
    }

    private boolean esNumero(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            if (Character.isDigit(s1.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private void initVentana() {
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy");
        lblFecha.setText(hoy.format(formato));
        lblFecha.setText(hoy.format(formato));
        LocalTime hora = LocalTime.now();
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String sHora = hora.format(formato1);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LocalTime hora = LocalTime.now();
                DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("HH:mm:ss");
                String sHora = hora.format(formato2);
                lblHora.setText(sHora);
            }
        });
        timer.start();
    }

    private void initBD() {

        conexion = Conexion.mySQL("bdproyectocajero", "root", "");
        if (conexion == null) {
            JOptionPane.showMessageDialog(this, "Error, no se pudo conectar a la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panCambioPin = new javax.swing.JPanel();
        lblPinA = new javax.swing.JLabel();
        txfPinA = new javax.swing.JTextField();
        lblPinN = new javax.swing.JLabel();
        txfPinN = new javax.swing.JTextField();
        lblPinConf = new javax.swing.JLabel();
        txfPinConf = new javax.swing.JTextField();
        panOperaciones = new javax.swing.JPanel();
        btnCambRealizar = new javax.swing.JButton();
        btnCambSalir = new javax.swing.JButton();
        btnCambConfirmar = new javax.swing.JButton();
        panSuperior = new javax.swing.JPanel();
        lblHora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        panTeclado = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(800, 720));
        setResizable(false);

        panCambioPin.setLayout(new java.awt.GridLayout(3, 0, 0, 20));

        lblPinA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPinA.setText("PIN Actual:");
        panCambioPin.add(lblPinA);

        txfPinA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panCambioPin.add(txfPinA);

        lblPinN.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPinN.setText("Pin Nuevo:");
        panCambioPin.add(lblPinN);

        txfPinN.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panCambioPin.add(txfPinN);

        lblPinConf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblPinConf.setText("Confirmar PIN:");
        panCambioPin.add(lblPinConf);

        txfPinConf.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panCambioPin.add(txfPinConf);

        panOperaciones.setLayout(new java.awt.GridLayout(3, 0, 0, 20));

        btnCambRealizar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCambRealizar.setText("Realizar otra operación");
        btnCambRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambRealizarActionPerformed(evt);
            }
        });
        panOperaciones.add(btnCambRealizar);

        btnCambSalir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCambSalir.setText("Salir");
        btnCambSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambSalirActionPerformed(evt);
            }
        });
        panOperaciones.add(btnCambSalir);

        btnCambConfirmar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCambConfirmar.setText("Confirmar");
        btnCambConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambConfirmarActionPerformed(evt);
            }
        });
        panOperaciones.add(btnCambConfirmar);

        panSuperior.setLayout(new java.awt.GridLayout());

        lblHora.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        panSuperior.add(lblHora);

        lblFecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        panSuperior.add(lblFecha);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panSuperior.add(jComboBox1);

        panTeclado.setLayout(new java.awt.GridLayout(4, 0));

        btn1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/one.png"))); // NOI18N
        panTeclado.add(btn1);

        btn2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/two.png"))); // NOI18N
        panTeclado.add(btn2);

        btn3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/three.png"))); // NOI18N
        panTeclado.add(btn3);

        btn4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/four.png"))); // NOI18N
        panTeclado.add(btn4);

        btn5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/five.png"))); // NOI18N
        panTeclado.add(btn5);

        btn6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/six.png"))); // NOI18N
        panTeclado.add(btn6);

        btn7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seven.png"))); // NOI18N
        panTeclado.add(btn7);

        btn8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eight.png"))); // NOI18N
        panTeclado.add(btn8);

        btn9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nine.png"))); // NOI18N
        panTeclado.add(btn9);

        btnBorrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel.png"))); // NOI18N
        panTeclado.add(btnBorrar);

        btn0.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/zero.png"))); // NOI18N
        panTeclado.add(btn0);

        btnConfirmar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enter.png"))); // NOI18N
        panTeclado.add(btnConfirmar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panCambioPin, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(panOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(panTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(389, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(panCambioPin, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(panOperaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(622, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(293, 293, 293)
                    .addComponent(panTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(45, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambRealizarActionPerformed
        
    }//GEN-LAST:event_btnCambRealizarActionPerformed

    private void btnCambSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambSalirActionPerformed
        
    }//GEN-LAST:event_btnCambSalirActionPerformed

    private void btnCambConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambConfirmarActionPerformed
        
        try {
                if (txfPinN.getText().equals(txfPinConf.getText())) {
                    int pinnuevo = Integer.parseInt(txfPinN.getText());
                    sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    String sql = "SELECT * FROM tarjetas WHERE pin=" + txfPinA.getText() + ";";
                    resultado = sentencia.executeQuery(sql);
                    if (resultado.next()) {
                        resultado.updateInt("pin", pinnuevo);
                        resultado.updateRow();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El PIN nuevo no coincide", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
        } catch (SQLException ex) {
        } catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_btnCambConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(PIN.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PIN.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PIN.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PIN.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCambConfirmar;
    private javax.swing.JButton btnCambRealizar;
    private javax.swing.JButton btnCambSalir;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblPinA;
    private javax.swing.JLabel lblPinConf;
    private javax.swing.JLabel lblPinN;
    private javax.swing.JPanel panCambioPin;
    private javax.swing.JPanel panOperaciones;
    private javax.swing.JPanel panSuperior;
    private javax.swing.JPanel panTeclado;
    private javax.swing.JTextField txfPinA;
    private javax.swing.JTextField txfPinConf;
    private javax.swing.JTextField txfPinN;
    // End of variables declaration//GEN-END:variables
    Connection conexion;
    Statement sentencia;
    Statement sentencia2;
    ResultSet resultado;
    ResultSet resultado2;
    Tarjeta tarjeta;
    Cliente cliente;
}
