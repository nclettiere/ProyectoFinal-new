package mundial.controlador;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mundial.logica.Grupo;
import mundial.logica.Grupos;
import mundial.logica.Jugador;
import mundial.logica.Jugadores;
import mundial.persistencia.Archivos;
import mundial.logica.Seleccion;
import mundial.logica.Selecciones;

public class Fachada {

    private static Fachada instancia;
    
    private final Selecciones selecciones;
    private final Jugadores jugadores;
    private final Grupos grupos;

    private Fachada() { // (1) - El constructor recupera los datos del archivo
        selecciones = (Selecciones) Archivos.getInstancia().recuperar(0);
        jugadores = (Jugadores) Archivos.getInstancia().recuperar(1);
        grupos = (Grupos) Archivos.getInstancia().recuperar(2);
    }

    public static Fachada getInstancia() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }

    public void inscribirSeleccion(Seleccion s) {
        selecciones.insertar(s);
    }
    
    public void inscribirJugador(Jugador j) {
        jugadores.insertar(j);
    }

    public void inscribirGrupo(Grupo g) {
        grupos.insertar(g);
    }
    
    public void reemplazarSelecciones(Selecciones s) {
        try {
            Archivos.getInstancia().reemplazar(s);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Fachada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Selecciones devolverSelecciones() {
        return (Selecciones) Archivos.getInstancia().recuperar(0);
    }

    public void guardarCambios(int tipo) { // tipo: 0 -> Selecciones | 1 -> Jugadores | 2 -> Grupos
        switch (tipo) {
            case 0:
                Archivos.getInstancia().guardarSelecciones(selecciones);
                break;
            case 1:
                Archivos.getInstancia().guardarJugadores(jugadores);
                break;
            default:
                Archivos.getInstancia().guardarGrupos(grupos);
                break;
        }
    }
}
