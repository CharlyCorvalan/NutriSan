/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author charl
 */
public class PacienteData {

    private Connection con = null;
private ArrayList<Paciente> pacientes=new ArrayList<>();
    public PacienteData() {
        con=Conector.getConnection();
    }
public void agregarPaciente(Paciente paciente){
    String sql="insert into paciente (nombre,dni,domicilio,telefono,estado)"
            + "values (?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getDni());
            ps.setString(3, paciente.getDomicilio());
            ps.setString(4, paciente.getTelefono());
            ps.setBoolean(5, true);
            ps.executeUpdate();
            ResultSet resultado=ps.getGeneratedKeys();
            if(resultado.next()){
                paciente.setIdPaciente(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Paciente agregado satisfactoriamente");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paciente");
        }
}
public void modificiarPaciente(Paciente paciente){
    String sql="update paciente set domicilio=?,telefono=? "
            + "where idPaciente=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,paciente.getDomicilio() );
            ps.setString(2, paciente.getTelefono());
            ps.setInt(3, paciente.getIdPaciente());
            int resultado=ps.executeUpdate();
            if(resultado==1){
                JOptionPane.showMessageDialog(null, "Exito al modificar datos del paciente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paciente");
        }
}
public void eliminarPaciente(int id){
    String sql="UPDATE paciente SET estado=0 WHERE idPaciente=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Paciente eliminado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paciente "+ex);
        }
    
}
public ArrayList <Paciente> listarPaciente(){
   String sql="SELECT * FROM paciente WHERE estado=1";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Paciente paciente=new Paciente();
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setTelefono(rs.getString("telefono"));
                paciente.setEstado(rs.getBoolean("estado"));
                pacientes.add(paciente);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paciente "+ex);
        }
    return pacientes;
}
public ArrayList<Paciente> listarPacientePorDieta(int idDieta){
    String sql="SELECT nombre, paciente.idPaciente FROM paciente join dieta on (paciente.idPaciente = dieta.idPaciente)"
            + " WHERE idDieta=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idDieta);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Paciente paciente=new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setNombre(rs.getString("nombre"));
                pacientes.add(paciente);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paciente "+ex);
        }
    
    return pacientes;
}
public Paciente buscarXdni(int dni){
    Paciente pa=new Paciente();
    String sql="select idPaciente ,nombre,dni,domicilio,telefono, estado from paciente where dni=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet resultado=ps.executeQuery();
            while(resultado.next()){
                pa.setIdPaciente(resultado.getInt("idPaciente"));
                pa.setNombre(resultado.getString("nombre"));
                pa.setDni(resultado.getInt("dni"));
                pa.setDomicilio(resultado.getString("domicilio"));
                pa.setTelefono(resultado.getString("telefono"));
                pa.setEstado(resultado.getBoolean("estado"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Paciente");
        }
    return pa;
}
public Paciente buscarXID(int id){
    Paciente pa=new Paciente();
    String sql="select  nombre, dni, domicilio, telefono,estado from paciente where idPaciente=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet  resultado=ps.executeQuery();
            while(resultado.next()){
                
                pa.setNombre(resultado.getString("nombre"));
                pa.setDomicilio(resultado.getString("domicilio"));
                pa.setDni(resultado.getInt("dni"));
                pa.setTelefono(resultado.getString("telefono"));
                pa.setEstado(resultado.getBoolean("estado"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Pacientes");
        }
       
    return pa;
}
}
