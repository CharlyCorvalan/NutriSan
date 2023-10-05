/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Comida;
import Entidades.Dieta;
import Entidades.DietaComida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Win7
 */
public class DietaComidaData {
private Connection con= null;

    public DietaComidaData() {
     con = Conector.getConnection();   
       
    }

 public void agregarDieta(Dieta dieta, Comida comida) {
        String sql = "INSERT INTO dieta (idDieta, idComida,) VALUES (?, ?)";
        DietaComida dt= new DietaComida();

        PreparedStatement stmt;
    try {
        stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
         stmt.setInt(1,dieta.getIdDieta());
        stmt.setInt(2, comida.getIdComida()); 
        ResultSet rs= stmt.getGeneratedKeys();
         
        while (rs.next()){
            
      dt.setId(rs.getInt(1));
            
      JOptionPane.showMessageDialog(null,"se agrego la comida a la dieta");
      
            
            
            
        }
         
         
         
         
         
    } catch (SQLException ex) {
        Logger.getLogger(DietaComidaData.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    

     
      

}
  
 
}
