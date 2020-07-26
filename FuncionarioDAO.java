package dao;

import conexiones.ConexionSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Funcionario;

/**
 * @author catas
 */

public class FuncionarioDAO {
  public static Funcionario funcionario;
  public static ResultSet res;
  
  
  public static int inicioSesionSecretaria(int cedula, String contrasenia) throws SQLException{
    res = ConexionSQL.consulta("select cedula, contrasenia from funcionario where cedula = '" + 
       cedula + "' and contrasenia = '" + contrasenia + "'");
    if(res != null){
      while(res.next()) {
        if(cedula == (res.getInt(1)) && contrasenia.equals(res.getString(2))){
          return 1;
        }
      }
    }
    return 0;
  }
  
  
  public static int inicioSesionDoctor(int cedula, String contrasenia) throws SQLException{
    res = ConexionSQL.consulta("select cedula, contrasenia from funcionario where cedula = '" + 
       cedula + "' and contrasenia = '" + contrasenia + "'");
    if(res != null){
      while(res.next()) {
        if(cedula == (res.getInt(1)) && contrasenia.equals(res.getString(2))){
          return 1;
        }
      }
    }
    return 0;
  }
  
  
  public static int inicioSesionEnfermera(int cedula, String contrasenia) throws SQLException{
    res = ConexionSQL.consulta("select cedula, contrasenia from funcionario where cedula = '" + 
       cedula + "' and contrasenia = '" + contrasenia + "'");
    if(res != null){
      while(res.next()) {
        if(cedula == (res.getInt(1)) && contrasenia.equals(res.getString(2))){
          return 1;
        }
      }
    }
    return 0;
  }
}