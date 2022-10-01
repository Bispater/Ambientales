import java.util.Scanner;
import java.util.ArrayList;
public class PuntoReciclaje {
    Scanner leer = new Scanner(System.in);

    //Atributos
    private String Direccion;
    private boolean Habilitado;
    private String TipoReciclaje;
    // LA CAPACIDAD SERÁ EN KILOS
    private int Capacidad;
    // PERÍODO DE VACIADO (LIMPIEZA DEL PUNTO DE RECICLAJE) EN DÍAS
    private int PeriodoVaciado;
    private String Ciudad;
    private int Id;

    //Constructor
    public PuntoReciclaje()
    {
        this.Direccion="";
        this.Habilitado=false;
        this.TipoReciclaje="";
        this.Capacidad=0;
        this.PeriodoVaciado=0;
        this.Ciudad="";
    }

    //Getters & Setters
    public String getDireccion() {
        return this.Direccion;
    }
    public boolean getHabilitado() {
        return this.Habilitado;
    }
    public String getTipoReciclaje() {
        return this.TipoReciclaje;
    }
    public int getCapacidad() {
        return this.Capacidad;
    }
    public int getPeriodoVaciado(){
        return this.PeriodoVaciado;
    }
    public String getCiudad(){
        return this.Ciudad;
    }

    public int getId() {
        return Id;
    }

    public void setDireccion(String Direccion){
        this.Direccion = Direccion;
    }

    public void setHabilitado(boolean Habilitado){
        this.Habilitado = Habilitado;
    }
    public void setTipoReciclaje(String TipoReciclaje){
        this.TipoReciclaje = TipoReciclaje;
    }
    public void setCapacidad(int Capacidad){
        this.Capacidad = Capacidad;
    }
    public void setPeriodoVaciado(int PeriodoVaciado){
        this.PeriodoVaciado = PeriodoVaciado;
    }
    public void setCiudad(String ciudad){
        this.Ciudad = ciudad;
    }
    public void setId(int id) {
        Id = id;
    }

    //Comportamientos y metodos
    public void CrearPuntoReciclaje() {
        System.out.print("Direccion: ");
        this.setDireccion(leer.nextLine());
        System.out.print("Tipo Reciclaje: ");
        this.setTipoReciclaje(leer.nextLine());
        System.out.print("Capacidad en kilogramos: ");
        this.setCapacidad(leer.nextInt());
        System.out.print("Periodo de vaciado en dias: ");
        this.setCapacidad(leer.nextInt());
        System.out.print("Ciudad donde se encuentra: ");
        this.setCiudad(leer.nextLine());
        System.out.println("Ingrese el numero identificador:");
        this.setId(leer.nextInt());
        this.Habilitado = true; //Se habilita el punto de reciclaje creado por el admin
    }

    public void MostrarPtoReciclaje(ArrayList <PuntoReciclaje> Lista, int indice){
        System.out.println("================PUNTO DE RECICLAJE "+(indice+1)+"==================");
        System.out.println("Tipo de reciclaje: "+Lista.get(indice).getTipoReciclaje());
        System.out.println("Direccion: "+Lista.get(indice).getDireccion());
        System.out.println("Capacidad del punto de reciclaje: "+Lista.get(indice).getCapacidad()+" kilogramos.");
        System.out.println("Identificador del punto de reciclaje: "+Lista.get(indice).getId());
        if(Lista.get(indice).getHabilitado()){
            System.out.println("Punto de reciclaje DISPONIBLE");
        }
        else{
            System.out.println("Punto de reciclaje NO DISPONIBLE");
        }
    }
}