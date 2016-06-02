/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author vamshi
 */
@FacesValidator("custom.Validator")
public class ValidationExec implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    System.out.println("I am in Custom Validator");
    String s=(String)component.getAttributes().get("item");

System.out.println(s);
    if(value.toString().equals("vamshi")){
        FacesMessage fc=new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error Testing", "Testing the Error");
    throw new ValidatorException(fc);
    
    }
    
    }
    
}
