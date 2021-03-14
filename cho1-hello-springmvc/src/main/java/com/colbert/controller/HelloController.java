package com.colbert.controller;

import com.colbert.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @author colbert
 */
@Controller
@RequestMapping
public class HelloController {

    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(String name,String age) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("age", age);
        mv.addObject("name", name);
        mv.setViewName("show");
        return mv;
    }

    /**
     * 请求中参数名和方法中的不一致
     * @RequestParam解决参数名和形参名不一致,
     * required 默认是true（必须传此参数），false可以不必包含此参数
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("/param")
    public ModelAndView doParam(@RequestParam(value = "rname",required = false) String name,@RequestParam(value = "rage",required = false) String age) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("age", age);
        mv.addObject("name", name);
        mv.setViewName("show");
        return mv;
    }

    /**
     * 接收对象，参数中的对象名和形参中的对象名一致
     *
     * @return
     */
    @RequestMapping("/student.do")
    public ModelAndView doParam(Student student) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("student", student);
        mv.setViewName("show");
        return mv;
    }

    /**
     * 返回值为String的时候，返回的是视图（返回视图名称，forward转发），也可以自己传入HttpServletRequest，
     * 存入数据，实现ModelAndView的功能
     * @return
     */

    @PostMapping("/view.do")
    @ResponseBody
    public Student doView() {
        Student student = new Student();
        student.setAge(20);
        student.setName("李四");
        return student;
    }
}
