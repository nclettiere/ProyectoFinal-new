package mundial.logica;

import java.io.Serializable;
import java.util.ArrayList;

public class Selecciones implements Serializable {

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

    public ArrayList<Seleccion> getLista() {
        return lista;
    }

    public Seleccion obtener(int posicion) {
        Seleccion resultado = lista.get(posicion);
        return resultado;
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
}
