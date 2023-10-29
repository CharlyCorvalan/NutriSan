/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author charl
 */
public class Visita {
    private int idVisita,paciente, dieta;   
    private double pesoVisita;
    private LocalDate fechaVisita;
    private boolean objetivo;

    public Visita() {
    }

    public Visita(int paciente, int dieta, double pesoVisita, LocalDate fechaVisita, boolean objetivo) {
        this.paciente = paciente;
        this.dieta = dieta;
        this.pesoVisita = pesoVisita;
        this.fechaVisita = fechaVisita;
        this.objetivo = objetivo;
    }

    public Visita(int idVisita, int paciente, int dieta, double pesoVisita, LocalDate fechaVisita, boolean objetivo) {
        this.idVisita = idVisita;
        this.paciente = paciente;
        this.dieta = dieta;
        this.pesoVisita = pesoVisita;
        this.fechaVisita = fechaVisita;
        this.objetivo = objetivo;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public int getPaciente() {
        return paciente;
    }

    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }

    public int getDieta() {
        return dieta;
    }

    public void setDieta(int dieta) {
        this.dieta = dieta;
    }

    public double getPesoVisita() {
        return pesoVisita;
    }

    public void setPesoVisita(double pesoVisita) {
        this.pesoVisita = pesoVisita;
    }

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public boolean isObjetivo() {
        return objetivo;
    }

    public void setObjetivo(boolean objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public String toString() {
        return "Visita{" + "idVisita=" + idVisita + ", paciente=" + paciente + ", dieta=" + dieta + ", pesoVisita=" + pesoVisita + ", fechaVisita=" + fechaVisita + ", objetivo=" + objetivo + '}';
    }
    

}