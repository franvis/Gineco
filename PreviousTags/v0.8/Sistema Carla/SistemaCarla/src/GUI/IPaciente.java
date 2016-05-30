/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ClasesBase.MensajesValidaciones;
import ClasesBase.ObraSocial;
import DAO.DAOObraSocial;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;

public class IPaciente extends javax.swing.JDialog {
    private DAOObraSocial daoObraSocial;
        private LinkedList<ObraSocial> obras;
    /**
     * Creates new form Paciente
     */
    public IPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        obras = new LinkedList<>();
        daoObraSocial = new DAOObraSocial();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVolver2 = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        pnlDatosPersonales = new javax.swing.JPanel();
        lblstaticNombres = new javax.swing.JLabel();
        lblstaticApellidos = new javax.swing.JLabel();
        lblstaticTelefono = new javax.swing.JLabel();
        lblstaticFechaNacimiento = new javax.swing.JLabel();
        txtfNombres = new javax.swing.JTextField();
        txtfApellidos = new javax.swing.JTextField();
        txtfTelefono = new javax.swing.JTextField();
        txtfDni = new javax.swing.JTextField();
        lblstaticTelefono1 = new javax.swing.JLabel();
        ftxtfFechaNacimiento = new javax.swing.JFormattedTextField();
        lblstaticGrupoS = new javax.swing.JLabel();
        rbtnFactorPos = new javax.swing.JRadioButton();
        rbtnFactorNeg = new javax.swing.JRadioButton();
        lblstaticFactor = new javax.swing.JLabel();
        cmbGrupoS = new javax.swing.JComboBox();
        pnlObraSocial = new javax.swing.JPanel();
        cmbObraSocial = new javax.swing.JComboBox();
        btnNuevaObraSocial = new javax.swing.JButton();
        lblstaticNumAfiliado = new javax.swing.JLabel();
        txtfNumeroAfiliado = new javax.swing.JTextField();
        btnGuardarOS = new javax.swing.JButton();
        txtfNuevaObraSocial = new javax.swing.JTextField();
        btnCancelarOS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnVolver2.setText("Volver");
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        pnlDatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 14))); // NOI18N

        lblstaticNombres.setText("Nombres:");

        lblstaticApellidos.setText("Apellidos:");

        lblstaticTelefono.setText("Teléfono:");

        lblstaticFechaNacimiento.setText("Fecha de Nacimiento:");

        txtfNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfNombresKeyTyped(evt);
            }
        });

        txtfApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfApellidosKeyTyped(evt);
            }
        });

        txtfTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfTelefonoKeyTyped(evt);
            }
        });

        txtfDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfDniKeyTyped(evt);
            }
        });

        lblstaticTelefono1.setText("Nro. Doc.:");

        lblstaticGrupoS.setText("Grupo Sanguíneo:");

        rbtnFactorPos.setText("+");

        rbtnFactorNeg.setText("-");

        lblstaticFactor.setText("Factor:");

        cmbGrupoS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "AB", "0" }));

        pnlObraSocial.setBorder(javax.swing.BorderFactory.createTitledBorder("Obra Social"));

        cmbObraSocial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbObraSocialItemStateChanged(evt);
            }
        });

        btnNuevaObraSocial.setText("Nueva");
        btnNuevaObraSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaObraSocialActionPerformed(evt);
            }
        });

        lblstaticNumAfiliado.setText("Nro. Afiliado:");

        txtfNumeroAfiliado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfNumeroAfiliadoKeyTyped(evt);
            }
        });

        btnGuardarOS.setText("Guardar");
        btnGuardarOS.setEnabled(false);
        btnGuardarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarOSActionPerformed(evt);
            }
        });

        txtfNuevaObraSocial.setEnabled(false);
        txtfNuevaObraSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfNuevaObraSocialKeyTyped(evt);
            }
        });

        btnCancelarOS.setText("Cancelar");
        btnCancelarOS.setEnabled(false);
        btnCancelarOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarOSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlObraSocialLayout = new javax.swing.GroupLayout(pnlObraSocial);
        pnlObraSocial.setLayout(pnlObraSocialLayout);
        pnlObraSocialLayout.setHorizontalGroup(
            pnlObraSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlObraSocialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarOS, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlObraSocialLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlObraSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlObraSocialLayout.createSequentialGroup()
                        .addComponent(lblstaticNumAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfNumeroAfiliado))
                    .addGroup(pnlObraSocialLayout.createSequentialGroup()
                        .addComponent(cmbObraSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevaObraSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(pnlObraSocialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtfNuevaObraSocial))
        );
        pnlObraSocialLayout.setVerticalGroup(
            pnlObraSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlObraSocialLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(pnlObraSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbObraSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaObraSocial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfNuevaObraSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlObraSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarOS)
                    .addComponent(btnGuardarOS))
                .addGap(13, 13, 13)
                .addGroup(pnlObraSocialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfNumeroAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstaticNumAfiliado))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlDatosPersonalesLayout = new javax.swing.GroupLayout(pnlDatosPersonales);
        pnlDatosPersonales.setLayout(pnlDatosPersonalesLayout);
        pnlDatosPersonalesLayout.setHorizontalGroup(
            pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblstaticFechaNacimiento)
                            .addComponent(lblstaticGrupoS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(cmbGrupoS, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblstaticFactor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnFactorPos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtnFactorNeg))
                            .addComponent(ftxtfFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlObraSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblstaticTelefono1)
                            .addComponent(lblstaticTelefono)
                            .addComponent(lblstaticNombres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblstaticApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfTelefono)
                            .addComponent(txtfDni)
                            .addComponent(txtfApellidos)
                            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(39, 39, 39))
        );
        pnlDatosPersonalesLayout.setVerticalGroup(
            pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstaticNombres)
                    .addComponent(txtfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstaticApellidos)
                    .addComponent(txtfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstaticTelefono)
                    .addComponent(txtfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstaticTelefono1))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstaticFechaNacimiento)
                    .addComponent(ftxtfFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstaticGrupoS)
                    .addComponent(cmbGrupoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstaticFactor)
                    .addComponent(rbtnFactorPos)
                    .addComponent(rbtnFactorNeg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlObraSocial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver2))
                    .addComponent(pnlDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolver2ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        CambiarEstadoCajas(true);
        this.btnGuardar.setEnabled(true);
        this.btnModificar.setEnabled(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
//        afam = new AntecedentesFamiliares();
//        afam.setDbt(this.chkDiabetes.isSelected());
//        afam.setHta(this.chkHipertension.isSelected());
//        afam.setOncologicos(this.chkOncologicos.isSelected());
//        afam.setTiroides(this.chkTiroides.isSelected());
//        afam.setDescripcionOncologicos(this.txtaOncologicos.getText());
//        afam.setDescripcionTiroides(this.txtfTiroides.getText());
//        afam.setObservaciones(this.txtaFamObservaciones.getText());
//        daoAntecFam.actualizarAntecedente(afam, paciente.getDni());
//        paciente.setAntecFam(afam);
        CambiarEstadoCajas(false);
        this.btnGuardar.setEnabled(false);
        this.btnModificar.setEnabled(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

private void txtfNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfNombresKeyTyped
        MensajesValidaciones.negarNumeros(evt,this);
        MensajesValidaciones.limitarLargo(this.txtfNombres,evt,45,this);
}//GEN-LAST:event_txtfNombresKeyTyped

private void txtfApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfApellidosKeyTyped
        MensajesValidaciones.negarNumeros(evt,this);
        MensajesValidaciones.limitarLargo(this.txtfApellidos,evt,45,this);
}//GEN-LAST:event_txtfApellidosKeyTyped

private void txtfTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfTelefonoKeyTyped
        MensajesValidaciones.negarLetras(evt,this);
        MensajesValidaciones.limitarLargo(this.txtfTelefono, evt, 45,this);
}//GEN-LAST:event_txtfTelefonoKeyTyped

private void txtfDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfDniKeyTyped
        MensajesValidaciones.negarLetras(evt,this);
}//GEN-LAST:event_txtfDniKeyTyped

private void cmbObraSocialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbObraSocialItemStateChanged
    if(cmbObraSocial.getSelectedIndex()==obras.size()-1)
    {
        txtfNumeroAfiliado.setText("");
        txtfNumeroAfiliado.setEnabled(false);
    }
    else
    {
        txtfNumeroAfiliado.setText("");
        txtfNumeroAfiliado.setEnabled(true);
    }
}//GEN-LAST:event_cmbObraSocialItemStateChanged

private void btnNuevaObraSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaObraSocialActionPerformed
        this.txtfNuevaObraSocial.setEnabled(true);
        this.btnGuardarOS.setEnabled(true);
        this.btnCancelarOS.setEnabled(true);
        this.btnNuevaObraSocial.setEnabled(false);
        this.cmbObraSocial.setEnabled(false);
}//GEN-LAST:event_btnNuevaObraSocialActionPerformed

private void txtfNumeroAfiliadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfNumeroAfiliadoKeyTyped
        MensajesValidaciones.limitarLargo(this.txtfNumeroAfiliado, evt, 45, this);
        MensajesValidaciones.validarNumeroAfiliado(evt, this);
}//GEN-LAST:event_txtfNumeroAfiliadoKeyTyped

private void btnGuardarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarOSActionPerformed
        if (this.txtfNuevaObraSocial.getText().isEmpty()) {
            MensajesValidaciones.mostrarError(this, "Ingrese un nombre de obra social válido...");
            return;
        }

        if (daoObraSocial.registrarObraSocial(new ObraSocial(0, this.txtfNuevaObraSocial.getText()))) {
            MensajesValidaciones.mostrarInformacion(this, "Registro Exitoso.");
            cmbObraSocial.removeAllItems();
            llenarObrasSociales();
        } else {
            MensajesValidaciones.mostrarError(this, "Registro Fallido.");
        }

        this.txtfNuevaObraSocial.setEnabled(false);
        this.btnGuardarOS.setEnabled(false);
        this.btnNuevaObraSocial.setEnabled(true);
        this.cmbObraSocial.setEnabled(true);
        this.txtfNuevaObraSocial.setText("");
}//GEN-LAST:event_btnGuardarOSActionPerformed

private void txtfNuevaObraSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfNuevaObraSocialKeyTyped
        MensajesValidaciones.limitarLargo(this.txtfNuevaObraSocial, evt, 80, this);
}//GEN-LAST:event_txtfNuevaObraSocialKeyTyped

private void btnCancelarOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarOSActionPerformed
        this.txtfNuevaObraSocial.setText("");
        this.txtfNuevaObraSocial.setEnabled(false);
        this.btnGuardarOS.setEnabled(false);
        this.btnCancelarOS.setEnabled(false);
        this.btnNuevaObraSocial.setEnabled(true);
        this.cmbObraSocial.setEnabled(true);
}//GEN-LAST:event_btnCancelarOSActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarOS;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarOS;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevaObraSocial;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JComboBox cmbGrupoS;
    private javax.swing.JComboBox cmbObraSocial;
    private javax.swing.JFormattedTextField ftxtfFechaNacimiento;
    private javax.swing.JLabel lblstaticApellidos;
    private javax.swing.JLabel lblstaticFactor;
    private javax.swing.JLabel lblstaticFechaNacimiento;
    private javax.swing.JLabel lblstaticGrupoS;
    private javax.swing.JLabel lblstaticNombres;
    private javax.swing.JLabel lblstaticNumAfiliado;
    private javax.swing.JLabel lblstaticTelefono;
    private javax.swing.JLabel lblstaticTelefono1;
    private javax.swing.JPanel pnlDatosPersonales;
    private javax.swing.JPanel pnlObraSocial;
    private javax.swing.JRadioButton rbtnFactorNeg;
    private javax.swing.JRadioButton rbtnFactorPos;
    private javax.swing.JTextField txtfApellidos;
    private javax.swing.JTextField txtfDni;
    private javax.swing.JTextField txtfNombres;
    private javax.swing.JTextField txtfNuevaObraSocial;
    private javax.swing.JTextField txtfNumeroAfiliado;
    private javax.swing.JTextField txtfTelefono;
    // End of variables declaration//GEN-END:variables

 private void llenarObrasSociales() {
        obras = daoObraSocial.getAllObrasSociales();
        obras.add(new ObraSocial(0, "Sin Obra Social"));
        for(int i = 0; i<obras.size(); i++)
            cmbObraSocial.addItem(obras.get(i).getNombre());
        cmbObraSocial.setSelectedIndex(obras.size()-1);
    }

    private void CambiarEstadoCajas(boolean accion) {
        this.txtfApellidos.setEnabled(accion);
        this.txtfNombres.setEnabled(accion);
        this.txtfDni.setEnabled(accion);
        this.txtfNumeroAfiliado.setEnabled(accion);
        this.txtfTelefono.setEnabled(accion);
        this.cmbGrupoS.setEnabled(accion);
        this.cmbObraSocial.setEnabled(accion);
    }    
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/sistema.png"));
        return retValue;
    }
}
