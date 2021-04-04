/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Usuario
 */
public class SolicitudesClass {
    
    long solicitudID;
    public final String matricula;
    public final String materia;
    public final String programa;
    public final String grupo;
    public final String tipoMovimiento;
    public final long fechaMovimiento;
    
    /**
     *
     */
    public void SolicitudesClass(){};

    public SolicitudesClass(String matricula, String materia, String programa, 
                            String grupo,String tipoMovimiento,long fechaMovimiento ){
        
        this.matricula =  matricula;
        this.materia = materia;
        this.programa = programa;
        this.grupo = grupo;
        this.tipoMovimiento = tipoMovimiento;
        this.fechaMovimiento = fechaMovimiento;
    }
    
    public SolicitudesClass(long solicitudID, String matricula, String materia,
                            String programa,String grupo,String tipoMovimiento,
                            long fechaMovimiento ){
        this.solicitudID = solicitudID;
        this.matricula =  matricula;
        this.materia = materia;
        this.programa = programa;
        this.grupo = grupo;
        this.tipoMovimiento = tipoMovimiento;
        this.fechaMovimiento = fechaMovimiento;
    }
    
    
    public void setID(long solicitudID){
        this.solicitudID = solicitudID;
    }
         
   public long getID(){
        return solicitudID;
    } 
}
