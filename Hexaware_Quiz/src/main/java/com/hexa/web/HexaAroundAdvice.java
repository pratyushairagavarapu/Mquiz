package com.hexa.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.hexa.exceptions.AuthenticateException;

@Aspect
@Component
@ControllerAdvice
public class HexaAroundAdvice {

	@Around(value = "execution(* com.hexa.web.QuizQryController.*(..)) && args(..,req)")
	public String around(ProceedingJoinPoint pt, HttpServletRequest req) throws Throwable {
		System.out.println("aaaaaa");
		HttpSession sess = req.getSession(false);
		if(sess == null)throw new AuthenticateException("You are not Authenticated, Please Login");
		System.out.println("bbbbb");
		if(sess.getAttribute("login") == null)throw new AuthenticateException("You are not Authenticated, Please Login");
		System.out.println("ccccc");
		String view = (String)pt.proceed();
		return view;
		
	}
	
	@ExceptionHandler(value = AuthenticateException.class)
	public String handleException(Model model, Exception ex) {
		model.addAttribute("msg", ex.getMessage());
		return "Error";
	}
}
