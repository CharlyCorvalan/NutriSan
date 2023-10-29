/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Comida;
import Entidades.Dieta;
import Entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author charl
 */
public class DietaData {

    private Connection con = null;

    public DietaData() {
        con = Conector.getConnection();
    }

    public void agregarDieta(Dieta dieta) {
        String sql = "insert into dieta (idPaciente,nombre,fechaInicial,pesoInicial,pesoFinal,fechaFinal)"
                + "values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dieta.getPaciente().getIdPaciente());
            ps.setString(2, dieta.getNombre());
            ps.setDate(3, Date.valueOf(dieta.getFechaInicial()));
            ps.setDouble(4, dieta.getPesoInicial());
            ps.setDouble(5, dieta.getPesoFinal());
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            while (resultado.next()) {
                dieta.setIdDieta(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Dieta agregada satisfactoriamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Dieta");
        }
    }

    public void modificarDieta(Dieta dieta) {

        String sql = "update dieta set pesoFinal=?, fechaFinal=?"
                + "where idDieta=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, dieta.getPesoFinal());
            ps.setDate(2, Date.valueOf(dieta.getFechaFinal()));
            ps.setInt(3, dieta.getIdDieta());
            int resultado = ps.executeUpdate();
            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "Datos de dieta modificado satisfactoriamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Dieta");
        }
    }

    public ArrayList<Dieta> listarDietas(Paciente paciente) {
        ArrayList<Dieta> dietas = new ArrayList<>();
        String sql = "SELECT nombre,idDieta,pesoFinal,fechaFinal FROM dieta where idPaciente=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, paciente.getIdPaciente());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                dieta.setNombre(rs.getString("nombre"));
                dieta.setIdDieta(rs.getInt("idDieta"));
                
                dietas.add(dieta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la tabla dieta " + ex);
        }       
        return dietas;
    }
    public Dieta buscarDieta(int id, int paciente){
        Dieta dieta=new Dieta();
        String sql="Select idDieta,nombre,fechaInicial,fechaFinal,pesoInicial,pesoFinal from dieta where idDieta=? AND idPaciente=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, paciente);
            ResultSet resultado=ps.executeQuery();
            while(resultado.next()){
                
                dieta.setIdDieta(resultado.getInt("idDieta"));
                dieta.setNombre(resultado.getString("nombre"));
                dieta.setPesoFinal(resultado.getDouble("pesoFinal"));
                dieta.setPesoInicial(resultado.getDouble("pesoInicial"));
                dieta.setFechaInicial(resultado.getDate("fechaInicial").toLocalDate());
                dieta.setFechaFinal(resultado.getDate("fechaFinal").toLocalDate());
                
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla dieta");
        }
        
        
        return dieta;
    }
    

}
