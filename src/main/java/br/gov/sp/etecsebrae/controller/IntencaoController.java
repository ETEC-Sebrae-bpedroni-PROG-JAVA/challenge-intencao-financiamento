package br.gov.sp.etecsebrae.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.gov.sp.etecsebrae.dto.Intencao;
import br.gov.sp.etecsebrae.service.IntencaoService;

@Controller
public class IntencaoController {
	@Autowired
	private IntencaoService service;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true, 10));
	}

	@GetMapping({ "nova-intencao" })
	public ModelAndView homeIntencao() {
		ModelAndView view = new ModelAndView("intencao");
		view.addObject("intencao", new Intencao());
		return view;
	}

	@GetMapping("/intencao/{id}")
	public ModelAndView getIntencao(@PathVariable int id) {
		ModelAndView view = new ModelAndView("intencao");
		Intencao intencao = service.getIntencao(id);
		view.addObject("intencao", intencao);
		return view;
	}

	@PostMapping("add-intencao")
	public String saveIntencao(@Valid Intencao intencao, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute(intencao);
			return "intencao";
		}
		service.saveIntencao(intencao);
		return "redirect:/";
	}
}
