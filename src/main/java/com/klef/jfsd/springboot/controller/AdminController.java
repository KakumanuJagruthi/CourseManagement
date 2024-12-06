package com.klef.jfsd.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.service.AdminService;

import jakarta.servlet.http.HttpServletRequest;



@Controller
@RequestMapping("admin")
public class AdminController {
	
	  @Autowired
	  private  AdminService adminService;
	    
	  
	  @GetMapping("login")
	  public ModelAndView adminlogin() 
	  {
	    ModelAndView mv = new ModelAndView();
	    mv.setViewName("adminlogin");
	    return mv;
	  }
	  
	  @PostMapping("checkadminlogin")
	  public ModelAndView checkadminlogin(@RequestParam("auname") String auname, 
	                                      @RequestParam("apwd") String apwd) {
	      ModelAndView mv = new ModelAndView();

	      Admin admin = adminService.checkadminLogin(auname, apwd);

	      if (admin != null) {
	          mv.setViewName("adminhome");
	      } else {
	          mv.setViewName("adminloginfail");
	          mv.addObject("message", "Login failed");
	      }
	      return mv;
	  }
	  
	  @GetMapping("home")
	     public ModelAndView adminhome()
	     {
	       ModelAndView mv = new ModelAndView();
	       mv.setViewName("adminhome");
	       return mv;
	     }
	  
	
}
