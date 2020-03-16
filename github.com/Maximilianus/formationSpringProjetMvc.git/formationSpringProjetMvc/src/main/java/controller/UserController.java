package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import model.User;
import repository.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController 
{
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping("/inscription")
	public String formDisplay(Model model, HttpServletRequest ht)
	{
		model.addAttribute("user", new User());
		ht.getServletContext().setAttribute("users", repository.findAll());
		model.addAttribute("users", repository.findAll());
		return "user/inscription";
	}
	
	@PostMapping("/inscription")
	public String infoDisplay(Model model, @ModelAttribute(name = "user") User user, HttpServletRequest ht)
	{
		repository.save(user);
		ht.getServletContext().setAttribute("users", repository.findAll());
		model.addAttribute("users", repository.findAll());
		return "user/inscription";
	}
}
