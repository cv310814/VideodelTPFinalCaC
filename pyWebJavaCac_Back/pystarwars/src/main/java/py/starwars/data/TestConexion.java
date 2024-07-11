package py.starwars.data;

import java.sql.SQLException;
import java.sql.Connection;
public class TestConexion {
    public static void main(String[] args) {
        try {
            // Intentar obtener una conexión
            Connection connection = Conexion.getConexion();
            
            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                
                // Cerrar la conexión
                Conexion.close(connection);
            } else {
                System.out.println("Fallo en la conexión a la base de datos.");
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
    }
}
