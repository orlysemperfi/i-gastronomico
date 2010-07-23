/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.decorator;

import pe.com.igastronomico.model.TipoUsuario;
import pe.com.igastronomico.service.IgastronomicoService;

/**
 *
 * @author dew-grupo6
 */
public class TipoUsuarioEditor extends AbstractEditor{

    public TipoUsuarioEditor(IgastronomicoService igastronomicoService){
        super.setIgastronomicoService(igastronomicoService);
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        // text es lo que viene del browser
        // text es el contenido del combo box de tipos de usuarios        
        for(TipoUsuario tipoUsuario: this.igastronomicoService.listaTipoUsuario()){
            if(String.valueOf(tipoUsuario.getIdtipoUsuario()).equals(text)){
                setValue(tipoUsuario);                
            }
        }
    }
}
