package edu.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class WalmartBillingController {
	
	
	/*@RequestMapping(value="/greeting")
	public String sayHello(Model model) {
		model.addAttribute("greetng", "Hello World");
		return "hello";
	}*/
	

	@RequestMapping(value = { "/"}, method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		return "home";
	}

	@RequestMapping(value = { "/products"}, method = RequestMethod.GET)
	public String productsPage(ModelMap model) {
		return "products";
	}

	@RequestMapping(value = { "/contactus"}, method = RequestMethod.GET)
	public String contactUsPage(ModelMap model) {
		return "contactus";
	}
	
	@RequestMapping(value = { "/billing"}, method = RequestMethod.GET)
	public String calculateBill(ModelMap model) {
		return "billing";
	}
}
