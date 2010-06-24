/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.igastronomico.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import pe.edu.upc.dew.igastronomico.service.TourService;
import pe.edu.upc.dew.igastronomico.actionform.TourForm;
import pe.edu.upc.dew.igastronomico.bean.TourBean;

/**
 *
 * @author Junior
 */
public class TourAction extends DispatchAction{
TourService servicio=new TourService();
    public ActionForward registraTour (ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        
		TourBean Tbean=servicio.BuscaTour((TourForm)form);
        TourBean bean= new TourBean();

        bean.setCod_tour(((TourForm)form).getCod_tour());
        bean.setNombre_tour(((TourForm)form).getNombre_tour());
        bean.setCod_usuario(((TourForm)form).getCod_usuario());
        bean.setPrioridad(((TourForm)form).getPrioridad());
        bean.setComentario(((TourForm)form).getComentario());
        bean.setFlag_comparte_tour(((TourForm)form).getFlag_comparte_tour());
        System.out.println("algun mensje cualkiera solo para log");
        if(Tbean ==null){
			//ArrayList listado=servicio.listadoUsuarios();
			//request.setAttribute("listadoUsuarios",listado);
                     servicio.registraTour(bean);
                    request.getSession().setAttribute("usrTour", bean);
                    System.out.println("agrego");
			return mapping.findForward("exito");

		}
                else{
			request.setAttribute("mensajeerror","no se ha registrado el tour");
			return mapping.findForward("falla");
		}
         
    }

    public ActionForward listarTour(ActionMapping mapping,	ActionForm form,HttpServletRequest request,	HttpServletResponse response)throws Exception{

		//TourService servicio=new TourService();
		//LocalBean bean=new LocalBean() ;
                request.setAttribute("bTour",new TourBean());
                request.setAttribute("lstaTab",servicio.getListaTours());
                System.out.println("entrando lista tour");
                return mapping.findForward("exito");


	}

}
