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

    private Connection con = null;
    ArrayList<Comida> comidaArray = new ArrayList<>();

    public DietaComidaData() {
        con = Conector.getConnection();

    }

    public void agregarDietaComida(Dieta dieta, ArrayList<Comida> comid) {

        for (Comida comida : comid) {

            String sql = "insert into dietacomida (idDieta, idComida) VALUES (?, ?)";
            DietaComida dt = new DietaComida();
            PreparedStatement stmt;

            try {
                stmt = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                stmt.setInt(1, dieta.getIdDieta());
                stmt.setInt(2, comida.getIdComida());
                stmt.executeUpdate();
                ResultSet rs = stmt.getGeneratedKeys();
                while (rs.next()) {
                    dt.setId(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "Se agrego la comida a la dieta");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DietaComidaData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ArrayList<Comida> add(int idCom) {
String sql="SELECT idComida FROM comida WHERE idComida=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idCom);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Comida com=new Comida();
                com.setIdComida(rs.getInt("idComida"));
                comidaArray.add(com);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla Comida");
        }

        return comidaArray;
    }
    //comidaArray.add(comida);
}
