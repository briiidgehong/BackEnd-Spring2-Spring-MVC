package controller;

import entitiy.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import service.NoticeService;
import service.jdbc.JDBCNoticeService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class ListController{

    @Autowired
    private NoticeService noticeService;

    public void setNoticeService(NoticeService noticeService) {
        this.noticeService = noticeService;
    }

    @RequestMapping("/notice/list")
    public ModelAndView listPage(){
        ModelAndView mv = new ModelAndView();
        System.out.println("view listPage");
        List<Notice> list = noticeService.getNoticeList("TITLE", "", 1);
        mv.addObject("list",list);
        return mv;
    }

    /*
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView("notice/list");
        System.out.println("listController");
        List<Notice> list = noticeService.getNoticeList("TITLE", "", 1);
        mv.addObject("list",list);
        return mv;
    }
    */
}
