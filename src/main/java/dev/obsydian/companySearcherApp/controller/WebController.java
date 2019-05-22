package dev.obsydian.companySearcherApp.controller;

import dev.obsydian.companySearcherApp.domain.CompanyData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping()
public class WebController {

	@Autowired
	private AppController appController;

	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}

	@PostMapping("/")
		public String checkCompany(@ModelAttribute("nip") String nip){
		if (nip.length() != 10){
			return "redirect:/?error";
		} else {
			return "redirect:/nip/" + nip;
		}
	}

	@GetMapping("/nip/{nip}")
	public ModelAndView getCompanyDetails(@PathVariable("nip") String nip){
		ModelAndView mav = new ModelAndView("index");
		CompanyData.Company company = appController.getCompanyDetails(nip);
		mav.addObject("company", company);
		return  mav;
	}
}
