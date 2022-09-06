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
        //Arreglo de adminintradores de los puntos de reciclaje
        ArrayList<Admin> admins = new ArrayList<Admin>() ;
        int opcion = 0;
        System.out.println("elija el tipo de cuenta \n 1)Admin 2)\n Usuario ");
        opcion=entrada.nextInt();
        switch (opcion) {
            case 1 :
                MenuAdmin(admins , puntosDeReciclajes , usuarios);
                break ;
            case 2 :
                MenuUsuario(usuarios , puntosDeReciclajes );
                break ;
        }

    }
    //Termino del main
    public static void MenuUsuario( ArrayList<Usuario> usuarios , ArrayList<PuntoReciclaje> puntos  ) {


    }
    public static void MenuAdmin(ArrayList<Admin> admins , ArrayList<PuntoReciclaje> puntos , ArrayList<Usuario>usuarios)
    {
        int opcion = 0;

        while (opcion != -1) {
            System.out.println("elija opcion deseada");
            System.out.println("1 = Agregar ,editar ,buscar y mostrar usuarios ");
            System.out.println("2 = Agregar , editar ,buscar y mostrar puntos de reciclaje ");
            System.out.println("5 Si desea terminar el proceso");
            opcion = entrada.nextInt();

        

            switch (opcion)
            {
                case 1 :
                    int correcto = agregarUsuario( usuarios);
                    if(correcto==1 ){
                        System.out.println("Se agrego con exito");
                    }
                    else {
                        System.out.println("No se pudo agregar");
                    }
                    break ;
                case 2 :
                     correcto = EditarUsuario(usuarios );
                    if(correcto==1 ){
                        System.out.println("Se edito con exito");
                    }
                    else {
                        System.out.println("No se pudo agregar");
                    }
                    break ;
                case 3:
                    correcto = buscarUsuario();
                    if(correcto==1 ){
                        System.out.println("Se encontro con exito");
                    }
                    else {
                        System.out.println("No se pudo encontrar");
                    }
                    break ;
                if(opcion==5 )
                {
                    return;
                }
            }
          }
    }
    public static int EditarUsuario(ArrayList<Usuario> usuarios)
    {
        Scanner entrada = new Scanner(System.in) ;
        Usuario usuarioAbuscar= new Usuario(); 
        System.out.println("Inserte nombre a buscar ");
        String nombreBuscado = entrada.next(); 
       int check = buscarNombre(usuarios , nombreBuscado , usuarioAbuscar) ;   
        
        return check ;     
    }
    public static int buscarNombre(ArrayList<Usuario>usuarios , String nombreBuscar , Usuario usuarioAcambiar)
    {
        
        for(int i = 0 ; i<usuarios.size() ; i++)
        {
            if(usuarios.get(i).getNombres() == nombreBuscar )
            {
                usuarioAcambiar= usuarios.get(i);
                return 1 ; 
                
            }
            
        }
        
        
        return 0 ; 
    }
    public static int agregarUsuario( ArrayList<Usuario> usuarios )
    {
        int i ;
        Usuario usuarioNuevo = new Usuario();
        usuarioNuevo.CrearUsuario();
        for( i=0 ; i <= usuarios.size() ; i++)
        {
            if (usuarios.get(i) == null  ) {
                usuarios.add(usuarioNuevo) ;
                return 1;
            }

        }
        return 0 ;
    }
    
}

