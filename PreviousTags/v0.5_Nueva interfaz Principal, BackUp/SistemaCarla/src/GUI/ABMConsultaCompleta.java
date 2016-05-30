/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ClasesBase.Consulta;
import ClasesBase.ExamenGinecologico;
import ClasesBase.ExamenObstetrico;
import ClasesBase.MensajesValidaciones;
import DAO.DAOConsulta;
import DAO.DAOExamenGinecologico;
import DAO.DAOExamenObstetrico;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Fran
 */
public class ABMConsultaCompleta extends javax.swing.JDialog {
    private HistoriaClinica HC;
    private ExamenGinecologico eGinec;
    private ExamenObstetrico eObste;
    private DAOConsulta daoConsulta;
    private DAOExamenGinecologico daoExamGinec;
    private DAOExamenObstetrico daoExamObste;
    private Consulta cons;
    private Calendar c;
    private String dia;
    private String mes;
    private String año;
    private int tipoConsulta;//0 Obstetrica , 1 Ginecologica y 2 Completa
    private long dni;
    /**
     * Creates new form ABMConsultaCompleta
     */
    public ABMConsultaCompleta(java.awt.Frame parent, boolean modal,int tipoConsulta,long dni) {
        super(parent, modal);
        initComponents();
        eGinec = new ExamenGinecologico();
        eObste = new ExamenObstetrico();
        daoConsulta = new DAOConsulta();
        daoExamGinec = new DAOExamenGinecologico();
        daoExamObste = new DAOExamenObstetrico();
        this.lblIMC.setText("");
        HC = (HistoriaClinica)parent;
        this.dni = dni;
        this.tipoConsulta = tipoConsulta;
        c = Calendar.getInstance();
        dia = c.get(Calendar.DAY_OF_MONTH) +"";
        mes = c.get(Calendar.MONTH)+1+"";
        año = c.get(Calendar.YEAR)+"";
        this.lblFecha.setText(dia+"/"+mes+"/"+año);
        if(tipoConsulta != 2)
        {
            tpaneExamenes.remove(tipoConsulta);
        }
            
    }
    
    public ABMConsultaCompleta(java.awt.Frame parent, boolean modal,int tipoConsulta,long dni,Consulta con) {
        super(parent, modal);
        initComponents();
        llenarCajas(con);
        eGinec = new ExamenGinecologico();
        eObste = new ExamenObstetrico();
        daoConsulta = new DAOConsulta();
        daoExamGinec = new DAOExamenGinecologico();
        daoExamObste = new DAOExamenObstetrico();
        this.lblIMC.setText("");
        HC = (HistoriaClinica)parent;
        this.dni = dni;
        this.tipoConsulta = tipoConsulta;
        c = Calendar.getInstance();
        dia = c.get(Calendar.DAY_OF_MONTH) +"";
        mes = c.get(Calendar.MONTH)+1+"";
        año = c.get(Calendar.YEAR)+"";
        this.lblFecha.setText(dia+"/"+mes+"/"+año);
        if(tipoConsulta != 2)
        {
            tpaneExamenes.remove(tipoConsulta);
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

        btngrpMAF = new javax.swing.ButtonGroup();
        lblstaticFecha = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        btnVolverHC = new javax.swing.JButton();
        tpaneExamenes = new javax.swing.JTabbedPane();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        txtaGenitoUrinario = new javax.swing.JTextArea();
        pnlObstetrico = new javax.swing.JPanel();
        rbtnMafNo = new javax.swing.JRadioButton();
        rbtnMafSi = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaObstetObservaciones = new javax.swing.JTextArea();
        lblstaticObstetricoObserv = new javax.swing.JLabel();
        lblstaticAU = new javax.swing.JLabel();
        lblstaticTalla = new javax.swing.JLabel();
        lblstaticPeso = new javax.swing.JLabel();
        lblstaticLCF = new javax.swing.JLabel();
        lblstaticMAF = new javax.swing.JLabel();
        txtfLCF = new javax.swing.JTextField();
        txtfPeso = new javax.swing.JTextField();
        txtfTalla = new javax.swing.JTextField();
        lblstaticPA = new javax.swing.JLabel();
        txtfPresionArterial = new javax.swing.JTextField();
        txtfAlturaUterina = new javax.swing.JTextField();
        lblstaticUnidadPA = new javax.swing.JLabel();
        lblstaticUnidadAU = new javax.swing.JLabel();
        lblstaticUnidadTalla = new javax.swing.JLabel();
        lblstaticUnidadPeso = new javax.swing.JLabel();
        lblstaticUnidadLCF = new javax.swing.JLabel();
        lblstaticIMC = new javax.swing.JLabel();
        lblIMC = new javax.swing.JLabel();
        lblstaticTratamiento = new javax.swing.JLabel();
        lblstaticMotivo = new javax.swing.JLabel();
        lblstaticEstudiosComple = new javax.swing.JLabel();
        lblstaticConsObserv = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtaTratamiento = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtaObservaciones = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtaMotivo = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtaEstudiosComple = new javax.swing.JTextArea();
        lblstaticDiagnostico = new javax.swing.JLabel();
        txtfDiagnostico = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblstaticFecha.setText("Fecha:");

        lblFecha.setText("FechaDeHoy");

        btnVolverHC.setText("Volver a la HC");
        btnVolverHC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverHCActionPerformed(evt);
            }
        });

        tpaneExamenes.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Examenes"));

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
        jScrollPane4.setViewportView(txtaGenitoUrinario);

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
                    .addComponent(jScrollPane4))
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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(pnlGinecologicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstaticBethesda)
                    .addComponent(cmbBethesda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblstaticPap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tpaneExamenes.addTab("Ginecologico", pnlGinecologico);

        btngrpMAF.add(rbtnMafNo);
        rbtnMafNo.setText("NO");

        btngrpMAF.add(rbtnMafSi);
        rbtnMafSi.setText("SI");

        txtaObstetObservaciones.setColumns(20);
        txtaObstetObservaciones.setRows(5);
        jScrollPane1.setViewportView(txtaObstetObservaciones);

        lblstaticObstetricoObserv.setText("Observaciones:");

        lblstaticAU.setText("Altura Uterina:");

        lblstaticTalla.setText("Talla:");

        lblstaticPeso.setText("Peso:");

        lblstaticLCF.setText("LCF:");

        lblstaticMAF.setText("MAF:");

        txtfLCF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfLCFKeyTyped(evt);
            }
        });

        txtfPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfPesoKeyTyped(evt);
            }
        });

        txtfTalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfTallaKeyTyped(evt);
            }
        });

        lblstaticPA.setText("Presion Arterial:");

        txtfPresionArterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfPresionArterialKeyTyped(evt);
            }
        });

        txtfAlturaUterina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfAlturaUterinaKeyTyped(evt);
            }
        });

        lblstaticUnidadPA.setText("mm/hg");

        lblstaticUnidadAU.setText("cm");

        lblstaticUnidadTalla.setText("cm");

        lblstaticUnidadPeso.setText("Kg");

        lblstaticUnidadLCF.setText("lpm");

        lblstaticIMC.setText("IMC:");

        lblIMC.setText("Aca va el imc");

        javax.swing.GroupLayout pnlObstetricoLayout = new javax.swing.GroupLayout(pnlObstetrico);
        pnlObstetrico.setLayout(pnlObstetricoLayout);
        pnlObstetricoLayout.setHorizontalGroup(
            pnlObstetricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlObstetricoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlObstetricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlObstetricoLayout.createSequentialGroup()
                        .addGroup(pnlObstetricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblstaticTalla)
                            .addComponent(lblstaticPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblstaticIMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlObstetricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtfTalla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(txtfPeso)
                            .addComponent(lblIMC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlObstetricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblstaticUnidadTalla)
                            .addComponent(lblstaticUnidadPeso))
                        .addGap(32, 32, 32)
                        .addGroup(pnlObstetricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlObstetricoLayout.createSequentialGroup()
                                .addGroup(pnlObstetricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblstaticPA)
                                    .addComponent(lblstaticMAF)
                                    .addComponent(lblstaticLCF))
                                .addGap(18, 18, 18))
                            .addGroup(pnlObstetricoLayout.createSequentialGroup()
                                .addComponent(lblstaticAU)
                                .addGap(24, 24, 24)))
                        .addGroup(pnlObstetricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfPresionArterial)
                            .addComponent(txtfLCF)
                            .addGroup(pnlObstetricoLayout.createSequentialGroup()
                                .addComponent(rbtnMafSi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtnMafNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtfAlturaUterina))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlObstetricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblstaticUnidadPA)
                            .addComponent(lblstaticUnidadAU)
                            .addComponent(lblstaticUnidadLCF)))
                    .addComponent(lblstaticObstetricoObserv)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnlObstetricoLayout.setVerticalGroup(
            pnlObstetricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlObstetricoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlObstetricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstaticTalla)
                    .addComponent(txtfTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstaticAU)
                    .addComponent(txtfAlturaUterina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstaticUnidadAU)
                    .addComponent(lblstaticUnidadTalla))
                .addGap(18, 18, 18)
                .addGroup(pnlObstetricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstaticPeso)
                    .addComponent(txtfPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstaticPA)
                    .addComponent(txtfPresionArterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstaticUnidadPA)
                    .addComponent(lblstaticUnidadPeso))
                .addGap(21, 21, 21)
                .addGroup(pnlObstetricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstaticLCF)
                    .addComponent(txtfLCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstaticUnidadLCF)
                    .addComponent(lblstaticIMC)
                    .addComponent(lblIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlObstetricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnMafSi)
                    .addComponent(rbtnMafNo)
                    .addComponent(lblstaticMAF))
                .addGap(18, 18, 18)
                .addComponent(lblstaticObstetricoObserv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        tpaneExamenes.addTab("Obstetrico", pnlObstetrico);

        lblstaticTratamiento.setText("Tratamiento:");

        lblstaticMotivo.setText("Motivo:");

        lblstaticEstudiosComple.setText("Estudios Complementarios:");

        lblstaticConsObserv.setText("Observaciones:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);

        txtaTratamiento.setColumns(20);
        txtaTratamiento.setLineWrap(true);
        txtaTratamiento.setRows(2);
        jScrollPane7.setViewportView(txtaTratamiento);

        txtaObservaciones.setColumns(20);
        txtaObservaciones.setLineWrap(true);
        txtaObservaciones.setRows(2);
        jScrollPane8.setViewportView(txtaObservaciones);

        txtaMotivo.setColumns(20);
        txtaMotivo.setLineWrap(true);
        txtaMotivo.setRows(2);
        jScrollPane9.setViewportView(txtaMotivo);

        txtaEstudiosComple.setColumns(20);
        txtaEstudiosComple.setLineWrap(true);
        txtaEstudiosComple.setRows(2);
        jScrollPane10.setViewportView(txtaEstudiosComple);

        lblstaticDiagnostico.setText("Diagnostico:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVolverHC))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblstaticFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFecha))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblstaticMotivo)
                                    .addComponent(lblstaticTratamiento)
                                    .addComponent(lblstaticEstudiosComple)
                                    .addComponent(lblstaticDiagnostico)
                                    .addComponent(lblstaticConsObserv)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtfDiagnostico, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane9)))
                                .addGap(18, 18, 18)
                                .addComponent(tpaneExamenes, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tpaneExamenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblstaticFecha)
                            .addComponent(lblFecha))
                        .addGap(18, 18, 18)
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
                        .addComponent(txtfDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolverHC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverHCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverHCActionPerformed
        this.dispose();
        HC.setVisible(true);
    }//GEN-LAST:event_btnVolverHCActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    String error = comprobarObligatorias(tipoConsulta);
    if(!error.isEmpty())
        {
            MensajesValidaciones.mostrarError(this,"Debe completar los siguientes datos obligatorios: \n"+error);
            return;
        }   
    
    generarConsultaMedica();
    
    if(daoConsulta.RegistrarConsulta(cons, dni,tipoConsulta))
    {
    MensajesValidaciones.mostrarInformacion(this, "Registro exitoso");
    }
    else
    {
    MensajesValidaciones.mostrarError(this, "Registro fallido");
    }
    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtfTallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfTallaKeyTyped
        MensajesValidaciones.negarLetras(evt, this);
        float talla,peso;
        String textoTalla="";
        String textoPeso = this.txtfPeso.getText();
        
        int i = this.txtfTalla.getText().length();
        if(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE || evt.getKeyChar() == KeyEvent.VK_DELETE){
            if(i > 1)
                textoTalla = this.txtfTalla.getText().substring(0, this.txtfTalla.getText().length() - 1);
            else if(i == 1)
                textoTalla = this.txtfTalla.getText();
            else if(i == 0){
                this.lblIMC.setText("");   
                return;
            }
        }
        else
        {
        textoTalla = this.txtfTalla.getText() + evt.getKeyChar();
        }
        talla = Float.parseFloat(textoTalla)/100;
        if(!textoPeso.isEmpty())
        {
        peso = Float.parseFloat(textoPeso);
        float resultadoIMC = peso/(talla*talla);
        lblIMC.setText(resultadoIMC+"");
        }
//        else
//        {
//        lblIMC.setText("");
//        }
        
    }//GEN-LAST:event_txtfTallaKeyTyped

    private void txtfPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfPesoKeyTyped
        MensajesValidaciones.negarLetras(evt, this);
        float talla,peso;
        String textoPeso = "";
        String textoTalla = this.txtfTalla.getText();
        
         int i = this.txtfPeso.getText().length();
        if(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE || evt.getKeyChar() == KeyEvent.VK_DELETE){
            if(i > 1)
                textoPeso = this.txtfPeso.getText().substring(0, this.txtfTalla.getText().length() - 1);
            else if(i == 1)
                textoPeso = this.txtfPeso.getText();
            else if(i == 0){
                this.lblIMC.setText("");   
                return;
            }
        }
        else
        {
        textoPeso = this.txtfPeso.getText() + evt.getKeyChar();
        }
        peso = Float.parseFloat(textoPeso);
        if(!textoTalla.isEmpty())
        {
        talla = Float.parseFloat(textoTalla)/100;
        float resultadoIMC = peso/(talla*talla);
        lblIMC.setText(resultadoIMC+"");
        }
        else
        {
        lblIMC.setText("");
        }
    }//GEN-LAST:event_txtfPesoKeyTyped

    private void txtfAlturaUterinaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfAlturaUterinaKeyTyped
        MensajesValidaciones.negarLetras(evt, this);
    }//GEN-LAST:event_txtfAlturaUterinaKeyTyped

    private void txtfPresionArterialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfPresionArterialKeyTyped
        MensajesValidaciones.negarLetras(evt, this);
    }//GEN-LAST:event_txtfPresionArterialKeyTyped

    private void txtfLCFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfLCFKeyTyped
        MensajesValidaciones.negarLetras(evt, this);
    }//GEN-LAST:event_txtfLCFKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolverHC;
    private javax.swing.ButtonGroup btngrpMAF;
    private javax.swing.JComboBox cmbBethesda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIMC;
    private javax.swing.JLabel lblstaticAU;
    private javax.swing.JLabel lblstaticBethesda;
    private javax.swing.JLabel lblstaticConsObserv;
    private javax.swing.JLabel lblstaticDiagnostico;
    private javax.swing.JLabel lblstaticEstudiosComple;
    private javax.swing.JLabel lblstaticFecha;
    private javax.swing.JLabel lblstaticGenito;
    private javax.swing.JLabel lblstaticIMC;
    private javax.swing.JLabel lblstaticLCF;
    private javax.swing.JLabel lblstaticMAF;
    private javax.swing.JLabel lblstaticMamas;
    private javax.swing.JLabel lblstaticMotivo;
    private javax.swing.JLabel lblstaticObstetricoObserv;
    private javax.swing.JLabel lblstaticPA;
    private javax.swing.JLabel lblstaticPap;
    private javax.swing.JLabel lblstaticPeso;
    private javax.swing.JLabel lblstaticTalla;
    private javax.swing.JLabel lblstaticTratamiento;
    private javax.swing.JLabel lblstaticUnidadAU;
    private javax.swing.JLabel lblstaticUnidadLCF;
    private javax.swing.JLabel lblstaticUnidadPA;
    private javax.swing.JLabel lblstaticUnidadPeso;
    private javax.swing.JLabel lblstaticUnidadTalla;
    private javax.swing.JPanel pnlGinecologico;
    private javax.swing.JPanel pnlObstetrico;
    private javax.swing.JRadioButton rbtnMafNo;
    private javax.swing.JRadioButton rbtnMafSi;
    private javax.swing.JTabbedPane tpaneExamenes;
    private javax.swing.JTextArea txtaEstudiosComple;
    private javax.swing.JTextArea txtaGenitoUrinario;
    private javax.swing.JTextArea txtaMamas;
    private javax.swing.JTextArea txtaMotivo;
    private javax.swing.JTextArea txtaObservaciones;
    private javax.swing.JTextArea txtaObstetObservaciones;
    private javax.swing.JTextArea txtaPapYColpo;
    private javax.swing.JTextArea txtaTratamiento;
    private javax.swing.JTextField txtfAlturaUterina;
    private javax.swing.JTextField txtfDiagnostico;
    private javax.swing.JTextField txtfLCF;
    private javax.swing.JTextField txtfPeso;
    private javax.swing.JTextField txtfPresionArterial;
    private javax.swing.JTextField txtfTalla;
    // End of variables declaration//GEN-END:variables

    private void llenarCajas(Consulta c) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private String comprobarObligatorias(int tipoConsulta) {//estudios complementarios y observaciones no son obligatorios
        String incompletas="";
        
        if(this.txtaMotivo.getText().isEmpty())
            incompletas+="Motivo \n";
        
        if(this.txtaTratamiento.getText().isEmpty())
            incompletas+="Tratamiento \n";
        
        if(this.txtfDiagnostico.getText().isEmpty())
            incompletas+="Diagnostico \n";
        
        if(tipoConsulta == 2 || tipoConsulta == 1)
        {
            if(this.txtaMamas.getText().isEmpty())
                incompletas+="Mamas \n";
        
            if(this.txtaGenitoUrinario.getText().isEmpty())
                incompletas += "Genitourinario \n";
        
            if(this.txtaPapYColpo.getText().isEmpty())
                incompletas += "Papanicolau y Colposcopia \n";
        }
        
        if(tipoConsulta == 2 || tipoConsulta == 0)
        {
            if(this.txtfTalla.getText().isEmpty())
                incompletas+="Talla \n";
        
            if(this.txtfPeso.getText().isEmpty())
                incompletas += "Peso \n";
        
            if(this.txtfAlturaUterina.getText().isEmpty())
                incompletas += "Altura Uterina \n";
            
            if(this.txtfPresionArterial.getText().isEmpty())
                incompletas += "Presion Arterial \n";
            
            if(this.txtfLCF.getText().isEmpty())
                incompletas += "LCF \n";
            
            if(this.rbtnMafNo.isSelected() == false && this.rbtnMafSi.isSelected() == false)
                incompletas += "MAF";        
        
        }
        return incompletas;

    }

    private void generarConsultaMedica() {
        cons = new Consulta();
        cons.setDiagnostico(this.txtfDiagnostico.getText());
        cons.setEstudiosComplementarios(this.txtaEstudiosComple.getText());
        cons.setFecha(this.lblFecha.getText());
        cons.setMotivo(this.txtaMotivo.getText());
        cons.setObservaciones(this.txtaObservaciones.getText());
        switch(tipoConsulta)
        {
            case 0 : cons.setTipoConsulta("Obstetrica");  
                     break;
            case 1 : cons.setTipoConsulta("Ginecologica");
                     break;
            case 2 : cons.setTipoConsulta("Completa");
                     break;
        }
        cons.setTratamiento(this.txtaTratamiento.getText());
        
        generarExamenes();
        
        cons.setExamenGinecologico(eGinec);
        cons.setExamenObstetrico(eObste);
        }

    private void generarExamenes() {
        eGinec = new ExamenGinecologico();
        eObste = new ExamenObstetrico();
        
        if(tipoConsulta == 1 || tipoConsulta == 2){
        eGinec.setBethesda(this.cmbBethesda.getSelectedItem().toString());
        eGinec.setGenitourinario(this.txtaGenitoUrinario.getText());
        eGinec.setMamas(this.txtaMamas.getText());
        eGinec.setPapycolposcopia(this.txtaPapYColpo.getText());
        }
        
        if(tipoConsulta == 0 || tipoConsulta == 2){
        eObste.setAu(Integer.parseInt(this.txtfAlturaUterina.getText()));
        eObste.setImc(Float.parseFloat(this.lblIMC.getText()));
        eObste.setLcf(Integer.parseInt(this.txtfLCF.getText()));
        if(rbtnMafNo.isSelected())
            eObste.setMaf("NO");
        else
            eObste.setMaf("SI");
        eObste.setObservaciones(this.txtaObstetObservaciones.getText());
        eObste.setPa(Integer.parseInt(this.txtfPresionArterial.getText()));
        eObste.setPeso(Integer.parseInt(this.txtfPeso.getText()));
        eObste.setTalla(Integer.parseInt(this.txtfTalla.getText()));
    }
    }
    }

