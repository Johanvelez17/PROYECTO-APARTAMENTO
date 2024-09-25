package org.example.MODELOS;

import java.time.LocalDate;

public class Apartamento {

    private Long id;
    private String direccion;
    private String arrendatario;
    private Integer numeroHabitaciones;
    private Double precio;
    private LocalDate antiguedad;
    private Boolean disponibilidad;

    public Apartamento() {
    }

    public Apartamento(Long id, String direccion, Arrendatario arrendatario, Integer numeroHabitaciones, Integer precio, LocalDate antiguedad, Boolean disponibilidad) {
        this.id = id;
        this.direccion = direccion;
        this.arrendatario = arrendatario;
        this.numeroHabitaciones = numeroHabitaciones;
        this.precio = precio;
        this.antiguedad = antiguedad;
        this.disponibilidad = disponibilidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Arrendatario getArrendatario() {
        return arrendatario;
    }

    public void setArrendatario(String arrendatario) {
        this.arrendatario = arrendatario;
    }

    public Integer getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Integer numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public LocalDate getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(LocalDate antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
