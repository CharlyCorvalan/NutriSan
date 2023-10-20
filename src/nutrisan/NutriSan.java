/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nutrisan;

import AccesoADatos.ComidaDatos;
import AccesoADatos.DietaComidaData;
import AccesoADatos.DietaData;
import AccesoADatos.IngredientesData;
import AccesoADatos.PacienteData;
import Entidades.Comida;
import Entidades.Dieta;
import Entidades.Ingredientes;
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
        Dieta d1 = new Dieta(1, "Vegana", p5, LocalDate.of(2023, 5, 15), 95.56, 84, LocalDate.of(2023, 8, 15));
//        DietaData dd1=new DietaData();
//        dd1.agregarDieta(d1);
//        Comida comida = new Comida(1, "pizza", "(2 porciones) pizza de masa integral, con queso port Salut y albaca", 450);
//        Comida comida2 = new Comida(2, "Pollo", "200gr de pollo hervido, a la plancha o al horno", 200);
//        Comida comida3 = new Comida(3, "Carnes rojas", "200gr de carne al horno, a la plancha o asada", 300);
//        Comida comida4 = new Comida(4, "Legumbres", "150gr de legumbres cocidas", 150);
//        Comida comida5 = new Comida(5, "Yogurt Natural", "200gr (1 pote)", 175);
//        Comida comida6 = new Comida(6, "Ensaladas verdes", "200gr de ensalada fresca", 125);

//        comidaArray.add(comida.getIdComida(), comida);
//        comidaArray.add(comida2.getIdComida(), comida2);
//        comidaArray.add(comida3.getIdComida(), comida3);
//        comidaArray.add(comida4.getIdComida(), comida4);
//        comidaArray.add(comida5.getIdComida(), comida5);
//        comidaArray.add(comida6.getIdComida(), comida6);
        ComidaDatos comi = new ComidaDatos();
//        comi.agregarComida(comida6);
        DietaComidaData dcd = new DietaComidaData();
        //dcd.agregarDietaComida(d1, comidaArray);
        //System.out.println(dcd.add());

//        ArrayList<Comida> comidaArray = new ArrayList<>(dcd.add(4));
//
//        for (Comida comida1 : comidaArray) {
//            System.out.println(comida1.getIdComida());
//        }
        //dcd.agregarDietaComida(d1, comidaArray);
        IngredientesData ingreData=new IngredientesData();
//        Ingredientes ingredientes1=new Ingredientes("pollo", "proteina", 100,7);
//        Ingredientes ingredientes2=new Ingredientes("Ensalada", "verdura", 45,2);
//        Ingredientes ingredientes3=new Ingredientes("queso", "lacteo", 105,3);
//        Ingredientes ingredientes4=new Ingredientes("cafe con leche", "infucion", 180,4);
//        Ingredientes ingredientes5=new Ingredientes("tostadas", "carbohidratos", 85,5);
//        Ingredientes ingredientes6=new Ingredientes("cereales", "cereal", 120,6);
        //ingreData.agregarIngrediente(ingredientes1);
       //ingreData.eliminarIngrediente(1);
       // System.out.println(ingreData.listarIngredientesPorCateg("lacteo"));
    
    }

}
