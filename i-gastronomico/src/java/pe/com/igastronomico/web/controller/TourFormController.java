/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import pe.com.igastronomico.model.Tour;
import pe.com.igastronomico.model.Usuario;

/**
 *
 * @author dew-grupo6
 */

@Controller
@SessionAttributes({"tour"})
public class TourFormController extends IgastronomicoController {

    @InitBinder
    public void doInitBinder(WebDataBinder dataBinder){
        dataBinder.setDisallowedFields(new String[] {"idtour"});
    }
    
    @RequestMapping(value="/registrotour.htm", method=RequestMethod.GET)
    public void doShowForm(HttpServletRequest request,@RequestParam(value="idtour", required=false) Integer idtour, @RequestParam(value="codLocal", required=false) Integer codLocal,  Model model){
        Tour tour = (idtour==null)?(request.getSession().getAttribute("tour")!=null)?(Tour)request.getSession().getAttribute("tour"):new Tour():(idtour==0)?new Tour():this.igastronomicoService.getTour(idtour);
        if(codLocal!=null){
            tour.getLocals().add(this.igastronomicoService.getLocal(codLocal));
        }        
        model.addAttribute(tour);
    }

    @RequestMapping(value="/registrotour.htm", method=RequestMethod.POST)
    public String doProcessForm(Tour tour, BindingResult result, SessionStatus status){
        
        if(!StringUtils.hasLength(tour.getCodTour())){
            result.rejectValue("codTour", "required", "required");
            return "registrotour";
        }
        else{            
            return "redirect:buscalocales.htm?showaddtour=true";
        }
    }

    @RequestMapping(value="/registrotour.htm", method=RequestMethod.POST, params={"codUsuario"})
    public String doProcessForm2(Tour tour, BindingResult result, SessionStatus status, HttpServletRequest request){
        
        Usuario usuario = this.igastronomicoService.getUsuario(this.getCurrentUser(request));
        if(!StringUtils.hasLength(tour.getCodTour())){
            result.rejectValue("codTour", "required", "required");
            return "registrotour";
        }
        else{
            if(tour.getLocals().size()>0){
                tour.setUsuario(usuario);                
                this.igastronomicoService.guardaTour(tour);
                status.setComplete();
                return "redirect:listartour.htm";
            }
            else{
                result.reject(null, "Agrege los locales a visitar antes de guardar");
                return "registrotour";
            }            
        }
    }

}
