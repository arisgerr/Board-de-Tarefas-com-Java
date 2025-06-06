package com.dio.service;

import com.dio.persistence.entity.TaskEntity;
import com.dio.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<TaskEntity> findAll() {
        return taskRepository.findAll();
    }

    public Optional<TaskEntity> findById(Long id) {
        return taskRepository.findById(id);
    }

    public TaskEntity save(TaskEntity task) {
        return taskRepository.save(task);
    }

    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return taskRepository.existsById(id);
    }
}
