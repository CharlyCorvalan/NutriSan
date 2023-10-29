/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Paciente;
import Entidades.Visita;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author charl
 */
public class VisitaData {
    private Connection con=null;

    public VisitaData() {
        con=Conector.getConnection();
    }
    public void nuevaVisita(Visita visita){
        String sql="insert into visita (idPaciente,idDieta,pesoVisita,fechaVisita,objetivo)"
                + "values (?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, visita.getPaciente());
            ps.setInt(2, visita.getDieta());
            ps.setDouble(3, visita.getPesoVisita());
            ps.setDate(4, Date.valueOf(visita.getFechaVisita()));
            ps.setBoolean(5, visita.isObjetivo());
            ps.executeUpdate();
            ResultSet resultado=ps.getGeneratedKeys();
            while(resultado.next()){
                visita.setIdVisita(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Visita registrada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla visitas");
        }
    }
    public ArrayList<Visita> objetivoCumplido(){
        ArrayList<Visita>reg=new ArrayList<>();
        String sql="select idVisita,idPaciente,idDieta,pesoVisita,fechaVisita from visita where objetivo=1";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet resultado=ps.executeQuery();
            while(resultado.next()){
                Visita visita=new Visita();  
                visita.setIdVisita(resultado.getInt("idVisita"));
                visita.setPaciente(resultado.getInt("idPaciente"));
                visita.setDieta(resultado.getInt("idDieta"));
                visita.setPesoVisita(resultado.getDouble("pesoVisita"));
                visita.setFechaVisita(resultado.getDate("fechaVisita").toLocalDate());
                visita.setObjetivo(true);
                reg.add(visita);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla visitas");
        }
        return reg;
    }
    public ArrayList<Visita> noCumplido(){
        ArrayList<Visita>reg=new ArrayList<>();
        String sql="select idVisita,idPaciente,idDieta,pesoVisita,fechaVisita from visita where objetivo=0";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet resultado=ps.executeQuery();
            while(resultado.next()){
                Visita visita=new Visita();
                visita.setIdVisita(resultado.getInt("idVisita"));
                visita.setPaciente(resultado.getInt("idPaciente"));
                visita.setDieta(resultado.getInt("idDieta"));
                visita.setPesoVisita(resultado.getDouble("pesoVisita"));
                visita.setFechaVisita(resultado.getDate("fechaVisita").toLocalDate());
                visita.setObjetivo(false);
                reg.add(visita);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla visita");
        }
        return reg;
    }
}
