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
public class Tour {
    /*definir atributos*/
    private String cod_tour;
    private String nombre_tour;
    private String cod_usuario;
    private String cod_local;
    private String prioridad;
    private String comentario;
    private String flag_comparte_tour;

    private List<Local> local;
    private List<Usuario> usuario;
}
