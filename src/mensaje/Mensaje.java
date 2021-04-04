/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensaje;

import javafx.scene.layout.Pane;

/**
 *
 * @author Usuario
 */
public class Mensaje {
    public static final String CAMBIOS_OK = "Cambios realizados exitosamente!";
    public static final String ALTA_OK = "Alta realizada exitosamente!";


    public Mensaje(){
    }
    
     public static void confirm( String message) {
      //  DBDialog.showMessageDialog( message, "Éxito","Movimiento Exitoso");
    }
}

