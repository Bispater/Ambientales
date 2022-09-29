import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    //LECTURA DE ENTRADAS
    //Scanner entrada = new Scanner(System.in);
    //entrada = new Scanner(System.in);
    
    //COLECCIÓN DE USUARIOS, PUNTOS DE RECICLAJE Y ADMINISTRADOR;
    ArrayListo<Ciudades> ciudades = 
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
  
    ArrayList<Admin> admins = new ArrayList<Admin>();

    /*  Admin admin1 = new Admin() ; 
      admin1.CrearAdmin();
      admins.add(admin1) ;*/
    
    MenuPrincipal();

  public static int buscarUsuario(ArrayList<Usuario> usuarios) {
    Scanner entrada = new Scanner(System.in);
    String nombreUsuarioBuscar = entrada.next();
    for (int i = 0; i < usuarios.size(); i++) {
      if (usuarios.get(i).getNombres() == nombreUsuarioBuscar) {
        return 1;
      }
    }
    return 0;
  }

  public static int EditarUsuario(ArrayList<Usuario> usuarios) {
    Scanner entrada = new Scanner(System.in);
    Usuario usuarioAbuscar = new Usuario();
    System.out.println("Inserte nombre a buscar ");
    String nombreBuscado = entrada.next();
    int check = buscarNombre(usuarios, nombreBuscado, usuarioAbuscar);

    return check;
  }

  public static int buscarNombre(ArrayList<Usuario> usuarios, String nombreBuscar, Usuario usuarioAcambiar){

    for (int i = 0; i < usuarios.size(); i++) {
      if (usuarios.get(i).getNombres() == nombreBuscar) {
        usuarioAcambiar = usuarios.get(i);
        return 1;
      }

    }
    return 0;
  }
}