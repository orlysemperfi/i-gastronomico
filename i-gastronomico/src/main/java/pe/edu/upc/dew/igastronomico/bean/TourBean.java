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
public class TourBean extends BeanAccessLanguageException{

     private String cod_tour;
    private String nombre_tour;
    private String cod_usuario;
    private String cod_local;
    private String prioridad;
    private String comentario;
    private String flag_comparte_tour;

    public TourBean(String cod_tour, String nombre_tour, String cod_usuario, String cod_local, String prioridad, String comentario, String flag_comparte_tour) {
        this.cod_tour = cod_tour;
        this.nombre_tour = nombre_tour;
        this.cod_usuario = cod_usuario;
        this.cod_local = cod_local;
        this.prioridad = prioridad;
        this.comentario = comentario;
        this.flag_comparte_tour = flag_comparte_tour;
    }

    public TourBean(){
    }

    public String getCod_local() {
        return cod_local;
    }

    public void setCod_local(String cod_local) {
        this.cod_local = cod_local;
    }

    public String getCod_tour() {
        return cod_tour;
    }

    public void setCod_tour(String cod_tour) {
        this.cod_tour = cod_tour;
    }

    public String getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(String cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFlag_comparte_tour() {
        return flag_comparte_tour;
    }

    public void setFlag_comparte_tour(String flag_comparte_tour) {
        this.flag_comparte_tour = flag_comparte_tour;
    }

    public String getNombre_tour() {
        return nombre_tour;
    }

    public void setNombre_tour(String nombre_tour) {
        this.nombre_tour = nombre_tour;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

   



}
