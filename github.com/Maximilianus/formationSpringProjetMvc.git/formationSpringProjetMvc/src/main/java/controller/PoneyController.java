package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Poney;
import repository.PoneyRepository;

@Controller
@RequestMapping("/avendre") 
public class PoneyController {

	@Autowired
	private PoneyRepository repository;
	
	
	@RequestMapping("/poneys")  
	public String m1( Model model) {
		List<Poney> poneys = repository.findAll();
		model.addAttribute("poneys", poneys);
		return "avendre/poneys"; 
	}
	

	
//	@PostMapping("/filtre")
//	public String m2(@ModelAttribute(name="poney") String poney, Model model, HttpServletRequest ht) {
//		
//		ht.getSession().setAttribute("articles", repository.findAll());
//		
//		return "article/filtre";
//	}
	
	
}
