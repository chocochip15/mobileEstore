package com.niit.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NavController {
	
	
	
		@RequestMapping("/")
		protected ModelAndView landingPage(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
			ModelAndView modelandview=new ModelAndView("Landing_Page");
			
			
			return modelandview;
			
		}

		
		@RequestMapping("/About_us")
		protected ModelAndView aboutUs(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
			ModelAndView modelandview=new ModelAndView("About_us");
			
			return modelandview;
			
		}
		@RequestMapping("/Sign_in")
		protected ModelAndView signIn(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
			ModelAndView modelandview=new ModelAndView("Sign_in");
			
			return modelandview;
			
		}
		@RequestMapping("/Sign_up")
		protected ModelAndView signUp(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
			ModelAndView modelandview=new ModelAndView("Sign_up");
			
			return modelandview;
			
		}
		@RequestMapping("/Products")
		protected ModelAndView products(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
			ModelAndView modelandview=new ModelAndView("Products");
			
			return modelandview;
			
		}
		

	}