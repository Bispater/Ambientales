//package Principal;
import java.util.Scanner;
public class Usuario {
    //Atributos
    private String Nombres;
    private String Apellidos;
    private int Edad;
    private String Rut;
    private String Email;
    private String Ciudad;

    Scanner leer = new Scanner(System.in);
    //Constructor
    public Usuario(){
        this.Nombres="";
        this.Apellidos="";
        this.Edad=0;
        this.Rut="";
        this.Email="";
        this.Ciudad="";
    }

    //Accesores
    public String getNombres() {
        return this.Nombres;
    }

    public String getApellidos() {
        return this.Apellidos;
    }

    public int getEdad() {
        return this.Edad;
    }

    public String getRut() {
        return this.Rut;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getCiudad() {
        return this.Ciudad;
    }

    //mutadores
    public void setNombres(String Nombres1) {
        this.Nombres = Nombres1;
    }

    public void setApellidos(String Apellidos1) {
        this.Apellidos = Apellidos1;
    }

    public void setEdad(int Edad1) {
        Edad = Edad1;
    }

    public void setRut(String Rut){
        this.Rut = Rut;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    //comportamientos CRUD
    public void CrearUsuario(){
        System.out.print("Nombres: ");
        this.setNombres(leer.nextLine());
        System.out.print("Apellidos:");
        this.setApellidos(leer.nextLine());
        System.out.print("Edad: ");
        this.setEdad(leer.nextInt());
        System.out.print("Rut: ");
        this.setRut(leer.nextLine());
        System.out.print("Email: ");
        this.setEmail(leer.nextLine());
        System.out.print("Ciudad donde vive:");
        this.setCiudad(leer.nextLine());
    }

    public void BuscarUsuario(String Rut){
        System.out.println("Buscar Usuario "+ Rut);
    }

    public void ActualizarUsuario (String Rut){
        System.out.println("Modificando al usuario "+ Rut);
    }

    public void EliminarUsuario (String Rut){
        System.out.println("Se ha eliminado el "+ Rut);
    }
}