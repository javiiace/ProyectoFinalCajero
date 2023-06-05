/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Programa;

import Programa.Bienvenidas;
import bd.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author alumnoT
 */
public class Ingresar extends javax.swing.JFrame {
    
    
    /**
     * Creates new form main
     */
    public Ingresar() {
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

        panIngresos = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        lblIngresarCliente = new javax.swing.JLabel();
        lblConcepto = new javax.swing.JLabel();
        lblIngresarConcepto = new javax.swing.JTextField();
        lblImporte = new javax.swing.JLabel();
        lblIngresarImporte = new javax.swing.JTextField();
        panOp3 = new javax.swing.JPanel();
        lblIngresarCambiarOp = new javax.swing.JButton();
        lblIngresarConfirmar = new javax.swing.JButton();
        lblIngresarSalir = new javax.swing.JButton();
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

        panIngresos.setLayout(new java.awt.GridLayout(3, 0, 10, 0));

        lblCliente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCliente.setText("Cliente:");
        panIngresos.add(lblCliente);

        lblIngresarCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblIngresarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panIngresos.add(lblIngresarCliente);

        lblConcepto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblConcepto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblConcepto.setText("Concepto:");
        panIngresos.add(lblConcepto);

        lblIngresarConcepto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblIngresarConcepto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lblIngresarConcepto.setBorder(null);
        panIngresos.add(lblIngresarConcepto);

        lblImporte.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblImporte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblImporte.setText("Importe:");
        panIngresos.add(lblImporte);

        lblIngresarImporte.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblIngresarImporte.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lblIngresarImporte.setBorder(null);
        panIngresos.add(lblIngresarImporte);

        panOp3.setLayout(new java.awt.GridLayout(3, 0, 0, 20));

        lblIngresarCambiarOp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblIngresarCambiarOp.setText("Cambiar Operación");
        lblIngresarCambiarOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblIngresarCambiarOpActionPerformed(evt);
            }
        });
        panOp3.add(lblIngresarCambiarOp);

        lblIngresarConfirmar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblIngresarConfirmar.setText("Confirmar");
        lblIngresarConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblIngresarConfirmarActionPerformed(evt);
            }
        });
        panOp3.add(lblIngresarConfirmar);

        lblIngresarSalir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblIngresarSalir.setText("Salir");
        lblIngresarSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblIngresarSalirActionPerformed(evt);
            }
        });
        panOp3.add(lblIngresarSalir);

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
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panIngresos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(panOp3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(panTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(388, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(panIngresos, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(panOp3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(621, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(329, 329, 329)
                    .addComponent(panTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblIngresarCambiarOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblIngresarCambiarOpActionPerformed
        
    }//GEN-LAST:event_lblIngresarCambiarOpActionPerformed

    private void lblIngresarConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblIngresarConfirmarActionPerformed

    }//GEN-LAST:event_lblIngresarConfirmarActionPerformed

    private void lblIngresarSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblIngresarSalirActionPerformed
        
    }//GEN-LAST:event_lblIngresarSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class
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
                new Ingresar().setVisible(true);
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
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblConcepto;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JButton lblIngresarCambiarOp;
    private javax.swing.JLabel lblIngresarCliente;
    private javax.swing.JTextField lblIngresarConcepto;
    private javax.swing.JButton lblIngresarConfirmar;
    private javax.swing.JTextField lblIngresarImporte;
    private javax.swing.JButton lblIngresarSalir;
    private javax.swing.JPanel panIngresos;
    private javax.swing.JPanel panOp3;
    private javax.swing.JPanel panSuperior;
    private javax.swing.JPanel panTeclado;
    // End of variables declaration//GEN-END:variables
    Connection conexion;
    Statement sentencia;
    Statement sentencia2;
    ResultSet resultado;
    ResultSet resultado2;
    Tarjeta tarjeta;
    Cliente cliente;
}
