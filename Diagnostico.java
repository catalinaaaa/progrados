package modelo;

/**
 * @author catas
 */

public class Diagnostico {
  private int identificador = 0;
  private int identificadorCita = 0;
  private String informacion = "";
  private String nombre = "";
  private String nivel = "";
  private String observacion = "";

  
  public Diagnostico() {
  }

  
  public Diagnostico(int pIdentificador, int pIdentificadorCita, String pInformacion, 
     String pNombre, String pNivel, String pObservacion) {
    setIdentificador(pIdentificador);
    setIdentificadorCita(pIdentificadorCita);
    setInformacion(pInformacion);
    setNombre(pNombre);
    setNivel(pNivel);
    setObservacion(pObservacion);
  }

  
  public Diagnostico(int pIdentificador, int pIdentificadorCita, String pInformacion, 
     String pNombre, String pNivel) {
    setIdentificador(pIdentificador);
    setIdentificadorCita(pIdentificadorCita);
    setInformacion(pInformacion);
    setNombre(pNombre);
    setNivel(pNivel);
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

  
  public String getInformacion() {
    return informacion;
  }

  
  public void setInformacion(String informacion) {
    this.informacion = informacion;
  }

  
  public String getNombre() {
    return nombre;
  }
  

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  
  public String getNivel() {
    return nivel;
  }

  
  public void setNivel(String nivel) {
    this.nivel = nivel;
  }

  
  public String getObservacion() {
    return observacion;
  }
  

  public void setObservacion(String observacion) {
    this.observacion = observacion;
  }
}