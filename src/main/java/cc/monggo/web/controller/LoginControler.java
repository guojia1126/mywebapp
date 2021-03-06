package cc.monggo.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cc.monggo.domain.LoginForm;

@Controller
public class LoginControler {
	@RequestMapping(value = "login")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response, LoginForm command) {
		String username = command.getUsername();
		ModelAndView mv = new ModelAndView("hello", "command",
				"LOGIN SUCCESS, " + username);
		return mv;
	}
}