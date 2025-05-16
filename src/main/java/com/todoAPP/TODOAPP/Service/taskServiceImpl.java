package com.todoAPP.TODOAPP.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoAPP.TODOAPP.Dao.taskDao;
import com.todoAPP.TODOAPP.Entities.task;

@Service
public class taskServiceImpl implements taskService {

    @Autowired
    private taskDao taskdao;

    @Override
    public List<task> getTasks() {
        return taskdao.findAll();
    }

    @Override
    public task getTaskById(long id) {
        return taskdao.findById(id).orElse(null);
    }

    @Override
    public task addTask(task task) {
        return taskdao.save(task);
    }

    @Override
    public task updateTask(task task) {
        return taskdao.save(task);
    }

    @Override
    public task deleteTask(long id) {
        task taskToDelete = taskdao.findById(id).orElse(null);
        if (taskToDelete != null) {
            taskdao.delete(taskToDelete);
        }
        return taskToDelete;
    }

    @Override
    public boolean status(long id) {
        task currentTask = taskdao.findById(id).orElse(null);
        if (currentTask != null) {
            return currentTask.isMarked();
        }
        return false;
    }

    @Override
    public task markDone(long id) {
        task currentTask = taskdao.findById(id).orElse(null);
        if (currentTask != null) {
            currentTask.setMarked(true);
            return taskdao.save(currentTask);
        }
        return null;
    }
}
