package com.hexa.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hexa.dao.IQuizDao;
import com.hexa.entity.User;

@Controller
public class LoginController {
	@Autowired
	private IQuizDao dao;
	
	
	@RequestMapping(value = { "/", "home" })
	public String dispalyHome() {
		return "HomePage";
	}
	
	@RequestMapping(value = "displaypage")
	public String userLogin(@RequestParam("userId") String id, @RequestParam("userPassword") String pass, Model model, HttpServletRequest req) {
		int Id = Integer.parseInt(id);
		try {
			User usr = dao.getUserLogin(Id, pass);
			HttpSession sess = req.getSession();
			sess.setAttribute("login", usr);
		} catch (Exception e) {
			model.addAttribute("message", "Invalid Details");
			return "HomePage";
		}
		model.addAttribute("name",dao.getUserLogin(Id, pass));
		return "Home";
		}
	
	
	@RequestMapping(value = { "logout" })
	public String logout(HttpServletRequest req) {
		HttpSession sess = req.getSession(false);
		if(sess != null)
			sess.invalidate();
		return "HomePage";
	}
}
