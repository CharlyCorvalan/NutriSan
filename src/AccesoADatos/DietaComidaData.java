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
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(DietaComidaData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        JOptionPane.showMessageDialog(null, "Exito al agregar comidas a la dieta");
    }

    public ArrayList<Comida> ListarDietaComidas(int idDieta) {
String sql="SELECT comida.idComida, nombre, detalle, cantCalorias FROM comida join dietacomida ON "
        + "(comida.idComida=dietacomida.idcomida) WHERE dietacomida.idDieta=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idDieta);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Comida com=new Comida();
                com.setIdComida(rs.getInt("idComida"));
                com.setNombre(rs.getString("nombre"));
                com.setCantCalorias(rs.getInt("cantCalorias"));
                com.setDetalle(rs.getString("detalle"));
                comidaArray.add(com);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla Comida");
        }

        return comidaArray;
    }
    
    public boolean BuscarComida(Comida comida, Dieta dieta){
        String sql="SELECT dietacomida.idComida FROM dietacomida WHERE dietacomida.idDieta=? "
                + "AND dietacomida.idComida=?";
        try {
           PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dieta.getIdDieta());
            ps.setInt(2, comida.getIdComida());
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                return true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DietaComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
 
    }
    
    public void modificarDietaComida(Dieta dieta,Comida comida) {
        String sql = "delete  from dietacomida where idDieta=? AND idComida=? ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, dieta.getIdDieta());
            ps.setInt(2, comida.getIdComida());
            int resultado=ps.executeUpdate();
            if(resultado==1){
                JOptionPane.showMessageDialog(null, "Exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla dieta comida 2323232");
        }

    }
    
    public void AgregarUnaComida(Dieta dieta, Comida comida){
        String sql="INSERT into dietacomida (idComida, idDieta) VALUES (?,?)";
        try {
            DietaComida DC=new DietaComida();
            PreparedStatement ps=con.prepareStatement( sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1,comida.getIdComida() );
            ps.setInt(2,dieta.getIdDieta() );
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            while(rs.next()){
                DC.setId(rs.getInt(1));
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al conectar la base de datos dieta comida" +ex);
        }
       
    }
}
