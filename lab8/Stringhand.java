/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;
/*3) Write a program to demonstrate following string related function
  a)Character extraction funcion(charAt(),getChars(),toCharArray())
  b)String Comparision function (equals(),equalsIgnoreCase(),CompareTo())
  c)Modifying string function(substring(),concat(),replace())*/

/**
 *
 * @author prabin
 */
public class Stringhand{
    public static void main(String[] args){
        String k="Welcome to the world of";
        String l=" Programmers.";
        String m=k+l;
        String p=m.substring(15,23);
        String v=k.concat(l);
        String w=m.replace('o','a');
        char[] ch=new char[5];
        try{
        System.out.println("The character at index 5 is "+m.charAt(11));
        m.getChars(15, 20, ch, 0);
        System.out.println("Implementation of Function getChars(); : "+new String(ch));
        char[] m1=m.toCharArray();
        System.out.println("Implementation of toCharArray() function.");
        for(int i=0;i<m1.length;i++){
            System.out.println(m1[i]);
        }
        System.out.println(p);
        System.out.println(v);
        System.out.println(w);
        String n="Hello";
        String o="hello";
        boolean isequal=n.equals(o);
        boolean isequall=n.equalsIgnoreCase(o);
        {
        System.out.println("Implementation of compareTo()");
        if(n.compareTo(o)>0){
            System.out.println(n+" is greater");
        }
        else if(n.compareTo(o)<0){
            System.out.println(o+" is greater.");
        }
        else{
            System.out.println("Both are equal.");
        }}
        int result=n.compareToIgnoreCase(o);
        {
          System.out.println("Implementation of comparetoIgnoreCase() Function.");
            if(result>0){
                System.out.println(n+" is greater.");
            }
            else if(result<0){
                System.out.println(o+" is greater.");
            }
            else{
                System.out.println("Both the string are equal.");
            }
        }
        {
        System.out.println("Implementation of boolean isequal() function.");
        if(isequal){
            System.out.println("These two strings are equal.");
        }
        else{
            System.out.println("These two strings arenot equal.");
        }}
        {
            System.out.println("Implementation of boolean isequalIgnorecase().");
        if(isequall){
            System.out.println("These two strings are equal.");
        }
        else{
            System.out.println("These two strings arenot equal.");
        }
        }
        
        }catch(Exception ex){
            System.out.println(ex);
        }
        finally{
            System.out.println("We've reach the end of the program.");
        }
       
}}
