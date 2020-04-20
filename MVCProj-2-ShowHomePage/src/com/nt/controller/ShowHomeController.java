package com.nt.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ShowHomeController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Date d=new Date();
		ModelAndView mav=null;
		mav=new ModelAndView();
		mav.addObject("sysDate", d);
		mav.addObject("message", "*** Hii I  AM AJIT !!! ***");
		mav.setViewName("show");
		return mav;
	}

}
