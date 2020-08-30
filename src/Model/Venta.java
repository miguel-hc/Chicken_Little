
package Model;

public class Venta {
    
    String Fecha;
    String NombreRuta;
    String NombreCliente;
    int NumeroRejas;
    int NumeroPollos;
    int kilogramo;
    int Precio;
    int PrecioTotal;
    String Ruta;
    
    public Venta(){
    
        Fecha = "";
        NombreRuta = "";
        NombreCliente = "";
        NumeroRejas = 0;
        NumeroPollos = 0;
        kilogramo = 0;
        Precio = 0;
        PrecioTotal = 0;
        Ruta = "";
        
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getNombreRuta() {
        return NombreRuta;
    }

    public void setNombreRuta(String NombreRuta) {
        this.NombreRuta = NombreRuta;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public int getNumeroRejas() {
        return NumeroRejas;
    }

    public void setNumeroRejas(int NumeroRejas) {
        this.NumeroRejas = NumeroRejas;
    }

    public int getNumeroPollos() {
        return NumeroPollos;
    }

    public void setNumeroPollos(int NumeroPollos) {
        this.NumeroPollos = NumeroPollos;
    }

    public int getKilogramo() {
        return kilogramo;
    }

    public void setKilogramo(int kilogramo) {
        this.kilogramo = kilogramo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(int PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }
    
    
    
}
