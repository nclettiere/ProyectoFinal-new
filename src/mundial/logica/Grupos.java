package mundial.logica;

import java.io.Serializable;
import java.util.ArrayList;

public class Grupos implements Serializable {
    private final ArrayList<Grupo> lista = new ArrayList<>();
    private static final long serialVersionUID = 1L;

    public Grupos() {
    }

    public void insertar(Grupo s) {
        lista.add(s);
    }

    public void eliminar(Grupo s) {
        lista.remove(s);
    }

    public boolean esVacia() {
        return (lista.isEmpty());
    }

    public boolean contiene(Grupo s) {
        return (lista.contains(s));
    }

    public ArrayList<Grupo> getLista() {
        return lista;
    }
    
    public Grupo obtenerPorLetra(String letra) {
        Grupo resultado = null;
        
        for(Grupo grupo : lista) {
            if(grupo.getLetra().equals(letra))
                resultado = grupo;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Grupos{" + "lista=" + lista + '}';
    }
}
