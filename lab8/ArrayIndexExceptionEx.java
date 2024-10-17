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
public class ArrayIndexExceptionEx {
    public static void main(String[] args){
            try{
        int[] arr=new int[]{10,20,30,40,50};
        arr[10]=100;
        System.out.println("arr[10]="+arr[10]);
    }catch(ArrayIndexOutOfBoundsException ex)
    {
        System.out.println(ex);
}
    catch(Exception ex)
    {
        System.out.println(ex);
    }    
    finally
    {
        System.out.println("End of program");
    }
}
}
