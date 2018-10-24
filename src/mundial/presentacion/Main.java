package mundial.presentacion;

import com.bulenkov.darcula.DarculaLaf;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.plaf.basic.BasicLookAndFeel;
import mundial.logica.Seleccion;
import mundial.logica.Selecciones;
import mundial.persistencia.Archivos;

public class Main extends javax.swing.JFrame {

    public Main() {
        try {
            BasicLookAndFeel darcula = new DarculaLaf();
            UIManager.setLookAndFeel(darcula);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuBuscador = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        jMenu3.setText("Selecciones");

        jMenuItem1.setText("Agregar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Ver");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Jugadores");

        jMenuItem3.setText("Agregar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setText("Ver");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Grupos");

        jMenuItem6.setText("Crear");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Reset");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuBar2.add(jMenu5);

        jMenuBuscador.setText("Bucador Google");
        jMenuBuscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBuscadorMouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenuBuscador);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AgregarSeleccion addSeleccion = AgregarSeleccion.getInstancia();
        jDesktopPane1.removeAll(); // Limpiamos el panel
        jDesktopPane1.add(addSeleccion); // Agregamos la ventana
        BasicInternalFrameUI bi = (BasicInternalFrameUI) addSeleccion.getUI();
        bi.setNorthPane(null);
        addSeleccion.setVisible(true); // Visualizamos
        jDesktopPane1.updateUI();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        VerSelecciones verSeleccion = VerSelecciones.getInstancia();
        jDesktopPane1.removeAll(); // Limpiamos el panel
        jDesktopPane1.add(verSeleccion); // Agregamos la ventana
        BasicInternalFrameUI bi = (BasicInternalFrameUI) verSeleccion.getUI();
        bi.setNorthPane(null);
        verSeleccion.setVisible(true); // Visualizamos
        jDesktopPane1.updateUI();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AddJugador addJugador = AddJugador.getInstancia();
        jDesktopPane1.removeAll(); // Limpiamos el panel
        jDesktopPane1.add(addJugador); // Agregamos la ventana
        BasicInternalFrameUI bi = (BasicInternalFrameUI) addJugador.getUI();
        bi.setNorthPane(null);
        addJugador.setVisible(true); // Visualizamos
        jDesktopPane1.updateUI();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        VerJugadores verJugadores = VerJugadores.getInstancia();
        jDesktopPane1.removeAll(); // Limpiamos el panel
        jDesktopPane1.add(verJugadores); // Agregamos la ventana
        BasicInternalFrameUI bi = (BasicInternalFrameUI) verJugadores.getUI();
        bi.setNorthPane(null);
        verJugadores.setVisible(true); // Visualizamos
        jDesktopPane1.updateUI();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        CrearGrupos crearGrupos = CrearGrupos.getInstancia();
        jDesktopPane1.removeAll(); // Limpiamos el panel
        jDesktopPane1.add(crearGrupos); // Agregamos la ventana
        BasicInternalFrameUI bi = (BasicInternalFrameUI) crearGrupos.getUI();
        bi.setNorthPane(null);
        crearGrupos.setVisible(true); // Visualizamos
        jDesktopPane1.updateUI();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuBuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBuscadorMouseClicked
        Buscador buscador = Buscador.getInstancia();
        jDesktopPane1.removeAll(); // Limpiamos el panel
        jDesktopPane1.add(buscador); // Agregamos la ventana
        BasicInternalFrameUI bi = (BasicInternalFrameUI) buscador.getUI();
        bi.setNorthPane(null);
        buscador.setVisible(true); // Visualizamos
        jDesktopPane1.updateUI();
    }//GEN-LAST:event_jMenuBuscadorMouseClicked

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Atencion Lord, esta opcion se encuentra bugeada y nesecita un parche de victorval\nDesea continuar?", "breath. BOI.", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Lord, le informo que el bug se ha solucionado.\nLos grupos fueron reseteados!\nPuede volver a trabajar a la normalidad.");
            // REEMPLAZA LA LISTA ANTERIOR POR LA NUEVA
            Selecciones selecciones = (Selecciones) Archivos.getInstancia().recuperar(0);
            ArrayList<Seleccion> lista = selecciones.getLista();

            Selecciones reemplazo = new Selecciones();
            for (Seleccion s : lista) {
                // SETEA EL GRUPO A 0
                // PARA REMOVER CUALQUIER GRUPO ANTERIORMENTE CREADO.
                s.setGrupo(0);
                reemplazo.insertar(s);
            }

            try {
                //  LLAMA AL METODO DONDE SE REEMPLAZA
                Archivos.getInstancia().reemplazar(reemplazo);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "PESIMA...\nDecision...");
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuBuscador;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables
}
