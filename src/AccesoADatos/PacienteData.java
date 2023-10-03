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
            ps.setBoolean(5, paciente.isEstado());
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
}
