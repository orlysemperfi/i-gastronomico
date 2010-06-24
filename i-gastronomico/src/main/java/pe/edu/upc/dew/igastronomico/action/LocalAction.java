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

import pe.edu.upc.dew.igastronomico.service.LocalService;
import pe.edu.upc.dew.igastronomico.actionform.LocalForm;
import pe.edu.upc.dew.igastronomico.bean.LocalBean;
public class LocalAction extends DispatchAction {

    public ActionForward listarLocal(ActionMapping mapping,	ActionForm form,HttpServletRequest request,	HttpServletResponse response)throws Exception{

		LocalService servicio=new LocalService();
		//LocalBean bean=new LocalBean() ;
                request.setAttribute("blocal",new LocalBean());
                request.setAttribute("lstaCmbo",servicio.getListaLocales());
                return mapping.findForward("exito");


	}

}
