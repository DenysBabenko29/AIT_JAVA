package ait.todo_appl.dao;

import ait.todo_appl.model.Task;


public interface ToDoList {
    boolean addTask(Task task);
    Task findTask(int id);
    //Task findTaskByString(String str);
    Task removeTask(int id);
    void printTasks();
    int quantity();
    void readTasks();
    void saveTasks();
}
