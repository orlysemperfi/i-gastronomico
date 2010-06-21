/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.igastronomico.dao;
import java.util.ArrayList;
import pe.edu.upc.dew.igastronomico.actionform.*;
import pe.edu.upc.dew.igastronomico.bean.UsuarioBean;

/**
 *
 * @author Junior
 */
public interface UsuarioDAO {

    public abstract UsuarioBean login(LoginForm form) throws Exception;
    public abstract ArrayList listadoUsuarios() throws Exception;

}
