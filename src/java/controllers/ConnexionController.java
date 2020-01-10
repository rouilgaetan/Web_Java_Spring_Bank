/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.math.BigInteger;
import java.security.MessageDigest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.mvc.AbstractController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author croux08
 */
@Controller
public class ConnexionController extends AbstractController{
    
    @RequestMapping(value="index", method=RequestMethod.GET)
    public String init(){
        return "index";
    }
    
    @RequestMapping(value="accueil", method=RequestMethod.POST)
    public ModelAndView handleRequestInternal(
    HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView("message");
        String nom = request.getParameter("nom");
        String password = request.getParameter("password");
        
        //Cryptage mot de passe
        MessageDigest crypt = MessageDigest.getInstance("SHA-1");
        crypt.reset();
        crypt.update(password.getBytes("UTF-8"));
        String mdpcrypt =  new BigInteger(1, crypt.digest()).toString(16);
        
        
        mv.addObject("nom",nom);
        mv.addObject("password", mdpcrypt);
        return mv;
    }
}
