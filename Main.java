import java.util.Scanner;
import java.util.ArrayList;

public class main {

    public static void main(String[] args){
        //ArrayList
        ArrayList <Admin> administradores = new ArrayList<>();
        ArrayList <PuntoReciclaje> puntosReciclaje = new ArrayList<>();

        int opcion;
        Scanner entrada = new Scanner(System.in);

        System.out.println("ESCOGA UNA OPCION : ");
        System.out.println("============================");
        System.out.println("1.- ADMINISTRADOR");
        System.out.println("2.- USUARIO NORMAL");
        System.out.println("============================");
        opcion=entrada.nextInt();
        
        Admin adm1 = new Admin();
        administradores.add(adm1);

        //SWITCH DE OPCIONES
        switch(opcion)
        {
            case 1 :
                MenuAdministrador(administradores);
                break ;
            case 2 :
                MenuUsuario(puntosReciclaje);
                break;
        }
    }
    
    public static void MenuAdministrador(ArrayList<Admin> admins){
        int ID;
        String contra;
        Scanner leer = new Scanner(System.in);
        int aux=0; 
        while(aux == 0){
            
            System.out.println("Ingrese ID:");
            ID = leer.nextInt();
            System.out.println("Ingrese contraseña");
            contra = leer.next();
        
            for(int i=0; i<admins.size(); i++){
                if(admins.get(i).getId() == ID && admins.get(i).getContrasenia().equals(contra)){
                    System.out.println("Acceso permitido");
                    aux = 1;
                }
            }
            System.out.println("Acceso denegado - intente nuevamente");
        }
    }
}
