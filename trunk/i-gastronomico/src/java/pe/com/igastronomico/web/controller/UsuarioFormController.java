/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;
import pe.com.igastronomico.model.TipoUsuario;
import pe.com.igastronomico.model.Usuario;
import pe.com.igastronomico.web.decorator.TipoUsuarioEditor;
import pe.com.igastronomico.web.validator.UsuarioValidator;

/**
 *
 * @author dew-grupo6
 */
@Controller
@SessionAttributes({"usuario"})
@RequestMapping("/formusuario.htm")

public class UsuarioFormController extends IgastronomicoController{

    @ModelAttribute
    public List<TipoUsuario> doAtachList(){        
        return this.igastronomicoService.listaTipoUsuario();
    }

    @InitBinder
    public void doInitBinder(WebDataBinder dataBinder){        
        dataBinder.setDisallowedFields(new String[] {"codUsuario"});
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
        dataBinder.registerCustomEditor(TipoUsuario.class, new TipoUsuarioEditor(this.igastronomicoService));
        dataBinder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
    }

    @RequestMapping(method=RequestMethod.GET)
    public String doShowForm(Model model, HttpServletRequest request){
        Usuario usuario = this.igastronomicoService.getUsuario(this.getCurrentUser(request));
        model.addAttribute(usuario);
        return "formusuario";
    }
    

    @RequestMapping(method=RequestMethod.POST)
    public String doProcessForm(Usuario usuario, BindingResult result, SessionStatus status){        
        new UsuarioValidator().validate(usuario, result);
        if(!result.hasErrors()){            
            this.igastronomicoService.guardaUsuario(usuario);
            this.logger.info("la foto esta cargada");
            return "redirect:usuario.htm";
        }
        else{            
            return "formusuario";
        }
    }

}
