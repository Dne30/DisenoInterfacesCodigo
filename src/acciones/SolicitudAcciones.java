/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import clases.SolicitudesClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class SolicitudAcciones {


    public static void guardarSolicitud (SolicitudesClass solicitudClass) throws SQLException{
        long id = insertarSolicitud(solicitudClass);
        solicitudClass.setID(id);
    }
    
    static private long insertarSolicitud(SolicitudesClass solicitudClass) throws SQLException{
        String sql = "insert into solicitudes(matricula, materia, programa, grupo, TipoMovimiento, fechaMovimiento) "
                + "values (?,?,?,?,?,?);";
        PreparedStatement ps = Conexion.PreparedStatement(sql);
        ps.setString(1, solicitudClass.matricula);
        ps.setString(2, solicitudClass.materia);
        ps.setString(3, solicitudClass.programa);
        ps.setString(4, solicitudClass.grupo);
        ps.setString(5, solicitudClass.tipoMovimiento);
        ps.setLong(6, solicitudClass.fechaMovimiento);
        int id = 0;
        ps.execute();
        sql = "Select last_insert_rowid();";
        ps = Conexion.PrepareStatement(sql, true);
        ResultSet rs =  ps.executeQuery();
        if (rs.next()){
            id = rs.getInt(1);
        }
        return id;
    }
    
    public static ArrayList<SolicitudesClass> obtenerAcciones(String parametro) throws SQLException {
        String sql = "SELECT id, matricula, materia, programa, grupo, tipoMovimiento, \n" +
                     "       fechaMovimiento\n" +
                     "       FROM solicitudes\n" +
                     "       WHERE matricula = ? " +
                     "       ORDER BY fechaMovimiento";

        PreparedStatement ps = Conexion.PreparedStatement(sql);
        ps.setString(1,parametro);
        ArrayList<SolicitudesClass> list = new ArrayList<>();
        try (ResultSet rs = ps.executeQuery()){
            while (rs.next()){
                long id = rs.getLong("id");
                String matricula = rs.getString("matricula");
                String materia = rs.getString("materia");
                String programa = rs.getString("programa");
                String grupo = rs.getString("grupo");
                String tipoMovimiento = rs.getString("tipoMovimiento");
                long fechaMovimiento = rs.getLong("fechaMovimiento");
                SolicitudesClass solicitudclass  = new SolicitudesClass(id, matricula, materia,programa,grupo,tipoMovimiento, fechaMovimiento );
                list.add(solicitudclass);
            }
        }
        return list;    
    }
    
    public static void eliminarSolicitud(SolicitudesClass solicitudClass) throws SQLException {
        String sql = "delete from solicitudes  where id = ?";
        PreparedStatement ps = Conexion.PreparedStatement(sql);
        ps.setLong(1, solicitudClass.getID());
        ps.execute();
    }

    public static void modificarTarea(SolicitudesClass solicitudClass, String grupo) throws SQLException {
        String sql = "UPDATE solicitudes   SET grupo = ?, tipoMovimiento = ? WHERE id = ?";
        PreparedStatement ps = Conexion.PreparedStatement(sql);
        
        ps.setString(1,grupo);
        ps.setString(2,"C");
        ps.setLong(3, solicitudClass.getID());
        ps.execute();
    }
    
}
