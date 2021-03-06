/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Fran
 */
public class ABMConsultaGinecologica extends javax.swing.JDialog {

    /**
     * Creates new form ABMConsultaGinecologica
     */
    public ABMConsultaGinecologica(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        lblstaticTratamiento = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        txtfDiagnostico = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtaObservaciones = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtaTratamiento = new javax.swing.JTextArea();
        lblstaticFecha = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtaEstudiosComple = new javax.swing.JTextArea();
        lblstaticDiagnostico = new javax.swing.JLabel();
        btnVolverHC = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtaMotivo = new javax.swing.JTextArea();
        lblFecha = new javax.swing.JLabel();
        lblstaticEstudiosComple = new javax.swing.JLabel();
        lblstaticConsObserv = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        lblstaticMotivo = new javax.swing.JLabel();
        pnlGinecologico = new javax.swing.JPanel();
        lblstaticMamas = new javax.swing.JLabel();
        lblstaticGenito = new javax.swing.JLabel();
        lblstaticBethesda = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaMamas = new javax.swing.JTextArea();
        cmbBethesda = new javax.swing.JComboBox();
        lblstaticPap = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtaPapYColpo = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaGenitoUrinario = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblstaticTratamiento.setText("Tratamiento:");

        btnSalir.setText("Salir");

        txtaObservaciones.setColumns(20);
        txtaObservaciones.setLineWrap(true);
        txtaObservaciones.setRows(2);
        jScrollPane8.setViewportView(txtaObservaciones);

        txtaTratamiento.setColumns(20);
        txtaTratamiento.setLineWrap(true);
        txtaTratamiento.setRows(2);
        jScrollPane7.setViewportView(txtaTratamiento);

        lblstaticFecha.setText("Fecha:");

        txtaEstudiosComple.setColumns(20);
        txtaEstudiosComple.setLineWrap(true);
        txtaEstudiosComple.setRows(2);
        jScrollPane10.setViewportView(txtaEstudiosComple);

        lblstaticDiagnostico.setText("Diagnostico:");

        btnVolverHC.setText("Volver a la HC");
        btnVolverHC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverHCActionPerformed(evt);
            }
        });

        txtaMotivo.setColumns(20);
        txtaMotivo.setLineWrap(true);
        txtaMotivo.setRows(2);
        jScrollPane9.setViewportView(txtaMotivo);

        lblFecha.setText("FechaDeHoy");

        lblstaticEstudiosComple.setText("Estudios Complementarios:");

        lblstaticConsObserv.setText("Observaciones:");

        btnGuardar.setText("Guardar");

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);

        lblstaticMotivo.setText("Motivo:");

        pnlGinecologico.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Examenes"));

        lblstaticMamas.setText("Mamas:");

        lblstaticGenito.setText("Genitourinario:");

        lblstaticBethesda.setText("Bethesda:");

        txtaMamas.setColumns(20);
        txtaMamas.setLineWrap(true);
        txtaMamas.setRows(2);
        txtaMamas.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtaMamas);

        cmbBethesda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "I", "II", "III", "IV", "V" }));

        lblstaticPap.setText("Papanicolau y Colposcopia:");

        txtaPapYColpo.setColumns(20);
        txtaPapYColpo.setLineWrap(true);
        txtaPapYColpo.setRows(5);
        txtaPapYColpo.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtaPapYColpo);

        txtaGenitoUrinario.setColumns(20);
        txtaGenitoUrinario.setLineWrap(true);
        txtaGenitoUrinario.setRows(5);
        txtaGenitoUrinario.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtaGenitoUrinario);

        javax.swing.GroupLayout pnlGinecologicoLayout = new javax.swing.GroupLayout(pnlGinecologico);
        pnlGinecologico.setLayout(pnlGinecologicoLayout);
        pnlGinecologicoLayout.setHorizontalGroup(
            pnlGinecologicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGinecologicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGinecologicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .addGroup(pnlGinecologicoLayout.createSequentialGroup()
                        .addGroup(pnlGinecologicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblstaticMamas)
                            .addComponent(lblstaticGenito)
                            .addGroup(pnlGinecologicoLayout.createSequentialGroup()
                                .addComponent(lblstaticBethesda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbBethesda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblstaticPap))
                        .addGap(0, 342, Short.MAX_VALUE))
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        pnlGinecologicoLayout.setVerticalGroup(
            pnlGinecologicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGinecologicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblstaticMamas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblstaticGenito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pnlGinecologicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstaticBethesda)
                    .addComponent(cmbBethesda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblstaticPap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblstaticFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFecha))
                    .addComponent(lblstaticDiagnostico)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnGuardar)
                            .addGap(18, 18, 18)
                            .addComponent(btnModificar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVolverHC)
                            .addGap(18, 18, 18)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblstaticMotivo)
                                .addComponent(lblstaticTratamiento)
                                .addComponent(lblstaticEstudiosComple)
                                .addComponent(lblstaticConsObserv)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtfDiagnostico, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane9)))
                            .addGap(18, 18, 18)
                            .addComponent(pnlGinecologico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstaticFecha)
                    .addComponent(lblFecha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblstaticMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(lblstaticTratamiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lblstaticEstudiosComple)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(lblstaticConsObserv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(lblstaticDiagnostico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlGinecologico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnVolverHC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverHCActionPerformed
        this.dispose();
//        HC.setVisible(true);
    }//GEN-LAST:event_btnVolverHCActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolverHC;
    private javax.swing.JComboBox cmbBethesda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblstaticBethesda;
    private javax.swing.JLabel lblstaticConsObserv;
    private javax.swing.JLabel lblstaticDiagnostico;
    private javax.swing.JLabel lblstaticEstudiosComple;
    private javax.swing.JLabel lblstaticFecha;
    private javax.swing.JLabel lblstaticGenito;
    private javax.swing.JLabel lblstaticMamas;
    private javax.swing.JLabel lblstaticMotivo;
    private javax.swing.JLabel lblstaticPap;
    private javax.swing.JLabel lblstaticTratamiento;
    private javax.swing.JPanel pnlGinecologico;
    private javax.swing.JTextArea txtaEstudiosComple;
    private javax.swing.JTextArea txtaGenitoUrinario;
    private javax.swing.JTextArea txtaMamas;
    private javax.swing.JTextArea txtaMotivo;
    private javax.swing.JTextArea txtaObservaciones;
    private javax.swing.JTextArea txtaPapYColpo;
    private javax.swing.JTextArea txtaTratamiento;
    private javax.swing.JTextField txtfDiagnostico;
    // End of variables declaration//GEN-END:variables
}
