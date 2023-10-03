/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nutrisan;

import AccesoADatos.PacienteData;
import Entidades.Paciente;
import java.util.ArrayList;
import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

/**
 *
 * @author charl
 */
public class NutriSan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Paciente p1=new Paciente("Matias",30518478,"Lujan 258","1548887456",true);
       Paciente p2=new Paciente("Franco",35897458,"Tres Arroyos 458","1548795823",true);
       Paciente p3=new Paciente("Pablo",31658996,"Las Delicias 987","1548721563",true);
       Paciente p4=new Paciente("Carlos",41548775,"Piñol 552","1587415599",true);
       Paciente p5=new Paciente("Jose",29548865,"Manzanares 143","1542111656",true);
        PacienteData pd1=new PacienteData();
        //pd1.agregarPaciente(p5);
        
        //pd1.modificiarPaciente(p1);
        //pd1.eliminarPaciente(1);
        ArrayList<Paciente>paciente=new ArrayList<>(pd1.listarPaciente());
        for (Paciente paciente1 : paciente) {
            System.out.println(paciente1.toString());
        }
    }
    
}
