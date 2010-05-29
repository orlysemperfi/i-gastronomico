/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.igastronomico.model;

import java.util.List;

/**
 *
 * @author Administrador
 */
public class Comentario {
    /*definir atributos*/
    private String cod_usuario;
    private String cod_local;
    private String comentario;
    private int calificacion;
    
    private List<Local> local;
    private List<Usuario> usuario;
}
