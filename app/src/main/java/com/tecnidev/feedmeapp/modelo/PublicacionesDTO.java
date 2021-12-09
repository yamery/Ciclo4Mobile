package com.tecnidev.feedmeapp.modelo;

public class PublicacionesDTO {

    //Attributes
    private String id;
    private String nombreAlimento;
    private String tipoAlimento;
    private String fechaVencimiento;
    private String descripcion;
    private String precio;

    // Constructors
    public PublicacionesDTO() {
    }

    public PublicacionesDTO(String id, String nombreAlimento, String tipoAlimento, String fechaVencimiento, String descripcion, String precio) {
        this.id = id;
        this.nombreAlimento = nombreAlimento;
        this.tipoAlimento = tipoAlimento;
        this.fechaVencimiento = fechaVencimiento;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    // Getters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreAlimento() {
        return nombreAlimento;
    }

    public void setNombreAlimento(String nombreAlimento) {
        this.nombreAlimento = nombreAlimento;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
