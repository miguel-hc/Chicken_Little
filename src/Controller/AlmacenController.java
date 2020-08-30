
package Controller;


public class AlmacenController {
    
    int DniTransporte;
    String Nombre;
    int PolloVivos;
    int PollosMuertos;
    int Precio;
    String Fecha;
    int TotalAves;
    String NombreTransporte;
    String DescripcionTransporte;
    
    public AlmacenController(){
        DniTransporte = 0;
        Nombre = "";
        PolloVivos = 0;
        PollosMuertos = 0;
        Precio = 0;
        TotalAves = 0;
        Fecha = "";
        NombreTransporte = "";
        DescripcionTransporte = "";
    }

    public int getDniTransporte() {
        return DniTransporte;
    }

    public void setDniTransporte(int DniTransporte) {
        this.DniTransporte = DniTransporte;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPolloVivos() {
        return PolloVivos;
    }

    public void setPolloVivos(int PolloVivos) {
        this.PolloVivos = PolloVivos;
    }

    public int getPollosMuertos() {
        return PollosMuertos;
    }

    public void setPollosMuertos(int PollosMuertos) {
        this.PollosMuertos = PollosMuertos;
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

    public int getTotalAves() {
        return TotalAves;
    }

    public void setTotalAves(int TotalAves) {
        this.TotalAves = TotalAves;
    }

    public String getNombreTransporte() {
        return NombreTransporte;
    }

    public void setNombreTransporte(String NombreTransporte) {
        this.NombreTransporte = NombreTransporte;
    }

    public String getDescripcionTransporte() {
        return DescripcionTransporte;
    }

    public void setDescripcionTransporte(String DescripcionTransporte) {
        this.DescripcionTransporte = DescripcionTransporte;
    }
}
