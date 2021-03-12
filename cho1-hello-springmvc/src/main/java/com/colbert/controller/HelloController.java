package com.colbert.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author colbert
 */
@Controller
@RequestMapping
public class HelloController {

    @RequestMapping("/some.do")
    public ModelAndView doSome() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "欢迎使用springmvc");
        mv.addObject("fun", "执行doSome");
        mv.setViewName("show");
        return mv;
    }
}
