/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.igastronomico.actionform;

/**
 *
 * @author Junior
 */

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class LoginForm extends ActionForm {

private String usuario;
private String password;

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
@Override
public void reset(ActionMapping mapping, HttpServletRequest request) {
	// TODO Auto-generated method stub
	super.reset(mapping, request);
}
@Override
public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
	// TODO Auto-generated method stub
	return super.validate(mapping, request);
}

}
