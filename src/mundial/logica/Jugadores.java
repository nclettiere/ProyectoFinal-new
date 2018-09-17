package mundial.logica;

import java.io.Serializable;
import java.util.ArrayList;

public class Jugadores implements Serializable {
    private final ArrayList<Jugador> lista = new ArrayList<>();
    private static final long serialVersionUID = 1L;

    public Jugadores() {
    }

    public void insertar(Jugador s) {
        lista.add(s);
    }

    public void eliminar(Jugador s) {
        lista.remove(s);
    }

    public boolean esVacia() {
        return (lista.isEmpty());
    }

    public boolean contiene(Jugador s) {
        return (lista.contains(s));
    }

    public ArrayList<Jugador> getLista() {
        return lista;
    }
    
    public Jugador obtenerPorNombre(String nombre) {
        Jugador resultado = null;
        
        String[] nbre = nombre.split("\\s");
        
        for(Jugador jugador : lista) {
            if(jugador.getNombre().equals(nbre[0]) && jugador.getApellido().equals(nbre[1]))
                resultado = jugador;
        }
        return resultado;
    }
    
    @Override
    public String toString() {
        return "Jugadores{" + "lista=" + lista.toString() + '}';
    }
}
