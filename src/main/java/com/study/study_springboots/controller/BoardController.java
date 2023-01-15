package com.study.study_springboots.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.study.study_springboots.beans.BoardBean;
import com.study.study_springboots.service.DataInfors;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();
        DataInfors dataInfors = new DataInfors();
        ArrayList<BoardBean> boardList = dataInfors.getDataListWithBoardBean();
        modelAndView.addObject("boardList",boardList);
        modelAndView.setViewName("board/list");
        return modelAndView;
    }
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public ModelAndView view(@RequestParam(value="uid", required=false) String uid,ModelAndView modelAndView){
        DataInfors dataInfors = new DataInfors();
        BoardBean boardBean = dataInfors.getDataWithBoardBean();
        modelAndView.addObject("boardBean", boardBean);
        modelAndView.setViewName("board/view");
        return modelAndView;
    }
    @RequestMapping(value = "/form", method = RequestMethod.GET) 
    public ModelAndView form(ModelAndView modelAndView){
        modelAndView.setViewName("board/form");
        return modelAndView;
    }
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(ModelAndView modelAndView){
        modelAndView.setViewName("board/list");
        return modelAndView;
    }
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView edit(ModelAndView modelAndView){
        modelAndView.setViewName("board/edit");
        return modelAndView;
    }
    // @RequestMapping(value = "/board/form", method = RequestMethod.GET)
    // public String form(){
    //     return "/WEB-INF/views/board/form.jsp";
    // }
    // @RequestMapping(value = "/board/form", method = RequestMethod.POST)
    // public String formPost(){
    //     // insert biz
    //     return "/WEB-INF/views/board/list.jsp";
    // }
}
