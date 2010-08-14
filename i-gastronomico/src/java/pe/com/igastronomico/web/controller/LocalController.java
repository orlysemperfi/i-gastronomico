/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.controller;

import java.io.OutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import pe.com.igastronomico.model.Local;
import pe.com.igastronomico.model.Usuario;

/**
 *
 * @author dew-grupo6
 */
@Controller
@SessionAttributes({"local"})
public class LocalController extends IgastronomicoController{

    @RequestMapping("/listarlocales.htm")
    public void doListLocales(@RequestParam(value="all", required=false) String all, Model model, HttpServletRequest request){

        String UsuarioActivo;

        Usuario usuario = this.igastronomicoService.getUsuario(this.getCurrentUser(request));

        UsuarioActivo = usuario.getLoginUsuario();

        if(all==null){
            if (!UsuarioActivo.equals("guest")){
                model.addAttribute(usuario.getLocals());
            }
            else
            {
                model.addAttribute(this.igastronomicoService.listaLocales());
            }
        }
        else
        {            
            model.addAttribute(this.igastronomicoService.listaLocales());
        }
    }

    @RequestMapping("/obtienefotolocal.htm")
    public void dogetFoto(Local local, HttpServletRequest request, HttpServletResponse response) throws Exception{
        byte[] bytes  = local.getFotoLocal();
        if(bytes!=null){
            response.setContentType("image/jpeg");
            OutputStream out = response.getOutputStream();
            out.write(bytes);
            out.close();
        }
    }

}
