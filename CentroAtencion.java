package modelo;

/**
 * @author catas
 */

public class CentroAtencion {
  private String codigo = "";
  private String nombre = "";
  private String ubicacion = "";
  private int capacidadPacientes = 0;
  private String tipo = "";

  
  public CentroAtencion() {
  }

  
  public CentroAtencion(String pCodigo, String pNombre, String pUbicacion, int pCapacidadPacientes, 
     String pTipo) {
    setCodigo(pCodigo);
    setNombre(pNombre);
    setUbicacion(pUbicacion);
    setCapacidadPacientes(pCapacidadPacientes);
    setTipo(pTipo);
  }

  
  public String getCodigo() {
    return codigo;
  }

  
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  
  public String getNombre() {
    return nombre;
  }

  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  

  public String getUbicacion() {
    return ubicacion;
  }
  

  public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
  }

  
  public int getCapacidadPacientes() {
    return capacidadPacientes;
  }
  

  public void setCapacidadPacientes(int capacidadPacientes) {
    this.capacidadPacientes = capacidadPacientes;
  }

  
  public String getTipo() {
    return tipo;
  }

  
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}