package mundial.logica;

import java.io.Serializable;

public class Jugador extends Selecciones implements Serializable {
    private String nombre;
    private String apellido;
    private String fechaNac;
    private double altura;
    private double peso;
    private String pais;
    private String club;
    private int debut;
    private String[] posicion;
    
    private int dia;
    private int mes;
    private int anio;

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getDebut() {
        return debut;
    }

    public void setDebut(int debut) {
        this.debut = debut;
    }

    public String[] getPosicion() {
        return posicion;
    }

    public void setPosicion(String[] posicion) {
        this.posicion = posicion;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
   

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + ", altura=" + altura + ", peso=" + peso + ", pais=" + pais + ", club=" + club + ", debut=" + debut + ", posicion=" + posicion + ", dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
}
