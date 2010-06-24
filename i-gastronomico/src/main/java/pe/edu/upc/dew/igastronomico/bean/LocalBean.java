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
public class LocalBean extends BeanAccessLanguageException {

    private String cod_local;
    private String razon_social;
    private String departamento;
    private String provincia;
    private String distrito;
    private String direccion;
    private String referencia;
    private String persona_de_contacto;
    private String telefonos;
    private String correo;
    private String web;
    private String categoria_platos;
    private int categoria_costo;
    private String comentario_perfil;
    private String foto_ubicacion;
    private String foto_local;
    private int flag_promocion;
    private String carta_actual;
    private String promocion_actual;


    public LocalBean(){
    }
    public LocalBean(String cod_local, String razon_social, String departamento, String provincia, String distrito, String direccion, String referencia, String persona_de_contacto, String telefonos, String correo, String web, String categoria_platos, int categoria_costo, String comentario_perfil, String foto_ubicacion, String foto_local, int flag_promocion, String carta_actual, String promocion_actual) {
        this.cod_local = cod_local;
        this.razon_social = razon_social;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.direccion = direccion;
        this.referencia = referencia;
        this.persona_de_contacto = persona_de_contacto;
        this.telefonos = telefonos;
        this.correo = correo;
        this.web = web;
        this.categoria_platos = categoria_platos;
        this.categoria_costo = categoria_costo;
        this.comentario_perfil = comentario_perfil;
        this.foto_ubicacion = foto_ubicacion;
        this.foto_local = foto_local;
        this.flag_promocion = flag_promocion;
        this.carta_actual = carta_actual;
        this.promocion_actual = promocion_actual;
    }

    

    public String getCarta_actual() {
        return carta_actual;
    }

    public void setCarta_actual(String carta_actual) {
        this.carta_actual = carta_actual;
    }

    public int getCategoria_costo() {
        return categoria_costo;
    }

    public void setCategoria_costo(int categoria_costo) {
        this.categoria_costo = categoria_costo;
    }

    public String getCategoria_platos() {
        return categoria_platos;
    }

    public void setCategoria_platos(String categoria_platos) {
        this.categoria_platos = categoria_platos;
    }

    public String getCod_local() {
        return cod_local;
    }

    public void setCod_local(String cod_local) {
        this.cod_local = cod_local;
    }

    public String getComentario_perfil() {
        return comentario_perfil;
    }

    public void setComentario_perfil(String comentario_perfil) {
        this.comentario_perfil = comentario_perfil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public int getFlag_promocion() {
        return flag_promocion;
    }

    public void setFlag_promocion(int flag_promocion) {
        this.flag_promocion = flag_promocion;
    }

    public String getFoto_local() {
        return foto_local;
    }

    public void setFoto_local(String foto_local) {
        this.foto_local = foto_local;
    }

    public String getFoto_ubicacion() {
        return foto_ubicacion;
    }

    public void setFoto_ubicacion(String foto_ubicacion) {
        this.foto_ubicacion = foto_ubicacion;
    }

    public String getPersona_de_contacto() {
        return persona_de_contacto;
    }

    public void setPersona_de_contacto(String persona_de_contacto) {
        this.persona_de_contacto = persona_de_contacto;
    }

    public String getPromocion_actual() {
        return promocion_actual;
    }

    public void setPromocion_actual(String promocion_actual) {
        this.promocion_actual = promocion_actual;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }



    

}
