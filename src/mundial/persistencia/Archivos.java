package mundial.persistencia;

import java.io.*;
import mundial.logica.Grupos;
import mundial.logica.Jugadores;
import mundial.logica.Selecciones;

public class Archivos {

    private static Archivos instancia;
    private final String rutaS; // selecciones.dat
    private final String rutaJ; // jugadores.dat

    // Ruta del proyecto
    private final String rutaProyecto = System.getProperty("user.dir");

    private Archivos() {
        rutaS = rutaProyecto + "\\src\\mundial\\persistencia\\selecciones.dat";
        rutaJ = rutaProyecto + "\\src\\mundial\\persistencia\\jugadores.dat";
    }

    public static Archivos getInstancia() {
        if (instancia == null) {
            instancia = new Archivos();
        }
        return instancia;
    }

    public void guardarSelecciones(Selecciones selecciones) {
        try {
            FileOutputStream fileOut = new FileOutputStream(rutaS);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject((Object) selecciones);
            objectOut.close();
            fileOut.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void guardarJugadores(Jugadores jugadores) {
        try {
            FileOutputStream fileOut = new FileOutputStream(rutaJ);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject((Object) jugadores);
            objectOut.close();
            fileOut.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    //  Este metodo utiliza Object para simplificar el codigo 
    //  en un solo metodo. Solamente se castea a Selecciones, Jugadores, etc...
    //  la var tipo define si se trata de una seleccion, jugador ...
    public void reemplazar(Selecciones objeto) throws FileNotFoundException {

        // Borra el contenido del archivo
        PrintWriter writer = new PrintWriter(rutaS);
        writer.print("");
        writer.close();
        // Para reemplazarlo por el nuevo objeto.
        // Castea el objeto ingresado
        guardarSelecciones(objeto);

    }

    //  Este metodo utiliza Object para simplificar el codigo 
    //  en un solo metodo. Solamente se castea a Selecciones, Jugadores, etc...
    //  la var tipo define si se trata de una seleccion, jugador ...
    public Object recuperar(int tipo) {
        switch (tipo) {
            case 0: {
                Selecciones a = new Selecciones();
                try {
                    FileInputStream f = new FileInputStream(rutaS);
                    ObjectInputStream o = new ObjectInputStream(f);
                    a = (Selecciones) o.readObject(); // Obtengo Selecciones a del archivo
                    o.close();
                    f.close();
                } catch (EOFException e) {
                    System.err.println(e.getMessage());
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return a;
            }
            case 1: {
                Jugadores a = new Jugadores();
                try {
                    FileInputStream f = new FileInputStream(rutaJ);
                    ObjectInputStream o = new ObjectInputStream(f);
                    a = (Jugadores) o.readObject(); // Obtengo Jugadores a del archivo
                    o.close();
                    f.close();
                } catch (EOFException e) {
                    System.err.println(e.getMessage());
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return a;
            }
        }
        return null;
    }
}
