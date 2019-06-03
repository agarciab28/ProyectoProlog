/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import jpl.Prolog;

/**
 *
 * @author Alejandro
 */
public class Consultas extends javax.swing.JFrame {

    /**
     * Creates new form Consultas
     */
    
    Prolog prolog;
    int porcentaje;
    
    public Consultas() {
        initComponents();
    }
    
    public Consultas(Prolog prolog) {
        this.prolog = prolog;
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

        jbtnAtras = new javax.swing.JButton();
        jlbTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlbDatos = new javax.swing.JLabel();
        jbtnConsultar = new javax.swing.JButton();
        jlbPorcentajeMax = new javax.swing.JLabel();
        jcbPorcentaje = new javax.swing.JComboBox<>();
        jlbHombre = new javax.swing.JLabel();
        jlbMujer = new javax.swing.JLabel();
        jlbPorcentaje = new javax.swing.JLabel();
        jlbResHombre = new javax.swing.JLabel();
        jlbResMujer = new javax.swing.JLabel();
        jlbResPorcentaje = new javax.swing.JLabel();
        jlbP = new javax.swing.JLabel();
        jlbSexo = new javax.swing.JLabel();
        jcbSexo = new javax.swing.JComboBox<>();
        jlbPersona = new javax.swing.JLabel();
        jtfPersona = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tinder Para Jotos - Consultas");
        setResizable(false);

        jbtnAtras.setText("Atrás");
        jbtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAtrasActionPerformed(evt);
            }
        });

        jlbTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbTitle.setText("Consulta de Matching");

        jlbDatos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbDatos.setText("Datos de Matching:");

        jbtnConsultar.setText("Consultar");
        jbtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConsultarActionPerformed(evt);
            }
        });

        jlbPorcentajeMax.setText("Porcentaje Maximo de Match:");

        jcbPorcentaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));

        jlbHombre.setText("Hombre:");

        jlbMujer.setText("Mujer:");

        jlbPorcentaje.setText("Porcentaje:");

        jlbP.setText("%");

        jlbSexo.setText("Sexo:");

        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        jlbPersona.setText("Persona:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtnAtras))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlbTitle)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlbPorcentajeMax)
                                        .addGap(18, 18, 18)
                                        .addComponent(jcbPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlbP)
                                        .addGap(4, 4, 4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnConsultar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jlbSexo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jlbPersona)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbPorcentaje)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbResPorcentaje))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbMujer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbResMujer))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbHombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbResHombre))
                            .addComponent(jlbDatos))
                        .addGap(294, 294, 294))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbTitle)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbSexo)
                    .addComponent(jcbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbPersona)
                    .addComponent(jtfPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbPorcentajeMax)
                    .addComponent(jcbPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnConsultar)
                    .addComponent(jlbP))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlbDatos)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbHombre)
                    .addComponent(jlbResHombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbMujer)
                    .addComponent(jlbResMujer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbPorcentaje)
                    .addComponent(jlbResPorcentaje))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAtrasActionPerformed
        this.dispose();
        index menu = new index(prolog);
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
    }//GEN-LAST:event_jbtnAtrasActionPerformed

    private void jbtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConsultarActionPerformed
        String porc = jcbPorcentaje.getSelectedItem().toString();
        String per = jtfPersona.getText().toString();
        System.out.println(per);
        int sexo = jcbSexo.getSelectedIndex();
        switch(sexo){
            case 0:
                prolog.consultarHombre(porc, per);
                jlbResHombre.setText(per);
                jlbResMujer.setText(prolog.m);
                break;
            case 1:
                prolog.consultarMujer(porc, per);
                jlbResHombre.setText(prolog.h);
                jlbResMujer.setText(per);
                break;
        }
        
        jlbResPorcentaje.setText(prolog.p);
    }//GEN-LAST:event_jbtnConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtnAtras;
    private javax.swing.JButton jbtnConsultar;
    private javax.swing.JComboBox<String> jcbPorcentaje;
    private javax.swing.JComboBox<String> jcbSexo;
    private javax.swing.JLabel jlbDatos;
    private javax.swing.JLabel jlbHombre;
    private javax.swing.JLabel jlbMujer;
    private javax.swing.JLabel jlbP;
    private javax.swing.JLabel jlbPersona;
    private javax.swing.JLabel jlbPorcentaje;
    private javax.swing.JLabel jlbPorcentajeMax;
    private javax.swing.JLabel jlbResHombre;
    private javax.swing.JLabel jlbResMujer;
    private javax.swing.JLabel jlbResPorcentaje;
    private javax.swing.JLabel jlbSexo;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JTextField jtfPersona;
    // End of variables declaration//GEN-END:variables
}