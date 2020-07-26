package modelo;

/**
 * @author catas
 */

public class Bitacora {
  private int identificador = 0;
  private int identificadorCita = 0;
  private String fechaModificacion = "";
  private String estadoActual = "";

  
  public Bitacora() {
  }

  
  public Bitacora(int pIdentificador, int pIdentificadorCita, String pFechaModificacion, String 
     pEstadoActual) {
    setIdentificador(pIdentificador);
    setIdentificadorCita(pIdentificadorCita);
    setFechaModificacion(pFechaModificacion);
    setEstadoActual(pEstadoActual);
  }

  
  public int getIdentificador() {
    return identificador;
  }

  
  public void setIdentificador(int identificador) {
    this.identificador = identificador;
  }

  
  public int getIdentificadorCita() {
    return identificadorCita;
  }

  
  public void setIdentificadorCita(int identificadorCita) {
    this.identificadorCita = identificadorCita;
  }

  
  public String getFechaModificacion() {
    return fechaModificacion;
  }

  
  public void setFechaModificacion(String fechaModificacion) {
    this.fechaModificacion = fechaModificacion;
  }

  
  public String getEstadoActual() {
    return estadoActual;
  }

  
  public void setEstadoActual(String estadoActual) {
    this.estadoActual = estadoActual;
  }
}