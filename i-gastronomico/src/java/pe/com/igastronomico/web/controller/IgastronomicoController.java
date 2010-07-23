/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.com.igastronomico.web.controller;

import javax.servlet.http.HttpServletRequest;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationObjectSupport;
import pe.com.igastronomico.service.IgastronomicoService;

/**
 *
 * @author dew-grupo6
 */

public abstract class IgastronomicoController extends WebApplicationObjectSupport {
    protected final Log logger  = LogFactory.getLog(getClass());
    
    @Autowired
    protected IgastronomicoService igastronomicoService;

    //nuevo
    protected String getCurrentUser(HttpServletRequest request){
        String login  = (String)request.getSession().getAttribute("SPRING_SECURITY_LAST_USERNAME");        
        if(login==null || login.equals("")){
            login="guest";
        }

        return login;
    }
}

