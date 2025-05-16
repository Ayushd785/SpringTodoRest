package com.todoAPP.TODOAPP.Service;

import java.util.List;

import com.todoAPP.TODOAPP.Entities.task;

public interface taskService {
    public List<task> getTasks();

    public task getTaskById(long id);

    public task addTask(task task);

    public task updateTask(task task);

    public task deleteTask(long id);

    public boolean status(long id);

    public task markDone(long id);
}
