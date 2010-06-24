/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.igastronomico.actionform;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Junior
 */
public class TourForm extends ActionForm {

      private String cod_tour;
    private String nombre_tour;
    private String cod_usuario;
    private String cod_local;
    private String prioridad;
    private String comentario;
    private String flag_comparte_tour;

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

    @Override
public void reset(ActionMapping mapping, HttpServletRequest request) {
	// TODO Auto-generated method stub
	super.reset(mapping, request);
}
@Override
public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
	// TODO Auto-generated method stub
	return super.validate(mapping, request);
}

}
