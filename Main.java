import java.util.Scanner ;
import java.util.ArrayList;
public class Main {
   static Scanner entrada = new Scanner(System.in);


    public static void main(String[] args) {
        entrada = new Scanner(System.in);
        //Arreglo donde cargamos los usuarios inscritos
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        //Arreglo de puntos de reciclajes cargados
            
        ArrayList<PuntoReciclaje> puntosDeReciclajes = new ArrayList<PuntoReciclaje>();
        
        ArrayList<Admin> admins = new ArrayList<Admin>() ; 
        int opcion = 0;
        System.out.println("elija el tipo de cuenta \n 1)Admin 2)\n Usuario ");
        opcion=entrada.nextInt(); 
        switch (opcion) {
            case 1 :
                MenuAdmin(admins , puntosDeReciclajes);
                break ; 
            case 2 : 
                MenuUsuario(usuarios , puntosDeReciclajes); 
        }   
    
    
    }


    public static void MenuUsuario( ArrayList<Usuario> usuarios , ArrayList<PuntoReciclaje> puntos  ) {
    

    }


  
    public static void MenuAdmin(ArrayList<Admin> admins , ArrayList<PuntoReciclaje> puntos)
    {
        int opcion = 0;

        while (opcion != -1) {
            System.out.println("elija opcion deseada");
            System.out.println("1 = Agregar ,editar ,buscar y mostrar usuarios ");
            System.out.println("2 = Agregar , editar ,buscar y mostrar puntos de reciclaje ");
            System.out.println("5 Si desea terminar el proceso");
            opcion = entrada.nextInt();


        }

        if(opcion==1 )
        {
            System.out.println("Que desea hacer");
            System.out.println("1 = Agregar usuario \n 2 = Editar usuario \n 3= Buscar usuario \n 4 Mostrar usuarios");
            opcion=entrada.nextInt();
            switch (opcion)
            {
                case 1 :
                    int correcto = agregarUsuario();
                    if(correcto==1 ){
                        System.out.println("Se agrego con exito");
                    }
                    else {
                        System.out.println("No se pudo agregar");
                    }
                    break ;
                case 2 :
                    int correcto = EditarUsuario();
                    if(correcto==1 ){
                        System.out.println("Se agrego con exito");
                    }
                    else {
                        System.out.println("No se pudo agregar");
                    }
                    break ;
                case 3:
                    int correcto = buscarUsuario();
                    if(correcto==1 ){
                        System.out.println("Se encontro con exito");
                    }
                    else {
                        System.out.println("No se pudo encontrar");
                    }
                    break ;

            }
        }
        if(opcion==5 )
        {
            return;
        }
    }
   
}

