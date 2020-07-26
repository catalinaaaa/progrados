package modelo;

/**
 * @author catas
 */

public class CatalogoDiagnostico {
  private int identificador = 0;
  private String nombre = "";
  private String tratamiento = "";
  private int identificadorTratamiento = 0;

  
  public CatalogoDiagnostico() {
  }
  

  public CatalogoDiagnostico(int pIdentificador, String pNombre, String pTratamiento, 
     int pIdentificadorTratamiento){
    setIdentificador(pIdentificador);
    setNombre(pNombre);
    setTratamiento(pTratamiento);
    setIdentificadorTratamiento(pIdentificadorTratamiento);
  }
  
  
  public int getIdentificador() {
    return identificador;
  }

  
  public void setIdentificador(int identificador) {
    this.identificador = identificador;
  }

  
  public String getNombre() {
    return nombre;
  }

  
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  
  public String setTratamiento() {
    return tratamiento;
  }

  public void setTratamiento(String tratamiento) {
    this.tratamiento = tratamiento;
  }
  

  public int getIdentificadorTratamiento() {
    return identificadorTratamiento;
  }

  
  public void setIdentificadorTratamiento(int identificadorTratamiento) {
    this.identificadorTratamiento = identificadorTratamiento;
  }
}