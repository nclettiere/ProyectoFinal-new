package mundial.persistencia;

import java.io.*;
import mundial.logica.Grupos;
import mundial.logica.Jugadores;
import mundial.logica.Selecciones;

public class Archivos {

    private static Archivos instancia;
    private final String rutaS; // selecciones.dat
    private final String rutaJ; // jugadores.dat
    private final String rutaG; // grupos.dat

    private Archivos() {
        rutaS = "C:\\Users\\Valholl\\Documents\\NetBeansProjects\\ProyectoFinal-new\\src\\mundial\\persistencia\\selecciones.dat";
        rutaJ = "C:\\Users\\Valholl\\Documents\\NetBeansProjects\\ProyectoFinal-new\\src\\mundial\\persistencia\\jugadores.dat";
        rutaG = "C:\\Users\\Valholl\\Documents\\NetBeansProjects\\ProyectoFinal-new\\src\\mundial\\persistencia\\grupos.dat";
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
            System.out.println("The Object  was succesfully written to a file");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void guardarGrupos(Grupos grupo) {
        try {
            FileOutputStream fileOut = new FileOutputStream(rutaG);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject((Object) grupo);
            objectOut.close();
            fileOut.close();
            System.out.println("The Object  was succesfully written to a file");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public Object recuperar(int tipo) {
        switch (tipo) {
            case 0:
            {
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
            case 1:
            {
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
            default:
            {
                Grupos a = new Grupos();
                try {
                    FileInputStream f = new FileInputStream(rutaG);
                    ObjectInputStream o = new ObjectInputStream(f);
                    a = (Grupos) o.readObject(); // Obtengo Grupos a del archivo
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
}
