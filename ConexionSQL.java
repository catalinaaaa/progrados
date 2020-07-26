package conexiones;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

/**
 * @author Irene Rojas, Daniel Salazar, Catalina Sánchez
 */

public class ConexionSQL {
  static Connection contact = null;   
  
  
  /**Metodo para conectarse a la base de datos de sql
   * @return  la conexión con sql
   */
  public static Connection getConnection(){
    String url = "jdbc:sqlserver://localhost:1433;databaseName=proyectodos"; //cambiar
    try{
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");           
    }
    catch (ClassNotFoundException e){
      JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion" + e.getMessage(),
         "Error de conexion", JOptionPane.ERROR_MESSAGE);
    }
    try{
      contact = DriverManager.getConnection(url, "sa", "sa");
    }
    catch(SQLException e){
      JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
         "Error de conexion", JOptionPane.ERROR_MESSAGE);
    }
    return contact;
  }
  
    
  /**
  * Metodo que consultar en la base de datos 
  * @param  query recibe la consulta que se va a realizar en bd
  * @return null en caso de no lograr hacer la consulta
  */
  public static ResultSet consulta(String query){
    Connection con = getConnection();
    Statement declare;
    try{
      declare = con.createStatement();
      ResultSet answer = declare.executeQuery(query);
      return answer;
    }
    catch(SQLException e){      
    }
    return null;
  }
}