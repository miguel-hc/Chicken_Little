
package Model;


public class AsignarRutaModel {
    
    String Nombre;
    String Ruta;
    int Precio;
    String FechaEntrega;
    String FechaSalida;
    int Gasto;
    
    public AsignarRutaModel(){
        
        Nombre = "";
        Ruta = "";
        Precio = 0;
        FechaEntrega = "";
        FechaSalida = "";
        Gasto = 0;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public String getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public int getGasto() {
        return Gasto;
    }

    public void setGasto(int Gasto) {
        this.Gasto = Gasto;
    }
    
    
    
}
