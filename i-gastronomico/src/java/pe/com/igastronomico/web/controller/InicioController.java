/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import pe.com.igastronomico.model.Usuario;

/**
 *
 * @author dew-grupo6
 */
@Controller
@SessionAttributes({"tour"})
public class InicioController extends IgastronomicoController {

    @RequestMapping("/index.htm")
    public void doInicio(Model model, HttpServletRequest request){
            model.addAttribute(this.igastronomicoService.getUsuario(this.getCurrentUser(request)));
    }

    @RequestMapping("/listarusuario.htm")
    public void doListarUsuario(Model model){
        model.addAttribute(this.igastronomicoService.listaUsuarios());
        Usuario usuario = this.igastronomicoService.getUsuario(6);
    }

    @RequestMapping("/submenucomentario.htm")
    public void doSubmenu(Model model){
    }
}
