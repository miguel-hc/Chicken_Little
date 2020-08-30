
package Model;


public class Cliente {
   
   int Dni;
   String Nombre;
   String Apellidos;
   String Sexo;
   String Direcion;
   String Telefono;
   int Credito1;
   int Credito2;
   int Credito3;
   int Suma;
   String Ruta;
   
   public Cliente(){
   
       Nombre = "";
       Apellidos = "";
       Sexo = "";
       Direcion = "";
       Telefono = "";
       Ruta = "";
       Credito1 = 0;
       Credito2 = 0;
       Credito3 = 0;
   }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDirecion() {
        return Direcion;
    }

    public void setDirecion(String Direcion) {
        this.Direcion = Direcion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getRuta() {
        return Ruta;
    }

    public void setRuta(String Ruta) {
        this.Ruta = Ruta;
    }

    public int getCredito1() {
        return Credito1;
    }

    public void setCredito1(int Credito1) {
        this.Credito1 = Credito1;
    }

    public int getCredito2() {
        return Credito2;
    }

    public void setCredito2(int Credito2) {
        this.Credito2 = Credito2;
    }

    public int getCredito3() {
        return Credito3;
    }

    public void setCredito3(int Credito3) {
        this.Credito3 = Credito3;
    }
   
       public int getSuma() {
        return Suma;
    }

    public void setSuma(int Suma) {
        this.Suma = Suma;
    }
    
    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }
   
}
