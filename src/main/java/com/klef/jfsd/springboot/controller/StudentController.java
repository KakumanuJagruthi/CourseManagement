package com.klef.jfsd.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("login")
    public ModelAndView stulogin()
   {
       ModelAndView mv = new ModelAndView();
       mv.setViewName("studentlogin");
       return mv;
   } 
	
	@PostMapping("checkstulogin")
	 public ModelAndView checkstulogin(@RequestParam("email") String email, 
	            @RequestParam("password") String password)
	 {
	  
	  ModelAndView mv=new ModelAndView();
	  Student student=studentService.checkstulogin(email, password);
	  
	  if(student!=null) 
	  {	   
	   mv.setViewName("studenthome");
	  }
	  else
	  {
	   mv.setViewName("stuloginfail");
	   mv.addObject("message","Login Failed");
	  }
	  return mv;
	 }
	
	@GetMapping("home")
    public ModelAndView stuhome()
    {
      ModelAndView mv = new ModelAndView();
      mv.setViewName("studenthome");
      return mv;
    }
	
}
