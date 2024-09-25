package org.example.MODELOS;

import java.time.LocalDate;

public class Propietario {

    private Long id;
    private String nombres;
    private String Apellidos;
    private String numeroDocumento;
    private String numeroTelefono;
    private String direccionResidencia;
    private LocalDate fechaNacimiento;

    public Propietario() {
    }

    public Propietario(Long id, String nombres, String apellidos, String numeroDocumento, String numeroTelefono, String direccionResidencia, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombres = nombres;
        Apellidos = apellidos;
        this.numeroDocumento = numeroDocumento;
        this.numeroTelefono = numeroTelefono;
        this.direccionResidencia = direccionResidencia;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
