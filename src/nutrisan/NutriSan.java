/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nutrisan;

import AccesoADatos.PacienteData;
import Entidades.Paciente;
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
       Paciente p1=new Paciente("Jorge",30518478,"Besares 258","3568989",true);
        PacienteData pd1=new PacienteData();
        pd1.agregarPaciente(p1);
    }
    
}
