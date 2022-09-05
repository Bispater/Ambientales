
public class Usuario {
    
    //metodos
    private String Nombres;
    private String Apellidos;
    private int Edad;
    private int Rut;
    private String Email;
    private String Ciudad;
    private String Pais;
    
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
  
    public String getPais() {
        return Pais;
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
  
    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    
    
    //comportamientos 
    
    public void CrearUsuario(Usuario Objeto){
        
        System.out.println("Nombres:"+ Objeto.Nombres);
        System.out.println("Apellidos:"+ Objeto.Apellidos);
        System.out.println("Rut:"+ Objeto.Rut);
        System.out.println("Email:"+ Objeto.Email);
        
    }
    
    public void LeerEstudiante(int Rut){
        System.out.println("Buscar Usuario "+ Rut);
    }
    
    public void ActualizarEstudiante (int Rut){
        System.out.println("Modificando al usuario "+ Rut);
    }
    
    public void EliminarEstudiante (int Rut){
        System.out.println("Se ha eliminado el "+ Rut);
    }
    
    
    
    
}