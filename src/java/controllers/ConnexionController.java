/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.mvc.AbstractController;

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
}
