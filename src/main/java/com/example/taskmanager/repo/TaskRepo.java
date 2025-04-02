package com.example.taskmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.taskmanager.models.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task, Integer> {

}
