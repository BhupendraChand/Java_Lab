/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author prabin
 */
//Multithread Application using Runnable inter face.
class Test implements Runnable{
    public void run(){
        for(int i=0;i<15;i++){
            System.out.println("Test Thread.");
        }
        System.out.println("Test Thread processing ends.");
    
}}
public class NewClass {
    public static void main(String[] args){
        Test t=new Test();
        Thread sc=new Thread(t);
        sc.start();
    for(int i=0;i<15;i++)
    {
        System.out.println("Main Thread");
    }
    System.out.println("Main Thread processing ends.");
    }
    
}
