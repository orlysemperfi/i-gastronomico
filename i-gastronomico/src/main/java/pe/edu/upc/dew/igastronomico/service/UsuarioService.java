/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.igastronomico.service;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.igastronomico.actionform.*;
import pe.edu.upc.dew.igastronomico.bean.UsuarioBean;
import pe.edu.upc.dew.igastronomico.dao.DAOFactory;
import pe.edu.upc.dew.igastronomico.dao.UsuarioDAO;
import pe.edu.upc.dew.igastronomico.util.Parametros;

/**
 *
 * @author Junior
 */
public class UsuarioService {

    private List<UsuarioBean> listUsuarios;
    DAOFactory objDAOFactory = DAOFactory.getDAOFactory(Parametros.ORIGEN);

	UsuarioDAO objUsuarioDAO = objDAOFactory.getUsuarioDAO();
	/*Este es el metodo consutrctor, aqui inicilizas tu lista de usuarios y
	como se la asignas a listaUsuarios qeu has delcarado como global lineas arriba,
	cuando llames al metodo getlistausuario obtendras la misma lista q has lelnado dentrode
	este metodo	*/
	public UsuarioService(){
		UsuarioBean usu1 = new UsuarioBean("U0001","Junior Rufasto","123",1,"20/06/2010","jrufasto5@gmail.com");
        UsuarioBean usu2 = new UsuarioBean("U0002","Jose Huaman","123",2,"20/06/2010","jhuaman@gmail.com");
        UsuarioBean usu3 = new UsuarioBean("U0003","Carlos Martinez","123",1,"20/06/2010","cmartinez@gmail.com");

		//ya no declaras nuevamente xq ya lo has declarado como global, solo la inicializas
        //List<UsuarioBean> listUsuarios = new ArrayList<UsuarioBean>();
        listUsuarios = new ArrayList<UsuarioBean>();
        listUsuarios.add(usu1);
        listUsuarios.add(usu2);
        listUsuarios.add(usu3);
	}

     /**
      * @return the listaAgencias
      */
     

	/*Este metodo te entrega la lsita de usuarios*/
	public List<UsuarioBean> getListaUsuarios() {
         return listUsuarios;
     }

        public UsuarioBean login(LoginForm form) throws Exception{
		return objUsuarioDAO.login(form);
	}

        public ArrayList listadoUsuarios() throws Exception{
		return objUsuarioDAO.listadoUsuarios();
	}

}

