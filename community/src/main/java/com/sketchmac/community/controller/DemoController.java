package com.sketchmac.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, Java. Hello, Spring Boot";
    }

    // GET请求
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    @ResponseBody
    public String getStudents(
            @RequestParam(name = "current", required = false, defaultValue = "1") int current,
            @RequestParam(name = "limit", required = false, defaultValue = "10") int limit
    ) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(current);
        al.add(limit);
        return al.toString();
    }

    @RequestMapping(path = "/student/{id}", method = RequestMethod.GET)
    @ResponseBody
    public int getStudents(@PathVariable("id") int id) {
        return id;
    }

    // POST请求
    @RequestMapping(path = "/student", method = RequestMethod.POST)
    @ResponseBody
    public String saveStudent(String name, int age) {
        ArrayList<String> al = new ArrayList<>();
        al.add(name);
        al.add(String.valueOf(age));
        return al.toString();
    }

    // 返回模板
    @RequestMapping(path = "/teacher", method = RequestMethod.GET)
    public ModelAndView getTeacher() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("name", "张三");
        mav.addObject("age", 20);
        mav.setViewName("/demo/view");
        return mav;
    }

    // 返回模板方法2
    @RequestMapping(path = "/teacher2", method = RequestMethod.GET)
    public String getTeacher(Model model) {
        model.addAttribute("name", "李四");
        model.addAttribute("age", 30);
        return "/demo/view";
    }

    // 返回json
    @RequestMapping(path = "/emp", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getEmp() {
        HashMap<String, Object> emp = new HashMap<>();
        emp.put("name", "王五");
        emp.put("age", 23);
        emp.put("salary", 5000);
        return emp;
    }
    @RequestMapping(path = "/emps", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<HashMap<String, Object>> getEmps() {
        ArrayList<HashMap<String, Object>> al = new ArrayList<>();

        HashMap<String, Object> emp = new HashMap<>();
        emp.put("name", "王五");
        emp.put("age", 23);
        emp.put("salary", 5000);
        al.add(emp);

        emp = new HashMap<>();
        emp.put("name", "李四");
        emp.put("age", 22);
        emp.put("salary", 5000);
        al.add(emp);

        emp = new HashMap<>();
        emp.put("name", "张三");
        emp.put("age", 21);
        emp.put("salary", 5000);
        al.add(emp);

        return al;
    }

}
