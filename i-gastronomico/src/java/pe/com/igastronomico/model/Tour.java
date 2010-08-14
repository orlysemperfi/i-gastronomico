package pe.com.igastronomico.model;
// Generated 05/07/2010 12:21:34 PM by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;

/**
 * Tour generated by hbm2java
 */
public class Tour  implements java.io.Serializable {

     private Integer idtour;
     private Usuario usuario;
     private String codTour;
     private String comentario;
     private Integer flagComparteTour;
     private Set locals = new HashSet(0);

    public Tour() {
    }

    public Tour(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tour(Usuario usuario, String codTour, String comentario, Integer flagComparteTour, Set locals) {
       this.usuario = usuario;
       this.codTour = codTour;
       this.comentario = comentario;
       this.flagComparteTour = flagComparteTour;
       this.locals = locals;
    }

    public Integer getIdtour() {
        return this.idtour;
    }

    public void setIdtour(Integer idtour) {
        this.idtour = idtour;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getCodTour() {
        return this.codTour;
    }

    public void setCodTour(String codTour) {
        this.codTour = codTour;
    }
    public String getComentario() {
        return this.comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public Integer getFlagComparteTour() {
        return this.flagComparteTour;
    }

    public void setFlagComparteTour(Integer flagComparteTour) {
        this.flagComparteTour = flagComparteTour;
    }
    public Set getLocals() {
        return this.locals;
    }

    public void setLocals(Set locals) {
        this.locals = locals;
    }

}

