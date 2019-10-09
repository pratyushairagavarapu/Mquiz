package com.hexa.web;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hexa.dao.IQuizDao;
import com.hexa.entity.Exam;
import com.hexa.entity.Questions;
import com.hexa.entity.Schedule;
import com.hexa.entity.User;
import com.hexa.service.IGetQuestionService;

@Controller
public class QuizQryController {
	@Autowired
	private IQuizDao dao;
	@Autowired
	private IGetQuestionService qService;
	

	
	
	@RequestMapping(value = "schedule")
	public String dispalySchedule(Model model, HttpServletRequest req) {
		HttpSession sess = req.getSession(false);
		User user = (User) sess.getAttribute("login");
		int id = user.getUserId();
		model.addAttribute("sch",dao.getHistory(id));
		
		return "ViewSchedule";
	}

	@RequestMapping(value = "start")
	public String viewFirstQuestions(Model model, HttpServletRequest req) {
		HttpSession sess = req.getSession();
		Map<Integer, Questions> qmap = qService.generateQuestions();
		List<Questions> lst = new ArrayList<>(qmap.values());
		sess.setAttribute("qmap", qmap);
		sess.setAttribute("qlist", lst);
		sess.setAttribute("qindex", 0);
		sess.setAttribute("amap", new HashMap<Integer, String>());
		model.addAttribute("ques", lst.get(0));
		return "QuestionView";
	}

	/*
	 * @RequestMapping(value = "showresult") public String viewResult(Model model,
	 * HttpServletRequest req) { HttpSession sess = req.getSession(); Map map =
	 * (Map) req.getAttribute("qmap"); Map map1 = (Map) req.getAttribute("amap");
	 * 
	 * int rest = qService.evaluate(map, map1); model.addAttribute("res", rest);
	 * return "DisplayResult"; }
	 */

	@RequestMapping(value = "quiz", method = RequestMethod.POST)
	public String viewNextQuestions(Model model, HttpServletRequest req, @RequestParam("btn") String btn,
			@RequestParam(name = "ques", required = false) String ans, @RequestParam("qid") int qid) {

		HttpSession sess = req.getSession(false);
		int idx = (int) sess.getAttribute("qindex");
		HashMap<Integer, String> ansmap = (HashMap<Integer, String>) sess.getAttribute("amap");

		ansmap.put(qid, ans);

		sess.setAttribute("amap", ansmap);
		if(btn.equals("finish")) {
			Map<Integer, Questions> qmap = (Map<Integer, Questions>)sess.getAttribute("qmap");
			int score = qService.evaluate(qmap, ansmap);
			
			User user = (User) sess.getAttribute("login");
			int id = user.getUserId();
			model.addAttribute("score", score);
			System.out.println(dao.updateSchedule(id, score));
			return "DisplayResult";
		}
		if (btn.equals("prev"))
			idx = idx - 1;
		if (btn.equals("next"))
			idx = idx + 1;
		List<Questions> lst = (List<Questions>) sess.getAttribute("qlist");
		model.addAttribute("ques", lst.get(idx));
		sess.setAttribute("qindex", idx);
		return "QuestionView";
	}

	
	@RequestMapping(value = { "returnhome" })
	public String returnHome(HttpServletRequest req) {
		HttpSession sess = req.getSession(false);
		
		return "Home";
	}

	
	@RequestMapping(value = "history")
	public String viewHistory(Model model, HttpServletRequest req) {
		HttpSession sess = req.getSession(false);
		User user = (User) sess.getAttribute("login");
		int id = user.getUserId();
		List<Schedule> lst= dao.getHistory(id);
		model.addAttribute("hist",lst);
		return "History";
	}

}
