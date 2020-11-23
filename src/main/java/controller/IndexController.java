package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller {
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView mv = new ModelAndView("index");
        mv.addObject("data", "hello SPRING MVC !!!");
        System.out.println("indexController");
        // 맨 앞에 /: 절대경로, "": 상대경로
        //mv.setViewName("WEB-INF/view/index.jsp");
        return mv;
    }
}