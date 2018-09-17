package mundial.persistencia;

import java.io.*;
import mundial.logica.Jugadores;
import mundial.logica.Selecciones;

public class Archivos {

    private static Archivos instancia;
    private final String rutaS;
    private final String rutaJ;

    private Archivos() {
        rutaS = "C:\\Users\\Winston Churchill\\Documents\\NetBeansProjects\\ProyectoFinal-new\\src\\mundial\\persistencia\\selecciones.dat";
        rutaJ = "C:\\Users\\Winston Churchill\\Documents\\NetBeansProjects\\ProyectoFinal-new\\src\\mundial\\persistencia\\jugadores.dat";
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
            System.out.println("The Object  was succesfully written to a file");
        } catch (Exception e) {
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
            System.out.println("The Object  was succesfully written to a file");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public Object recuperar(int tipo) {
        if (tipo == 0) {
            Selecciones a = new Selecciones();
            try {
                FileInputStream f = new FileInputStream(rutaS);
                ObjectInputStream o = new ObjectInputStream(f);
                a = (Selecciones) o.readObject(); // Obtengo Alumnos a del archivo
                o.close();
                f.close();
            } catch (EOFException e) {
                System.err.println(e.getMessage());
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            return a;
        } else {
            Jugadores a = new Jugadores();
            try {
                FileInputStream f = new FileInputStream(rutaJ);
                ObjectInputStream o = new ObjectInputStream(f);
                a = (Jugadores) o.readObject(); // Obtengo Alumnos a del archivo
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
}
