/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.SessionAttributes;
import pe.com.igastronomico.model.Usuario;
import pe.com.igastronomico.service.IgastronomicoService;

/**
 *
 * @author dew-grupo6
 */
@Component
@SessionAttributes("usuario")
public class LoginValidator {
   
   private IgastronomicoService igastronomicoService;

    @Autowired
    public LoginValidator(IgastronomicoService igastronomicoService){
        this.igastronomicoService = igastronomicoService;
    }
  
    public Usuario validate(Usuario usuario, Errors errors){

        if(!StringUtils.hasLength(usuario.getLoginUsuario())){
            errors.rejectValue("loginUsuario", "required", "required");
        }

        if(!StringUtils.hasLength(usuario.getClaveUsuario())){
            errors.rejectValue("claveUsuario", "required", "required");
        }

        Usuario usuario1 = igastronomicoService.getUsuario(usuario.getLoginUsuario());
        if(usuario1!=null && usuario1.getClaveUsuario().equals(usuario.getClaveUsuario())){
            usuario = usuario1;            
        }
        else{
            errors.reject(null, "Usuario o clave incorrectos");
        }
        return usuario1;
    }

}
