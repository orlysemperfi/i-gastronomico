/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.decorator;

import pe.com.igastronomico.model.CategoriaPlato;
import pe.com.igastronomico.service.IgastronomicoService;

/**
 *
 * @author dew-grupo6
 */
public class CategoriaPlatoEditor extends AbstractEditor{

    public CategoriaPlatoEditor(IgastronomicoService igastronomicoService){
        super.setIgastronomicoService(igastronomicoService);
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        // text es lo que viene del browser
        // text es el contenido del combo box de tipos de usuarios
        for(CategoriaPlato categoriaPlato: this.igastronomicoService.listaCategoriaPlato()){
            if(String.valueOf(categoriaPlato.getIdcategoriaPlato()).equals(text)){
                setValue(categoriaPlato);
                break;
            }
        }
    }

}
