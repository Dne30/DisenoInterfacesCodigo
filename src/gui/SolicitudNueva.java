/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import clases.SolicitudesClass;
import gui.AltaSolicitud;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class SolicitudNueva  extends Solicitud{
    
    public SolicitudNueva(){
        matriculaText.setEnabled(true);
        matriculaText.setText("");
        programaText.setEnabled(true);
        programaText.setText("");
        materiaText.setEnabled(true);
        materiaText.setText("");
        grupoText.setEnabled(true);
        grupoText.setText("");       
        fechaSpinner.setEnabled(true);
        modificarBtn.setVisible(false);
        eliminarBtn.setVisible(false);
    }
    
    SolicitudesClass getSolicitudesClass(){
        String matricula = matriculaText.getText();
        String materia = materiaText.getText();
        String programa = programaText.getText();
        String grupo = grupoText.getText();
        String tipoMov = "A";
        Date fecha = (Date) fechaSpinner.getValue();
        SolicitudesClass solicitudesClass = new SolicitudesClass(matricula, materia, programa, grupo, tipoMov, fecha.getTime());
        return solicitudesClass;
    }

    @Override
    void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
