/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.validator;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import pe.com.igastronomico.model.Local;

/**
 *
 * @author dew-grupo6
 */
public class LocalValidator {

    public LocalValidator(){
    }
    
    public void validate(Local local, Errors errors) {
        if(!StringUtils.hasLength(local.getRazonSocial())){
            errors.rejectValue("razonSocial", "required", "required");
        }
        if(!StringUtils.hasLength(local.getDepartamento())){
            errors.rejectValue("departamento", "required", "required");
        }
        if(!StringUtils.hasLength(local.getProvincia())){
            errors.rejectValue("provincia", "required", "required");
        }
        if(!StringUtils.hasLength(local.getDistrito())){
            errors.rejectValue("distrito", "required", "required");
        }
        if(!StringUtils.hasLength(local.getDireccion())){
            errors.rejectValue("direccion", "required", "required");
        }
        if(!StringUtils.hasLength(local.getReferencia())){
            errors.rejectValue("referencia", "required", "required");
        }
        if(!StringUtils.hasLength(local.getPersonaDeContacto())){
            errors.rejectValue("personaDeContacto", "required", "required");
        }
        if(!StringUtils.hasLength(local.getTelefonos())){
            errors.rejectValue("telefonos", "required", "required");
        }
        if(!StringUtils.hasLength(local.getCorreo())){
            errors.rejectValue("correo", "required", "required");
        }
    }
}
