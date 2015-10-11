package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//web controller
@Controller
public class GreetingController
{
	//specifically mapped to GET
	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String greetingForm(Model model)
	{
		model.addAttribute("greeting", new Greeting());
		return "greeting";
	}
	//specifically mapped to POST
	@RequestMapping(value="/greeting", method=RequestMethod.POST)
	public String greetingSubmit(@ModelAttribute Greeting greeting, Model model)
	{
		model.addAttribute("greeting", greeting);
		return "result";
	}
}