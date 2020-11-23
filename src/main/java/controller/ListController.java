package controller;

import entitiy.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import service.NoticeService;
import service.jdbc.JDBCNoticeService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ListController implements Controller {

    @Autowired
    private NoticeService noticeService;

    public void setNoticeService(NoticeService noticeService) {
        this.noticeService = noticeService;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView("notice/list");
        System.out.println("listController");
        List<Notice> list = noticeService.getNoticeList("TITLE", "", 1);
        mv.addObject("list",list);
        return mv;
    }
}
