package controller;

import java.util.ArrayList;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.cj.ParseInfo;

import model.Materiel;
import model.Poney;
import model.User;
import repository.MaterielRepository;
import repository.PoneyRepository;

@Controller
@RequestMapping("/commander") 

public class ComMatosController {

	@Autowired
	private MaterielRepository repository;
	

	
	
	@GetMapping("/achatmatos")
	public ModelAndView list2(HttpServletRequest ht) {
		ModelAndView modelAndView = new ModelAndView("commander/achatmatos", "matos", repository.findAll());
		
		modelAndView.addObject("m", new Materiel());
		
		if (ht.getSession().getAttribute("lstM")== null) // si y'a pas d'e
			ht.getSession().setAttribute("lstM", new ArrayList<Object>()); 
		
		return modelAndView;
	}
	
	@PostMapping("/achatmatos")
	public ModelAndView aa( @ModelAttribute(name = "m") Materiel m, HttpServletRequest ht	) {
		
		ModelAndView modelAndView = new ModelAndView("commander/achatmatos", "monmatos", repository.findById(m.getId()).get());
		
		
		
		m = repository.findById(m.getId()).get();
		
		ArrayList<Object> lstM = (ArrayList<Object>)ht.getSession().getAttribute("lstM");
		lstM.add(m);
		
		modelAndView.addObject("lstM", lstM);
		
		
		ht.getSession().setAttribute("lstM", lstM);
		
		modelAndView.addObject("matos", repository.findAll());
		
		
		int prix =0;
		for (Object matos : lstM)
		{
			prix = prix + ((Materiel)matos).getPrix();
		}
		
		modelAndView.addObject("total2", prix);
		ht.getServletContext().setAttribute("total2", prix);
		

		return modelAndView;
	}
	
}
