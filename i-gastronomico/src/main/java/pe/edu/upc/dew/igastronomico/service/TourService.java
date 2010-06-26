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
    private ArrayList<TourBean> Tours;
	/*Este es el metodo consutrctor, aqui inicilizas tu lista de usuarios y
	como se la asignas a listaUsuarios qeu has delcarado como global lineas arriba,
	cuando llames al metodo getlistausuario obtendras la misma lista q has lelnado dentrode
	este metodo	*/
	public TourService(){

	TourBean tour1 = new TourBean("T0001","Mancora-Lima","U0002","L0001","5","Todo incluido","S");
        TourBean tour2 = new TourBean("T0002","Cuzco-Lima","U0003","L0002","3","Todo incluido","S");
        TourBean tour3 = new TourBean("T0003","Cuzco-Lima","U0003","L0002","3","Todo incluido","S");
            Tours = new ArrayList<TourBean>();

		//ya no declaras nuevamente xq ya lo has declarado como global, solo la inicializas
        //List<UsuarioBean> listUsuarios = new ArrayList<UsuarioBean>();
		listTours = new ArrayList<TourBean>();
        listTours.add(tour1);
        listTours.add(tour2);
        listTours.add(tour3);
        
	}

        /*Este metodo te entrega la lsita de usuarios*/
	public List<TourBean> getListaTours() {
         return listTours;
}

       
        public ArrayList<TourBean> getTours (String cod_tour,String nombre_tour, String cod_local) {
         System.out.println("SERVICE");
        System.out.println(cod_tour);
        System.out.println(nombre_tour);
        System.out.println(cod_local);
        ArrayList<TourBean> lista = new ArrayList<TourBean>();
        for (TourBean tour : listTours) {

            if ((cod_tour != null) && (nombre_tour.equals(""))) {
            if (tour.getCod_tour().equals(cod_tour)){
                System.out.println("solo codigo");
                lista.add(tour);
            }
                }
            else    if ((cod_tour.equals("")) && (nombre_tour != null)){
            if (tour.getNombre_tour().equals(nombre_tour)){
                System.out.println("solo nombre");
                lista.add(tour);
            }
                }
            else if ( (cod_tour.equals("")) && (cod_local != null)){
            if (tour.getCod_local().equals(cod_local)){
                System.out.println("solo local");
                lista.add(tour);
            }
                }

        /*    else    if ((cod_local != null) && (nombre_tour != null)){
            if ((tour.getNombre_tour().equals(nombre_tour))&& (tour.getCod_local().equals(cod_local)) ) {
                System.out.println("solo nombre");
                lista.add(tour);
            }
                }*/

        }
        return lista;
    }
        
         public TourBean BuscaTour(TourForm form) {
              System.out.println(form.getCod_tour());
                // System.out.println(form.getPassword());
		TourBean t = null;
		for(TourBean ts : listTours ){

      if(ts.getCod_tour().equals(((TourForm)form).getCod_tour())){
            //  .equals((LoginForm)form).getUsuario()){
				t = ts;
			}
		}
        return t;
 }
        public void registraTour(TourBean ts){
          listTours.add(ts);
     }

      

        public TourBean buscarTour2 (String cod_tour) {
        for(TourBean tour : listTours){
            if (tour.getCod_tour().equals(cod_tour)){
                return tour;
            }
        }
        return null;
    }



    public TourBean buscarTour (String cod_tour) {
        TourBean retorno = null;
        for (int i = 0; i < listTours.size(); i++) {
            String Ncod_tour = listTours.get(i).getCod_tour();
            if (Ncod_tour.equals(cod_tour) ) {
                retorno = listTours.get(i);
            }
        }
        return retorno;
    }

    

    public void modificarTour (TourBean ts) {

        ts.setNombre_tour(ts.getNombre_tour());
        ts.setCod_local(ts.getCod_local());
        ts.setPrioridad(ts.getPrioridad());
        ts.setComentario(ts.getComentario());
        ts.setFlag_comparte_tour(ts.getFlag_comparte_tour());

    }

    public void eliminarTour (String cod_tour) {
       listTours.remove(buscarTour(cod_tour));
       
       
    }
}
