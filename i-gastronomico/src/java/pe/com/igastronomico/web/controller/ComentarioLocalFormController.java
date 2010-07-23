/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import pe.com.igastronomico.model.Comentario;
import pe.com.igastronomico.model.Local;
import pe.com.igastronomico.model.Usuario;

/**
 *
 * @author dew-grupo6
 */

@Controller
@RequestMapping("/comentariolocal.htm")
@SessionAttributes({"local"})
public class ComentarioLocalFormController extends IgastronomicoController{
    
    @RequestMapping(method=RequestMethod.GET)    
    public void doShowForm(@RequestParam("codLocal") Integer codLocal, Model model, HttpServletRequest request){
        model.addAttribute(this.igastronomicoService.getUsuario(this.getCurrentUser(request)));
        model.addAttribute(this.igastronomicoService.getLocal(codLocal));
    }

    @RequestMapping(method=RequestMethod.POST)
    public void soProcessForm(@RequestParam("comentario")String coment, Local local, BindingResult result, SessionStatus status, HttpServletRequest request){

        Usuario usuario = this.igastronomicoService.getUsuario(this.getCurrentUser(request));
        Comentario comentario = new Comentario(local, usuario, coment, 1);
        local.getComentarios().add(comentario);
        usuario.getComentarios().add(comentario);
        this.igastronomicoService.guardaComentario(comentario);
        status.isComplete();
    }
}
