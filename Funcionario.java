package modelo;

/**
 * @author catas
 */

public class Funcionario {
  private int cedula = 0;
  private String nombreCompleto = "";
  private String tipo = "";
  private String fechaIngreso = "";
  private String areaLaboral = "";
  private String contrasenia = "";

  
  public Funcionario() {
  }

  
  public Funcionario(int pCedula, String pNombreCompleto, String pTipo, String pFechaIngreso, String
     pAreaLaboral, String pContrasenia) {
    setCedula(pCedula);
    setNombreCompleto(pNombreCompleto);
    setTipo(pTipo);
    setFechaIngreso(pFechaIngreso);
    setAreaLaboral(pAreaLaboral);
    setContrasenia(pContrasenia);
  }
  
  
  public int getCedula() {
    return cedula;
  }

  
  public void setCedula(int cedula) {
    this.cedula = cedula;
  }

  
  public String getNombreCompleto() {
    return nombreCompleto;
  }
  

  public void setNombreCompleto(String nombreCompleto) {
    this.nombreCompleto = nombreCompleto;
  }
  

  public String getTipo() {
    return tipo;
  }

  
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  

  public String getFechaIngreso() {
    return fechaIngreso;
  }
  

  public void setFechaIngreso(String fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
  }
  

  public String getAreaLaboral() {
    return areaLaboral;
  }
  

  public void setAreaLaboral(String areaLaboral) {
    this.areaLaboral = areaLaboral;
  }

  
  public String getContrasenia() {
    return contrasenia;
  }
  

  public void setContrasenia(String contrasenia) {
    this.contrasenia = contrasenia;
  }
}