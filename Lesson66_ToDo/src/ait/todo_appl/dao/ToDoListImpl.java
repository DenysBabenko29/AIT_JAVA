package ait.todo_appl.dao;

import ait.todo_appl.model.Task;

import java.io.*;
import java.util.Arrays;

public class ToDoListImpl implements ToDoList {
    final String OUTPUT = "tasks.txt";
    final String INPUt = "tasks.txt";
    private Task[] tasks;
    private int capacity;
    private int quantity;

    public ToDoListImpl(int capacity) {
        this.tasks = new Task[capacity];
    }

    @Override
    public boolean addTask(Task task) {
        if (task != null && quantity <= capacity) {
            tasks[quantity++] = task;
            return true;
        }
        return false;
    }

    @Override
    public Task findTask(int id) {
        for (int i = 0; i < quantity; i++) {
            if (tasks[i].getId() == id){
                return tasks[i];
            }
        }
        return null;
    }

    @Override
    public Task removeTask(int id) {
        Task victim = null;
        for (int i = 0; i < quantity; i++) {
            if (tasks[i].getId() == id){
                victim = tasks[i];
                for (int j = i; j < quantity - 1; j++) {
                    tasks[j] = tasks[j + 1];
                }
                tasks[quantity - 1] = null;
                quantity--;
                for (int j = 0; j < quantity; j++) {
                    tasks[j].setId(j);
                }
            }
        }
        return victim;
    }

    @Override
    public void printTasks() {
        for (int i = 0; i < quantity; i++) {
            System.out.println(tasks[i]);
        }
        System.out.println("You have " + quantity + " tasks");
    }

    @Override
    public int quantity() {
        return quantity;
    }

    @Override
    public void readTasks() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(INPUt));
            String str;
            int countTask = 0;
            while ((str = br.readLine()) != null){
                int index = str.indexOf(':');
                String t = str.substring(index + 1, str.length());
                Task task = new Task(t);
                tasks[countTask++] = task;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void saveTasks() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT));
            for (int i = 0; i < quantity; i++) {
                String str = String.valueOf(tasks[i]);
                bw.write(str + "\n");
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
