package com.kr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kr.model.Model;
import com.kr.repo.IModelRepo;

@Service
public class ModelService implements IModelService {

	@Autowired
	IModelRepo repo;
	
	@Override
	public void addTask(Model m) {
		repo.save(m);
	}

	@Override
	public void deleteTaskById(Long id) {
		repo.deleteById(id);
	}

	@Override
	public List<Model> getAllTasks() {
		return repo.findAll();
	}

	@Override
	public void updateTaskById(String tasks, Long id) {
		repo.updateTaskById(tasks, id);
	}

}
