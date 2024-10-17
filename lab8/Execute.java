/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author prabin
 */
//MultiThread Application by extending the Thread class
class A extends Thread{
    public void run(){
        for(int i=0;i<15;i++){
            System.out.println("From Class A Execution "+i);
        }
         System.out.println("Class a End of Task.");
    }
   
}
class B extends Thread{
    public void run(){
        for(int i=0;i<15;i++)
        {
            System.out.println("From Class B Execution "+i);
        }
        System.out.println("Class B End of Task.");
    }
}
public class Execute {
public static void main(String[] args){
A p=new A();
B k=new B();
p.start();
k.start();
}
}