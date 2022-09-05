
public class Usuario {
    
    //Atributos
    private String Nombres;
    private String Apellidos;
    private int Edad;
    private int Rut;
    private String Email;
    private String Ciudad;
    
    //Accesores
    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public int getRut() {
        return Rut;
    }

    public String getEmail() {
        return Email;
    }
  
    public String getCiudad() {
        return Ciudad;
    }
  
    
    //mutadores
    public void setNombres(String Nombres1) {
        Nombres = Nombres1;
    }

    public void setApellidos(String Apellidos1) {
        Apellidos = Apellidos1;
    }

    public void setEdad(int Edad1) {
        Edad = Edad1;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
  
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

  
    //comportamientos CRUD
    
    public void CrearUsuario(Usuario Objeto){

      
        System.out.println("Nombres:"+ Objeto.Nombres);
        System.out.println("Apellidos:"+ Objeto.Apellidos);
        System.out.println("Rut:"+ Objeto.Rut);
        System.out.println("Email:"+ Objeto.Email);
        
    }
    
    public void BuscarUsuario(int Rut){
        System.out.println("Buscar Usuario "+ Rut);
    }
    
    public void ActualizarUsuario (int Rut){
        System.out.println("Modificando al usuario "+ Rut);
    }
    
    public void EliminarUsuario (int Rut){
        System.out.println("Se ha eliminado el "+ Rut);
    }
    
    
}