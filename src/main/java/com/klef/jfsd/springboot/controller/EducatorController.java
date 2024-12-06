package com.klef.jfsd.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Educator;
import com.klef.jfsd.springboot.service.EducatorService;

import jakarta.servlet.http.HttpServletRequest;


	@Controller
	@RequestMapping("/educator")
	public class EducatorController {
		
		@Autowired
		private EducatorService educatorService;
		
		@PostMapping("signup")
		public ModelAndView inserteedu(HttpServletRequest request) {
		    String name = request.getParameter("ename");
		    String gender = request.getParameter("egender");
		    String dob = request.getParameter("edob");
		    String dept = request.getParameter("edept");
		    String location = request.getParameter("elocation");
		    String email = request.getParameter("eemail");
		    String password = request.getParameter("epwd");
		    String contact = request.getParameter("econtact");
		    String status = "Registered";

		    Educator educator = new Educator();
		    educator.setName(name);
		    educator.setGender(gender);
		    educator.setDateofbirth(dob);
		    educator.setDepartment(dept);
		    educator.setLocation(location);
		    educator.setEmail(email);
		    educator.setPassword(password);
		    educator.setContact(contact);
		    educator.setStatus(status);

		    String msg = educatorService.registerEducator(educator);

		    ModelAndView mv = new ModelAndView("regsuccess");
		    mv.addObject("message", msg);
		    mv.addObject("name", name);  // Pass educator's name to view

		    return mv;
		}


	    @PostMapping("/signup/submit")
	    public ModelAndView handleSignup(
	            @RequestParam("name") String name,
	            @RequestParam("gender") String gender,
	            @RequestParam("dateofbirth") String dateofbirth,
	            @RequestParam("department") String department,
	            @RequestParam("salary") double salary,
	            @RequestParam("email") String email,
	            @RequestParam("password") String password,
	            @RequestParam("location") String location,
	            @RequestParam("contact") String contact,
	            @RequestParam("status") String status) {
	        return new ModelAndView("signupsuccess"); // Adjust to your view name
	    }

	
	@GetMapping("login")
	public ModelAndView edulogin() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("educatorlogin");
		return mv;
	}
	
	@PostMapping("checkedulogin")
	public ModelAndView checkedulogin(@RequestParam("email") String email, 
            @RequestParam("password") String password) {
	    ModelAndView mv = new ModelAndView();
	    
	    Educator educator=educatorService.checkedulogin(email, password);
	    if (educator != null) {
	        mv.setViewName("educatorhome");
	    } else {
	        mv.setViewName("eduloginfail");
	        mv.addObject("message", "Login Failed");
	    }
	    return mv;
	}

	
	@GetMapping("home")
    public ModelAndView eduhome()
    {
      ModelAndView mv = new ModelAndView();
      mv.setViewName("educatorhome");
      return mv;
    }
}
