import java.util.Scanner;
import java.util.ArrayList;

public class Admin {
    // Atributos
    private String Nombres;
    private int id;
    private String Contrasenia;

    Scanner entrada = new Scanner(System.in);

    // Constructores
    public Admin() {
        this.Nombres = "";
        this.id = 1;
        this.Contrasenia = "a";
    }

    // Geters y setters
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

    //Comportamientos
    public void CrearAdmin() {
        String contrasenia, nombre;
        int ID, flag=0;

        //Valdiacion de formato de datos
        System.out.print("Inserte nombre de administrador: ");
        nombre = entrada.nextLine();
        while(!nombre.matches("[a-zA-Z]+([ '][a-zA-Z]+)*")){
            System.out.println("El dato es incorrecto, debe recibir solo letras minusculas o mayusculas");
            System.out.print("Inserte nombre de administrador: ");
            nombre = entrada.nextLine();
        }

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

        System.out.print("Ingrese contraseña:");
        contrasenia = entrada.next();
        while(!contrasenia.matches("[a-zA-Z]*")){
          System.out.println("El dato es incorrecto, debe escribir solo letras minusculas o mayusculas con nombre y apellido");

            System.out.print("Ingrese contraseña:");
            contrasenia = entrada.next();
        }

        this.Nombres = nombre;
        this.id = ID;
        this.Contrasenia = contrasenia;
    }
    public void mostrarPuntosReciclaje(ArrayList<PuntoReciclaje>puntos){
        PuntoReciclaje ptoReciclaje = new PuntoReciclaje();
        for(int i= 0 ; i< puntos.size() ; i ++) {
            ptoReciclaje.MostrarPtoReciclaje(puntos, i);
        }
    }
    public void agregarAdmin(ArrayList<Admin> admins) {
        Admin adminNuevo = new Admin();
        adminNuevo.CrearAdmin();
        admins.add(adminNuevo);
        System.out.println("Se agrego exitosamente...");
    }
    public void agregarPuntosReciclaje(ArrayList<PuntoReciclaje>ptos)
    {
        PuntoReciclaje ptoNuevo = new PuntoReciclaje() ;
        ptoNuevo.CrearPuntoReciclaje();
        ptos.add(ptoNuevo);
        System.out.print("Se agrego exitosamente...");
    }
    public void agregarNoticia(ArrayList<Noticias> ListaNoticias){
        Noticias noticia = new Noticias();
        noticia.CrearNoticia();
        ListaNoticias.add(noticia);
        System.out.print("Se agrego exitosamente...");
    }
}