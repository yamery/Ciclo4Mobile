package com.tecnidev.feedmeapp.modelos;

public class FormularioPublicacionDTO {
    private String nombreAlimento;
    private String fotoAlimento;
    private String fechaVencimiento;
    private String tipoAlimento;
    private String comentario;


    private static FormularioPublicacionDTO instance = new FormularioPublicacionDTO();

    public static FormularioPublicacionDTO getInstance() {
        return instance;
    }

    public static void setInstance(FormularioPublicacionDTO instance) {

    }

    public String getNombreAlimento() {
        return nombreAlimento;
    }

    public void setNombreAlimento(String nombreAlimento) {
        this.nombreAlimento = nombreAlimento;
    }

    public String getFotoAlimento() {
        return fotoAlimento;
    }

    public void setFotoAlimento(String fotoAlimento) {
        this.fotoAlimento = fotoAlimento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

}


