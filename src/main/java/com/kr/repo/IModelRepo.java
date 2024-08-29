package com.kr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.kr.model.Model;

import jakarta.transaction.Transactional;

public interface IModelRepo extends JpaRepository<Model, Long> {
	
	@Query(value="UPDATE Model SET tasks=?1 WHERE id=?2")
	@Modifying
	@Transactional
	public int updateTaskById(String tasks,Long id);

}
