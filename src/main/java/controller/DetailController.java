package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class DetailController{

    @RequestMapping("/notice/detail")
    public void detailPage(){
        System.out.println("view detailPage");
    }
    /*
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView("notice/detail");
        System.out.println("detailController");
        return mv;
    }
     */
}
