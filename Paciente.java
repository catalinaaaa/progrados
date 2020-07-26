package modelo;

/**
 * @author catas
 */

public class Paciente {
  private int cedula = 0;
  private String nombreCompleto = "";
  private String fechaNacimiento = "";
  private String tipoSangre = "";
  private String nacionalidad = "";
  private String lugarResidencia = "";
  private int telefono = 0;

  
  public Paciente() {
  }
  

  public Paciente(int pCedula, String pNombreCompleto, String pFechaNacimiento, String pTipoSangre,
     String pNacionalidad, String pLugarResidencia, int pTelefono) {
    setCedula(pCedula);
    setNombreCompleto(pNombreCompleto);
    setFechaNacimiento(pFechaNacimiento);
    setTipoSangre(pTipoSangre);
    setNacionalidad(pNacionalidad);
    setLugarResidencia(pLugarResidencia);
    setTelefono(pTelefono);
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

  
  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  
  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  
  public String getTipoSangre() {
    return tipoSangre;
  }

  
  public void setTipoSangre(String tipoSangre) {
    this.tipoSangre = tipoSangre;
  }

  
  public String getNacionalidad() {
    return nacionalidad;
  }

  
  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }

  
  public String getLugarResidencia() {
    return lugarResidencia;
  }

 
  public void setLugarResidencia(String lugarResidencia) {
    this.lugarResidencia = lugarResidencia;
  }

  
  public int getTelefono() {
    return telefono;
  }

  
  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }
}