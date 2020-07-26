package modelo;

/**
 * @author catas
 */

public class Hospitalizacion {
  private int identificador = 0;
  private String centro = "";
  private int cedulaPaciente = 0;
  private String nombrePaciente = "";
  private String diagnostico = "";
  private String fechaEntrada = "";
  private String fechaSalida = "";
  private String especialidad = "";
  private int funcionario = 0;

  
  public Hospitalizacion() {
  }
  

  public Hospitalizacion(int pIdentificador, String pCentro, int pCedulaPaciente, 
     String pNombrePaciente, String pDiagnostico, String pFechaEntrada, String pFechaSalida, 
     String pEspecialidad, int pFuncionario) {
    setIdentificador(pIdentificador);
    setCentro(pCentro);
    setCedulaPaciente(pCedulaPaciente);
    setNombrePaciente(pNombrePaciente);    
    setDiagnostico(pDiagnostico);
    setFechaEntrada(pFechaEntrada);
    setFechaSalida(pFechaSalida);
    setEspecialidad(pEspecialidad);
    setFuncionario(pFuncionario);
  }
  

  public Hospitalizacion(int pIdentificador, String pCentro, int pCedulaPaciente, 
     String pNombrePaciente, String pDiagnostico, String pFechaEntrada, String pEspecialidad, 
     int pFuncionario) {
    setIdentificador(pIdentificador);
    setCentro(pCentro);
    setCedulaPaciente(pCedulaPaciente);
    setNombrePaciente(pNombrePaciente);    
    setDiagnostico(pDiagnostico);
    setFechaEntrada(pFechaEntrada);
    setEspecialidad(pEspecialidad);
    setFuncionario(pFuncionario);
  }

  
  public int getIdentificador() {
    return identificador;
  }

  
  public void setIdentificador(int identificador) {
    this.identificador = identificador;
  }

  
  public String getCentro() {
    return centro;
  }

  
  public void setCentro(String centro) {
    this.centro = centro;
  }
  

  public int getCedulaPaciente() {
    return cedulaPaciente;
  }

  
  public void setCedulaPaciente(int cedulaPaciente) {
    this.cedulaPaciente = cedulaPaciente;
  }

  
  public String getNombrePaciente() {
    return nombrePaciente;
  }
  

  public void setNombrePaciente(String nombrePaciente) {
    this.nombrePaciente = nombrePaciente;
  }

  
  public String getDiagnostico() {
    return diagnostico;
  }
  

  public void setDiagnostico(String diagnostico) {
    this.diagnostico = diagnostico;
  }
  

  public String getFechaEntrada() {
    return fechaEntrada;
  }
  

  public void setFechaEntrada(String fechaEntrada) {
    this.fechaEntrada = fechaEntrada;
  }

  
  public String getFechaSalida() {
    return fechaSalida;
  }

  
  public void setFechaSalida(String fechaSalida) {
    this.fechaSalida = fechaSalida;
  }
  

  public String getEspecialidad() {
    return especialidad;
  }
  

  public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
  }
  

  public int getFuncionario() {
    return funcionario;
  }
  

  public void setFuncionario(int funcionario) {
    this.funcionario = funcionario;
  }
}