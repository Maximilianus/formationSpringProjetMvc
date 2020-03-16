package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/commander")
public class PanierController {

	
	@RequestMapping("/panier")
	public String hello(HttpServletRequest ht, Model model	)
	{
		ArrayList<Object> lstP = (ArrayList<Object>)ht.getSession().getAttribute("lstP");
		ArrayList<Object> lstM = (ArrayList<Object>)ht.getSession().getAttribute("lstM");
		
		model.addAttribute("listePoneys", lstP);
		model.addAttribute("listeMatos", lstM);
		
		int total1 = (int) (ht.getServletContext().getAttribute("total"));
		System.out.println(total1);
		int total2 = (int) (ht.getServletContext().getAttribute("total2"));
		System.out.println(total2);
		int total = total1 + total2;
		
		model.addAttribute("prixtotal", total);
		
		
		return "commander/panier";
	}
	
	
	
	
	
}
