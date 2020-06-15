
package Controller;

public class RutasController {
    
    int dnireja;
    int numero;
    float kg;
    float precio;
    String fecha;
    String NombreEmpleado;
    String NombreRuta;
    float PrecioEnKg;
    String FechaSalida;
    String Fechallegada;
    String NombreTransporte;
    String Descripcion;

    public String getNombreTransporte() {
        return NombreTransporte;
    }

    public void setNombreTransporte(String NombreTransporte) {
        this.NombreTransporte = NombreTransporte;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    public RutasController(){
        dnireja = 0; 
        numero = 0;
        kg = 0;
        precio = 0;
        fecha = "";
        NombreEmpleado = "";
        NombreRuta = "";
        PrecioEnKg = 0;
        FechaSalida = ""; 
        Fechallegada = "";
        NombreTransporte = "";
        Descripcion = "";
        
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public void setNombreEmpleado(String NombreEmpleado) {
        this.NombreEmpleado = NombreEmpleado;
    }

    public String getNombreRuta() {
        return NombreRuta;
    }

    public void setNombreRuta(String NombreRuta) {
        this.NombreRuta = NombreRuta;
    }

    public float getPrecioEnKg() {
        return PrecioEnKg;
    }

    public void setPrecioEnKg(float PrecioEnKg) {
        this.PrecioEnKg = PrecioEnKg;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public String getFechallegada() {
        return Fechallegada;
    }

    public void setFechallegada(String Fechallegada) {
        this.Fechallegada = Fechallegada;
    }

    public int getDnireja() {
        return dnireja;
    }

    public void setDnireja(int dnireja) {
        this.dnireja = dnireja;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getKg() {
        return kg;
    }

    public void setKg(float kg) {
        this.kg = kg;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
