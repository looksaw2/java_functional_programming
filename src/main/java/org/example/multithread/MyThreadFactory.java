package org.example.multithread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class MyThreadFactory implements ThreadFactory {
    private int counter;
    private String name;
    private List<String> stats;
    public MyThreadFactory(String name) {
        this.counter = 0;
        this.name = name;
        this.stats = new ArrayList<>();
    }
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r,name+"-Thread_"+counter);
        counter++;
        stats.add(String.format("Create thread %d with name %s on %s\n",t.getId(),t.getName(),new Date()));
        return t;
    }
    public String getStats(){
        StringBuffer sb = new StringBuffer();
        for(var s : stats){
            sb.append(s + "\n");
        }
        return sb.toString();
    }


    public static void main(String[] args){
        MyThreadFactory factory = new MyThreadFactory("MyThreadFactory");
        Task task = new Task();
        System.out.println("Starting the Threads\n");
        for(int i = 0; i < 10; i++){
            Thread thread = factory.newThread(task);
            thread.start();
        }
    }
}
