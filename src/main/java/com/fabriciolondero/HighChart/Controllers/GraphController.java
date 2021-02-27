package com.fabriciolondero.HighChart.Controllers;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GraphController 
{
	@GetMapping("/barChart")
	public String barChart(Model model)
	{
		Map<String, Integer> data = new LinkedHashMap<String,Integer>();
		data.put("Fabrício", 30);
		data.put("Felipe", 30);
		data.put("Grazi", 37);
		data.put("Nivia", 34);
		data.put("Kinder", 8);
		data.put("Punk", 14);
		
		model.addAttribute("keySet", data.keySet());
		model.addAttribute("values", data.values());
		
		return "barChart";
	}
	
	@GetMapping("/pieChart")
	public String pieChart(Model model)
	{	
		model.addAttribute("sucesso", 80);
		model.addAttribute("falha", 20);
		
		return "pieChart";
	}
}
