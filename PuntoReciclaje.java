import java.util.Scanner;
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

  
    //Accesores
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

  
  //Mutadores
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

  //Comportamientos
    public void CrearPuntoReciclaje(){

        System.out.println("Direccion: ");
        this.setDireccion(leer.nextLine());
        System.out.println("Tipo Reciclaje:");
        this.setTipoReciclaje(leer.nextLine());
        System.out.println("Capacidad :");
        this.setCapacidad(leer.nextInt());
        System.out.println("Periodo de vaciado :");
        this.setCapacidad(leer.nextInt());
    }

    public void BuscarPuntoReciclaje(){
        System.out.println("Buscar Punto Reciclaje ");
    }

    /* ACTUALIZAR PUNTO RECICLAJE
      public void ActualizarPuntoReciclaje (PuntoReciclaje Objeto){
          System.out.println("Modificando Punto Reciclaje "+ Objeto);
      }
      */
    public void EliminarPuntoReciclaje (){
        System.out.println("Se ha eliminado el ");
    }

}