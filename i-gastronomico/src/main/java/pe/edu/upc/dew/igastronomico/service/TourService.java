/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.igastronomico.service;
import java.util.ArrayList;
import java.util.List;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import pe.edu.upc.dew.igastronomico.actionform.*;
import pe.edu.upc.dew.igastronomico.bean.TourBean;

/**
 *
 * @author Junior
 */
public class TourService {

    private List<TourBean> listTours;
	/*Este es el metodo consutrctor, aqui inicilizas tu lista de usuarios y
	como se la asignas a listaUsuarios qeu has delcarado como global lineas arriba,
	cuando llames al metodo getlistausuario obtendras la misma lista q has lelnado dentrode
	este metodo	*/
	public TourService(){

	TourBean tour1 = new TourBean("T0001","Mancora-Lima","U0002","L0001","5","Todo incluido","S");
        TourBean tour2 = new TourBean("T00021","Cuzco-Lima","U0003","L0002","3","Todo incluido","S");


		//ya no declaras nuevamente xq ya lo has declarado como global, solo la inicializas
        //List<UsuarioBean> listUsuarios = new ArrayList<UsuarioBean>();
		listTours = new ArrayList<TourBean>();
        listTours.add(tour1);
        listTours.add(tour2);
        
	}

        /*Este metodo te entrega la lsita de usuarios*/
	public List<TourBean> getListaTours() {
         return listTours;
}
}
