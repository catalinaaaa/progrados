package modelo;

/**
 * @author catas
 */

public class Seguimiento {
  private int identificador = 0;
  private int identificadorHospitalizacion = 0;
  private String fecha = "";
  private int funcionario = 0;
  private String observacion = "";
  private String tratamientoAsociado = "";

  
  public Seguimiento() {
  }

  
  public Seguimiento(int pIdentificador, int pIdentificadorHospitalizacion, String pFecha, 
     int pFuncionario, String pObservacion, String pTratamientoAsociado) {
    setIdentificador(pIdentificador);
    setIdentificadorHospitalizacion(pIdentificadorHospitalizacion);
    setFecha(pFecha);
    setFuncionario(pFuncionario);
    setObservacion(pObservacion);
    setTratamientoAsociado(pTratamientoAsociado);    
  }

  
  public int getIdentificador() {
    return identificador;
  }

  
  public void setIdentificador(int identificador) {
    this.identificador = identificador;
  }
  

  public int getIdentificadorHospitalizacion() {
    return identificadorHospitalizacion;
  }

  
  public void setIdentificadorHospitalizacion(int identificadorHospitalizacion) {
    this.identificadorHospitalizacion = identificadorHospitalizacion;
  }

  
  public String getFecha() {
    return fecha;
  }

  
  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

  
  public int getFuncionario() {
    return funcionario;
  }
  

  public void setFuncionario(int funcionario) {
    this.funcionario = funcionario;
  }

  
  public String getObservacion() {
    return observacion;
  }

  
  public void setObservacion(String observacion) {
    this.observacion = observacion;
  }

  
  public String getTratamientoAsociado() {
    return tratamientoAsociado;
  }

  
  public void setTratamientoAsociado(String tratamientoAsociado) {
    this.tratamientoAsociado = tratamientoAsociado;
  }
}