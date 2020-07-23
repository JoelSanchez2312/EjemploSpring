package com.empleados.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.empleados.interfacesServices.IAreaService;
import com.empleados.modelo.*;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IAreaService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Area>areas = service.listar();
		model.addAttribute("areas", areas);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("area", new Area());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Validated Area a, Model model) {
		service.save(a);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Area> area = service.listarId(id);
		model.addAttribute("area", area);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
}
