/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.dao;

import java.util.List;
import pe.com.igastronomico.model.CategoriaCosto;
import pe.com.igastronomico.model.CategoriaPlato;
import pe.com.igastronomico.model.Comentario;
import pe.com.igastronomico.model.Local;
import pe.com.igastronomico.model.TipoUsuario;
import pe.com.igastronomico.model.Tour;
import pe.com.igastronomico.model.Usuario;

/**
 *
 * @author dew-grupo6
 */
public interface IgastronomicoDao {

    void eliminaComentario(int id);

    void eliminaComentario(Comentario comentario);

    void eliminaLocal(int id);

    void eliminaLocal(Local local);

    void eliminaTour(int id);

    void eliminaTour(Tour tour);

    void eliminaUsuario(int id);

    void eliminaUsuario(Usuario usuario);

    CategoriaCosto getCategoriaCosto(int id);

    CategoriaPlato getCategoriaPlato(int id);

    Comentario getComentario(int id);

    Local getLocal(int id);

    TipoUsuario getTipoUsuario(int id);

    Tour getTour(int id);

    Usuario getUsuario(int id);

    void guardaComentario(Comentario comentario);

    void guardaLocal(Local local);

    void guardaTour(Tour tour);

    void guardaUsuario(Usuario usuario);

    List<CategoriaCosto> listaCategoriaCosto();

    List<CategoriaPlato> listaCategoriaPlato();

    List<Comentario> listaComentario();

    List<Local> listaLocales();

    List<Local> listaLocales(String razonSocial);

    List<Local> listaLocales(String razonSocial, String departamento, String provincia, String distrito);

    List<Local> listaLocales(String razonSocial, String departamento, String provincia, String distrito, String platos, String costos);

    List<TipoUsuario> listaTipoUsuario();

    List<Tour> listaTour();

    List<Usuario> listaUsuarios();

    List<Usuario> listaUsuarios(String login);

    Usuario getUsuario(String login);

}
