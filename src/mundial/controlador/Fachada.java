package mundial.controlador;

import mundial.logica.Jugador;
import mundial.logica.Jugadores;
import mundial.persistencia.Archivos;
import mundial.logica.Seleccion;
import mundial.logica.Selecciones;

public class Fachada {

    private final Selecciones selecciones;
    private final Jugadores jugadores;
    private static Fachada instancia;

    private Fachada() { // (1) - El constructor recupera los datos del archivo
        selecciones = (Selecciones) Archivos.getInstancia().recuperar(0);
        jugadores = (Jugadores) Archivos.getInstancia().recuperar(1);
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

    public Selecciones devolverSelecciones() {
        return (Selecciones) Archivos.getInstancia().recuperar(1);
    }

    public void guardarCambios(int tipo) { // tipo: 0 -> Selecciones | 1 -> Jugadores
        if (tipo == 0) {
            Archivos.getInstancia().guardarSelecciones(selecciones);
        } else {
            Archivos.getInstancia().guardarJugadores(jugadores);
        }
    }
}
