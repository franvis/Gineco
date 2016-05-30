/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ClasesBase.modelo.AntecedentesFamiliares;
import ClasesBase.MensajesValidaciones;
import ClasesBase.modelo.Paciente;
import DAO.DAOAntecedentesFamiliares;
import java.awt.Image;
import java.awt.KeyboardFocusManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class AntecFamiliares extends javax.swing.JDialog {

    private AntecedentesFamiliares afam;
    private DAOAntecedentesFamiliares daoAntecFam;
    private Paciente paciente;
    private String tiroidesAux = "", oncologógicosAux = "";

    /**
     * Creates new form AntecFamiliares
     */
    public AntecFamiliares(java.awt.Frame parent, boolean modal, Paciente p) {
        super(parent, modal);
        initComponents();
        paciente = p;
        daoAntecFam = new DAOAntecedentesFamiliares();
        llenarCajas(p);
        CambiarEstadoCajas(false);
        this.btnModificar.grabFocus();
        this.setLocationRelativeTo(parent);
        setIconImage(getIconImage());
        ClasesBase.GestorEstilos.pintar(this);
        //eventos de la página
        KeyStroke strokeEsc = KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0);
        this.getRootPane().registerKeyboardAction(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    salir();
                }
            }, strokeEsc, JComponent.WHEN_IN_FOCUSED_WINDOW);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAntecedentes = new javax.swing.JPanel();
        txtfTiroides = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtaOncologicos = new javax.swing.JTextArea();
        chkDiabetes = new javax.swing.JCheckBox();
        chkTiroides = new javax.swing.JCheckBox();
        chkHipertension = new javax.swing.JCheckBox();
        chkOncologicos = new javax.swing.JCheckBox();
        pnlBotones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaFamObservaciones = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Antecedentes Familiares");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlAntecedentes.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Antecedentes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 51, 102))); // NOI18N
        pnlAntecedentes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtfTiroides.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtfTiroides.setNextFocusableComponent(chkOncologicos);
        txtfTiroides.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfTiroidesKeyTyped(evt);
            }
        });

        txtaOncologicos.setColumns(16);
        txtaOncologicos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtaOncologicos.setLineWrap(true);
        txtaOncologicos.setRows(2);
        txtaOncologicos.setTabSize(0);
        txtaOncologicos.setWrapStyleWord(true);
        txtaOncologicos.setNextFocusableComponent(txtaFamObservaciones);
        txtaOncologicos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtaOncologicosKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(txtaOncologicos);

        chkDiabetes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkDiabetes.setText("Diabetes");
        chkDiabetes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chkDiabetes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkDiabetes.setIconTextGap(73);
        chkDiabetes.setNextFocusableComponent(chkHipertension);
        chkDiabetes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkDiabetesItemStateChanged(evt);
            }
        });

        chkTiroides.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkTiroides.setText("Tiroides");
        chkTiroides.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chkTiroides.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkTiroides.setIconTextGap(80);
        chkTiroides.setNextFocusableComponent(txtfTiroides);
        chkTiroides.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkTiroidesItemStateChanged(evt);
            }
        });

        chkHipertension.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkHipertension.setText("Hipertensión Arterial");
        chkHipertension.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chkHipertension.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkHipertension.setIconTextGap(6);
        chkHipertension.setNextFocusableComponent(chkTiroides);
        chkHipertension.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkHipertensionItemStateChanged(evt);
            }
        });

        chkOncologicos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chkOncologicos.setText("Oncológicos");
        chkOncologicos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        chkOncologicos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chkOncologicos.setIconTextGap(52);
        chkOncologicos.setNextFocusableComponent(txtaOncologicos);
        chkOncologicos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkOncologicosItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlAntecedentesLayout = new javax.swing.GroupLayout(pnlAntecedentes);
        pnlAntecedentes.setLayout(pnlAntecedentesLayout);
        pnlAntecedentesLayout.setHorizontalGroup(
            pnlAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAntecedentesLayout.createSequentialGroup()
                .addGroup(pnlAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkOncologicos, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(chkTiroides, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(chkHipertension, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(chkDiabetes, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtfTiroides)
                    .addComponent(jScrollPane4))
                .addGap(4, 4, 4))
        );
        pnlAntecedentesLayout.setVerticalGroup(
            pnlAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAntecedentesLayout.createSequentialGroup()
                .addComponent(chkDiabetes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkHipertension)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfTiroides, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkTiroides))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAntecedentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkOncologicos)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlBotones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 51, 102));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save_enabled.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setEnabled(false);
        btnGuardar.setNextFocusableComponent(btnCancelar);
        btnGuardar.setOpaque(true);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 51, 102));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancel_enabled.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setEnabled(false);
        btnCancelar.setNextFocusableComponent(btnVolver);
        btnCancelar.setOpaque(true);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 51, 102));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home_enabled.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnVolver.setNextFocusableComponent(btnModificar);
        btnVolver.setOpaque(true);
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 51, 102));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit_enabled.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        btnModificar.setContentAreaFilled(false);
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setNextFocusableComponent(chkDiabetes);
        btnModificar.setOpaque(true);
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModificarMouseExited(evt);
            }
        });
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Observaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 51, 102))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N

        txtaFamObservaciones.setColumns(20);
        txtaFamObservaciones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtaFamObservaciones.setLineWrap(true);
        txtaFamObservaciones.setRows(5);
        txtaFamObservaciones.setTabSize(0);
        txtaFamObservaciones.setWrapStyleWord(true);
        txtaFamObservaciones.setNextFocusableComponent(btnGuardar);
        txtaFamObservaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtaFamObservacionesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtaFamObservaciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlAntecedentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAntecedentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.salir();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        this.chkDiabetes.grabFocus();
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

        String error;
        error = comprobarDatosObligatorios();
        if (!error.isEmpty()) {
            MensajesValidaciones.mostrarError(this, "Debe completar los siguientes datos obligatorios: \n" + error);
            return;
        }

        if (daoAntecFam.actualizarAntecedente(afam, paciente.getDni())) {
            MensajesValidaciones.mostrarInformacion(this, "Actualización Exitosa");
            CambiarEstadoCajas(false);
            this.btnGuardar.setEnabled(false);
            this.btnModificar.setEnabled(true);
            paciente.setAntecFam(afam);
        } else {
            MensajesValidaciones.mostrarError(this, "Actualización Fallida.");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtfTiroidesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfTiroidesKeyTyped
        MensajesValidaciones.limitarLargo(this.txtfTiroides, evt, 45, this);
    }//GEN-LAST:event_txtfTiroidesKeyTyped

private void txtaFamObservacionesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaFamObservacionesKeyPressed
        this.controlarFoco(evt);
}//GEN-LAST:event_txtaFamObservacionesKeyPressed

private void txtaOncologicosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaOncologicosKeyPressed
        this.controlarFoco(evt);
}//GEN-LAST:event_txtaOncologicosKeyPressed

    private void btnModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseEntered
        this.setearLabels(btnModificar, true);
    }//GEN-LAST:event_btnModificarMouseEntered

    private void btnModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseExited
        this.setearLabels(btnModificar, false);
    }//GEN-LAST:event_btnModificarMouseExited

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        this.setearLabels(btnCancelar, true);
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        this.setearLabels(btnCancelar, false);
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        this.setearLabels(btnGuardar, true);
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        this.setearLabels(btnGuardar, false);
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        this.setearLabels(btnVolver, true);
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        this.setearLabels(btnVolver, false);
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.llenarCajas(paciente);
        this.CambiarEstadoCajas(false);
        this.btnGuardar.setEnabled(false);
        this.btnModificar.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void chkTiroidesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkTiroidesItemStateChanged
        if (!btnGuardar.isEnabled()) {
            chkTiroides.setSelected(paciente.getAntecFam().isTiroides());
        } else {
            if (!this.chkTiroides.isSelected()) {
                this.txtfTiroides.setEditable(false);
                this.txtfTiroides.setFocusable(false);
                this.txtfTiroides.setEnabled(false);
                this.tiroidesAux = this.txtfTiroides.getText();
                this.txtfTiroides.setText("");
            } else {
                this.txtfTiroides.setEditable(true);
                this.txtfTiroides.setFocusable(true);
                this.txtfTiroides.setEnabled(true);
                if (!this.tiroidesAux.isEmpty()){
                    this.txtfTiroides.setText(this.tiroidesAux);
                    this.txtfTiroides.selectAll();
                }
                this.txtfTiroides.grabFocus();
            }
        }
    }//GEN-LAST:event_chkTiroidesItemStateChanged

    private void chkOncologicosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkOncologicosItemStateChanged
        if (!btnGuardar.isEnabled()) {
            chkOncologicos.setSelected(paciente.getAntecFam().isOncologicos());
        } else {
            if (!this.chkOncologicos.isSelected()) {
                this.txtaOncologicos.setEditable(false);
                this.txtaOncologicos.setFocusable(false);
                this.txtaOncologicos.setEnabled(false);
                this.oncologógicosAux = this.txtaOncologicos.getText();
                this.txtaOncologicos.setText("");
            } else {
                this.txtaOncologicos.setEditable(true);
                this.txtaOncologicos.setFocusable(true);
                this.txtaOncologicos.setEnabled(true);
                if (!this.oncologógicosAux.isEmpty()){
                    this.txtaOncologicos.setText(this.oncologógicosAux);
                    this.txtaOncologicos.selectAll();
                }
                this.txtaOncologicos.grabFocus();
            }
        }
    }//GEN-LAST:event_chkOncologicosItemStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.salir();
    }//GEN-LAST:event_formWindowClosing

    private void chkDiabetesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkDiabetesItemStateChanged
        if (!btnGuardar.isEnabled())
            chkDiabetes.setSelected(paciente.getAntecFam().isDbt());
    }//GEN-LAST:event_chkDiabetesItemStateChanged

    private void chkHipertensionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkHipertensionItemStateChanged
        if (!btnGuardar.isEnabled())
            chkHipertension.setSelected(paciente.getAntecFam().isHta());
    }//GEN-LAST:event_chkHipertensionItemStateChanged

    private void setearLabels(JButton jbtn, boolean entrada) {
        if (jbtn.isEnabled()) {
            if (entrada) {
                jbtn.setFont(new java.awt.Font("Tahoma", 1, 15));
            } else {
                jbtn.setFont(new java.awt.Font("Tahoma", 1, 14));
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox chkDiabetes;
    private javax.swing.JCheckBox chkHipertension;
    private javax.swing.JCheckBox chkOncologicos;
    private javax.swing.JCheckBox chkTiroides;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pnlAntecedentes;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JTextArea txtaFamObservaciones;
    private javax.swing.JTextArea txtaOncologicos;
    private javax.swing.JTextField txtfTiroides;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo generico utilizado para llenar todos los datos.
     *
     * @param p Paciente que contiene todos los datos para llenar
     */
    private void llenarCajas(Paciente p) {
        this.limpiarChecks();
        this.txtaFamObservaciones.setText(p.getAntecFam().getObservaciones());
        this.txtaOncologicos.setText(p.getAntecFam().getDescripcionOncologicos());
        this.txtfTiroides.setText(p.getAntecFam().getDescripcionTiroides());

        if (p.getAntecFam().isTiroides()) {
            this.chkTiroides.setSelected(true);
        } else 
            this.txtfTiroides.setEnabled(false);

        if (p.getAntecFam().isOncologicos()) {
            this.chkOncologicos.setSelected(true);
        } else 
            this.txtaOncologicos.setEnabled(false);

        if (p.getAntecFam().isDbt()) {
            this.chkDiabetes.setSelected(true);
        }

        if (p.getAntecFam().isHta()) {
            this.chkHipertension.setSelected(true);
        }
    }

    /**
     * Metodo utilizado para cambiar el estado de las cajas (Habilitadas,
     * Deshabilitadas)
     * @param accion true (Habilitadas), false (Deshabilitadas)
     */
    private void CambiarEstadoCajas(boolean accion) {
        this.txtaFamObservaciones.setEditable(accion);
        this.txtaOncologicos.setEditable(accion);
        this.txtfTiroides.setEditable(accion);
        
        this.txtaFamObservaciones.setFocusable(accion);
        this.txtaOncologicos.setFocusable(accion);
        this.txtfTiroides.setFocusable(accion);
        
        this.chkOncologicos.setFocusable(accion);
        this.chkDiabetes.setFocusable(accion);
        this.chkHipertension.setFocusable(accion);
        this.chkTiroides.setFocusable(accion);
        
        this.btnCancelar.setEnabled(accion);
    }

    private void limpiarChecks() {
        this.chkDiabetes.setSelected(false);
        this.chkTiroides.setSelected(false);
        this.chkOncologicos.setSelected(false);
        this.chkHipertension.setSelected(false);
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/sistema.png"));
        return retValue;
    }

    /**
     * Método controlador del cierre de la ventana y validaciones oportunas
     */
    private void salir() {
        if (!btnGuardar.isEnabled()) {
            this.dispose();
            this.getOwner().setVisible(true);
        } else {
            MensajesValidaciones.validarSalidaVentana(this);
        }
    }

    private String comprobarDatosObligatorios() {

        String incompletas = "";

        if (this.chkTiroides.isSelected() && this.txtfTiroides.getText().isEmpty()) {
            incompletas += "Descripción de Tiroides \n";
        }

        if (this.chkOncologicos.isSelected() && this.txtaOncologicos.getText().isEmpty()) {
            incompletas += "Descripción de Oncológicos \n";
        }

        return incompletas;
    }
    
    /**
     * Maneja el paso del foco con las taclas TAB y Shift TAB.
     * Éste método cobra importancia para los componentes JTextArea.
     * @param evt 
     */
    private void controlarFoco(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_TAB && !evt.isShiftDown()) {
            evt.consume();
            KeyboardFocusManager.getCurrentKeyboardFocusManager().focusNextComponent();
        } else if (evt.getKeyCode() == KeyEvent.VK_TAB
                && evt.isShiftDown()) {
            evt.consume();
            KeyboardFocusManager.getCurrentKeyboardFocusManager().focusPreviousComponent();
        }
    }
}
