
package AccesoADatos;

import Entidades.Comida;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ComidaDatos {
    private Connection con=null;

    public ComidaDatos() {
        con = Conector.getConnection();
    }
    
    private void agregarComida(Comida comida){
        String sql="INSERT into comida (nombre, detalle, cantCalorias) VALUES (?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCantCalorias());
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                comida.setIdComida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Comida agregada con exito!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la tabla comida "+ex);
        }
        
    }
    
}
