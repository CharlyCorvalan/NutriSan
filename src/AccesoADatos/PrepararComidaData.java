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

    private Connection con = null;

    ArrayList<Ingredientes> ingre = new ArrayList<>();

    public PrepararComidaData() {
        con = Conector.getConnection();
    }

    public void crearComida(Comida comida, ArrayList<Ingredientes> ingredientes) {
       int num=ingredientes.size();
        for (Ingredientes ingred : ingredientes) {

            String sql = "insert into prepararcomida (idComida, idIngredientes) VALUES (?, ?)";
            PrepararComida pc = new PrepararComida();
            PreparedStatement stmt;

            try {
                stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                stmt.setInt(1, comida.getIdComida());
                stmt.setInt(2, ingred.getIdIngredientes());
                stmt.executeUpdate();
                ResultSet rs = stmt.getGeneratedKeys();
                while (rs.next()) {
                    pc.setIdPrepararComida(rs.getInt(1));
                    num--;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla preparar comida");
            }
        }
        if(num==0){
            JOptionPane.showMessageDialog(null, "Ingredientes agregados/modificados");
        }
    }

    public ArrayList<Ingredientes> consultaComida(Comida comida) {
        String sql = "Select ingredientes.idIngredientes,nombre,categoria,cantCalorias from ingredientes join "
                + "prepararcomida on(ingredientes.idIngredientes=prepararcomida.idIngredientes)where prepararcomida.idComida=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, comida.getIdComida());
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                Ingredientes ingrediente = new Ingredientes();
                ingrediente.setIdIngredientes(resultado.getInt("idIngredientes"));
                ingrediente.setNombre(resultado.getString("nombre"));
                ingrediente.setCategoria(resultado.getString("categoria"));
                ingrediente.setCantCalorias(resultado.getInt("cantCalorias"));
                ingre.add(ingrediente);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Preparar comida");
        }
        return ingre;
    }

    public void modificarComida(Comida comida) {
        String sql = "delete from prepararcomida where idComida=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, comida.getIdComida());
            int resultado=ps.executeUpdate();
            if(resultado==1){
                JOptionPane.showMessageDialog(null, "Exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla preparar comida");
        }

    }
}
