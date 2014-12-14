package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.entity.User;
import com.service.IUserService;

@Controller
public class UserAction {

	@Autowired
	private IUserService userService;

	private static Logger logger = Logger.getLogger(UserAction.class);

	@RequestMapping("/")
	public String getUser() {
		// 返回查询的数量
		System.out.println("old:" + userService.lookUser());
		// 保存一个新的对象
		userService.saveUser(new User());
		System.out.println("new:" + userService.lookUser());
		return "index";
	}

	@RequestMapping(value = "user", method = RequestMethod.POST)
	public ModelAndView saveUser(HttpServletRequest request, HttpServletResponse response, User user) throws Exception {
		request.setCharacterEncoding("UTF-8");
		//String userName = request.getParameter("username");
		logger.info("userName==" + user.getUsername());
//		User user = new User();
//		user.setUsername(userName);
//		user.setPassword("123");
		userService.saveUser(user);
		;
		String rspInfo = "你好!" + user.getUsername();
		ModelAndView mv = new ModelAndView("success", "command", rspInfo);
		return mv;
	}
}