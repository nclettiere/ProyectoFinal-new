package mundial.presentacion;

import java.awt.BorderLayout;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import mundial.logica.Jugadores;
import mundial.logica.Seleccion;
import mundial.logica.Selecciones;
import mundial.persistencia.Archivos;

public class VerGrupos extends javax.swing.JInternalFrame {

    private static VerGrupos instancia; // 1. Instancia de si mismo
    String jugadorSeleccionado;

    private VerGrupos() {
        initComponents();
        Selecciones selecciones = (Selecciones) Archivos.getInstancia().recuperar(0);
        int tamanio = selecciones.tamanio();
        Object[] n = new Object[tamanio];
        
        int contador = 0;
        for (final Seleccion s : selecciones.getLista()) {
            n[contador] = s;
            contador++;
            jTableGrupos.
        }
        
        TableColumn tableColumn = new TableColumn(3);
        jTableGrupos.addColumn(tableColumn);
        
        jTableGrupos.add(s)
        
        
    }

    public static VerGrupos getInstancia() {
        if (instancia == null) // Si no hay instancia ....
        {
            instancia = new VerGrupos(); // ... crearla y ...
        }
        return instancia;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTableGrupos = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableGrupos.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTableGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTableGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jTable2;
    private javax.swing.JScrollPane jTableGrupos;
    // End of variables declaration//GEN-END:variables
}
