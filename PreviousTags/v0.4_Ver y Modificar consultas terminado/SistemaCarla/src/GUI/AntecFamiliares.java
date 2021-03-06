/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ClasesBase.AntecedentesFamiliares;
import ClasesBase.MensajesValidaciones;
import ClasesBase.Paciente;
import DAO.DAOAntecedentesFamiliares;
import javax.swing.JFrame;

/**
 *
 * @author Fran
 */
public class AntecFamiliares extends javax.swing.JDialog {
    private AntecedentesFamiliares afam;
    private DAOAntecedentesFamiliares daoAntecFam;
    private Paciente paciente;
    /**
     * Creates new form AntecFamiliares
     */
    public AntecFamiliares(java.awt.Frame parent, boolean modal,Paciente p) {
        super(parent, modal);
        initComponents();
         paciente = p;
         daoAntecFam = new DAOAntecedentesFamiliares();
         llenarCajas(p);
         CambiarEstadoCajas(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpDiabetes = new javax.swing.ButtonGroup();
        btngrpHA = new javax.swing.ButtonGroup();
        btngrpCancer = new javax.swing.ButtonGroup();
        btngrpTiroides = new javax.swing.ButtonGroup();
        pnlFamiliares = new javax.swing.JPanel();
        lblstaticCA = new javax.swing.JLabel();
        lblstaticDiabetes = new javax.swing.JLabel();
        txtfTiroides = new javax.swing.JTextField();
        lblstaticTensionA = new javax.swing.JLabel();
        lblstaticTiroides = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtaOncologicos = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaFamObservaciones = new javax.swing.JTextArea();
        lblstaticFamObservaciones = new javax.swing.JLabel();
        chkDiabetes = new javax.swing.JCheckBox();
        chkTiroides = new javax.swing.JCheckBox();
        chkHipertension = new javax.swing.JCheckBox();
        chkOncologicos = new javax.swing.JCheckBox();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnVolver2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblstaticCA.setText("Oncologicos:");

        lblstaticDiabetes.setText("Diabetes:");

        txtfTiroides.setEditable(false);
        txtfTiroides.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfTiroidesKeyTyped(evt);
            }
        });

        lblstaticTensionA.setText("Hipertension Arterial:");

        lblstaticTiroides.setText("Tiroides:");

        txtaOncologicos.setColumns(20);
        txtaOncologicos.setEditable(false);
        txtaOncologicos.setRows(2);
        jScrollPane4.setViewportView(txtaOncologicos);

        txtaFamObservaciones.setColumns(20);
        txtaFamObservaciones.setEditable(false);
        txtaFamObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtaFamObservaciones);

        lblstaticFamObservaciones.setText("Observaciones:");

        chkTiroides.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkTiroidesStateChanged(evt);
            }
        });

        chkOncologicos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkOncologicosStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlFamiliaresLayout = new javax.swing.GroupLayout(pnlFamiliares);
        pnlFamiliares.setLayout(pnlFamiliaresLayout);
        pnlFamiliaresLayout.setHorizontalGroup(
            pnlFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFamiliaresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblstaticFamObservaciones)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFamiliaresLayout.createSequentialGroup()
                        .addGroup(pnlFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFamiliaresLayout.createSequentialGroup()
                                .addComponent(lblstaticTiroides, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkTiroides)
                                .addGap(18, 18, 18)
                                .addComponent(txtfTiroides, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlFamiliaresLayout.createSequentialGroup()
                                .addComponent(lblstaticDiabetes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkDiabetes)
                                .addGap(94, 94, 94)
                                .addComponent(lblstaticCA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkOncologicos))
                            .addGroup(pnlFamiliaresLayout.createSequentialGroup()
                                .addComponent(lblstaticTensionA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkHipertension)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlFamiliaresLayout.setVerticalGroup(
            pnlFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFamiliaresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFamiliaresLayout.createSequentialGroup()
                        .addGroup(pnlFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblstaticDiabetes)
                                .addComponent(lblstaticCA)
                                .addComponent(chkDiabetes))
                            .addComponent(chkOncologicos))
                        .addGap(15, 15, 15)
                        .addGroup(pnlFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkHipertension)
                            .addComponent(lblstaticTensionA))
                        .addGap(12, 12, 12)
                        .addGroup(pnlFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFamiliaresLayout.createSequentialGroup()
                                .addGroup(pnlFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblstaticTiroides)
                                    .addComponent(chkTiroides))
                                .addGap(18, 18, 18)
                                .addComponent(lblstaticFamObservaciones))
                            .addComponent(txtfTiroides, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

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

        btnVolver2.setText("Volver");
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlFamiliares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlFamiliares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
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
    afam = new AntecedentesFamiliares();
    afam.setDbt(this.chkDiabetes.isSelected());
    afam.setHta(this.chkHipertension.isSelected());
    afam.setOncologicos(this.chkOncologicos.isSelected());
    afam.setTiroides(this.chkTiroides.isSelected());
    afam.setDescripcionOncologicos(this.txtaOncologicos.getText());
    afam.setDescripcionTiroides(this.txtfTiroides.getText());
    afam.setObservaciones(this.txtaFamObservaciones.getText());
    daoAntecFam.actualizarAntecedente(afam, paciente.getDni());
    paciente.setAntecFam(afam);
    CambiarEstadoCajas(false);
    this.btnGuardar.setEnabled(false);
    this.btnModificar.setEnabled(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void chkTiroidesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkTiroidesStateChanged
     if(!this.chkTiroides.isSelected())
        {
        this.txtfTiroides.setEditable(false);
        this.txtfTiroides.setText("");
        }
    }//GEN-LAST:event_chkTiroidesStateChanged

    private void chkOncologicosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkOncologicosStateChanged
     if(!this.chkOncologicos.isSelected())
        {
        this.txtaOncologicos.setEditable(false);
        this.txtaOncologicos.setText("");
        }
    }//GEN-LAST:event_chkOncologicosStateChanged

    private void txtfTiroidesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfTiroidesKeyTyped
         MensajesValidaciones.limitarLargo(this.txtfTiroides, evt, 45,this);
    }//GEN-LAST:event_txtfTiroidesKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver2;
    private javax.swing.ButtonGroup btngrpCancer;
    private javax.swing.ButtonGroup btngrpDiabetes;
    private javax.swing.ButtonGroup btngrpHA;
    private javax.swing.ButtonGroup btngrpTiroides;
    private javax.swing.JCheckBox chkDiabetes;
    private javax.swing.JCheckBox chkHipertension;
    private javax.swing.JCheckBox chkOncologicos;
    private javax.swing.JCheckBox chkTiroides;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblstaticCA;
    private javax.swing.JLabel lblstaticDiabetes;
    private javax.swing.JLabel lblstaticFamObservaciones;
    private javax.swing.JLabel lblstaticTensionA;
    private javax.swing.JLabel lblstaticTiroides;
    private javax.swing.JPanel pnlFamiliares;
    private javax.swing.JTextArea txtaFamObservaciones;
    private javax.swing.JTextArea txtaOncologicos;
    private javax.swing.JTextField txtfTiroides;
    // End of variables declaration//GEN-END:variables
private void llenarCajas(AntecedentesFamiliares af) {
        this.txtaFamObservaciones.setText(af.getObservaciones());
        this.txtaOncologicos.setText(af.getDescripcionOncologicos());
        this.txtfTiroides.setText(af.getDescripcionTiroides());
        
        if(af.isTiroides())
            this.chkTiroides.setSelected(true);
        
        if(af.isOncologicos())
            this.chkOncologicos.setSelected(true);

        if(af.isDbt())
            this.chkDiabetes.setSelected(true);
        
        if(af.isHta())
            this.chkHipertension.setSelected(true);
    }
    private void llenarCajas(Paciente p) {
        this.txtaFamObservaciones.setText(p.getAntecFam().getObservaciones());
        this.txtaOncologicos.setText(p.getAntecFam().getDescripcionOncologicos());
        this.txtfTiroides.setText(p.getAntecFam().getDescripcionTiroides());
        
        if(p.getAntecFam().isTiroides())
            this.chkTiroides.setSelected(true);
        
        if(p.getAntecFam().isOncologicos())
            this.chkOncologicos.setSelected(true);
        
        if(p.getAntecFam().isDbt())
            this.chkDiabetes.setSelected(true);
        
        if(p.getAntecFam().isHta())
            this.chkHipertension.setSelected(true);
    }


private void CambiarEstadoCajas(boolean accion)
{
 this.txtaFamObservaciones.setEditable(accion);
 this.txtaOncologicos.setEditable(accion);
 this.txtfTiroides.setEditable(accion);
 this.chkTiroides.setEnabled(accion);
 this.chkOncologicos.setEnabled(accion);
 this.chkDiabetes.setEnabled(accion);
 this.chkHipertension.setEnabled(accion);
}
}
