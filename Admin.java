import java.util.Scanner;

public class Admin {
    //Atributos
    private String Nombres;
    private int id ;
    private String Contrasenia ;

    Scanner entrada = new Scanner(System.in);

    //Constructores
    public Admin() {
        this.Nombres = "";
        this.id = -1;
        this.Contrasenia = "";
    }

    public void CrearAdmin( int Id  )
    {
        System.out.println("Inserte nombre de admin");
        this.Nombres= entrada.next();
        this.id=Id ;
        this.Contrasenia=entrada.next();
    }


      //Geters y setters 
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
        return Contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        Contrasenia = contrasenia;
    }
        //Comportamientos

}
