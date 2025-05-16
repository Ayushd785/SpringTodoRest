package com.todoAPP.TODOAPP.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoAPP.TODOAPP.Entities.task;

public interface taskDao extends JpaRepository<task,Long> {

}
