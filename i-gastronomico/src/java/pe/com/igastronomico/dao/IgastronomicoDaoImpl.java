/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;
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
@Repository("igastronomicoDao")
public class IgastronomicoDaoImpl extends HibernateDaoSupport implements IgastronomicoDao{
    
    @Autowired
    public IgastronomicoDaoImpl(SessionFactory sessionFactory){
        this.setSessionFactory(sessionFactory);
    }

    /* primero para el Usuario */
    @Override
    public Usuario getUsuario(int id){        
        return (Usuario)this.getHibernateTemplate().get(Usuario.class, id);

    }

    @Override
    public Usuario getUsuario(String login){
        List  usuarios =  this.getHibernateTemplate().find(" from Usuario where loginUsuario=?", login);
        if (usuarios.isEmpty()) {            
            return null;
        } else {            
            return (Usuario) usuarios.get(0);
        }
    }

    @Override
    public List<Usuario>listaUsuarios(){
       return this.getHibernateTemplate().loadAll(Usuario.class);
    }

    @Override
    public List<Usuario>listaUsuarios(String login){
       return this.getHibernateTemplate().find(" from Usuario where loginUsuario=?", login);
    }




    @Override
    public void eliminaUsuario(int id){
       this.getHibernateTemplate().delete(getUsuario(id));
    }

    @Override
    public void eliminaUsuario(Usuario usuario){
       this.getHibernateTemplate().delete(usuario);
    }

    @Override
    public void guardaUsuario(Usuario usuario){
        this.getHibernateTemplate().saveOrUpdate(usuario);
    }

    /*  para los locales */

    @Override
    public Local getLocal(int id){
        return (Local) this.getHibernateTemplate().load(Local.class, id);
    }

    @Override
    public List<Local> listaLocales(){
        return this.getHibernateTemplate().loadAll(Local.class);
    }

    @Override
    public List<Local> listaLocales(String razonSocial){
        razonSocial = "%" + razonSocial + "%";
        return this.getHibernateTemplate().find(" from Local l " +
                                                 "where l.razonSocial like ?",
                                                razonSocial);
    }

    @Override
    public List<Local> listaLocales(String razonSocial, String departamento, String provincia, String distrito){
    razonSocial = "%" + razonSocial + "%";
    departamento = "%" + departamento + "%";
    provincia = "%" + provincia + "%";
    distrito = "%" + distrito + "%";
    return this.getHibernateTemplate().findByNamedParam(" from Local local " +
                                                        "where local.razonSocial like :razonSocial " +
                                                        "and local.departamento like :departamento " +
                                                        "and local.provincia like :provincia " +
                                                        "and local.distrito like :distrito ",
                                                        new String[]{"razonSocial","departamento","provincia","distrito"},
                                                        new Object[]{razonSocial,departamento,provincia,distrito});
    }
    
    @Override
    public List<Local> listaLocales(String razonSocial, String departamento, String provincia, String distrito, String platos, String costos){
        razonSocial = "%" + razonSocial + "%";
        departamento = "%" + departamento + "%";
        provincia = "%" + provincia + "%";
        distrito = "%" + distrito + "%";
        StringBuffer query = new StringBuffer();
        
        query.append("from Local local ");
        query.append("where local.razonSocial like :razonSocial ");
        query.append("and local.departamento like :departamento ");
        query.append("and local.provincia like :provincia ");
        query.append("and local.distrito like :distrito ");
        if(platos!=null && StringUtils.hasLength(platos)){
            query.append("and local.categoriaPlato.categoriaPlato in ("+platos+") ");
        }
        if(costos!=null && StringUtils.hasLength(costos)){
            query.append("and local.categoriaCosto.categoriaCosto in ("+costos+") ");
        }

        System.out.println(query.toString());
        return this.getHibernateTemplate().findByNamedParam(query.toString(),
                                                            new String[]{"razonSocial","departamento","provincia","distrito"},
                                                            new Object[]{razonSocial,departamento,provincia,distrito});
    }

    @Override
    public void eliminaLocal(int id){
        this.getHibernateTemplate().delete(getLocal(id));
    }

    @Override
    public void eliminaLocal(Local local){
        this.getHibernateTemplate().delete(local);
    }
    
    @Override
    public void guardaLocal(Local local){
        this.getHibernateTemplate().saveOrUpdate(local);
    }

    //    Tour
    @Override
    public Tour getTour(int id){
        return (Tour) this.getHibernateTemplate().load(Tour.class, id);
    }

    @Override
    public List<Tour> listaTour(){
        return this.getHibernateTemplate().loadAll(Tour.class);
    }

    @Override
    public void eliminaTour(int id){
        this.getHibernateTemplate().delete(getTour(id));
    }

    @Override
    public void eliminaTour(Tour tour){
        this.getHibernateTemplate().delete(tour);
    }

    @Override
    public void guardaTour(Tour tour){
        this.getHibernateTemplate().saveOrUpdate(tour);
    }

    //    Comentario
@Override
    public Comentario getComentario(int id){
        return (Comentario)this.getHibernateTemplate().load(Comentario.class, id);
    }

@Override
    public List<Comentario> listaComentario(){
        return this.getHibernateTemplate().loadAll(Comentario.class);
    }

@Override
    public void eliminaComentario(int id){
        this.getHibernateTemplate().delete(getComentario(id));
    }

@Override
    public void eliminaComentario(Comentario comentario){
        this.getHibernateTemplate().delete(comentario);
    }

@Override
    public void guardaComentario(Comentario comentario){
        this.getHibernateTemplate().saveOrUpdate(comentario);
    }

@Override
    public CategoriaCosto getCategoriaCosto(int id){
        return (CategoriaCosto)this.getHibernateTemplate().load(CategoriaCosto.class, id);
    }

@Override
    public List<CategoriaCosto> listaCategoriaCosto(){
        return this.getHibernateTemplate().loadAll(CategoriaCosto.class);
    }

@Override
    public CategoriaPlato getCategoriaPlato(int id){
        return (CategoriaPlato)this.getHibernateTemplate().load(CategoriaPlato.class, id);
    }

@Override
    public List<CategoriaPlato> listaCategoriaPlato(){
        return this.getHibernateTemplate().loadAll(CategoriaPlato.class);
    }

@Override
    public TipoUsuario getTipoUsuario(int id){
        return (TipoUsuario)this.getHibernateTemplate().load(TipoUsuario.class, id);
    }

@Override
    public List<TipoUsuario> listaTipoUsuario(){
        return this.getHibernateTemplate().loadAll(TipoUsuario.class);
    }

}
