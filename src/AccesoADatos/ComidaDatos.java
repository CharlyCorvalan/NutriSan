
package AccesoADatos;

import Entidades.Comida;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ComidaDatos {
    private Connection con=null;

    public ComidaDatos() {
        con = Conector.getConnection();
    }
    
   
    
    public void agregarComida(Comida comida){
        String sql="INSERT into comida (nombre, detalle, cantCalorias) VALUES (?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                comida.setIdComida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Comida agregada con exito!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la tabla comida "+ex);
        }
        
    }
    
    public ArrayList <Comida> listarComidas(){
      ArrayList <Comida> comidas =new ArrayList<>();
      String sql="SELECT * FROM comida";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Comida comida=new Comida();
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                comida.setIdComida(rs.getInt("idComida"));
                comidas.add(comida);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la tabla comida "+ex);
        }
        
        return comidas;
    }
    
    public ArrayList <Comida> listarComidasPorCalorias(int cantCalorias){
      ArrayList <Comida> comidas =new ArrayList<>();
      String sql="SELECT * FROM comida WHERE cantCalorias <= ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, cantCalorias);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Comida comida=new Comida();
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                comida.setIdComida(rs.getInt("idComida"));
                comidas.add(comida);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la tabla comida "+ex);
        }
        
        return comidas;
    }
}
