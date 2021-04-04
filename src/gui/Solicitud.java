/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public abstract class Solicitud extends JPanel {

    /**
     * Creates new form Solicitud
     */
    public Solicitud() {
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

        jLabel1 = new javax.swing.JLabel();
        programaText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        materiaText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        matriculaText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        grupoText = new javax.swing.JTextField();
        eliminarBtn = new javax.swing.JButton();
        modificarBtn = new javax.swing.JButton();
        fechaSpinner = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setText("Matricula");

        programaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                programaTextKeyReleased(evt);
            }
        });

        jLabel2.setText("Carrera");

        materiaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                materiaTextKeyReleased(evt);
            }
        });

        jLabel3.setText("Materia");

        matriculaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculaTextActionPerformed(evt);
            }
        });

        jLabel4.setText("Grupo");

        Fecha.setText("Fecha");

        grupoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                grupoTextKeyReleased(evt);
            }
        });

        eliminarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/delete.png"))); // NOI18N
        eliminarBtn.setText("Eliminar");
        eliminarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBtnActionPerformed(evt);
            }
        });

        modificarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/save.png"))); // NOI18N
        modificarBtn.setText("Modificar");
        modificarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtnActionPerformed(evt);
            }
        });

        fechaSpinner.setModel(new javax.swing.SpinnerDateModel());
        fechaSpinner.setEnabled(false);
        fechaSpinner.setFocusCycleRoot(true);
        fechaSpinner.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Fecha)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(modificarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(eliminarBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fechaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(materiaText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(programaText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matriculaText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grupoText))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(matriculaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(programaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(materiaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(grupoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha)
                    .addComponent(fechaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void matriculaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculaTextActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        modificar();
    }//GEN-LAST:event_modificarBtnActionPerformed

    private void eliminarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBtnActionPerformed
        // TODO add your handling code here:
        eliminar();
        JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.", "Consulta de materias", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_eliminarBtnActionPerformed

    private void programaTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_programaTextKeyReleased
        // TODO add your handling code here:
        convertiraMayusculasEnJtextfield(programaText);
    }//GEN-LAST:event_programaTextKeyReleased

    private void materiaTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_materiaTextKeyReleased
        convertiraMayusculasEnJtextfield(materiaText);
    }//GEN-LAST:event_materiaTextKeyReleased

    private void grupoTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_grupoTextKeyReleased
       convertiraMayusculasEnJtextfield(grupoText);
    }//GEN-LAST:event_grupoTextKeyReleased
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fecha;
    protected javax.swing.JButton eliminarBtn;
    protected javax.swing.JSpinner fechaSpinner;
    protected javax.swing.JTextField grupoText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    protected javax.swing.JTextField materiaText;
    protected javax.swing.JTextField matriculaText;
    protected javax.swing.JButton modificarBtn;
    protected javax.swing.JTextField programaText;
    // End of variables declaration//GEN-END:variables
    
    abstract void eliminar() ;

    abstract void modificar();

    private void configurar(){
        matriculaText.getText().toUpperCase();
        
    }
    
    public void convertiraMayusculasEnJtextfield(javax.swing.JTextField jTextfieldS){
        String cadena= (jTextfieldS.getText()).toUpperCase();
        jTextfieldS.setText(cadena);
    }

}
