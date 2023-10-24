
package AccesoADatos;

import Entidades.Comida;
import Entidades.Ingredientes;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ComidaData {
    private Connection con=null;
    ArrayList<Ingredientes> ingre=new ArrayList<>();
    public ComidaData() {
        con = Conector.getConnection();
    }
    
   
    
    public void agregarComida(Comida comida){
        String sql="INSERT into comida (nombre, detalle, cantCalorias, estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.setBoolean(4, true);
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                comida.setIdComida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Comida agregada con exito!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la tabla comida ");
        }
        
    }
    
    public ArrayList <Comida> listarComidas(String detalle){
      ArrayList <Comida> comidas =new ArrayList<>();
      String sql="SELECT * FROM comida where detalle=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, detalle);
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
            JOptionPane.showMessageDialog(null, "Error al conectar a la tabla comida ");
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
            JOptionPane.showMessageDialog(null, "Error al conectar a la tabla comida ");
        }
        
        return comidas;
    }
    public void eliminarComida(Comida comida){
        String sql="update comida set estado=0 where idComida=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, comida.getIdComida());
            int resultado=ps.executeUpdate();
            if(resultado==1){
                JOptionPane.showMessageDialog(null, "Comida eliminada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla comida");
        }
    }
    public void editarComida(Comida comida){
        String sql="update comida set nombre=?,detalle=?,cantCalorias=? where idComida=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
            ps.setInt(4, comida.getIdComida());
            int resultado=ps.executeUpdate();
            if(resultado==1){
                JOptionPane.showMessageDialog(null, "Comida modificada exitosamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la tabla comida");
        }
    }
}
