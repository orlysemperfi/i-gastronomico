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
import pe.edu.upc.dew.igastronomico.bean.LocalBean;
/**
 *
 * @author Junior
 */
public class LocalService {

    private List<LocalBean> listLocal;
	/*Este es el metodo consutrctor, aqui inicilizas tu lista de usuarios y
	como se la asignas a listaUsuarios qeu has delcarado como global lineas arriba,
	cuando llames al metodo getlistausuario obtendras la misma lista q has lelnado dentrode
	este metodo	*/
	public LocalService(){

	LocalBean loc1 = new LocalBean("L0001","Cafe-Bar","Lima","Lima","San Isideo","Av. Republica de Panama 3515","corpac","Luis Murga","4322332","cafebar@gmail.com","www.cafebar.com","A1",1,"Excelente lugar","","",1,"","");
        LocalBean loc2 = new LocalBean("L0002","Acurio","Lima","Lima","Miraflores","Av. Benavides 3515","Por ahi","Jose carranza","4322332","acurio@gmail.com","www.acurio.com","A1",1,"Excelente lugar","","",1,"","");


		//ya no declaras nuevamente xq ya lo has declarado como global, solo la inicializas
        //List<UsuarioBean> listUsuarios = new ArrayList<UsuarioBean>();
		listLocal = new ArrayList<LocalBean>();
        listLocal.add(loc1);
        listLocal.add(loc2);

	}

        public List<LocalBean> getListaLocales() {
         return listLocal;
     }

}
