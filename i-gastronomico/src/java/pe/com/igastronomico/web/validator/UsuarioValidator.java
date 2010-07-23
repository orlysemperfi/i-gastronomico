/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.validator;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import pe.com.igastronomico.model.Usuario;



/**
 *
 * @author dew-grupo6
 */
public class UsuarioValidator {

    public void validate(Usuario usuario, Errors errors){

        if(!StringUtils.hasLength(usuario.getLoginUsuario())){
            errors.rejectValue("loginUsuario", "required", "required");
        }

        if(!StringUtils.hasLength(usuario.getClaveUsuario())){
            errors.rejectValue("claveUsuario", "required", "required");
        }

        if(!StringUtils.hasLength(usuario.getNombreUsuario())){
            errors.rejectValue("nombreUsuario", "required", "required");
        }

    }

}
