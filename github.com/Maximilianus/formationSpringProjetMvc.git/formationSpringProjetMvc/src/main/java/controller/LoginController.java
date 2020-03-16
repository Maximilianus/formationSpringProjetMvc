package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import model.User;
import repository.UserRepository;

@Controller
@RequestMapping("/login")
public class LoginController 
{
	@Autowired
	private UserRepository repo;
	
	@RequestMapping("/login")
	public String loginDisplay(Model model, @ModelAttribute(name = "nom")String nom, @ModelAttribute(name = "mdp")String mdp, HttpServletRequest ht)
	{
		System.out.println(repo.findByIdAndMdp(nom, mdp));
		
		if(repo.findByIdAndMdp(nom, mdp) == null)
			return "user/login";
		else
		{
			model.addAttribute("user", repo.findByIdAndMdp(nom, mdp));
			ht.getServletContext().setAttribute("user", repo.findByIdAndMdp(nom, mdp));
			return "user/loginOK";
		}
	}
}
