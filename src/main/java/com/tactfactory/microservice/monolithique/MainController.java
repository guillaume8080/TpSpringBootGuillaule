package com.tactfactory.microservice.monolithique;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/")
public class MainController {
	
	@Autowired
	private ExchangeValueRepository repository;
	@GetMapping("/currencyform")
	public ModelAndView index() {
	return new ModelAndView("currencyform");
	}
	@PostMapping("/currencyform")
	public ModelAndView formPosted(FormDto dto, Model model) {
		
		ExchangeValue value = repository.findByFromAndTo(dto.getFrom(), dto.getTo());
		dto.setTotalCalculatedAmount(dto.getAmount().multiply(value.getConversionMultiple()));
		model.addAttribute("result", dto.toString());
		return new ModelAndView("currencyform");
		
	}
	

}
