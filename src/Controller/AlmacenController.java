
package Controller;


public class AlmacenController {
    
    String Nombre;
    int PolloVivos;
    int PollosMuertos;
    int suma;
    
    public AlmacenController(){
        Nombre = "";
        PolloVivos = 0;
        PollosMuertos = 0;
        suma = 0;
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
    
    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }
    
}
