package mundial.presentacion;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import mundial.logica.Jugador;
import mundial.logica.Jugadores;
import mundial.logica.Seleccion;
import mundial.logica.Selecciones;
import mundial.persistencia.Archivos;

public class VerSelecciones extends javax.swing.JInternalFrame {

    private static VerSelecciones instancia; // 1. Instancia de si mismo

    private String paisSeleccionado;
    private String jugadorSeleccionado;

    private VerSelecciones() {
        Selecciones selecciones = (Selecciones) Archivos.getInstancia().recuperar(0);
        
        DefaultListModel model = new DefaultListModel();

        System.out.println(selecciones.toString());
        ArrayList<Seleccion> n = selecciones.getLista();
        System.out.println(n.toString());

        int indice = 0;
        for (Seleccion seleccion : n) {
            String x = seleccion.getPais();
            model.add(indice, x);
            indice++;
        }

        initComponents();

        jListSelecciones.setModel(model);
    }

    public static VerSelecciones getInstancia() {
        if (instancia == null) // Si no hay instancia ....
        {
            instancia = new VerSelecciones(); // ... crearla y ...
        }
        return instancia;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListSelecciones = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCapital = new javax.swing.JTextField();
        jTextFieldDT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldStatus = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldRank = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxGrupo = new javax.swing.JComboBox<>();
        jToolBar2 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListJugadores = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAltura = new javax.swing.JTextField();
        jTextFieldPeso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNac = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldClub = new javax.swing.JTextField();
        jTextFieldDebut = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldPos1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldPos2 = new javax.swing.JTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        setPreferredSize(new java.awt.Dimension(414, 482));
        setVisible(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jToolBar1.setFloatable(false);

        jListSelecciones.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListSeleccionesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListSelecciones);

        jLabel1.setText("Capital");

        jTextFieldCapital.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCapital.setEnabled(false);

        jTextFieldDT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDT.setEnabled(false);

        jLabel2.setText("Director Tecnico");

        jTextFieldStatus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldStatus.setEnabled(false);

        jLabel3.setText("Estado");

        jLabel4.setText("FIFA Rank");

        jTextFieldRank.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldRank.setEnabled(false);

        jButton1.setText("Ver jugadores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setText("Grupo");

        jComboBoxGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jTextFieldDT, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldCapital, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldRank)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldRank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jComboBoxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );

        jToolBar1.add(jPanel1);

        jTabbedPane1.addTab("Listado", jToolBar1);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jListJugadores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListJugadoresValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListJugadores);

        jLabel5.setText("Altura");

        jTextFieldAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAltura.setEnabled(false);

        jTextFieldPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPeso.setEnabled(false);

        jLabel6.setText("Peso");

        jTextFieldNac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNac.setEnabled(false);

        jLabel7.setText("Fecha de Nac.");

        jLabel8.setText("Club");

        jTextFieldClub.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldClub.setEnabled(false);

        jTextFieldDebut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDebut.setEnabled(false);

        jLabel9.setText("Debut");

        jLabel10.setText("Posicion 1");

        jTextFieldPos1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPos1.setEnabled(false);

        jLabel11.setText("Posicion 2");

        jTextFieldPos2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPos2.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldPos2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(jTextFieldPos1)
                    .addComponent(jTextFieldDebut)
                    .addComponent(jTextFieldNac)
                    .addComponent(jTextFieldPeso)
                    .addComponent(jTextFieldAltura)
                    .addComponent(jTextFieldClub, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldPos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldPos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar2.add(jPanel2);

        jTabbedPane1.addTab("Jugadores", jToolBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Listado");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListJugadoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListJugadoresValueChanged
        if (!evt.getValueIsAdjusting()) {
            Jugadores jugadores = (Jugadores) Archivos.getInstancia().recuperar(1);
            JList source = (JList) evt.getSource();
            jugadorSeleccionado = source.getSelectedValue().toString();

            Jugador seleccionado = jugadores.obtenerPorNombre(jugadorSeleccionado);
            System.out.println(seleccionado.toString());

            jTextFieldAltura.setText(String.valueOf(seleccionado.getAltura()));
            jTextFieldPeso.setText(String.valueOf(seleccionado.getPeso()));
            jTextFieldNac.setText(String.valueOf(seleccionado.getDia() + "/" + seleccionado.getMes() + "/" + seleccionado.getAnio()));
            jTextFieldClub.setText(String.valueOf(seleccionado.getClub()));
            jTextFieldDebut.setText(String.valueOf(seleccionado.getDebut()));

            jTextFieldPos1.setText(seleccionado.getPosicion()[0]);

            if (seleccionado.getPosicion()[1] != null) {
                jTextFieldPos2.setText(seleccionado.getPosicion()[1]);
            } else {
                jTextFieldPos2.setText("-");
            }
        }
    }//GEN-LAST:event_jListJugadoresValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Jugadores jugadores = (Jugadores) Archivos.getInstancia().recuperar(1);
        
        jTabbedPane1.setSelectedIndex(1);

        DefaultListModel model = new DefaultListModel();

        System.out.println(jugadores.toString());
        ArrayList<Jugador> n = jugadores.getLista();
        System.out.println(n.toString());
        for (Jugador jugador : n) {
            String pais = jugador.getPais();
            String nombre = jugador.getNombre() + " " + jugador.getApellido();
            System.out.println(pais);
            if (pais.equals(paisSeleccionado)) {
                model.addElement(nombre);
            }
        }

        jListJugadores.setModel(model);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jListSeleccionesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListSeleccionesValueChanged
        if (!evt.getValueIsAdjusting()) {
            Selecciones selecciones = (Selecciones) Archivos.getInstancia().recuperar(0);
            JList source = (JList) evt.getSource();
            paisSeleccionado = source.getSelectedValue().toString();

            Seleccion seleccionada = selecciones.obtenerPorPais(paisSeleccionado);

            jTextFieldCapital.setText(seleccionada.getCapital());
            jTextFieldDT.setText(seleccionada.getDt());
            jTextFieldStatus.setText(seleccionada.getStatus());
            jTextFieldRank.setText(String.valueOf(seleccionada.getRank()));
            
            jComboBoxGrupo.setSelectedIndex(seleccionada.getGrupo());
        }
    }//GEN-LAST:event_jListSeleccionesValueChanged

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.hide();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Selecciones selecciones = (Selecciones) Archivos.getInstancia().recuperar(0);
        
        DefaultListModel model = new DefaultListModel();

        System.out.println(selecciones.toString());
        ArrayList<Seleccion> n = selecciones.getLista();
        System.out.println(n.toString());

        int indice = 0;
        for (Seleccion seleccion : n) {
            String x = seleccion.getPais();
            model.add(indice, x);
            indice++;
        }

        jListSelecciones.setModel(model);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxGrupo;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListJugadores;
    private javax.swing.JList<String> jListSelecciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldCapital;
    private javax.swing.JTextField jTextFieldClub;
    private javax.swing.JTextField jTextFieldDT;
    private javax.swing.JTextField jTextFieldDebut;
    private javax.swing.JTextField jTextFieldNac;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldPos1;
    private javax.swing.JTextField jTextFieldPos2;
    private javax.swing.JTextField jTextFieldRank;
    private javax.swing.JTextField jTextFieldStatus;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
