package modelo;

/**
 * @author catas
 */

public class Cita {
  private int identificador = 0;
  private String especialidad = "";
  private String fecha = "";
  private String hora = "";
  private String  estado = "";
  private String observacion = "";
  private int paciente = 0;

  
  public Cita() {
  }
  

  public Cita(int pIdentificador, String pEspecialidad, String pFecha, String pHora, String 
     pEstado, String pObservacion, int pPaciente) {
    setIdentificador(pIdentificador);
    setEspecialidad(pEspecialidad);
    setFecha(pFecha);
    setHora(pHora);
    setEstado(pEstado);
    setObservacion(pObservacion);
    setPaciente(pPaciente);
  }
  

  public Cita(int pIdentificador, String pEspecialidad, String pFecha, String pHora, String 
     pEstado, int pPaciente) {
    setIdentificador(pIdentificador);
    setEspecialidad(pEspecialidad);
    setFecha(pFecha);
    setHora(pHora);
    setEstado(pEstado);
    setPaciente(pPaciente);
  }

  
  public int getIdentificador() {
    return identificador;
  }

  
  public void setIdentificador(int identificador) {
    this.identificador = identificador;
  }

  
  public String getEspecialidad() {
    return especialidad;
  }

  
  public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
  }

  
  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }
  

  public String getHora() {
    return hora;
  }

  
  public void setHora(String hora) {
    this.hora = hora;
  }

  
  public String getEstado() {
    return estado;
  }

  
  public void setEstado(String estado) {
    this.estado = estado;
  }
  

  public String getObservacion() {
    return observacion;
  }

  
  public void setObservacion(String observacion) {
    this.observacion = observacion;
  }
  

  public int getPaciente() {
    return paciente;
  }

  
  public void setPaciente(int paciente) {
    this.paciente = paciente;
  }
}