/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dew-grupo6
 */
@Controller
public class TourController extends IgastronomicoController{

    @RequestMapping("/listartour.htm")
    public void doListarTours(Model model){

        model.addAttribute(this.igastronomicoService.listaTour());

    }
    
}
