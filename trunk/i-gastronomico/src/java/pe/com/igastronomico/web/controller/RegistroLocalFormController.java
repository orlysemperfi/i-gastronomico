/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.controller;

import pe.com.igastronomico.web.validator.LocalValidator;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
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
import pe.com.igastronomico.model.CategoriaCosto;
import pe.com.igastronomico.model.CategoriaPlato;
import pe.com.igastronomico.model.Local;
import pe.com.igastronomico.model.Usuario;
import pe.com.igastronomico.web.decorator.CategoriaCostoEditor;
import pe.com.igastronomico.web.decorator.CategoriaPlatoEditor;

/**
 *
 * @author dew-grupo6
 */
@Controller
@SessionAttributes({"local"})
@RequestMapping("/registrolocal.htm")
public class RegistroLocalFormController extends IgastronomicoController {
    
    @ModelAttribute
    public List doAtachCategoriaCostoList(){
        return this.igastronomicoService.listaCategoriaCosto();
    }

    @ModelAttribute
    public List doAtachCategoriaPlatoList(){
       return this.igastronomicoService.listaCategoriaPlato();
    }

    @InitBinder
    public void doInitBinder(WebDataBinder dataBinder){
        dataBinder.setDisallowedFields(new String[] {"codLocal"});        
        dataBinder.registerCustomEditor(CategoriaCosto.class, new CategoriaCostoEditor(this.igastronomicoService));
        dataBinder.registerCustomEditor(CategoriaPlato.class, new CategoriaPlatoEditor(this.igastronomicoService));
        dataBinder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());
    }

    @RequestMapping(method=RequestMethod.GET)
    public String doShowForm(@RequestParam("codLocal") Integer codLocal,  Model model){
        if(codLocal==null || codLocal==0){
            model.addAttribute(new Local());
        }
        else
        {
            model.addAttribute(this.igastronomicoService.getLocal(codLocal));
        }
        return "registrolocal";
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public String doProcessForm(Local local, BindingResult result, SessionStatus status, HttpServletRequest request){
        Usuario usuario = this.igastronomicoService.getUsuario(this.getCurrentUser(request));
        local.setUsuario(usuario);
        usuario.getLocals().add(local);

        new LocalValidator().validate(local, result);

        if(!result.hasErrors()){
            this.igastronomicoService.guardaLocal(local);
            status.isComplete();
            return "redirect:listarlocales.htm";
        }
        else
        {
            return "registrolocal";
        }
    }
}
