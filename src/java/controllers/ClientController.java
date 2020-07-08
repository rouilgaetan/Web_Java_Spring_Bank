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
public class ClientController extends AbstractController {
    @RequestMapping(value="clientPage", method=RequestMethod.GET)
    public String init(){
        return "clientPage";
    }
    /**
     *
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @Override
    @RequestMapping(value="clientPage", method=RequestMethod.POST)
    public ModelAndView handleRequestInternal(
    HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView("clientPage");
        String name = request.getParameter("nom");
        mv.addObject("name", name);
        return mv;
    }
    
}

