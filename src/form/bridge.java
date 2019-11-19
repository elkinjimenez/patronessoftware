/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import AbstractFactory.EnsamblajeTv;
import AbstractFactory.FactoryLDCBlanco;
import AbstractFactory.FactoryLDCNegro;
import AbstractFactory.FactoryPlasmaBlanco;
import AbstractFactory.FactoryPlasmaNegro;
import AbstractFactory.Tv;
import AbstractFactory.TvAbstractFactory;
import Bridge.CarneDePollo;
import Bridge.CarneDeRes;
import Bridge.ElaborarAlimento;
import Bridge.ElaborarHamburguesa;
import FactoryMethod.Pago;
import FactoryMethod.PagoFactory;
import FactoryMethod.PagoFactoryMethod;
import com.sun.awt.AWTUtilities;

/**
 *
 * @author aula2
 */
public class bridge extends javax.swing.JFrame {

    /**
     * Creates new form formulario
     */
    public bridge() {
        initComponents();
    }

    private static String respu;

    public static String getRespu() {
        return respu;
    }

    public static void setRespu(String respu) {
        bridge.respu = respu;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        abstractFactory = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        carnes = new javax.swing.JComboBox<>();
        generarAbstract = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 33, 33));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Patrón Bridge");

        resultado.setBackground(new java.awt.Color(46, 46, 46));
        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        resultado.setForeground(new java.awt.Color(255, 255, 255));
        resultado.setRows(3);
        resultado.setText("Resultados");
        jScrollPane4.setViewportView(resultado);

        abstractFactory.setBackground(new java.awt.Color(51, 51, 51));
        abstractFactory.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        abstractFactory.setForeground(new java.awt.Color(255, 255, 255));
        abstractFactory.setText("Volver");
        abstractFactory.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        abstractFactory.setBorderPainted(false);
        abstractFactory.setContentAreaFilled(false);
        abstractFactory.setFocusPainted(false);
        abstractFactory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abstractFactoryActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Seleccione un elemento");

        carnes.setBackground(new java.awt.Color(204, 204, 204));
        carnes.setForeground(new java.awt.Color(255, 255, 255));
        carnes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de carne", "Carne de pollo", "Carne de res" }));

        generarAbstract.setBackground(new java.awt.Color(0, 0, 0));
        generarAbstract.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        generarAbstract.setForeground(new java.awt.Color(255, 255, 255));
        generarAbstract.setText("Preparar");
        generarAbstract.setBorderPainted(false);
        generarAbstract.setContentAreaFilled(false);
        generarAbstract.setFocusPainted(false);
        generarAbstract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarAbstractActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carnes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(abstractFactory, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(generarAbstract, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(abstractFactory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(carnes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(generarAbstract, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abstractFactoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abstractFactoryActionPerformed
        // TODO add your handling code here:

        formulario abrir = new formulario();
        abrir.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_abstractFactoryActionPerformed

    private void generarAbstractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarAbstractActionPerformed
        // TODO add your handling code here:

        if ("Carne de pollo".equals(carnes.getSelectedItem().toString())) {

            ElaborarAlimento hamburguesa = new ElaborarHamburguesa(new CarneDePollo());
            hamburguesa.obtener();

        } else if ("Carne de res".equals(carnes.getSelectedItem().toString())) {

            ElaborarAlimento hamburguesa = new ElaborarHamburguesa(new CarneDeRes());
            hamburguesa.obtener();

        } else {

            setRespu("Por favor seleccione un tipo de carne");

        }

//        if ("LCD".equals(tvs.getSelectedItem().toString())) {
//
//            if ("Blanco".equals(carnes.getSelectedItem().toString())) {
//
//                TvAbstractFactory f1 = new FactoryLDCBlanco();
//                EnsamblajeTv e1 = new EnsamblajeTv(f1);
//
//            } else if ("Negro".equals(carnes.getSelectedItem().toString())) {
//
//                TvAbstractFactory f1 = new FactoryLDCNegro();
//                EnsamblajeTv e1 = new EnsamblajeTv(f1);
//
//            } else {
//
//            }
//
//        } else if ("Plasma".equals(tvs.getSelectedItem().toString())) {
//
//            if (carnes.getSelectedItem().toString() == "Blanco") {
//
//                TvAbstractFactory f2 = new FactoryPlasmaBlanco();
//                EnsamblajeTv e2 = new EnsamblajeTv(f2);
//
//            } else if ("Negro".equals(carnes.getSelectedItem().toString())) {
//
//                TvAbstractFactory f2 = new FactoryPlasmaNegro();
//                EnsamblajeTv e2 = new EnsamblajeTv(f2);
//
//            } else {
//
//                setRespu("Por favor seleccione un color");
//
//            }
//
//        } else {
//
//            setRespu("Por favor seleccione un tipo de Tv");
//
//        }
        resultado.setText(getRespu());
    }//GEN-LAST:event_generarAbstractActionPerformed

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
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abstractFactory;
    private javax.swing.JComboBox<String> carnes;
    private javax.swing.JButton generarAbstract;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea resultado;
    // End of variables declaration//GEN-END:variables
}
