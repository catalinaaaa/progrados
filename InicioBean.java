package bean;

import dao.FuncionarioDAO;
import dao.PacienteDAO;
import java.io.Serializable;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 * @author catas
 */

@ManagedBean (name="Inicio", eager=true)
@SessionScoped
public class InicioBean implements Serializable{
  public static FuncionarioDAO rFuncionario = new FuncionarioDAO();  
  public static PacienteDAO rPaciente = new PacienteDAO();  
  private int cedula = 0;
  private String contrasenia = "";

  
  public int getCedula() {
    return cedula;
  }

  
  public void setCedula(int cedula) {
    this.cedula = cedula;
  }

  
  public String getContrasenia() {
    return contrasenia;
  }

  
  public void setContrasenia(String contrasenia) {
    this.contrasenia = contrasenia;
  }
  
  
  public String iniciarMenuSecretaria() throws SQLException{
    String resultado = "iniciarMenuSecretaria";
    String fail= "Datos no validos";
    int index = rFuncionario.inicioSesionSecretaria(cedula, contrasenia);
    if(index == 1){
      return resultado; 
    }
    else{    
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(fail));
      return null;
    }
  }
  
  
  public String iniciarMenuDoctor() throws SQLException{
    String resultado = "iniciarMenuDoctor";
    String fail= "Datos no validos";
    int index = rFuncionario.inicioSesionDoctor(cedula, contrasenia);
    if(index == 1){
      return resultado; 
    }
    else{    
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(fail));
      return null;
    }
  }
  
  
  public String iniciarMenuEnfermera() throws SQLException{
    String resultado = "iniciarMenuEnfermera";
    String fail= "Datos no validos";
    int index = rFuncionario.inicioSesionEnfermera(cedula, contrasenia);
    if(index == 1){
      return resultado; 
    }
    else{    
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(fail));
      return null;
    }
  }
  
  
  //arregarlo a que sea el de paciente
  public String iniciarMenuPaciente() throws SQLException{
    String resultado = "iniciarMenuPaciente";
    String fail= "Datos no validos";
    int index = rPaciente.inicioSesionPaciente(cedula, contrasenia);
    if(index == 1){
      return resultado; 
    }
    else{    
      FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(fail));
      return null;
    }
  }  
}