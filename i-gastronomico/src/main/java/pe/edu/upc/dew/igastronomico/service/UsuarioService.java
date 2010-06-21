/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.igastronomico.service;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.igastronomico.actionform.*;
import pe.edu.upc.dew.igastronomico.bean.UsuarioBean;

/**
 *
 * @author Junior
 */
public class UsuarioService {
    
    private List<UsuarioBean> listaUsuarios;

     UsuarioBean usu1 = new UsuarioBean("U0001","Junior Rufasto","123",1,"20/06/2010","jrufasto5@gmail.com");
            UsuarioBean usu2 = new UsuarioBean("U0002","Jose Huaman","123",2,"20/06/2010","jhuaman@gmail.com");
            UsuarioBean usu3 = new UsuarioBean("U0003","Carlos Martinez","123",1,"20/06/2010","cmartinez@gmail.com");


            List<UsuarioBean> listUsuarios = new ArrayList<UsuarioBean>();
            listUsuarios.add(usu1);
            listUsuarios.add(usu2);
            listUsuarios.add(usu3);
         
         


     /**
      * @return the listaAgencias
      */
     public List<Agencia> getListaAgencias() {
         return listaAgencias;
     }



}
