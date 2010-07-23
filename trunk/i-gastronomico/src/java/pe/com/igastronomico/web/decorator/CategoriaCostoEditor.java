/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.decorator;

import pe.com.igastronomico.model.CategoriaCosto;
import pe.com.igastronomico.service.IgastronomicoService;

/**
 *
 * @author dew-grupo6
 */
public class CategoriaCostoEditor extends AbstractEditor{

    public CategoriaCostoEditor(IgastronomicoService igastronomicoService){
        super.setIgastronomicoService(igastronomicoService);
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        // text es lo que viene del browser
        // text es el contenido del combo box de tipos de usuarios
        for(CategoriaCosto categoriaCosto: this.igastronomicoService.listaCategoriaCosto()){
            if(String.valueOf(categoriaCosto.getIdcategoriaCosto()).equals(text)){
                setValue(categoriaCosto);
                break;
            }
        }
    }
}
