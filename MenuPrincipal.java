import java.util.Scanner ;

public class MenuPrincipal {

  //DECLARACIÓN DE ENTRADA
  Scanner entrada = new Scanner(System.in);
  int opcion;
  
  //MENÚ PRINCIPAL
  System.out.println("ESCOGA EL TIPO DE USUARIO : ");
  System.out.println("============================");
  System.out.println("1.- ADMINISTRADOR");
  System.out.println("2.- USUARIO NORMAL");
  System.out.println("============================");
  opcion=entrada.nextInt();
  //SWITCH DE OPCIONES

  switch (opcion) {
      case 1 :
          MenuAdministrador();
          break ;
      case 2 :
          MenuUsuario();
          break;
  }  

  //Menu usado para miembros de admins
  public static void MenuAdministrador() {
    int opcion = 0;
    
    //Opciones para ver o modificar usuarios o puntos de reciclaje
    while (opcion != -1) {
        System.out.println("elija opcion deseada");
        System.out.println("1 = Agregar ,editar ,buscar y mostrar usuarios ");
        System.out.println("2 = Agregar , editar ,buscar y mostrar puntos de reciclaje "); //En desarrollo
        System.out.println("3 = Agregar, eliminar, buscar noticias"); //En desarrollo
        System.out.println("5 Si desea terminar el proceso");
        opcion = entrada.nextInt();

       if(opcion==1 ){
          System.out.println("Elija que desea hacer : \n 1-Agregar \n 2-Editar \n 3-buscar \n 4- Mostrar usuarios ");
          opcion = entrada.nextInt();
          switch (opcion) {
              case 1:
                  int correcto = 1; //agregarUsuario(usuarios);
                  if (correcto == 1) {
                      System.out.println("Se agrego con exito");
                  }
                  else {
                      System.out.println("No se pudo agregar");
                  }
                  break;
              case 2:
                  correcto = 1; // EditarUsuario(usuarios);
                  if (correcto == 1) {
                      System.out.println("Se edito con exito");
                  }
                  else {
                      System.out.println("No se pudo agregar");
                  }
                  break;
              case 3:
                  correcto = 1; //buscarUsuario(usuarios);
                  if (correcto == 1) {
                      System.out.println("Se encontro con exito");
                  }
                  else {
                      System.out.println("No se pudo encontrar");
                  }
                  break;
              case 5 :
                  return;
          }
        }
    }
  }
    
  public static void MenuUsuario( ) { }

}