
package packTurista;

import java.time.zone.ZoneOffsetTransitionRule;


public class Turistas {
 
    String NombreT;
    String ApellidoT;
    String TID;
    String IDTurista;
    String TipoReser;
    String Reserva;
    String CheckIn;
    String CheckOut;
    String CantidadPersonas;
    
    
    
    public Turistas() {
        
    }
    
    public Turistas(String nombreT, String ApellidoT, String Tide,String IDT, String Reser, String Treser, String Checki, String Checko, String Cant ) {
        this.NombreT = nombreT;
        this.ApellidoT = ApellidoT;
        this.TID = Tide;
        this.IDTurista =  IDT;
        this.TipoReser = Treser;
        this.Reserva = Reser;
        this.CheckIn = Checki;
        this.CheckOut = Checko;
        this.CantidadPersonas = Cant;
        
        
    }
    


     public String getNombreT() {
        return NombreT;
    }

    public void setNombreT(String nombreT) {
        this.NombreT = nombreT;
    }

    public String getApellidoT() {
        return ApellidoT;
    }

    public void setApellidoT(String apellidoT) {
        this.ApellidoT = apellidoT;
    }

    public String getTID() {
        return TID;
    }

    public void setTID(String TID) {
        this.TID = TID;
    }

    public String getIDTurista() {
        return IDTurista;
    }

    public void setIDTurista(String IDTurista) {
        this.IDTurista = IDTurista;
    }

    public String getTipoReser() {
        return TipoReser;
    }

    public void setTipoReser(String tipoReser) {
        this.TipoReser = tipoReser;
    }

    public String getReserva() {
        return Reserva;
    }

    public void setReserva(String reserva) {
        this.Reserva = reserva;
    }

    public String getCheckIn() {
        return CheckIn;
    }

    public void setCheckIn(String checkIn) {
        this.CheckIn = checkIn;
    }

    public String getCheckOut() {
        return CheckOut;
    }

    public void setCheckOut(String checkOut) {
        this.CheckOut = checkOut;
    }

    public String getCantidadPersonas() {
        return CantidadPersonas;
    }

    public void setCantidadPersonas(String cantidadPersonas) {
        this.CantidadPersonas = cantidadPersonas;
    }

    @Override
    public String toString() {
        return "Turistas{" +
                "NombreT='" + NombreT + '\'' +
                ", ApellidoT='" + ApellidoT + '\'' +
                ", TID='" + TID + '\'' +
                ", IDTurista='" + IDTurista + '\'' +
                ", TipoReser='" + TipoReser + '\'' +
                ", Reserva='" + Reserva + '\'' +
                ", CheckIn='" + CheckIn + '\'' +
                ", CheckOut='" + CheckOut + '\'' +
                ", CantidadPersonas='" + CantidadPersonas + '\'' +
                '}';
    }
}