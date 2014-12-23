package com.test.bl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.test.dao.TbUserMapper;
import com.test.model.TbUser;

@Controller
public class UserAction {

	@Autowired
	private TbUserMapper tbUserMapper;

	@RequestMapping(value = "user", method = RequestMethod.POST)
	@Transactional
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, TbUser user) {

		System.out.println("name==="+user.getUsername());
		tbUserMapper.insert(user);
		System.out.println("id==="+user.getId());
		List<TbUser> list = tbUserMapper.selectAll();
		System.out.println("list==="+list.size());
		ModelAndView mv = new ModelAndView("hello", "users", JSONArray.fromObject(list).toString());
		return mv;
	}
	
	
	@RequestMapping(value = "test", method = RequestMethod.POST)
	@ResponseBody
	public String test(@RequestParam(value="user") String user,HttpServletRequest request, HttpServletResponse response) {
		System.out.println("user==="+user);
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("success", "cool");
		return "你好";
	}
}