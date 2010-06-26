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
        bean.setCod_local(((TourForm)form).getCod_local());
        bean.setPrioridad(((TourForm)form).getPrioridad());
        bean.setComentario(((TourForm)form).getComentario());
        bean.setFlag_comparte_tour(((TourForm)form).getFlag_comparte_tour());
        System.out.println("algun mensje cualkiera solo para log");
        if(Tbean ==null){
			//ArrayList listado=servicio.listadoUsuarios();
			//request.setAttribute("listadoUsuarios",listado);
                     servicio.registraTour(bean);
                    request.getSession().setAttribute("usrTour", bean);
                    request.setAttribute("lstaTab",servicio.getListaTours());
                    System.out.println("agrego");
			return mapping.findForward("exito");

		}
                else{
			request.setAttribute("mensajeerror","no se ha registrado el tour");
			return mapping.findForward("falla");
		}
         
    }

     public ActionForward cargaDatos(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {
                


                        String cod_tour = request.getParameter("cod_tour");
//OBtienes el BEAN completo que coincide con ese c0digo
                        TourBean tour = servicio.buscarTour(cod_tour);
//porsiaca si es que tu jsp de modificar necesitas alguna lista de algo, la dejas en el request o session
                       // request.getSession().setAttribute("listaRolesNU", rolService.listaRoles());
//el Bean completo que obtubiste, lo dejas en el request para que lo pintes en tu jsp
                        request.getSession().setAttribute("usrEdit", tour);
                        
               
//mandas al jsp que sea newcesario
                return mapping.findForward("modificar");
        }

     public ActionForward modificar(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {



                        TourBean tour = (TourBean) request.getSession().getAttribute("usrEdit");
                        //usuario.setUsrCodigo(Integer.parseInt(miform.getString("usrCodigo")));
                         tour.setNombre_tour(((TourForm)form).getNombre_tour());
                        tour.setCod_local(((TourForm)form).getCod_local());
        tour.setPrioridad(((TourForm)form).getPrioridad());
        tour.setComentario(((TourForm)form).getComentario());
        tour.setFlag_comparte_tour(((TourForm)form).getFlag_comparte_tour());
                      

                        //mando a modifcar el usuario
                        servicio.modificarTour(tour);
                       // nunca debo dejr nada  indevid oen session, y como ya no me sirve  ese
                    //objeto lo borro de sesssion
                        request.getSession().removeAttribute("usrEdit");
                         request.setAttribute("lstaTab",servicio.getListaTours());
                        request.setAttribute("mensaje", "Usuario eagregado a la base de datos");

                return mapping.findForward("exito");
        }

     public ActionForward eliminar(ActionMapping mapping, ActionForm form,HttpServletRequest request, HttpServletResponse response)throws Exception {



                       String cod_tour = request.getParameter("cod_tour");
//OBtienes el BEAN completo que coincide con ese c0digo
                        servicio.eliminarTour(cod_tour);
//porsiaca si es que tu jsp de modificar necesitas alguna lista de algo, la dejas en el request o session
                       // request.getSession().setAttribute("listaRolesNU", rolService.listaRoles());
//el Bean completo que obtubiste, lo dejas en el request para que lo pintes en tu jsp
                      
request.setAttribute("lstaTab",servicio.getListaTours());

//mandas al jsp que sea newcesario
                return mapping.findForward("eliminar");
        }

    public ActionForward listarTour(ActionMapping mapping,	ActionForm form,HttpServletRequest request,	HttpServletResponse response)throws Exception{

		//TourService servicio=new TourService();
		//LocalBean bean=new LocalBean() ;
                request.setAttribute("bTour",new TourBean());
                request.setAttribute("lstaTab",servicio.getListaTours());
                System.out.println("entrando lista tour");
                return mapping.findForward("exito");


	}

    public ActionForward ConsultarTour(ActionMapping mapping,	ActionForm form,HttpServletRequest request,	HttpServletResponse response)throws Exception{

		//ToukrService servicio=new TourService();
		//LocalBean bean=new LocalBean() ;
        String cod_tour = ((TourForm)form).getCod_tour();
        String nombre_tour = ((TourForm)form).getNombre_tour();
        String cod_local = ((TourForm)form).getCod_local();
        System.out.println("LA CONSULTA");
        System.out.println(cod_tour);
                request.setAttribute("bTour",new TourBean());
                request.setAttribute("lstaTab",servicio.getTours(cod_tour,nombre_tour,cod_local));
                System.out.println("entrando lista tour");
                return mapping.findForward("exito");


	}

}
