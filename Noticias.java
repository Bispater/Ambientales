import java.util.Date;

public class Noticias {
    //Atributos
    private Date fecha;
    private String URL;
    private String TipoNoticia;
    private String Descripcion;
    private int idNoticia; //Las ID's <=0

    public Noticias(){
        Date fecha = new Date();
        this.URL="";
        this.TipoNoticia="";
        this.Descripcion="";
        this.idNoticia=-1;
    }

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
}