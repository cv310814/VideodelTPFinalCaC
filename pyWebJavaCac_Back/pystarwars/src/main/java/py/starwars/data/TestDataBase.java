package py.starwars.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDataBase {
    public static void main(String[] args) {
        // URL de conexión a la base de datos
        String jdbcUrl = "jdbc:mysql://localhost:3306/test_24115"; // Cambia 'tu_base_de_datos' por el nombre de tu base de datos
        String username = "root"; // Cambia 'tu_usuario' por tu usuario de MySQL
        String password = "&Gato7030#"; // Cambia 'tu_contraseña' por tu contraseña de MySQL

        try {
            // Establecer la conexión
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Conexión exitosa a la base de datos");

            // Crear una declaración
            Statement statement = connection.createStatement();

            // Ejecutar una consulta
            String sql = "SELECT * FROM movie"; // Cambia 'movies' por el nombre de tu tabla
            ResultSet resultSet = statement.executeQuery(sql);

            // Procesar los resultados
            while (resultSet.next()) {
                String nombre = resultSet.getString("nombre"); // Cambia 'nombre' por el nombre de tu columna
                String descripcion = resultSet.getString("descripcion"); // Cambia 'descripcion' por el nombre de tu columna
                // Obtén otros campos según sea necesario
                System.out.println("Nombre: " + nombre + ", Descripción: " + descripcion);
            }

            // Cerrar recursos
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
