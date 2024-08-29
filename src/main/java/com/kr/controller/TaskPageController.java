package com.kr.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kr.model.Model;
import com.kr.service.IModelService;

@Controller
public class TaskPageController {

	@Autowired
	IModelService service;

	@GetMapping("/")
	public String home(@ModelAttribute("model") Model m, Map<String, List<Model>> map) {
		List<Model> allTasks = service.getAllTasks();
		map.put("tasks", allTasks);
		System.out.println(allTasks);
		return "index";
	}

	@PostMapping("/add")
	public String add(@ModelAttribute("model") Model m) {
		System.out.println(m);
		service.addTask(m);
		return "redirect:./";
	}

	@GetMapping("/deleteData")
	public String delete(@RequestParam Long id) {
		service.deleteTaskById(id);
		return "redirect:./";
	}
	@PostMapping("/updateTask")
	public String update(@ModelAttribute("model") Model m)
	{
		service.updateTaskById(m.getTasks(), m.getId());
		return "redirect:./";
	}

}
