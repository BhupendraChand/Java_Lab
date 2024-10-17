/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author prabin
 */
//Write a java program to demonstrate Arithmetic Exception, ArrayIndexOutofBound Exception and Number formatException class
public class NumberFormatEx {
public static void main(String[] args){
    try{
        String s="Hello";
        int n=Integer.parseInt(s);
        System.out.print("Equivalent number="+n);
    }catch(NumberFormatException ex)
    {
        System.err.println(ex);
    }
    catch(Exception ex)
    {
        System.err.println(ex);
    }finally
    {
        System.out.println("End of program");
    }
}    
}
