/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ClasesBase.AntecedentesGinecologicos;
import ClasesBase.MensajesValidaciones;
import ClasesBase.Paciente;
import DAO.DAOAntecedentesGinecologicos;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Fran
 */
public class AntecGinecologicos extends javax.swing.JDialog {
    DAOAntecedentesGinecologicos daoAntecGinec;
    AntecedentesGinecologicos aginec;
    Paciente paciente;
    /**
     * Creates new form AntecGinecologicos
     */
    public AntecGinecologicos(java.awt.Frame parent, boolean modal,Paciente p) {
        super(parent, modal);
        initComponents();
        paciente = p;
        daoAntecGinec = new DAOAntecedentesGinecologicos();
        CambiarEstadoCajas(false);
        llenarCajas(p);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGinecologicos = new javax.swing.JPanel();
        lblstaticMenarca = new javax.swing.JLabel();
        lblstaticTelarca = new javax.swing.JLabel();
        lblstaticCiclosMens = new javax.swing.JLabel();
        lblstaticGestaciones = new javax.swing.JLabel();
        lblstaticDispareunia = new javax.swing.JLabel();
        lblstaticMenopausia = new javax.swing.JLabel();
        lblstaticSDPM = new javax.swing.JLabel();
        lblstaticDismenorrea = new javax.swing.JLabel();
        lblstaticPartos = new javax.swing.JLabel();
        lblstaticAnticoncep = new javax.swing.JLabel();
        lblstaticGinecObserv = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaGinecObserv = new javax.swing.JTextArea();
        txtfMenopausia = new javax.swing.JTextField();
        txtfTelarca = new javax.swing.JTextField();
        txtfMenarca = new javax.swing.JTextField();
        txtfAbortos = new javax.swing.JTextField();
        txtfAnticonceptivos = new javax.swing.JTextField();
        txtfCesareas = new javax.swing.JTextField();
        lblstaticSeparador2 = new javax.swing.JLabel();
        txtfPartos = new javax.swing.JTextField();
        lblstaticSeparador3 = new javax.swing.JLabel();
        txtfGestaciones = new javax.swing.JTextField();
        lblstaticGinecObserv1 = new javax.swing.JLabel();
        lblstaticSeparador4 = new javax.swing.JLabel();
        txtfVivos = new javax.swing.JTextField();
        txtfMuertos = new javax.swing.JTextField();
        txtfDuracionMenstrual = new javax.swing.JTextField();
        txtfPeriodoMenstrual = new javax.swing.JTextField();
        lblstaticSeparador5 = new javax.swing.JLabel();
        chkDispareunia = new javax.swing.JCheckBox();
        chkDismenorrea = new javax.swing.JCheckBox();
        chkSdpm = new javax.swing.JCheckBox();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblstaticMenarca.setText("Menarca:");

        lblstaticTelarca.setText("Telarca:");

        lblstaticCiclosMens.setText("Ciclos Menstruales:");

        lblstaticGestaciones.setText("Gestaciones/Abortos:");

        lblstaticDispareunia.setText("Dispareunia:");

        lblstaticMenopausia.setText("Menopausia:");

        lblstaticSDPM.setText("SDPM:");

        lblstaticDismenorrea.setText("Dismenorrea:");

        lblstaticPartos.setText("Partos/Cesareas:");

        lblstaticAnticoncep.setText("Anticonceptivos:");

        lblstaticGinecObserv.setText("Vivos/Muertos:");

        txtaGinecObserv.setColumns(20);
        txtaGinecObserv.setEditable(false);
        txtaGinecObserv.setRows(5);
        jScrollPane2.setViewportView(txtaGinecObserv);

        txtfMenopausia.setEditable(false);
        txtfMenopausia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfMenopausiaKeyTyped(evt);
            }
        });

        txtfTelarca.setEditable(false);
        txtfTelarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfTelarcaKeyTyped(evt);
            }
        });

        txtfMenarca.setEditable(false);
        txtfMenarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfMenarcaKeyTyped(evt);
            }
        });

        txtfAbortos.setEditable(false);
        txtfAbortos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfAbortosKeyTyped(evt);
            }
        });

        txtfAnticonceptivos.setEditable(false);
        txtfAnticonceptivos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfAnticonceptivosKeyTyped(evt);
            }
        });

        txtfCesareas.setEditable(false);
        txtfCesareas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfCesareasKeyTyped(evt);
            }
        });

        lblstaticSeparador2.setText("/");

        txtfPartos.setEditable(false);
        txtfPartos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfPartosKeyTyped(evt);
            }
        });

        lblstaticSeparador3.setText("/");

        txtfGestaciones.setEditable(false);
        txtfGestaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfGestacionesKeyTyped(evt);
            }
        });

        lblstaticGinecObserv1.setText("Observaciones:");

        lblstaticSeparador4.setText("/");

        txtfVivos.setEditable(false);
        txtfVivos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfVivosKeyTyped(evt);
            }
        });

        txtfMuertos.setEditable(false);
        txtfMuertos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfMuertosKeyTyped(evt);
            }
        });

        txtfDuracionMenstrual.setEditable(false);
        txtfDuracionMenstrual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfDuracionMenstrualKeyTyped(evt);
            }
        });

        txtfPeriodoMenstrual.setEditable(false);
        txtfPeriodoMenstrual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfPeriodoMenstrualKeyTyped(evt);
            }
        });

        lblstaticSeparador5.setText("/");

        chkDispareunia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        chkDismenorrea.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        chkSdpm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout pnlGinecologicosLayout = new javax.swing.GroupLayout(pnlGinecologicos);
        pnlGinecologicos.setLayout(pnlGinecologicosLayout);
        pnlGinecologicosLayout.setHorizontalGroup(
            pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGinecologicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(lblstaticGinecObserv1)
                    .addGroup(pnlGinecologicosLayout.createSequentialGroup()
                        .addGroup(pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblstaticGestaciones)
                            .addComponent(lblstaticCiclosMens)
                            .addComponent(lblstaticMenopausia)
                            .addComponent(lblstaticTelarca)
                            .addComponent(lblstaticMenarca)
                            .addComponent(lblstaticGinecObserv))
                        .addGap(18, 18, 18)
                        .addGroup(pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlGinecologicosLayout.createSequentialGroup()
                                .addGroup(pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlGinecologicosLayout.createSequentialGroup()
                                        .addComponent(txtfGestaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblstaticSeparador3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtfAbortos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtfMenarca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfMenopausia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfTelarca, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlGinecologicosLayout.createSequentialGroup()
                                        .addComponent(txtfDuracionMenstrual, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblstaticSeparador5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtfPeriodoMenstrual, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addGroup(pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblstaticAnticoncep)
                                    .addComponent(lblstaticPartos)
                                    .addGroup(pnlGinecologicosLayout.createSequentialGroup()
                                        .addGroup(pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblstaticDismenorrea)
                                            .addComponent(lblstaticSDPM)
                                            .addComponent(lblstaticDispareunia))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(chkDispareunia, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkDismenorrea, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkSdpm, javax.swing.GroupLayout.Alignment.LEADING)))))
                            .addGroup(pnlGinecologicosLayout.createSequentialGroup()
                                .addComponent(txtfVivos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblstaticSeparador4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfMuertos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtfAnticonceptivos)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlGinecologicosLayout.createSequentialGroup()
                                .addComponent(txtfPartos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblstaticSeparador2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfCesareas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGinecologicosLayout.setVerticalGroup(
            pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGinecologicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlGinecologicosLayout.createSequentialGroup()
                        .addGroup(pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblstaticMenarca)
                            .addComponent(txtfMenarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstaticDispareunia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfTelarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstaticTelarca)
                            .addComponent(lblstaticDismenorrea))
                        .addGap(12, 12, 12)
                        .addGroup(pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblstaticMenopausia)
                            .addComponent(txtfMenopausia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblstaticSDPM)))
                    .addGroup(pnlGinecologicosLayout.createSequentialGroup()
                        .addComponent(chkDispareunia)
                        .addGap(10, 10, 10)
                        .addComponent(chkDismenorrea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkSdpm)))
                .addGap(15, 15, 15)
                .addGroup(pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtfPeriodoMenstrual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtfDuracionMenstrual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblstaticSeparador5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblstaticCiclosMens)
                        .addComponent(lblstaticAnticoncep)
                        .addComponent(txtfAnticonceptivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstaticGestaciones)
                    .addComponent(lblstaticPartos)
                    .addComponent(txtfAbortos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfPartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstaticSeparador2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfGestaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstaticSeparador3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfCesareas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlGinecologicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblstaticGinecObserv)
                    .addComponent(txtfMuertos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfVivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstaticSeparador4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(lblstaticGinecObserv1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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

        btnVolver.setText("Volver");
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
                .addComponent(pnlGinecologicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlGinecologicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    CambiarEstadoCajas(true);
    this.btnGuardar.setEnabled(true);
    this.btnModificar.setEnabled(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    aginec = new AntecedentesGinecologicos();
    aginec.setAbortos(Integer.parseInt(this.txtfAbortos.getText()));
    aginec.setAnticonceptivos(this.txtfAnticonceptivos.getText());
    aginec.setCesareas(Integer.parseInt(this.txtfCesareas.getText()));
    aginec.setDismenorrea(this.chkDismenorrea.isSelected());
    aginec.setDispareunia(this.chkDispareunia.isSelected());
    aginec.setDuracionMenstrual(Integer.parseInt(this.txtfDuracionMenstrual.getText()));
    aginec.setGestaciones(Integer.parseInt(this.txtfGestaciones.getText()));
    aginec.setMenarca(Integer.parseInt(this.txtfMenarca.getText()));
    aginec.setMenopausia(Integer.parseInt(this.txtfMenopausia.getText()));
    aginec.setMuertos(Integer.parseInt(this.txtfMuertos.getText()));
    aginec.setObservaciones(this.txtaGinecObserv.getText());
    aginec.setPartos(Integer.parseInt(this.txtfPartos.getText()));
    aginec.setPeriodoMenstrual(Integer.parseInt(this.txtfPeriodoMenstrual.getText()));
    aginec.setSdpm(this.chkSdpm.isSelected());
    aginec.setTelarca(this.txtfTelarca.getText());
    aginec.setVivos(Integer.parseInt(this.txtfVivos.getText()));
    if(daoAntecGinec.actualizarAntecedente(aginec,paciente.getDni()))
    {
        MensajesValidaciones.mostrarInformacion(this, "Actualizacion Exitosa");
    }
    else
    {
        MensajesValidaciones.mostrarError(this, "Actualizacion Fallida");
        return;
    }
    paciente.setAntecGinec(aginec);
    CambiarEstadoCajas(false);
    this.btnGuardar.setEnabled(false);
    this.btnModificar.setEnabled(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtfAnticonceptivosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfAnticonceptivosKeyTyped
        MensajesValidaciones.limitarLargo(this.txtfAnticonceptivos, evt, 70,this);
    }//GEN-LAST:event_txtfAnticonceptivosKeyTyped

    private void txtfTelarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfTelarcaKeyTyped
        MensajesValidaciones.limitarLargo(this.txtfTelarca, evt, 70,this);
    }//GEN-LAST:event_txtfTelarcaKeyTyped

    private void txtfMenarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfMenarcaKeyTyped
        MensajesValidaciones.negarLetras(evt,this);
    }//GEN-LAST:event_txtfMenarcaKeyTyped

    private void txtfMenopausiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfMenopausiaKeyTyped
        MensajesValidaciones.negarLetras(evt,this);
    }//GEN-LAST:event_txtfMenopausiaKeyTyped

    private void txtfDuracionMenstrualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfDuracionMenstrualKeyTyped
        MensajesValidaciones.negarLetras(evt,this);
    }//GEN-LAST:event_txtfDuracionMenstrualKeyTyped

    private void txtfPeriodoMenstrualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfPeriodoMenstrualKeyTyped
        MensajesValidaciones.negarLetras(evt,this);
    }//GEN-LAST:event_txtfPeriodoMenstrualKeyTyped

    private void txtfGestacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfGestacionesKeyTyped
        MensajesValidaciones.negarLetras(evt,this);
    }//GEN-LAST:event_txtfGestacionesKeyTyped

    private void txtfAbortosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfAbortosKeyTyped
        MensajesValidaciones.negarLetras(evt,this);
    }//GEN-LAST:event_txtfAbortosKeyTyped

    private void txtfVivosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfVivosKeyTyped
        MensajesValidaciones.negarLetras(evt,this);
    }//GEN-LAST:event_txtfVivosKeyTyped

    private void txtfMuertosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfMuertosKeyTyped
        MensajesValidaciones.negarLetras(evt,this);
    }//GEN-LAST:event_txtfMuertosKeyTyped

    private void txtfPartosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfPartosKeyTyped
        MensajesValidaciones.negarLetras(evt,this);
    }//GEN-LAST:event_txtfPartosKeyTyped

    private void txtfCesareasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfCesareasKeyTyped
        MensajesValidaciones.negarLetras(evt,this);
    }//GEN-LAST:event_txtfCesareasKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox chkDismenorrea;
    private javax.swing.JCheckBox chkDispareunia;
    private javax.swing.JCheckBox chkSdpm;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblstaticAnticoncep;
    private javax.swing.JLabel lblstaticCiclosMens;
    private javax.swing.JLabel lblstaticDismenorrea;
    private javax.swing.JLabel lblstaticDispareunia;
    private javax.swing.JLabel lblstaticGestaciones;
    private javax.swing.JLabel lblstaticGinecObserv;
    private javax.swing.JLabel lblstaticGinecObserv1;
    private javax.swing.JLabel lblstaticMenarca;
    private javax.swing.JLabel lblstaticMenopausia;
    private javax.swing.JLabel lblstaticPartos;
    private javax.swing.JLabel lblstaticSDPM;
    private javax.swing.JLabel lblstaticSeparador2;
    private javax.swing.JLabel lblstaticSeparador3;
    private javax.swing.JLabel lblstaticSeparador4;
    private javax.swing.JLabel lblstaticSeparador5;
    private javax.swing.JLabel lblstaticTelarca;
    private javax.swing.JPanel pnlGinecologicos;
    private javax.swing.JTextArea txtaGinecObserv;
    private javax.swing.JTextField txtfAbortos;
    private javax.swing.JTextField txtfAnticonceptivos;
    private javax.swing.JTextField txtfCesareas;
    private javax.swing.JTextField txtfDuracionMenstrual;
    private javax.swing.JTextField txtfGestaciones;
    private javax.swing.JTextField txtfMenarca;
    private javax.swing.JTextField txtfMenopausia;
    private javax.swing.JTextField txtfMuertos;
    private javax.swing.JTextField txtfPartos;
    private javax.swing.JTextField txtfPeriodoMenstrual;
    private javax.swing.JTextField txtfTelarca;
    private javax.swing.JTextField txtfVivos;
    // End of variables declaration//GEN-END:variables
private void llenarCajas(Paciente p) {
        this.txtaGinecObserv.setText(p.getAntecGinec().getObservaciones());
        this.txtfAbortos.setText(p.getAntecGinec().getAbortos()+"");
        this.txtfAnticonceptivos.setText(p.getAntecGinec().getAnticonceptivos());
        this.txtfCesareas.setText(p.getAntecGinec().getCesareas()+"");
        this.txtfDuracionMenstrual.setText(p.getAntecGinec().getDuracionMenstrual()+"");
        this.txtfPeriodoMenstrual.setText(p.getAntecGinec().getPeriodoMenstrual()+"");
        this.txtfGestaciones.setText(p.getAntecGinec().getGestaciones()+"");
        this.txtfMenarca.setText(p.getAntecGinec().getMenarca()+"");
        this.txtfMenopausia.setText(p.getAntecGinec().getMenopausia()+"");
        this.txtfMuertos.setText(p.getAntecGinec().getMuertos()+"");
        this.txtfPartos.setText(p.getAntecGinec().getPartos()+"");
        this.txtfTelarca.setText(p.getAntecGinec().getTelarca());
        this.txtfVivos.setText(p.getAntecGinec().getVivos()+"");
        
        if(p.getAntecGinec().isDismenorrea())
        this.chkDismenorrea.setSelected(true);
        
        if(p.getAntecGinec().isDispareunia())
        this.chkDispareunia.setSelected(true);
        
        if(p.getAntecGinec().isSdpm())
        this.chkSdpm.setSelected(true);
    }
private void CambiarEstadoCajas(boolean accion)
{
 this.txtaGinecObserv.setEnabled(accion);
        this.txtfAbortos.setEditable(accion);
        this.txtfAnticonceptivos.setEditable(accion);
        this.txtfCesareas.setEditable(accion);
        this.txtfDuracionMenstrual.setEditable(accion);
        this.txtfPeriodoMenstrual.setEditable(accion);
        this.txtfGestaciones.setEditable(accion);
        this.txtfMenarca.setEditable(accion);
        this.txtfMenopausia.setEditable(accion);
        this.txtfPartos.setEditable(accion);
        this.txtfTelarca.setEditable(accion);
        this.txtfVivos.setEditable(accion);
        this.txtfMuertos.setEditable(accion);
        this.txtaGinecObserv.setEditable(accion);
        this.chkDismenorrea.setEnabled(accion);
        this.chkDispareunia.setEnabled(accion);
        this.chkSdpm.setEnabled(accion);
}
}
