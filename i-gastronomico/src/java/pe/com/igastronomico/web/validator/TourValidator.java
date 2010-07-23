/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.validator;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import pe.com.igastronomico.model.Tour;

/**
 *
 * @author dew-grupo6
 */
public class TourValidator {

    public TourValidator() {
        
    }

    public void validate(Tour tour, Errors errors){
        if(!StringUtils.hasLength(tour.getCodTour())){
            errors.rejectValue("codTour", "required", "required");
        }
    }
}
