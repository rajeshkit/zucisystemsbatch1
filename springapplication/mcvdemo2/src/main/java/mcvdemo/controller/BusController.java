package mcvdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import mcvdemo.model.Bus;

@Controller 
public class BusController {
	@RequestMapping("/welcome")
	public String welcome(Model model) {     //web request method
		System.out.println("Method os invoked");
		model.addAttribute("xyz", "Rajesh Nallusamy");
		return "show"; //LVM
		
	}
	@RequestMapping("/addbus")
	public String addBushdgffj(Model model) {
		model.addAttribute("bus", new Bus(8765,"Sharma travels", 1000));
		return "status";
		
	}

}
