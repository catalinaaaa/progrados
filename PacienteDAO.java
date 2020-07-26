package dao;

import conexiones.ConexionSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Paciente;

/**
 * @author catas
 */

public class PacienteDAO {
  public static Paciente paciente;
  public static ResultSet res;
  
  public static int inicioSesionPaciente(int cedula, String contrasenia) throws SQLException{
    res = ConexionSQL.consulta("select cedula, contrasenia from paciente where cedula = '" + 
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