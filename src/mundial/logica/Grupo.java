package mundial.logica;

import java.io.Serializable;

public class Grupo extends Selecciones implements Serializable {

    private String Letra;
    private Selecciones[] selecciones;

    public Grupo(String Letra, Selecciones[] selecciones) {
        this.Letra = Letra;
        this.selecciones = selecciones;
    }

    public Grupo() {
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    public Selecciones[] getSelecciones() {
        return selecciones;
    }

    public void setSelecciones(Selecciones[] selecciones) {
        this.selecciones = selecciones;
    }  

    @Override
    public String toString() {
        return "Grupo{" + "Letra=" + Letra + ", selecciones=" + selecciones + '}';
    }

}
