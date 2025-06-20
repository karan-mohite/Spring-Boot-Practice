package in.sp.main.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController
{
	@GetMapping("/stringPage")
	public String openStringsPage()
	{
		return "strings-page";
	}
	
	@GetMapping("/arrayPage")
	public String openArrayPage(Model model)
	{
		Integer[] marks_array = {70,40,60,20,90,80};
		model.addAttribute("modelArray", marks_array);
		
		return "array-page";
	}
	
	@GetMapping("/listPage")
	public String openListPage(Model model)
	{
		List<String> names_list = new ArrayList<>();
		names_list.add("Deepak");
		names_list.add("Amit");
		names_list.add("Kamal");
		names_list.add("Ravi");
		
		model.addAttribute("modelList", names_list);
		
		return "list-page";
	}
	
	@GetMapping("/localeAndDatePage")
	public String openLocaleAndDatePage()
	{
		return "locale-date-page";
	}
}
