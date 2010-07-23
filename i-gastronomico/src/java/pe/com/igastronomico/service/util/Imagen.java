/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.service.util;

import java.io.Serializable;

/**
 *
 * @author dew-grupo6
 */
public class Imagen implements Serializable{

    byte[] imagen;

    public Imagen(){
        
    }

    public Imagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

}
