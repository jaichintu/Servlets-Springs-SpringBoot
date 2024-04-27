 package springmvc_basics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import springmvc_basics.dao.MvcDao;
import springmvc_basics.dto.MvcDto;

@Controller
public class MvcController {
	
	@Autowired
	MvcDao mvcDao;
	
	
	@RequestMapping("/insert")
	@ResponseBody
	public void insert(@ModelAttribute MvcDto d1) {
		
		int id=d1.getId();
		
		String name=d1.getName();
		
		System.out.println(id+"   "+name);
		
//		MvcDao mvcDao=new MvcDao();
		mvcDao.insert(d1);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public void delete(@ModelAttribute MvcDto d1) {
		
		
		int id=d1.getId();
//		MvcDao mvcDao=new MvcDao();
		
		
		String msg=mvcDao.delete(id);
	}
	
	
	@RequestMapping("/fetchall")
	@ResponseBody
	public ModelAndView fetchall(@ModelAttribute MvcDto d1)
	{
		List<MvcDto> list=(List<MvcDto>)mvcDao.fetchall();
		
		ModelAndView mv=new ModelAndView("fetchall.jsp");
		mv.addObject("object", list);
		return mv;
		
	}
	
	@RequestMapping("/fetchbyid")
	@ResponseBody
	public ModelAndView fetch(@ModelAttribute MvcDto d1)
	{
		int id=d1.getId();
		MvcDto cv=mvcDao.fetch(id);
		
		ModelAndView mv=new ModelAndView("fetchbyid1.jsp");
		
		mv.addObject("object", cv);
		return mv;
		
		
	}
	
	
	@RequestMapping("/deleteall")
	@ResponseBody
	public String deleteall(@ModelAttribute MvcDto d1)
	{
//		int id=d1.getId();
		
		String e=mvcDao.deleteall();
		
		return e;
	}
	
	
	
	

}
