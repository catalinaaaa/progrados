package modelo;

/**
 * @author catas
 */

public class Tratamiento {
  private int identificador = 0;
  private String nombre = "";
  private int unidades = 0;
  private String tipo = "";

  
  public Tratamiento() {
  }
  

  public Tratamiento(int pIdentificador, String pNombre, int pUnidades, String pTipo){
    setIdentificador(pIdentificador);
    setNombre(pNombre);
    setUnidades(pUnidades);
    setTipo(pTipo);
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
  

  public int getUnidades() {
    return unidades;
  }

  
  public void setUnidades(int unidades) {
    this.unidades = unidades;
  }

  
  public String getTipo() {
    return tipo;
  }
  

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}