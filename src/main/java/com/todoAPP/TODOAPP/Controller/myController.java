package com.todoAPP.TODOAPP.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todoAPP.TODOAPP.Entities.task;
import com.todoAPP.TODOAPP.Service.taskService;

@RestController
public class myController {
    @Autowired
    private taskService taskservice;

    @GetMapping("/tasks")
    public List<task> getTasks(){
        return this.taskservice.getTasks();
    }

    @GetMapping("/tasks/{id}")
    public task geTaskById(@PathVariable String id){
        return this.taskservice.getTaskById(Long.parseLong(id));
    }

    @PostMapping(path = "/tasks")
    public task addTask(@RequestBody task task){
        return this.taskservice.addTask(task);
    }

    @PutMapping("/tasks")
        public task updateTask(@RequestBody task task){
            return this.taskservice.updateTask(task);
        }
    
    @GetMapping("/tasks/status/{id}")
    public boolean getStatus(@PathVariable String id){
        return this.taskservice.status(Long.parseLong(id));
    }

    @DeleteMapping("/tasks/{id}")
    public task deleteTask(@PathVariable String id){
        return this.taskservice.deleteTask(Long.parseLong(id));
    }

    @PutMapping("/tasks/{id}")
    public task markDone(@PathVariable String id){
        return this.taskservice.markDone(Long.parseLong(id));
    }

}
