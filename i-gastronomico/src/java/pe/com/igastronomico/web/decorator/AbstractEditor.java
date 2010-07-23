/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.decorator;

import java.beans.PropertyEditorSupport;
import pe.com.igastronomico.service.IgastronomicoService;

/**
 *
 * @author dew-grupo6
 */

public class AbstractEditor extends PropertyEditorSupport{

    protected IgastronomicoService igastronomicoService;
    
    public AbstractEditor(){
        
    }
    
    public void setIgastronomicoService(IgastronomicoService igastronomicoService) {
        this.igastronomicoService = igastronomicoService;
    }
}
