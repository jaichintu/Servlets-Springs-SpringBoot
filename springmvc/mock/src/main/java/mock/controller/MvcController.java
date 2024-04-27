package mock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import mock.dao.Employerdao;
import mock.dto.Employer;


@Controller
public class MvcController {
	
	
	@Autowired
	Employerdao dao;
	
	@RequestMapping("/insert")
	@ResponseBody
	public void insert(@ModelAttribute Employer d1)
	{
		
		dao.insert(d1);
	}

}
