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
//import pe.edu.upc.dew.igastronomico.service.TourService;
import pe.edu.upc.dew.igastronomico.actionform.LocalForm;
import pe.edu.upc.dew.igastronomico.bean.LocalBean;
public class LocalAction extends DispatchAction {



   LocalService servicio=new LocalService();

    public ActionForward registraRest (ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

		LocalBean Lbean=servicio.BuscaRest((LocalForm)form);
        LocalBean bean= new LocalBean();

 /*       private String cod_local;
    private String razon_social;
    private String departamento;
    private String provincia;
    private String distrito;
    private String direccion;
    private String referencia;
    private String persona_de_contacto;
    private String telefonos;
    private String correo;
    private String web;
    private String categoria_platos;
    private int categoria_costo;
    private String comentario_perfil;
    private String foto_ubicacion;
    private String foto_local;
    private int flag_promocion;
    private String carta_actual;
    private String promocion_actual; */

        bean.setCod_local(((LocalForm)form).getCod_local());
        bean.setRazon_social(((LocalForm)form).getRazon_social());
        bean.setDepartamento(((LocalForm)form).getDepartamento());
        bean.setProvincia(((LocalForm)form).getProvincia());
        bean.setDistrito(((LocalForm)form).getDistrito());
        bean.setDireccion(((LocalForm)form).getDireccion());
        bean.setReferencia(((LocalForm)form).getReferencia());
        bean.setPersona_de_contacto(((LocalForm)form).getPersona_de_contacto());
        bean.setTelefonos(((LocalForm)form).getTelefonos());
        bean.setCorreo(((LocalForm)form).getCorreo());
        bean.setWeb(((LocalForm)form).getWeb());
        bean.setCategoria_platos(((LocalForm)form).getCategoria_platos());
        bean.setCategoria_costo(((LocalForm)form).getCategoria_costo());
        bean.setComentario_perfil(((LocalForm)form).getComentario_perfil());bean.setCorreo(((LocalForm)form).getCorreo());
        bean.setFoto_ubicacion(((LocalForm)form).getFoto_ubicacion());
        bean.setFoto_local(((LocalForm)form).getFoto_local());
        bean.setFlag_promocion(((LocalForm)form).getFlag_promocion());
        bean.setCarta_actual(((LocalForm)form).getCarta_actual());
        bean.setPromocion_actual(((LocalForm)form).getPromocion_actual());


        System.out.println("algun mensje cualkiera solo para log");
        if(Lbean ==null){
			//ArrayList listado=servicio.listadoUsuarios();
			//request.setAttribute("listadoUsuarios",listado);
                     servicio.registraRest(bean);
                    request.getSession().setAttribute("usrTour", bean);
                    request.setAttribute("lstaTab",servicio.getListaLocales());
                    System.out.println("agrego");
			return mapping.findForward("exito");

		}
                else{
			request.setAttribute("mensajeerror","no se ha registrado el tour");
			return mapping.findForward("falla");
		}

    }

    public ActionForward listarLocal(ActionMapping mapping,	ActionForm form,HttpServletRequest request,	HttpServletResponse response)throws Exception{

		
               // TourService servicio2=new TourService();
		//LocalBean bean=new LocalBean() ;
                request.setAttribute("blocal",new LocalBean());
                request.setAttribute("lstaCmbo",servicio.getListaLocales());
                //request.setAttribute("lstaTab",servicio2.getListaTours());
                return mapping.findForward("exito");


	}

}
