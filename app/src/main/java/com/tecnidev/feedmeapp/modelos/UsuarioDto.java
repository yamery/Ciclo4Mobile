//package com.tecnidev.feedmeapp.modelos;

public class UsuarioDto {
    private String nombre;
    private String apellido;
    private String sexo;
    private String direccion;
    private String correo;
    private String foto;
    private String ciudad;
    private String celular;
    private String  usuario;
    private String  password;

    private static UsuarioDto instance = new UsuarioDto();

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getFoto() {
        return foto;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCelular() {
        return celular;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public static UsuarioDto getInstance() {
        return instance;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void setInstance(UsuarioDto instance) {
        UsuarioDto.instance = instance;
    }
}
