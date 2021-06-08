package br.gov.sp.etecsebrae.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.etecsebrae.dto.Intencao;
import br.gov.sp.etecsebrae.service.IntencaoService;

@Controller
public class HomeController {
	@Autowired
	private IntencaoService service;

	@GetMapping({ "/", "/home", "/index" })
	public ModelAndView home() {
		ModelAndView view = new ModelAndView("home");
		List<Intencao> intencoes = service.getIntencoes();
		view.addObject("intencoes", intencoes);
		return view;
	}
}
