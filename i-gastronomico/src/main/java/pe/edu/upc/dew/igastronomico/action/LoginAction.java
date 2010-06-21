/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.igastronomico.action;

/**
 *
 * @author Junior
 */

import java.util.ArrayList;


import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import pe.edu.upc.dew.igastronomico.service.UsuarioService;
import pe.edu.upc.dew.igastronomico.actionform.LoginForm;
import pe.edu.upc.dew.igastronomico.bean.UsuarioBean;
import pe.edu.upc.dew.igastronomico.model.Usuario;

public class LoginAction extends DispatchAction {
	public ActionForward login(ActionMapping mapping,	ActionForm form,HttpServletRequest request,	HttpServletResponse response)throws Exception{

		UsuarioService servicio=new UsuarioService();
		UsuarioBean bean=servicio.login((LoginForm)form);

		if(bean !=null){
			ArrayList listado=servicio.listadoUsuarios();
			request.setAttribute("listadoUsuarios",listado);
			return mapping.findForward("exito");
		}else{
			request.setAttribute("mensajeerror","el usuario no es valido");
			return mapping.findForward("falla");
		}
	}

	public ActionForward listar(ActionMapping mapping,	ActionForm form,HttpServletRequest request,	HttpServletResponse response)throws Exception{
	//	EmpleadoService servicio=new EmpleadoService();
	//	EmpleadoBean bean=servicio.login((LoginForm)form);
	//	ArrayList listado=servicio.listadoEmpleados();
	//	request.setAttribute("listadoEmpleados",listado);
		return mapping.findForward("exito");
	}

         public String listarUsuario(){
        log.debug("UsuarioAction :: listarUsuario()");

        try{
            //Establecemos el menu en el que nos encontramos
     

            Usuario usu1 = new Usuario("U0001","Junior Rufasto","123",1,"20/06/2010","jrufasto5@gmail.com");
            Usuario usu2 = new Usuario("U0002","Jose Huaman","123",2,"20/06/2010","jhuaman@gmail.com");
            Usuario usu3 = new Usuario("U0003","Carlos Martinez","123",1,"20/06/2010","cmartinez@gmail.com");
           

            List<Usuario> listUsuarios = new ArrayList<Usuario>();
            listUsuarios.add(usu1);
            listUsuarios.add(usu2);
            listUsuarios.add(usu3);
           

            return null;
        }catch (Exception e) {
            log.error("Error: UsuarioAction :: listarUsuario => " + e);
            return "error";
        }
    }

}

