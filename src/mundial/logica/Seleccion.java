package mundial.logica;

import java.io.Serializable;

public class Seleccion implements Serializable {

    private String pais;
    private String capital;
    private String dt;

    private String status;
    private int rank;
    
    private int grupo;
    
    private static final long serialVersionUID = 1L;

    public Seleccion() {
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Seleccion{" + "pais=" + pais + ", capital=" + capital + ", dt=" + dt + ", status=" + status + ", rank=" + rank + ", grupo=" + grupo + '}';
    }
}
