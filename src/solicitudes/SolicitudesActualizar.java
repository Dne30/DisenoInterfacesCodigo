/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solicitudes;

import gui.Consultar;

/**
 *
 * @author Usuario
 */
public class SolicitudesActualizar {
    public static Consultar consultar;
    
    public SolicitudesActualizar(){
        consultar = new Consultar();
        consultar.setVisible(true);
        consultar.requestFocus();
    }
}
