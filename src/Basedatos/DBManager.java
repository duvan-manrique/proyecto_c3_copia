package Basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//clase que me ayuda a la apertura de la base de datos
public class DBManager {
    // JDBC driver name and database URL
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    private final String DB_URL = "jdbc:mysql://localhost:3306/parques?useSSL=false";//link de la base de daatos en uso 
    
    //  Database credentials
    private static final String USER = "root";
    private static final String PASS = "";
    
    private Connection conn = null;
    
    public Connection open() {//metodo para la apertura de la base de datos
        try {
            Class.forName(JDBC_DRIVER);
            try {
            	conn = DriverManager.getConnection(DB_URL, USER, PASS);
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("No se pudo conectar a la base de datos"); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver no encontrado"); 
        }
        return conn;
    }
    
    public void close(){//metodo para cerrar la coneccion a la base de datos
    	try {
			conn.close();
		} catch (SQLException e) {
            System.out.println("No se pudo cerrar la conexi�n"); 
		}
    }
}

