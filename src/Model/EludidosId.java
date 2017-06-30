package Model;
// Generated Jun 29, 2017 6:13:26 PM by Hibernate Tools 4.3.1



/**
 * EludidosId generated by hbm2java
 */
public class EludidosId  implements java.io.Serializable {


     private int idEludidos;
     private int eventoIdFolioSistema;
     private int eventoSupervisorIdNumeroEmpleado;
     private int eventoCobradorIdNumeroEmpleado;
     private int eventoPeriodosTarifasIdPeriodoTarifa;

    public EludidosId() {
    }

    public EludidosId(int idEludidos, int eventoIdFolioSistema, int eventoSupervisorIdNumeroEmpleado, int eventoCobradorIdNumeroEmpleado, int eventoPeriodosTarifasIdPeriodoTarifa) {
       this.idEludidos = idEludidos;
       this.eventoIdFolioSistema = eventoIdFolioSistema;
       this.eventoSupervisorIdNumeroEmpleado = eventoSupervisorIdNumeroEmpleado;
       this.eventoCobradorIdNumeroEmpleado = eventoCobradorIdNumeroEmpleado;
       this.eventoPeriodosTarifasIdPeriodoTarifa = eventoPeriodosTarifasIdPeriodoTarifa;
    }
   
    public int getIdEludidos() {
        return this.idEludidos;
    }
    
    public void setIdEludidos(int idEludidos) {
        this.idEludidos = idEludidos;
    }
    public int getEventoIdFolioSistema() {
        return this.eventoIdFolioSistema;
    }
    
    public void setEventoIdFolioSistema(int eventoIdFolioSistema) {
        this.eventoIdFolioSistema = eventoIdFolioSistema;
    }
    public int getEventoSupervisorIdNumeroEmpleado() {
        return this.eventoSupervisorIdNumeroEmpleado;
    }
    
    public void setEventoSupervisorIdNumeroEmpleado(int eventoSupervisorIdNumeroEmpleado) {
        this.eventoSupervisorIdNumeroEmpleado = eventoSupervisorIdNumeroEmpleado;
    }
    public int getEventoCobradorIdNumeroEmpleado() {
        return this.eventoCobradorIdNumeroEmpleado;
    }
    
    public void setEventoCobradorIdNumeroEmpleado(int eventoCobradorIdNumeroEmpleado) {
        this.eventoCobradorIdNumeroEmpleado = eventoCobradorIdNumeroEmpleado;
    }
    public int getEventoPeriodosTarifasIdPeriodoTarifa() {
        return this.eventoPeriodosTarifasIdPeriodoTarifa;
    }
    
    public void setEventoPeriodosTarifasIdPeriodoTarifa(int eventoPeriodosTarifasIdPeriodoTarifa) {
        this.eventoPeriodosTarifasIdPeriodoTarifa = eventoPeriodosTarifasIdPeriodoTarifa;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof EludidosId) ) return false;
		 EludidosId castOther = ( EludidosId ) other; 
         
		 return (this.getIdEludidos()==castOther.getIdEludidos())
 && (this.getEventoIdFolioSistema()==castOther.getEventoIdFolioSistema())
 && (this.getEventoSupervisorIdNumeroEmpleado()==castOther.getEventoSupervisorIdNumeroEmpleado())
 && (this.getEventoCobradorIdNumeroEmpleado()==castOther.getEventoCobradorIdNumeroEmpleado())
 && (this.getEventoPeriodosTarifasIdPeriodoTarifa()==castOther.getEventoPeriodosTarifasIdPeriodoTarifa());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdEludidos();
         result = 37 * result + this.getEventoIdFolioSistema();
         result = 37 * result + this.getEventoSupervisorIdNumeroEmpleado();
         result = 37 * result + this.getEventoCobradorIdNumeroEmpleado();
         result = 37 * result + this.getEventoPeriodosTarifasIdPeriodoTarifa();
         return result;
   }   


}


