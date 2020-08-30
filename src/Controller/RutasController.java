
package Controller;

public class RutasController {
    
    String Ruta;
    String Transporte;
    String Empleado;
    int NumeroReja;
    int NumeroPollos;
    int Kg;
    int Precio;
    String Fecha;
    
    public RutasController(){
    
        Ruta = "";
        Transporte = "";
        Empleado = "";
        NumeroReja = 0;
        NumeroPollos = 0;
        Kg = 0;
        Precio = 0;
        Fecha = "";
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public String getTransporte() {
        return Transporte;
    }

    public void setTransporte(String Transporte) {
        this.Transporte = Transporte;
    }

    public String getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(String Empleado) {
        this.Empleado = Empleado;
    }

    public int getNumeroReja() {
        return NumeroReja;
    }

    public void setNumeroReja(int NumeroReja) {
        this.NumeroReja = NumeroReja;
    }

    public int getNumeroPollos() {
        return NumeroPollos;
    }

    public void setNumeroPollos(int NumeroPollos) {
        this.NumeroPollos = NumeroPollos;
    }

    public int getKg() {
        return Kg;
    }

    public void setKg(int Kg) {
        this.Kg = Kg;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
}
