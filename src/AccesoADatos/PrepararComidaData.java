
package AccesoADatos;

import Entidades.Comida;
import Entidades.DietaComida;
import Entidades.Ingredientes;
import Entidades.PrepararComida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PrepararComidaData {
   private Connection  con=null;
   
    ArrayList<Ingredientes> ingre=new ArrayList<>();

    public PrepararComidaData() {
    con = Conector.getConnection();
    }
    
    public void crearComida(Comida comida,ArrayList<Ingredientes> ingredientes){
        for (Ingredientes ingred : ingredientes) {

            String sql = "insert into prepararcomida (idComida, idIngredientes) VALUES (?, ?)";
            PrepararComida pc=new PrepararComida();
            PreparedStatement stmt;

            try {
                stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                stmt.setInt(1, comida.getIdComida());
                stmt.setInt(2, ingred.getIdIngredientes());
                stmt.executeUpdate();
                ResultSet rs = stmt.getGeneratedKeys();
                while (rs.next()) {
                    pc.setIdPrepararComida(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Se agregaron los ingredientes a la comida");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DietaComidaData.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
}
