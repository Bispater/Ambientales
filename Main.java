import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static Scanner entrada;

    public static void main(String[] args){
        int opcion;
        //ArrayList
        ArrayList <Admin> administradores = new ArrayList<>();
        ArrayList <PuntoReciclaje> puntosReciclaje = new ArrayList<>();
        ArrayList <Noticias> ListaNoticias = new ArrayList<>();
        entrada = new Scanner(System.in);

        do{
            System.out.println("============================");
            System.out.println("1.- ADMINISTRADOR");
            System.out.println("2.- USUARIO NORMAL");
            System.out.println("0.- EXIT");
            System.out.println("============================");
            System.out.print("ESCOGA UNA OPCION: ");
            opcion=entrada.nextInt();

            //Prueba
            Admin adm1 = new Admin();
            administradores.add(adm1);
            //PuntoReciclaje pto1 = new PuntoReciclaje();
            //pto1.CrearPuntoReciclaje();
            //puntosReciclaje.add(pto1);
            //-----------------

            switch(opcion)
            {
                case 1 :
                    MenuAdministrador(administradores, puntosReciclaje, ListaNoticias);
                    break ;
                case 2 :
                    MenuUsuario(puntosReciclaje, ListaNoticias);
                    break;
                case 0 :
                    return;
            }
        }while(true);
    }

    public static void MenuAdministrador(ArrayList<Admin> admins, ArrayList<PuntoReciclaje>puntos, ArrayList <Noticias> LNoticias){
        int ID;
        String contra;
        int validador=0, flag=0;
        Admin adminNuevo = null;


        do{
            System.out.print("Ingrese ID: ");
            ID = entrada.nextInt();

            //Valdiacion de formato de datos
            if(ID>0){
                flag = 1;   //Formato del ID correcto
            }
            else {
                System.out.println("Formato del identificador incorrecto");
            }
        }while(flag==0);

        //Valdiacion de formato de datos
        System.out.print("Ingrese contraseña: ");
        contra = entrada.next();
        while(!contra.matches("[a-zA-Z]*")){
            System.out.println("El dato es incorrecto, debe recibir solo letras minusculas o mayusculas");
            System.out.print("Ingrese contraseña: ");
            contra = entrada.next();
        }

        for(int i=0; i<admins.size(); i++){
            if(admins.get(i).getId() == ID && admins.get(i).getContrasenia().equals(contra)){
                adminNuevo = admins.get(i);
                System.out.println("------------Acceso permitido--------------");
                validador = 1;
            }
        }
        if(validador==0){
            System.out.println("Acceso denegado - intente nuevamente");
        }

        do {
            System.out.println("ELIJA UNA OPCION:");
            System.out.println("1) Mostrar puntos de reciclaje\n2) Agregar administrador\n3) Agregar punto de reciclaje\n4) Agregar noticia\n5) Presione 0 para salir");
            System.out.print("OPCION:");
            int opcion = entrada.nextInt();

            switch (opcion) {
                case 0:
                    validador=1;
                    return;
                case 1:
                    adminNuevo.mostrarPuntosReciclaje(puntos);
                    break;
                case 2:
                    adminNuevo.agregarAdmin(admins);
                    break;
                case 3:
                    adminNuevo.agregarPuntosReciclaje(puntos);
                    break;
                case 4:
                    adminNuevo.agregarNoticia(LNoticias);
                    break;
                default:
                    System.out.println("No se seleciono ninguna opcion valida, vuelva intentarlo");
                    break;
            }
        }while(validador!=0);
    }

    public static void MenuUsuario(ArrayList<PuntoReciclaje>ptoReciclaje, ArrayList<Noticias> ListaNoticias){
        int opcion;
        Usuario UsuarioActual = new Usuario();

        System.out.print("Ingrese su nombre: ");
        UsuarioActual.setNombre(entrada.nextLine());
        System.out.print("Ingrese sus apellido: ");
        UsuarioActual.setApellidos(entrada.nextLine());
        System.out.print("Ingrese la ciudad donde se encuentra: ");
        UsuarioActual.setCiudad(entrada.nextLine());

        System.out.println("ELIJA UNA OPCION:");
        System.out.println("1) Puntos de reciclaje cercanos\n2) Presentar noticias\n3) Recomendar punto de reciclaje\n4) Presione 0 para salir");
        System.out.print("OPCION:");
        opcion = entrada.nextInt();

        switch (opcion){
            case 0 :
                return;
            case 1 : UsuarioActual.PtoReciclajeCercano(ptoReciclaje);
                break;
            case 2 : UsuarioActual.MostrarNoticiasDisponibles(ListaNoticias);
                break;
            case 3 :
                break;
        }
    }
}