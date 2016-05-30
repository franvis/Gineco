/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ClasesBase.AntecedentesFamiliares;
import ClasesBase.AntecedentesGenerales;
import ClasesBase.AntecedentesGinecologicos;
import ClasesBase.Paciente;
import DAO.DAOAntecedentesFamiliares;
import DAO.DAOAntecedentesGenerales;
import DAO.DAOAntecedentesGinecologicos;
import DAO.DAOPaciente;

/**
 *
 * @author Fran
 */
public class HistoriaClinica extends javax.swing.JFrame {

    private Principal antecesor;
    private AntecedentesFamiliares af;
    private AntecedentesGenerales agen;
    private AntecedentesGinecologicos aginec;
    private ABMPacienteCompleto pacienteInterfaz;
    private DAOPaciente daoPaciente;
    private IPaciente iPaciente;
    private DAOAntecedentesFamiliares daoAntecFam;
    private DAOAntecedentesGinecologicos daoAntecGinec;
    private DAOAntecedentesGenerales daoAntecGen;
    private ABMConsultaCompleta consultaCompleta;
    private ABMConsultaGinecologica consultaGinecologica;
    private ABMConsultaObstetrica consultaObstetrica;
    private AntecFamiliares antecedentesFamiliares;
    private AntecGenerales antecedentesGenerales;
    private AntecGinecologicos antecedentesGinecologicos;
    private Paciente paciente;
    private boolean AntecFamModificado;
    private boolean AntecGenModificado;
    private boolean AntecGinecModificado;
     
    /**
     * Creates new form HistoriaClinica
     */
    public HistoriaClinica(Paciente p) {
        initComponents();
        AntecFamModificado = false;
        AntecGenModificado = false;
        AntecGinecModificado = false;
        daoPaciente = new DAOPaciente();
        daoAntecFam = new DAOAntecedentesFamiliares();
        daoAntecGen = new DAOAntecedentesGenerales();
        daoAntecGinec = new DAOAntecedentesGinecologicos();
        this.paciente = p;
        llenarCampos(paciente,0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDatosPersonales = new javax.swing.JPanel();
        lblstaticNombre = new javax.swing.JLabel();
        lblstaticApellido = new javax.swing.JLabel();
        lblstaticTelefono = new javax.swing.JLabel();
        lblstaticDni = new javax.swing.JLabel();
        lblstaticNumAfiliado = new javax.swing.JLabel();
        lblstaticObraSocial = new javax.swing.JLabel();
        lblstaticFechaNacimiento = new javax.swing.JLabel();
        lblNombrePaciente = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblNumeroAfiliado = new javax.swing.JLabel();
        lblObraSocial = new javax.swing.JLabel();
        pnlAntecedentes = new javax.swing.JPanel();
        btnGenerales = new javax.swing.JButton();
        btnGinecologicos = new javax.swing.JButton();
        btnFamiliares = new javax.swing.JButton();
        btnModificarPaciente = new javax.swing.JButton();
        lblstaticSangre = new javax.swing.JLabel();
        lblSangre = new javax.swing.JLabel();
        pnlConsultas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsultas = new javax.swing.JTable();
        btnVerConsulta = new javax.swing.JButton();
        btnNuevaConsulta1 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnNuevaCompleta = new javax.swing.JButton();
        btnNuevaGinecologica = new javax.swing.JButton();
        btnNuevaObstetrica = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 723, 598));
        setMinimumSize(new java.awt.Dimension(723, 598));

        pnlDatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Datos del Paciente", 0, 0, new java.awt.Font("Tahoma", 2, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        lblstaticNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblstaticNombre.setText("Nombre:");

        lblstaticApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblstaticApellido.setText("Apellidos:");

        lblstaticTelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblstaticTelefono.setText("Telefono:");

        lblstaticDni.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblstaticDni.setText("DNI:");

        lblstaticNumAfiliado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblstaticNumAfiliado.setText("Numero Afiliado:");

        lblstaticObraSocial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblstaticObraSocial.setText("Obra Social:");

        lblstaticFechaNacimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblstaticFechaNacimiento.setText("Fecha de Nacimiento:");

        lblNombrePaciente.setText("Jorge");

        lblApellido.setText("Suarez");

        lblTelefono.setText("423654");

        lblDni.setText("35953232");

        lblFechaNacimiento.setText("21/03/1991");

        lblNumeroAfiliado.setText("3-4534543-2");

        lblObraSocial.setText("OSPAC");

        pnlAntecedentes.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Antecedentes"));

        btnGenerales.setText("Generales");
        btnGenerales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneralesActionPerformed(evt);
            }
        });

        btnGinecologicos.setText("Ginecologicos");
        btnGinecologicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGinecologicosActionPerformed(evt);
            }
        });

        btnFamiliares.setText("Familiares");
        btnFamiliares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFamiliaresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAntecedentesLayout = new javax.swing.GroupLayout(pnlAntecedentes);
        pnlAntecedentes.setLayout(pnlAntecedentesLayout);
        pnlAntecedentesLayout.setHorizontalGroup(
            pnlAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAntecedentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGinecologicos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFamiliares, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAntecedentesLayout.setVerticalGroup(
            pnlAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAntecedentesLayout.createSequentialGroup()
                .addGroup(pnlAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerales)
                    .addComponent(btnGinecologicos)
                    .addComponent(btnFamiliares))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        btnModificarPaciente.setText("Modificar Paciente");
        btnModificarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPacienteActionPerformed(evt);
            }
        });

        lblstaticSangre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblstaticSangre.setText("Sangre:");

        lblSangre.setText("0 -");

        javax.swing.GroupLayout pnlDatosPersonalesLayout = new javax.swing.GroupLayout(pnlDatosPersonales);
        pnlDatosPersonales.setLayout(pnlDatosPersonalesLayout);
        pnlDatosPersonalesLayout.setHorizontalGroup(
            pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblstaticTelefono)
                            .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblstaticApellido)
                                .addComponent(lblstaticNombre)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblstaticFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblstaticDni, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblstaticSangre, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDni, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblstaticObraSocial)
                                    .addComponent(lblstaticNumAfiliado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblObraSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNumeroAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblSangre))
                        .addGap(25, 25, 25))
                    .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(btnModificarPaciente)
                        .addGap(68, 68, 68)
                        .addComponent(pnlAntecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlDatosPersonalesLayout.setVerticalGroup(
            pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblstaticNombre)
                        .addComponent(lblFechaNacimiento)
                        .addComponent(lblstaticObraSocial)
                        .addComponent(lblObraSocial))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombrePaciente)
                        .addComponent(lblstaticFechaNacimiento)))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstaticApellido)
                    .addComponent(lblstaticDni)
                    .addComponent(lblApellido)
                    .addComponent(lblDni)
                    .addComponent(lblstaticNumAfiliado)
                    .addComponent(lblNumeroAfiliado))
                .addGap(18, 18, 18)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblstaticTelefono)
                    .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTelefono)
                        .addComponent(lblSangre)
                        .addComponent(lblstaticSangre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(pnlDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAntecedentes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(btnModificarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pnlConsultas.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Consultas Anteriores"));

        tblConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Motivo", "Diagnostico", "Tipo de Consulta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblConsultas);

        btnVerConsulta.setText("Ver");

        btnNuevaConsulta1.setText("Eliminar");
        btnNuevaConsulta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaConsulta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultasLayout = new javax.swing.GroupLayout(pnlConsultas);
        pnlConsultas.setLayout(pnlConsultasLayout);
        pnlConsultasLayout.setHorizontalGroup(
            pnlConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
                    .addGroup(pnlConsultasLayout.createSequentialGroup()
                        .addComponent(btnVerConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevaConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlConsultasLayout.setVerticalGroup(
            pnlConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlConsultasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVerConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNuevaConsulta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnVolver.setText("Volver a Principal");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Nueva Consulta"));

        btnNuevaCompleta.setText("Completa");
        btnNuevaCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCompletaActionPerformed(evt);
            }
        });

        btnNuevaGinecologica.setText("Ginecologica");
        btnNuevaGinecologica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaGinecologicaActionPerformed(evt);
            }
        });

        btnNuevaObstetrica.setText("Obstetrica");
        btnNuevaObstetrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaObstetricaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevaCompleta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevaGinecologica, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevaObstetrica, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevaCompleta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaGinecologica, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaObstetrica, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaConsulta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaConsulta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevaConsulta1ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
    antecesor = new Principal();
    antecesor.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnModificarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPacienteActionPerformed
    paciente = daoPaciente.getPacienteCompleto(paciente.getDni());
    if(AntecFamModificado == false)
    {
        paciente.setAntecFam(daoAntecFam.getAntecedenteFamiliar(paciente.getDni()));
        AntecFamModificado = true;
    }
    
    if(AntecGenModificado == false)
    {
        paciente.setAntecGen(daoAntecGen.getAntecedenteGeneral(paciente.getDni()));
        AntecGenModificado = true;
    }
    
    if(AntecGinecModificado == false)
    {
        paciente.setAntecGinec(daoAntecGinec.getAntecedenteGinecologico(paciente.getDni()));
        AntecGinecModificado = true;
    }
    pacienteInterfaz = new ABMPacienteCompleto(this,true,2,this.paciente);
    pacienteInterfaz.setVisible(true);
//        iPaciente = new IPaciente(this, true);
//        iPaciente.setVisible(true);
    }//GEN-LAST:event_btnModificarPacienteActionPerformed

    private void btnNuevaCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCompletaActionPerformed
    consultaCompleta = new ABMConsultaCompleta(this,true);
    consultaCompleta.setVisible(true);
    }//GEN-LAST:event_btnNuevaCompletaActionPerformed

    private void btnNuevaGinecologicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaGinecologicaActionPerformed
     consultaGinecologica = new ABMConsultaGinecologica(this,true);
    consultaGinecologica.setVisible(true);
    }//GEN-LAST:event_btnNuevaGinecologicaActionPerformed

    private void btnNuevaObstetricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaObstetricaActionPerformed
    consultaObstetrica = new ABMConsultaObstetrica(this,true);
    consultaObstetrica.setVisible(true);
    }//GEN-LAST:event_btnNuevaObstetricaActionPerformed

    private void btnGeneralesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneralesActionPerformed
       if(!AntecGenModificado)
       {
            paciente.setAntecGen(daoAntecGen.getAntecedenteGeneral(paciente.getDni()));
            AntecGenModificado = true;
       }
       antecedentesGenerales = new AntecGenerales(this,true,paciente);
       antecedentesGenerales.setVisible(true);
    }//GEN-LAST:event_btnGeneralesActionPerformed

    private void btnGinecologicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGinecologicosActionPerformed
        if(!AntecGinecModificado)
        {
            paciente.setAntecGinec(daoAntecGinec.getAntecedenteGinecologico(paciente.getDni()));
            AntecGinecModificado = true;
        }
        antecedentesGinecologicos = new AntecGinecologicos(this,true,paciente);
        antecedentesGinecologicos.setVisible(true);
    }//GEN-LAST:event_btnGinecologicosActionPerformed

    private void btnFamiliaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFamiliaresActionPerformed
       if(!AntecFamModificado)
       {
        paciente.setAntecFam(daoAntecFam.getAntecedenteFamiliar(paciente.getDni()));
        AntecFamModificado = true;
       }
        antecedentesFamiliares = new AntecFamiliares(this,true,paciente);
        antecedentesFamiliares.setVisible(true);
        
    }//GEN-LAST:event_btnFamiliaresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFamiliares;
    private javax.swing.JButton btnGenerales;
    private javax.swing.JButton btnGinecologicos;
    private javax.swing.JButton btnModificarPaciente;
    private javax.swing.JButton btnNuevaCompleta;
    private javax.swing.JButton btnNuevaConsulta1;
    private javax.swing.JButton btnNuevaGinecologica;
    private javax.swing.JButton btnNuevaObstetrica;
    private javax.swing.JButton btnVerConsulta;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNombrePaciente;
    private javax.swing.JLabel lblNumeroAfiliado;
    private javax.swing.JLabel lblObraSocial;
    private javax.swing.JLabel lblSangre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblstaticApellido;
    private javax.swing.JLabel lblstaticDni;
    private javax.swing.JLabel lblstaticFechaNacimiento;
    private javax.swing.JLabel lblstaticNombre;
    private javax.swing.JLabel lblstaticNumAfiliado;
    private javax.swing.JLabel lblstaticObraSocial;
    private javax.swing.JLabel lblstaticSangre;
    private javax.swing.JLabel lblstaticTelefono;
    private javax.swing.JPanel pnlAntecedentes;
    private javax.swing.JPanel pnlConsultas;
    private javax.swing.JPanel pnlDatosPersonales;
    private javax.swing.JTable tblConsultas;
    // End of variables declaration//GEN-END:variables

    /**
     * Procedencia: 0 Principal, 1 DatosPaciente
     */
    public void llenarCampos(Paciente p,int procedencia) {
        String fecha;
        this.lblApellido.setText(p.getApellido());
        this.lblNombrePaciente.setText(p.getNombre());
        
        if(procedencia == 0)
        {
            fecha = p.getFechaNacimiento().substring(8,10)
                       +"/"+p.getFechaNacimiento().substring(5,7)
                       +"/"+p.getFechaNacimiento().substring(0,4);
            this.lblFechaNacimiento.setText(fecha);
        }
        else
            this.lblFechaNacimiento.setText(p.getFechaNacimiento());
        
        this.lblNumeroAfiliado.setText(p.getNumeroAfiliado());
        this.lblObraSocial.setText(p.getObraSocial().getNombre());
        this.lblTelefono.setText(p.getTelefono());
        this.lblDni.setText(p.getDni()+"");
        
        if(p.getFactor())
            this.lblSangre.setText(p.getGrupoSanguineo()+" +");   
        else
            this.lblSangre.setText(p.getGrupoSanguineo()+" -");
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

}
