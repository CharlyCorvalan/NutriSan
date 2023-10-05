/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nutrisan;

import AccesoADatos.ComidaDatos;
import AccesoADatos.DietaData;
import AccesoADatos.PacienteData;
import Entidades.Comida;
import Entidades.Dieta;
import Entidades.Paciente;
import java.time.LocalDate;
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

        Paciente p1 = new Paciente(1, "Matias", 30518478, "Lujan 258", "1548887456", true);
        Paciente p2 = new Paciente(2, "Franco", 35897458, "Tres Arroyos 458", "1548795823", true);
        Paciente p3 = new Paciente(3, "Pablo", 31658996, "Las Delicias 987", "1548721563", true);
        Paciente p4 = new Paciente(4, "Carlos", 41548775, "Piñol 552", "1587415599", true);
        Paciente p5 = new Paciente(5, "Jose", 29548865, "Manzanares 143", "1542111656", true);
        PacienteData pd1 = new PacienteData();
//        pd1.agregarPaciente(p5);

        //pd1.modificiarPaciente(p1);
        //pd1.eliminarPaciente(1);
//        ArrayList<Paciente>paciente=new ArrayList<>(pd1.listarPaciente());
//        for (Paciente paciente1 : paciente) {
//            System.out.println(paciente1.toString());
//        }
//        Dieta d1=new Dieta("Vegana", p5, LocalDate.of(2023, 5, 15), 95.56, 84, LocalDate.of(2023, 8, 15));
//        DietaData dd1=new DietaData();
//        dd1.agregarDieta(d1);
        Comida comida = new Comida("pizza", "(2 porciones) pizza de masa integral, con queso port Salut y albaca", 450);
        ComidaDatos comi = new ComidaDatos();
        comi.agregarComida(comida);
    }

}
