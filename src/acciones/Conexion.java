/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acciones;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Usuario
 */
public class Conexion {
    private static Connection connection;
    public final static Conexion instancia = new Conexion();
    
    
    public static PreparedStatement PreparedStatement(String sql) throws SQLException{
        return connection.prepareStatement(sql);
    }
    
    public static void cerrar() throws SQLException{
        connection.close();
    }
    
    public static PreparedStatement PrepareStatement(String sql,boolean b) throws SQLException{
        return connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    }
    
    private Conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String cadena = "jdbc:sqlite:materias.db";
        try {
            connection = DriverManager.getConnection(cadena);
        } catch (Exception ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null,ex);
        }
    }
}
