/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.igastronomico.model;

import java.util.List;

/**
 *
 * @author Administrador
 */
public class Usuario {
    /*definir atributos*/
    private String cod_usuario;
    private String nombre_usuario;
    private int tipo_usuario;
    private String fecha_registro;
    private String email;
    private String contrasena;

    public Usuario(String cod_usuario, String nombre_usuario, String contrasena, int tipo_usuario, String fecha_registro, String email) {
        this.cod_usuario = cod_usuario;
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
        this.tipo_usuario = tipo_usuario;
        this.fecha_registro = fecha_registro;
        this.email = email;
       
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private List<Local> local;
    private List<Tour> tour;

    public String getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(String cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public List<Local> getLocal() {
        return local;
    }

    public void setLocal(List<Local> local) {
        this.local = local;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public int getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(int tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    public List<Tour> getTour() {
        return tour;
    }

    public void setTour(List<Tour> tour) {
        this.tour = tour;
    }

    
}
