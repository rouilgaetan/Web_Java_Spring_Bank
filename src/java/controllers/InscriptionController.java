/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class InscriptionController extends AbstractController {
    @RequestMapping(value="inscription", method=RequestMethod.GET)
    public String init(){
        return "inscription";
    }
    /**
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @Override
    @RequestMapping(value="inscription", method=RequestMethod.POST)
    public ModelAndView handleRequestInternal(
    HttpServletRequest request, HttpServletResponse response) throws Exception {
        return null;
    }
    
}

