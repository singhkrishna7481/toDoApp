package com.kr.service;

import java.util.List;

import com.kr.model.Model;

public interface IModelService {
	void addTask(Model m);
	
	List<Model> getAllTasks();
	
	void deleteTaskById(Long id);
	
	void updateTaskById(String tasks,Long id);
}
