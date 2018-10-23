package mundial.presentacion;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import mundial.controlador.Fachada;
import mundial.logica.Seleccion;
import mundial.logica.Selecciones;
import mundial.persistencia.Archivos;

public class CrearGrupos extends javax.swing.JInternalFrame {

    private static CrearGrupos instancia; // 1. Instancia de si mismo

    String jugadorSeleccionado;
    int indice = 0;

    private CrearGrupos() {

        initComponents();

        DefaultListModel model = new DefaultListModel();
        Selecciones s = (Selecciones) Archivos.getInstancia().recuperar(0);
        System.out.println(s.toString());
        ArrayList<Seleccion> n = s.getLista();
        System.out.println(n.toString());

        indice = 0;
        for (Seleccion seleccion : n) {
            String x = seleccion.getPais();
            model.add(indice, x);
            indice++;
        }
        if (indice != 0) {
            jListSelecciones.setModel(model);
        }
    }

    public static CrearGrupos getInstancia() {
        if (instancia == null) // Si no hay instancia ....
        {
            instancia = new CrearGrupos(); // ... crearla y ...
        }
        return instancia;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListSelecciones = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelCantidadP = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelCantidadG = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabelSelG = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jSplitPane1.setDividerLocation(120);

        jListSelecciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListSelecciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jListSelecciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jLabel1.setText("Cantidad de paises:");

        jLabelCantidadP.setText("n/n");

        jLabel3.setText("Cantidad de grupos:");

        jLabelCantidadG.setText("n");

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Obtener paises");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Selecciones por grupo:");

        jLabelSelG.setText("n");

        jLabel2.setText("Grupos disponibles:");

        jLabel4.setText("default");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 76, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCantidadP))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelCantidadG))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelSelG))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelCantidadP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelCantidadG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelSelG))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (indice == 0) {
            JOptionPane.showMessageDialog(null, "No hay paises, verifique que haya apretado el boton Obtener pasies", "Jo!?, como has crecido...", JOptionPane.ERROR_MESSAGE);
        } else if (indice < 2) {
            JOptionPane.showMessageDialog(null, "Se necesitan al menos 2 selecciones para crear grupos", "Jo!?, como has crecido...", JOptionPane.ERROR_MESSAGE);
        } else if (indice % 2 != 0) {
            JOptionPane.showMessageDialog(null, "El numero de selecciones debe ser par\nEl numero actual es: " + indice, "Jo!?, como has crecido...", JOptionPane.ERROR_MESSAGE);
        } else {
            Selecciones selecciones = (Selecciones) Archivos.getInstancia().recuperar(0);
            int gruposMax = 2;
            for (int i = 2; i < 65; i += 2) {
                if ((i % 2 == 0) && i <= indice && i < 5) {
                    if ((indice / i) % 2 == 0) {
                        gruposMax = i;
                        System.out.println("Yes!");
                        break;
                    } else {
                        gruposMax = i + 1;
                        System.out.println("No!, no!");
                        break;
                    }
                }
            }
            int seleccionesMax = (indice / gruposMax);
            System.out.println(String.valueOf(gruposMax + " Grupos | " + seleccionesMax + " Selecciones | de: " + indice + " Paises"));
            jLabelCantidadG.setText(String.valueOf(gruposMax) + "/64");
            jLabelCantidadP.setText(String.valueOf(indice));
            jLabelSelG.setText(String.valueOf(seleccionesMax));

            int gIndice = 1;
            int contador = 0;
            Random random = new Random();
            int[] seleccionesSeteadas = new int[indice];
            ArrayList<Seleccion> lista = selecciones.getLista();
            Selecciones nuevasSelecciones = new Selecciones();
            
            // BUGEADO MAKINA!
            for (int i=0; i < lista.size();) {
                int indiceRandom = random.nextInt(indice);
                if(!Arrays.asList(seleccionesSeteadas).contains(indiceRandom)) {
                    Seleccion s = lista.get(indiceRandom);
                    s.setGrupo(gIndice);
                    nuevasSelecciones.insertar(s);
                    contador++;
                    i++; 
                }else {
                    if(i != 0) {
                      i--;  
                    }else {
                        i = 0;
                    }
                }
                
                if (contador == seleccionesMax) {
                    contador = 0;
                    gIndice++;
                }
            }
            
            try {
                Archivos.getInstancia().reemplazar(0, nuevasSelecciones);
            } catch (FileNotFoundException ex) {
                System.err.println(ex.getMessage());
            }
            
            System.out.print(Fachada.getInstancia().devolverSelecciones().toString());

            JOptionPane.showMessageDialog(null, "La creacion de grupos fue...\nExitosa!!11!!1", "Jo!?, como has crecido...", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultListModel model = new DefaultListModel();
        Selecciones s = (Selecciones) Archivos.getInstancia().recuperar(0);
        System.out.println(s.toString());
        ArrayList<Seleccion> n = s.getLista();
        System.out.println(n.toString());

        indice = 0;
        for (Seleccion seleccion : n) {
            String x = seleccion.getPais();
            model.add(indice, x);
            indice++;
        }
        if (indice != 0) {
            jListSelecciones.setModel(model);
        } else {
            JOptionPane.showMessageDialog(null, "No hay selecciones?", "Jo!?, como has crecido...", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCantidadG;
    private javax.swing.JLabel jLabelCantidadP;
    private javax.swing.JLabel jLabelSelG;
    private javax.swing.JList<String> jListSelecciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
