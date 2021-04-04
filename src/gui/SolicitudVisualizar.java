/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import acciones.SolicitudAcciones;
import clases.SolicitudesClass;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class SolicitudVisualizar extends Solicitud{
    final SolicitudesClass solicitudesClass;
    
    public SolicitudVisualizar(SolicitudesClass solicitudesClass){
           String auxGrupo = "";
           this.solicitudesClass = solicitudesClass;
           
           matriculaText.setEditable(false);
           matriculaText.setText(solicitudesClass.matricula);
           //matriculaText.setText(matriculaText.getText().toUpperCase());
           
           materiaText.setEditable(false);
           materiaText.setText(solicitudesClass.materia);
           
           programaText.setEditable(false);
           programaText.setText(solicitudesClass.programa);
           programaText.setText(programaText.getText().toUpperCase());
           
           grupoText.setEditable(true);
           auxGrupo = grupoText.getText();
           grupoText.setText(solicitudesClass.grupo);
           
           fechaSpinner.setEnabled(false);
           
           fechaSpinner.setValue(new Date (solicitudesClass.fechaMovimiento));

           modificarBtn.setVisible(true);
           eliminarBtn.setVisible(true);
    }

    @Override
    void eliminar() {
         try {
            SolicitudAcciones.eliminarSolicitud(solicitudesClass);
     //       Consultar.mostrar();

//            Consultar.solicitudList.clear();
//            consultar.solicitudPanel.removeAll();     
 //           consultar.cargarSolicitudes();
              
        } catch (SQLException ex) {
            Logger.getLogger(SolicitudVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    void modificar() {
        try {
            SolicitudAcciones.modificarTarea(solicitudesClass,solicitudesClass.grupo);
            //tareas.Tareas.principal.eliminarTarea(this);
        } catch (SQLException ex) {
            Logger.getLogger(SolicitudVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
