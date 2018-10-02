package mundial.logica;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Selecciones extends AbstractTableModel implements Serializable {

    private final ArrayList<Seleccion> lista = new ArrayList<>();
    private static final long serialVersionUID = 1L;

    public Selecciones() {
    }

    public void insertar(Seleccion s) {
        lista.add(s);
    }

    public void eliminar(Seleccion s) {
        lista.remove(s);
    }

    public boolean esVacia() {
        return (lista.isEmpty());
    }

    public boolean contiene(Seleccion s) {
        return (lista.contains(s));
    }

    public int tamanio() {
        return (lista.size());
    }

    public ArrayList<Seleccion> getLista() {
        return lista;
    }

    public Seleccion obtenerPorPais(String pais) {
        Seleccion resultado = null;
        for (Seleccion seleccion : lista) {
            if (seleccion.getPais().equals(pais)) {
                resultado = seleccion;
            }
        }
        return resultado;
    }

    public Seleccion obtenerPorGrupo(int grupo) {
        Seleccion resultado = null;
        for (Seleccion seleccion : lista) {
            if (seleccion.getGrupo() == grupo) {
                resultado = seleccion;
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Selecciones{" + "lista=" + lista.toString() + '}';
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
