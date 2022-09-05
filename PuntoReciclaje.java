public class PuntoReciclaje {

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
        return Direccion;
    }
    public boolean getHabilitado() {
        return Habilitado;
    }
    public String getTipoReciclaje() {
        return TipoReciclaje;
    }
    public int getCapacidad() {
        return Capacidad;
    }
    public int getPeriodoVaciado(){
      return PeriodoVaciado;
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
  public void CrearPuntoReciclaje(PuntoReciclaje Objeto){
        
        System.out.println("Direccion: "+ Objeto.Direccion);
        System.out.println("Tipo Reciclaje:"+ Objeto.TipoReciclaje);
        System.out.println("Capacidad :"+ Objeto.Capacidad);
        System.out.println("Periodo de vaciado :"+ Objeto.PeriodoVaciado);
        
    }
    
    public void BuscarPuntoReciclaje(String Direccion){
        System.out.println("Buscar Punto Reciclaje "+ Direccion);
    }

  /* ACTUALIZAR PUNTO RECICLAJE
    public void ActualizarPuntoReciclaje (PuntoReciclaje Objeto){
        System.out.println("Modificando Punto Reciclaje "+ Objeto);
    }
    */
    public void EliminarPuntoReciclaje (int Rut){
        System.out.println("Se ha eliminado el "+ Rut);
    }
  
}