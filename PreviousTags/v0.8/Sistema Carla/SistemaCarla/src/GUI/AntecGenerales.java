/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ClasesBase.AntecedentesGenerales;
import ClasesBase.MensajesValidaciones;
import ClasesBase.Paciente;
import DAO.DAOAntecedentesGenerales;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/**
 *
 * @author Fran
 */
public class AntecGenerales extends javax.swing.JDialog {
    private AntecedentesGenerales agen;
    private DAOAntecedentesGenerales daoAntecGen;
    private Paciente paciente;
    /**
     * Creates new form AntecGenerales
     */
    public AntecGenerales(java.awt.Frame parent, boolean modal,Paciente p) {
        super(parent, modal);
        initComponents();
        this.btnModificar.grabFocus();
        paciente = p;
        daoAntecGen = new DAOAntecedentesGenerales();
        llenarCajas(p);
        CambiarEstadoCajas(false);
        this.setLocationRelativeTo(parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGenerales = new javax.swing.JPanel();
        pnlQuirurgicos = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtaQuirurgicos = new javax.swing.JTextArea();
        pnlToxicos = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtaToxicos = new javax.swing.JTextArea();
        pnlPersonales = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtaPersonales = new javax.swing.JTextArea();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Antecedentes Generales");

        pnlQuirurgicos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Quirúrgicos"));

        txtaQuirurgicos.setColumns(20);
        txtaQuirurgicos.setEditable(false);
        txtaQuirurgicos.setRows(5);
        txtaQuirurgicos.setNextFocusableComponent(txtaToxicos);
        txtaQuirurgicos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtaQuirurgicosKeyPressed(evt);
            }
        });
        jScrollPane6.setViewportView(txtaQuirurgicos);

        javax.swing.GroupLayout pnlQuirurgicosLayout = new javax.swing.GroupLayout(pnlQuirurgicos);
        pnlQuirurgicos.setLayout(pnlQuirurgicosLayout);
        pnlQuirurgicosLayout.setHorizontalGroup(
            pnlQuirurgicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuirurgicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlQuirurgicosLayout.setVerticalGroup(
            pnlQuirurgicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuirurgicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlToxicos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tóxicos"));

        txtaToxicos.setColumns(20);
        txtaToxicos.setEditable(false);
        txtaToxicos.setRows(5);
        txtaToxicos.setNextFocusableComponent(btnGuardar);
        txtaToxicos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtaToxicosKeyPressed(evt);
            }
        });
        jScrollPane7.setViewportView(txtaToxicos);

        javax.swing.GroupLayout pnlToxicosLayout = new javax.swing.GroupLayout(pnlToxicos);
        pnlToxicos.setLayout(pnlToxicosLayout);
        pnlToxicosLayout.setHorizontalGroup(
            pnlToxicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToxicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pnlToxicosLayout.setVerticalGroup(
            pnlToxicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToxicosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Personales"));

        txtaPersonales.setColumns(20);
        txtaPersonales.setEditable(false);
        txtaPersonales.setRows(5);
        txtaPersonales.setNextFocusableComponent(txtaQuirurgicos);
        txtaPersonales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtaPersonalesKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(txtaPersonales);

        javax.swing.GroupLayout pnlPersonalesLayout = new javax.swing.GroupLayout(pnlPersonales);
        pnlPersonales.setLayout(pnlPersonalesLayout);
        pnlPersonalesLayout.setHorizontalGroup(
            pnlPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pnlPersonalesLayout.setVerticalGroup(
            pnlPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlGeneralesLayout = new javax.swing.GroupLayout(pnlGenerales);
        pnlGenerales.setLayout(pnlGeneralesLayout);
        pnlGeneralesLayout.setHorizontalGroup(
            pnlGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneralesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlQuirurgicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlToxicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlGeneralesLayout.setVerticalGroup(
            pnlGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGeneralesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuirurgicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlToxicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        btnModificar.setText("Modificar");
        btnModificar.setNextFocusableComponent(btnVolver);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.setNextFocusableComponent(btnVolver);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.setNextFocusableComponent(btnModificar);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
    this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.txtaPersonales.requestFocus();
        CambiarEstadoCajas(true);
        this.btnGuardar.setEnabled(true);
        this.btnModificar.setEnabled(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        agen = new AntecedentesGenerales();
        agen.setAntecedentesPersonales(this.txtaPersonales.getText());
        agen.setAntecedentesQuirurgicos(this.txtaQuirurgicos.getText());
        agen.setAntecedentesToxicos(this.txtaToxicos.getText());
        paciente.setAntecGen(agen);
        if(daoAntecGen.actualizarAntecedente(agen,paciente.getDni()))
            MensajesValidaciones.mostrarInformacion(this, "Actualización Exitosa.");
        else
            MensajesValidaciones.mostrarError(this, "Actualización Fallida.");
        CambiarEstadoCajas(false);
        this.btnGuardar.setEnabled(false);
        this.btnModificar.setEnabled(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

private void txtaPersonalesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaPersonalesKeyPressed
    if(evt.getKeyChar() == KeyEvent.VK_TAB)
    {
        this.txtaPersonales.nextFocus();
        evt.consume();
    }
}//GEN-LAST:event_txtaPersonalesKeyPressed

private void txtaQuirurgicosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaQuirurgicosKeyPressed
    if(evt.getKeyChar() == KeyEvent.VK_TAB)
    {
        this.txtaQuirurgicos.nextFocus();
        evt.consume();
    }
}//GEN-LAST:event_txtaQuirurgicosKeyPressed

private void txtaToxicosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaToxicosKeyPressed
    if(evt.getKeyChar() == KeyEvent.VK_TAB)
    {
        this.txtaToxicos.nextFocus();
        evt.consume();
    }
}//GEN-LAST:event_txtaToxicosKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel pnlGenerales;
    private javax.swing.JPanel pnlPersonales;
    private javax.swing.JPanel pnlQuirurgicos;
    private javax.swing.JPanel pnlToxicos;
    private javax.swing.JTextArea txtaPersonales;
    private javax.swing.JTextArea txtaQuirurgicos;
    private javax.swing.JTextArea txtaToxicos;
    // End of variables declaration//GEN-END:variables

    private void llenarCajas(Paciente p) {
        this.txtaPersonales.setText(p.getAntecGen().getAntecedentesPersonales());
        this.txtaToxicos.setText(p.getAntecGen().getAntecedentesToxicos());
        this.txtaQuirurgicos.setText(p.getAntecGen().getAntecedentesQuirurgicos());
    }
    
    private void CambiarEstadoCajas(boolean accion)
    {
        this.txtaPersonales.setEditable(accion);
        this.txtaToxicos.setEditable(accion);
        this.txtaQuirurgicos.setEditable(accion);
    }
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/sistema.png"));
        return retValue;
    }
}