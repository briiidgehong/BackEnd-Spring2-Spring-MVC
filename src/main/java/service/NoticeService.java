package service;

import entitiy.Notice;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface NoticeService {

    List<Notice> getNoticeList(String field, String query, int page);
    int getNoticeCount(String field, String query);
    Notice getNotice(int id);
    Notice getNextNotice(int id);
    Notice getPrevNotice(int id);

}
