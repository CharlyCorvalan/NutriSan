/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Paciente;
import java.sql.Connection;

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
    String sql="insert into paciente (nombre,dni,domicilio,telefono)"
            + "values (????)";
}
}
