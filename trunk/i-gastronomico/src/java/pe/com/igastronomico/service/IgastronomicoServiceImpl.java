/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.igastronomico.dao.IgastronomicoDao;
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

@Service("igastronomicoService")
public class IgastronomicoServiceImpl implements IgastronomicoService {

    @Autowired
    IgastronomicoDao igastronomicoDao;
    
    @Override
    public Usuario getUsuario(int id){
        return igastronomicoDao.getUsuario(id);
    }

        @Override
    public Usuario getUsuario(String login ){
        return igastronomicoDao.getUsuario(login);
    }


    @Override
    public List<Usuario>listaUsuarios(){
       return igastronomicoDao.listaUsuarios();
    }

    @Override
    public List<Usuario>listaUsuarios(String login){
       return igastronomicoDao.listaUsuarios(login);
    }

    @Override
    public void eliminaUsuario(int id){
       igastronomicoDao.eliminaUsuario(id);
    }

    @Override
    public void eliminaUsuario(Usuario usuario){
       igastronomicoDao.eliminaUsuario(usuario);
    }

    @Override
    public void guardaUsuario(Usuario usuario){
        igastronomicoDao.guardaUsuario(usuario);
    }

    /*  para los locales */

    @Override
    public Local getLocal(int id){
        return igastronomicoDao.getLocal(id);
    }

    @Override
    public List<Local> listaLocales(){
        return igastronomicoDao.listaLocales();
    }

    @Override
    public List<Local> listaLocales(String razonSocial){
        return igastronomicoDao.listaLocales(razonSocial);
    }


    @Override
    public List<Local> listaLocales(String razonSocial, String departamento, String provincia, String distrito){
        return igastronomicoDao.listaLocales(razonSocial, departamento, provincia, distrito);
    }

    @Override
    public List<Local> listaLocales(String razonSocial, String departamento, String provincia, String distrito, String platos, String costos){
        return igastronomicoDao.listaLocales(razonSocial, departamento, provincia, distrito, platos, costos);
    }

    @Override
    public void eliminaLocal(int id){
        igastronomicoDao.eliminaLocal(id);
    }

    @Override
    public void eliminaLocal(Local local){
        igastronomicoDao.eliminaLocal(local);
    }

    @Override
    public void guardaLocal(Local local){
        igastronomicoDao.guardaLocal(local);
    }

    //    Tour
    @Override
    public Tour getTour(int id){
        return igastronomicoDao.getTour(id);
    }

    @Override
    public List<Tour> listaTour(){
        return igastronomicoDao.listaTour();
    }

    @Override
    public void eliminaTour(int id){
        igastronomicoDao.eliminaTour(id);
    }

    @Override
    public void eliminaTour(Tour tour){
        igastronomicoDao.eliminaTour(tour);
    }

    @Override
    public void guardaTour(Tour tour){
        igastronomicoDao.guardaTour(tour);
    }

    //    Comentario
@Override
    public Comentario getComentario(int id){
        return igastronomicoDao.getComentario(id);
    }

@Override
    public List<Comentario> listaComentario(){
        return igastronomicoDao.listaComentario();
    }

@Override
    public void eliminaComentario(int id){
        igastronomicoDao.eliminaComentario(id);
    }

@Override
    public void eliminaComentario(Comentario comentario){
        igastronomicoDao.eliminaComentario(comentario);
    }

@Override
    public void guardaComentario(Comentario comentario){
        igastronomicoDao.guardaComentario(comentario);
    }

@Override
    public CategoriaCosto getCategoriaCosto(int id){
        return igastronomicoDao.getCategoriaCosto(id);
    }

@Override
    public List<CategoriaCosto> listaCategoriaCosto(){
        return igastronomicoDao.listaCategoriaCosto();
    }

@Override
    public CategoriaPlato getCategoriaPlato(int id){
        return igastronomicoDao.getCategoriaPlato(id);
    }

@Override
    public List<CategoriaPlato> listaCategoriaPlato(){
        return igastronomicoDao.listaCategoriaPlato();
    }

@Override
    public TipoUsuario getTipoUsuario(int id){
        return igastronomicoDao.getTipoUsuario(id);
    }

@Override
    public List<TipoUsuario> listaTipoUsuario(){
        return igastronomicoDao.listaTipoUsuario();
    }
}
