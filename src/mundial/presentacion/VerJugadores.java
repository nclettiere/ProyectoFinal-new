package mundial.presentacion;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import mundial.logica.Jugador;
import mundial.logica.Jugadores;
import mundial.persistencia.Archivos;


public class VerJugadores extends javax.swing.JInternalFrame {
    
    private static VerJugadores instancia; // 1. Instancia de si mismo
    private Jugadores jugadores = (Jugadores) Archivos.getInstancia().recuperar(1);
    String jugadorSeleccionado;
    
    private VerJugadores() {
        initComponents();
    }

    public static VerJugadores getInstancia() {
        if (instancia == null) // Si no hay instancia ....
        {
            instancia = new VerJugadores(); // ... crearla y ...
        }
        return instancia;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jListJugadores = new javax.swing.JList<>();
        jTextFieldAltura = new javax.swing.JTextField();
        jTextFieldPeso = new javax.swing.JTextField();
        jTextFieldNac = new javax.swing.JTextField();
        jTextFieldClub = new javax.swing.JTextField();
        jTextFieldDebut = new javax.swing.JTextField();
        jTextFieldPos1 = new javax.swing.JTextField();
        jTextFieldPos2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldPais = new javax.swing.JTextField();

        jListJugadores.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListJugadoresValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListJugadores);

        jTextFieldAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAltura.setEnabled(false);

        jTextFieldPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPeso.setEnabled(false);

        jTextFieldNac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNac.setEnabled(false);

        jTextFieldClub.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldClub.setEnabled(false);

        jTextFieldDebut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDebut.setEnabled(false);

        jTextFieldPos1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPos1.setEnabled(false);

        jTextFieldPos2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPos2.setEnabled(false);

        jLabel5.setText("Altura");

        jLabel6.setText("Peso");

        jLabel7.setText("Fecha de Nac.");

        jLabel8.setText("Club");

        jLabel9.setText("Debut");

        jLabel10.setText("Posicion 1");

        jLabel11.setText("Posicion 2");

        jButton1.setText("Obtener Jugadores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Pais");

        jTextFieldPais.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPais.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 124, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldPais)
                            .addComponent(jTextFieldPos2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jTextFieldPos1)
                            .addComponent(jTextFieldDebut)
                            .addComponent(jTextFieldNac)
                            .addComponent(jTextFieldPeso)
                            .addComponent(jTextFieldAltura)
                            .addComponent(jTextFieldClub, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldPos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldPos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListJugadoresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListJugadoresValueChanged
        if (!evt.getValueIsAdjusting()) {
            JList source = (JList) evt.getSource();
            jugadorSeleccionado = source.getSelectedValue().toString();

            Jugador seleccionado = jugadores.obtenerPorNombre(jugadorSeleccionado);
            System.out.println(seleccionado.toString());

            jTextFieldPais.setText(seleccionado.getPais());
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
        DefaultListModel model = new DefaultListModel();

        System.out.println(jugadores.toString());
        ArrayList<Jugador> n = jugadores.getLista();
        System.out.println(n.toString());

        int indice = 0;
        for (Jugador jugador : n) {
            String x = jugador.getNombre() + " " + jugador.getApellido();
            model.add(indice, x);
            indice++;
        }

        jListJugadores.setModel(model);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListJugadores;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldClub;
    private javax.swing.JTextField jTextFieldDebut;
    private javax.swing.JTextField jTextFieldNac;
    private javax.swing.JTextField jTextFieldPais;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldPos1;
    private javax.swing.JTextField jTextFieldPos2;
    // End of variables declaration//GEN-END:variables
}
