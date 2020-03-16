package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/testlogin")
public class TestLoginController 
{
	@RequestMapping("/")
	public ModelAndView testLogin(HttpServletRequest ht)
	{
		ModelAndView modelAndView = new ModelAndView("user/test", "user", ht.getServletContext().getAttribute("user"));
		
		return modelAndView;
	}
}
