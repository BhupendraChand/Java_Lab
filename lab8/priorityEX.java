/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author prabin
 */
//Write a java program to set and get thread priorities in multithreaded application.
class K extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class priorityEX {
    public static void main(String[] args){
        K t1=new K();
        K t2=new K();
        K t3=new K();
        
        t1.setName("Thread 1");
        t1.setPriority(2);
        
       
        t2.setName("Thread 2");
        t2.setPriority(5);
        

        t3.setName("Thread 3");
        t3.setPriority(10);
        
        t1.start();
        t2.start();
        t3.start();
    }
}
