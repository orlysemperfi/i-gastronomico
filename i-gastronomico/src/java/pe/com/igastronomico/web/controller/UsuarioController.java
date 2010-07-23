/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.controller;

import java.io.OutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import pe.com.igastronomico.model.Usuario;

/**
 *
 * @author dew-grupo6
 */
@Controller
@SessionAttributes("usuario")
public class UsuarioController extends IgastronomicoController{

    @RequestMapping("/obtienefotousuario.htm")
    public void dogetFoto(@RequestParam(value="codUsuario", required=false) String codUsuario, HttpServletRequest request, HttpServletResponse response) throws Exception{
        Usuario usuario = this.igastronomicoService.getUsuario(this.getCurrentUser(request));
        byte[] bytes;        
        if(codUsuario==null){
            bytes  = usuario.getFotoUsuario();
        }
        else{
            bytes  = this.igastronomicoService.getUsuario(Integer.valueOf(codUsuario)).getFotoUsuario();
        }
        
        if(bytes!=null){
            response.setContentType("image/jpeg");
            OutputStream out = response.getOutputStream();
            out.write(bytes);
            out.close();
        }
    }

    
    @RequestMapping("/usuario.htm")
    public void doShowUsuario(){
        
    }

}
