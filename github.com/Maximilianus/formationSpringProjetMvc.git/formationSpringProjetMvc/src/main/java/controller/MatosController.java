package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Materiel;
import model.Poney;
import repository.MaterielRepository;
import repository.PoneyRepository;

@Controller
@RequestMapping("/avendre") 
public class MatosController {

	
	@Autowired
	private MaterielRepository repository;
	
	
	@RequestMapping("/matos")  
	public String m1( Model model) {
		List<Materiel> matos = repository.findAll();
		model.addAttribute("matos", matos);
		return "avendre/matos"; 
	}
	
	
}
