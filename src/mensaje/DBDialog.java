/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mensaje;

//import com.alee.laf.rootpane.WebDialog;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dialog.ModalityType;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

/**
 *
 * @author Gustavo Enrique Ruiz Cisneros
 * @workspace Casa
 * @date 24-abr-2013
 */
public class DBDialog extends Dialog {

    

    public DBDialog(Frame frame, String nombre,ModalityType t) {
        super(frame,nombre , ModalityType.MODELESS);
        //setPreferredSize(new Dimension(1024, 600));
        //setDefaultCloseOperation(Dialog.);
        setResizable(false);
        setModal(true);
        setMinimumSize(new Dimension(500, 300));
        setBackground(Color.WHITE);
        
        //setLocationRelativeTo(null);
       // posicion();
    }
    
    private Dimension posicion(){
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        
        int w = (dim.width - this.getWidth())/2;
        int h = (dim.height - this.getHeight())/2;
        
        setLocation(w, h);
        
        return null;
        
    }
}
