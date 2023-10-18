
package AccesoADatos;

import Entidades.Ingredientes;
import Entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class IngredientesData {
   private Connection con = null;
ArrayList<Ingredientes> ingred =new ArrayList<>();
    public IngredientesData() {
     con=Conector.getConnection();
    
    }
   
    public void agregarIngrediente(Ingredientes ingredientes){
        String sql="INSERT into ingredientes (nombre, categoria, cantCalorias) VALUES (?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, ingredientes.getNombre());
            ps.setString(2, ingredientes.getCategoria());
            ps.setInt(3, ingredientes.getCantCalorias());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                ingredientes.setIdIngredientes(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ingrediente agregado con exito!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la tabla ingredientes "+ex);
        }
        
    }
   
    public void eliminarIngrediente(int idIngredientes){
    String sql="DELETE FROM ingredientes WHERE idIngredientes=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idIngredientes);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Ingrediente eliminado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ingredientes "+ex);
        }
    
}
    
    public ArrayList<Ingredientes> listarIngredientesPorCateg(String categoria){
    String sql="SELECT nombre, cantCalorias, idIngredientes FROM ingredientes WHERE ingredientes.categoria=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, categoria);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Ingredientes ingredientes=new Ingredientes();
                ingredientes.setNombre(rs.getString("nombre"));
                ingredientes.setCantCalorias(rs.getInt("cantCalorias"));
               ingredientes.setIdIngredientes(rs.getInt("idIngredientes"));
                ingred.add(ingredientes);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paciente "+ex);
        }
    
    return ingred;
}
}
