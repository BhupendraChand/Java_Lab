/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab8;

/**
 *
 * @author prabin
 */
//Write a java program to demonstrate Arithmetic Exception, ArrayIndexOutofBound Exception and Number formatException class
import java.util.*;
public class ArithmeticEx {
public static void main(String[] args){
    try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number:");
        int n1=sc.nextInt();
        System.out.println("Enter Second Number:");
        int n2=sc.nextInt();
        int div=n1/n2;
        System.out.println("Result="+div);
    }catch(ArithmeticException ex)
    {
        System.out.println(ex);
    }
    catch(Exception ex)
            {
            System.out.println(ex);
            }
    finally
    {
            System.out.println("This end of program");
            }
}    
}
    
