package mundial.presentacion;

import com.bulenkov.darcula.DarculaLaf;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.plaf.basic.BasicLookAndFeel;
import mundial.logica.Selecciones;

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
        jMenu4.add(jMenuItem4);

        jMenuBar2.add(jMenu4);

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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
