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
			//ArrayList listado=servicio.listadoUsuarios();
			//request.setAttribute("listadoUsuarios",listado);
			return mapping.findForward("exito");
		}else{
			request.setAttribute("mensajeerror","el usuario no es valido");
			return mapping.findForward("falla");
		}
	}

	

       

}

