/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.igastronomico.bean;
import org.apache.commons.beanutils.BeanAccessLanguageException;



/**
 *
 * @author Junior
 */
public class UsuarioBean extends BeanAccessLanguageException {
     private String cod_usuario;
    private String nombre_usuario;
    private int tipo_usuario;
    private String fecha_registro;
    private String email;
    private String contrasena;

     public UsuarioBean(String cod_usuario, String nombre_usuario, String contrasena, int tipo_usuario, String fecha_registro, String email) {
        this.cod_usuario = cod_usuario;
        this.nombre_usuario = nombre_usuario;
        this.contrasena = contrasena;
        this.tipo_usuario = tipo_usuario;
        this.fecha_registro = fecha_registro;
        this.email = email;

    }

    public String getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(String cod_usuario) {
        this.cod_usuario = cod_usuario;
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

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
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

    

}
