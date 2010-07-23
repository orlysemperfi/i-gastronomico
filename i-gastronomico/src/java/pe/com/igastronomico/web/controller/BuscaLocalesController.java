/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import pe.com.igastronomico.model.Local;

/**
 *
 * @author dew-grupo6
 */
@Controller
@RequestMapping("/buscalocales.htm")
@SessionAttributes("tour")
public class BuscaLocalesController extends IgastronomicoController {

    // aqui insertar en el modelo las listas de las categorias de costo y platos
    @ModelAttribute
    public List doAtachCategoriaCostoList(){
        return this.igastronomicoService.listaCategoriaCosto();
    }

    @ModelAttribute
    public List doAtachCategoriaPlatoList(){
       return this.igastronomicoService.listaCategoriaPlato();
    }

    @RequestMapping(method=RequestMethod.GET)
    public void doShowForm(Model model){
        model.addAttribute(new Local());
    }

    @RequestMapping(method=RequestMethod.POST)
    public String doProcessForm(Local local, BindingResult result, Model model, HttpServletRequest request){
        String[] categoriaPlato = request.getParameterValues("categoriaPlato");
        String[] categoriaCosto = request.getParameterValues("categoriaCosto");
        List<Local> locals = null;
        String platos = new String();
        String costos = new String();

        if(categoriaPlato!=null){
            for (int i=0;i<categoriaPlato.length; i++) {
                if(i>0){
                    platos+=",";
                }
                platos += "'" + categoriaPlato[i] + "'";
            }
        }

        if(categoriaCosto!=null){
            for (int i=0;i<categoriaCosto.length; i++) {
                if(i>0){
                    costos+=",";
                }
                costos += "'" + categoriaCosto[i] + "'";
            }
        }

        if(categoriaPlato==null && categoriaCosto==null){
            //si NO ha seleccionado alguna de las categorias, hacemos una consulta simple, es mas rapido
            locals = this.igastronomicoService.listaLocales(local.getRazonSocial(),
                                                                    local.getDepartamento(),
                                                                    local.getProvincia(),
                                                                    local.getDistrito());
        }
        else
        {
            // si ha seleccionado alguna de los checks box llamamoa a la busqueda avanzada (demora mas)
            locals = this.igastronomicoService.listaLocales(local.getRazonSocial(),
                                                                    local.getDepartamento(),
                                                                    local.getProvincia(),
                                                                    local.getDistrito(),
                                                                    platos,
                                                                    costos);
        }
        
        model.addAttribute(local);
        model.addAttribute(locals);
        return "buscalocales";
    }
}
