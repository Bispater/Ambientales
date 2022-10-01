import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Noticias {
    Scanner leer = new Scanner(System.in);

    //Atributos
    private Date fecha;
    private String URL;
    private String TipoNoticia;
    private String Descripcion;
    private int idNoticia; //Las ID's >=0

    public Noticias(){
        Date fecha = new Date();
        this.URL="";
        this.TipoNoticia="";
        this.Descripcion="";
        this.idNoticia=-1;
    }

    //Getters & Setters
    public int getIdNoticia() {
        return this.idNoticia;
    }
    public void setIdNoticia(int idNoticia) {
        this.idNoticia = idNoticia;
    }
    public String getDescripcion() {
        return this.Descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }
    public Date getFecha() {
        return this.fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getURL() {
        return this.URL;
    }
    public void setURL(String URL) {
        this.URL = URL;
    }
    public String getTipoNoticia() {
        return this.TipoNoticia;
    }
    public void setTipoNoticia(String tipoNoticia) {
        this.TipoNoticia = tipoNoticia;
    }

    //Comportamientos
    public void CrearNoticia(){
        System.out.print("Tipo de noticia: ");
        this.setTipoNoticia(leer.nextLine());
        System.out.print("Descripcion de la noticia: ");
        this.setDescripcion(leer.nextLine());
        System.out.print("Ingresar URL de la noticia");
        this.setURL(leer.nextLine());
        System.out.print("Ingrese identificador: ");
        this.setIdNoticia(leer.nextInt());
        //System.out.print("Fecha de publicacion de la noticia "); -- revisar como pasar de fecha a string
        //this.setFecha(leer.next());
    }
    public void PresentarNoticia(Noticias NoticiasActual){
        System.out.println("Titular:"+NoticiasActual.Descripcion);
        System.out.println("Tipo de noticia: "+NoticiasActual.TipoNoticia);
        System.out.println("URL: "+NoticiasActual.URL);
        //Colocar tambien la fecha de la noticia
    }
}