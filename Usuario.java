import java.util.ArrayList;
import java.util.Scanner;
public class Usuario {
    //Atributos
    private String Nombre;
    private String Apellidos;
    private String Ciudad;

    Scanner leer = new Scanner(System.in);
    //Constructor
    public Usuario(){
        this.Nombre="";
        this.Apellidos="";
        this.Ciudad="";
    }

    //Getters & Setters
    public String getNombre() {
        return this.Nombre;
    }
    public String getApellidos() {
        return this.Apellidos;
    }
    public String getCiudad() {
        return this.Ciudad;
    }
    public void setNombre(String Nombre1) {
        this.Nombre = Nombre1;
    }
    public void setApellidos(String Apellidos1) {
        this.Apellidos = Apellidos1;
    }
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    //Comportamientos y metodos
    public void PtoReciclajeCercano(ArrayList<PuntoReciclaje> ListaPuntosR){
        PuntoReciclaje ptoReciclaje = new PuntoReciclaje();
        for(int i=0; i<ListaPuntosR.size(); i++){
            if(ListaPuntosR.get(i).getCiudad().equals(this.Ciudad)){
                ptoReciclaje.MostrarPtoReciclaje(ListaPuntosR,i);
            }
        }
    }

    public void MostrarNoticiasDisponibles(ArrayList<Noticias> ListaNoticias){
        Noticias noticias = new Noticias();
        for(int i=0; i< ListaNoticias.size(); i++){
            System.out.println("============NOTICIA "+(i+1)+"=============");
            noticias.PresentarNoticia(ListaNoticias.get(i));
        }
    }

    /*public void CrearUsuario(){ //Leer datos usuario
        System.out.print("Nombres: ");
        this.setNombre(leer.nextLine());
        System.out.print("Apellidos:");
        this.setApellidos(leer.nextLine());
        System.out.print("Rut: ");
        this.setRut(leer.nextLine());
        System.out.print("Ciudad donde vive:");
        this.setCiudad(leer.nextLine());
    }*/

}