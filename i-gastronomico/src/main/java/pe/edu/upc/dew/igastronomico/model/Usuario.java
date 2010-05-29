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
public class Usuario {
    /*definir atributos*/
    private String cod_usuario;
    private String nombre_usuario;
    private int tipo_usuario;
    private String fecha_registro;

    private List<Local> local;
    private List<Tour> tour;
}
