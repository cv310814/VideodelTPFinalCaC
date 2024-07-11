package py.starwars.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;



public class Conexion {

    private final static String JDBC_URL = "jdbc:mysql://localhost:3306/test_24115";//?useSSL=false&useTimeZone=true&serverTimeZone=UTC&allowPublicKeyRetrieval=true";

    private final static String JDBC_USER = "root"; //usuario
    
    private final static String JDBC_PASS = "&Gato7030#"; //contraseña

    public static DataSource getDataSource(){

        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASS);
        ds.setInitialSize(20);
        return ds;
    }

    public static Connection getConexion() throws SQLException { 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
      
          } catch(ClassNotFoundException cnfe) {
            cnfe.printStackTrace(System.out);
          }
          return getDataSource().getConnection();
        }
    
    //Cerrar las conexiones buena práctica
    public static void close(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
    }

    public static void close(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
    }

    public static void close(Connection cn) {
        if (cn != null) {
            try {
                cn.close();
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
    }
    /*
    //Cerrar las conexiones buena práctica
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }

    public static void close(Statement st) throws SQLException{
        st.close();
    }

    public static void close(Connection cn) throws SQLException{
        cn.close();
    }
        */

}
