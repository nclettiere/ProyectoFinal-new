package mundial.controlador;

import java.sql.*;
import mundial.logica.Jugador;

public class ControladorBD {

    private static ControladorBD instancia;
    private Connection con;
    private String driver;
    private String url;
    private String usuario;
    private String password;

    private ControladorBD() {
        con = null;
        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/escuela";
        usuario = "root"; // Cambiar por el usuario de la bd
        password = "password"; // Cambiar por la contraseña válida
    }

    public static ControladorBD getInstancia() {
        if (instancia == null) {
            instancia = new ControladorBD();
        }
        return instancia;
    }

    private Connection getConnection() throws Exception {
        Class.forName(driver); // Establecer y devolver la conexion
        con = DriverManager.getConnection(url, usuario, password);
        return con;
    }

    public void setAlumno(Jugador a) throws Exception {
        Connection conn = getConnection();
        conn.setAutoCommit(false);
        String insertar = "insert into alumno(cedula,anio,cuotaColegio) "
                + "values(?,?,?)";
        PreparedStatement st = conn.prepareStatement(insertar);
        st.setString(1, a.getFechaNac());
        st.setInt(2, a.getDebut());
        st.setDouble(3, a.getAltura());
        st.executeUpdate();
        conn.commit();
        conn.close();
    }
}
