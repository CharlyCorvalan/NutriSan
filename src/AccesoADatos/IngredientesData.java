package AccesoADatos;

import Entidades.Ingredientes;
import Entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class IngredientesData {

    private Connection con = null;
    ArrayList<Ingredientes> ingred = new ArrayList<>();

    public IngredientesData() {
        con = Conector.getConnection();

    }

    public void agregarIngrediente(Ingredientes ingredientes) {
        String sql = "INSERT into ingredientes (nombre, categoria, cantCalorias,estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, ingredientes.getNombre());
            ps.setString(2, ingredientes.getCategoria());
            ps.setInt(3, ingredientes.getCantCalorias());
            ps.setBoolean(4, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ingredientes.setIdIngredientes(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ingrediente agregado con exito!");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la tabla ingredientes ");
        }

    }

    public void eliminarIngrediente(int idIngredientes) {
        String sql = "update ingredientes set estado=0 where idIngredientes=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idIngredientes);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Ingrediente eliminado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ingredientes ");
        }

    }

    public ArrayList<Ingredientes> listarIngredientesPorCateg(String categoria) {
        String sql = "SELECT nombre, cantCalorias, idIngredientes, estado FROM ingredientes WHERE categoria like ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, categoria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ingredientes ingredientes = new Ingredientes();
                ingredientes.setNombre(rs.getString("nombre"));
                ingredientes.setCantCalorias(rs.getInt("cantCalorias"));
                ingredientes.setIdIngredientes(rs.getInt("idIngredientes"));
                ingredientes.setEstado(rs.getBoolean("estado"));
                ingred.add(ingredientes);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ingredientes ");
        }

        return ingred;
    }
    public void modificarIngrediente(Ingredientes x){
        String sql="update ingredientes set nombre=?,cantCalorias=?,categoria=?  where idIngredientes =?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, x.getNombre());
            ps.setInt(2, x.getCantCalorias());
            ps.setString(3, x.getCategoria());
            ps.setInt(4, x.getIdIngredientes());
            int resultado=ps.executeUpdate();
            if(resultado==1){
                JOptionPane.showMessageDialog(null, "Exito al modificar el ingrediente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ingredientes");
        }
    }
    public Ingredientes buscarId(int id){
        Ingredientes ingre=new Ingredientes();
        String sql="Select nombre,categoria,cantCalorias from ingredientes where idIngredientes=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultado=ps.executeQuery();
            while(resultado.next()){
                ingre.setIdIngredientes(id);
                ingre.setNombre(resultado.getString("nombre"));
                ingre.setCategoria(resultado.getString("categoria"));
                ingre.setCantCalorias(resultado.getInt("cantCalorias"));
                
                
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ingredientes");
        }
        return ingre;
    }
}
