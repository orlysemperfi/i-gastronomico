/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.igastronomico.dao;

/**
 *
 * @author Junior
 */
public abstract class  DAOFactory {

    public static final int MYSQL = 1;
    public static final int ORACLE = 2;
    public static final int DB2 = 3;
    public static final int SQLSERVER = 4;
    public static final int XML = 5;

    public abstract UsuarioDAO getUsuarioDAO();

    public static DAOFactory getDAOFactory(int whichFactory){
       switch(whichFactory){
       	case MYSQL:
       	    return null;
       	default:
       	    return null;
       }
    }

}
