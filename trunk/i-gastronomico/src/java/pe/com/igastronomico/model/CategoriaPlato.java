package pe.com.igastronomico.model;
// Generated 05/07/2010 12:21:34 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * CategoriaPlato generated by hbm2java
 */
public class CategoriaPlato  implements java.io.Serializable {


     private Integer idcategoriaPlato;
     private String categoriaPlato;

    public CategoriaPlato() {
    }

    public CategoriaPlato(String categoriaPlato) {
       this.categoriaPlato = categoriaPlato;
    }
   
    public Integer getIdcategoriaPlato() {
        return this.idcategoriaPlato;
    }
    
    public void setIdcategoriaPlato(Integer idcategoriaPlato) {
        this.idcategoriaPlato = idcategoriaPlato;
    }
    public String getCategoriaPlato() {
        return this.categoriaPlato;
    }
    
    public void setCategoriaPlato(String categoriaPlato) {
        this.categoriaPlato = categoriaPlato;
    }

    public String toString(){
        return categoriaPlato;
    }
}


