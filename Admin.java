import java.util.Scanner;
import java.util.ArrayList;
public class Admin {
    //Atributos
    private String Nombres;
    private int id ;
    private String Contrasenia;

    Scanner entrada = new Scanner(System.in);

    //Constructores
    public Admin() {
        this.Nombres = "";
        this.id = -1;
        this.Contrasenia = "";
    }

    //Comportamientos
    public void CrearAdmin(){
        System.out.println("Inserte nombre de admin");
        this.Nombres= entrada.next();
        System.out.println("Inserte ID:");
        this.id=entrada.nextInt();
        System.out.println("Ingrese contraseña:");
        this.Contrasenia=entrada.next();
    }
  
    public boolean validarAdministrador(Admin admins, int id, String contrasenia){
      if((admins.Contrasenia == contrasenia)&(admins.id == id)){
        System.out.println("Ingreso Exitoso");
        return true;
      }
      return false;
    }

    public static int agregarUsuario(ArrayList<Usuario> usuarios) {
    int i;
    Usuario usuarioNuevo = new Usuario();
    usuarioNuevo.CrearUsuario();
    for (i = 0; i <= usuarios.size(); i++) {
      if (usuarios.get(i) == null) {
        usuarios.add(usuarioNuevo);
        return 1;
      }
    }
    return 0;
  }

    //Geters y setters 
    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContrasenia() {
        return this.Contrasenia;
    }

    public void setContrasenia(String contrasenia) {
      this.Contrasenia = contrasenia;
    }
}

