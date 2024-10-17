/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author prabin
 */
/*Write a java program that willl read balance and withdraw amount form keyboard and display the remaining balance on screen if the balance is greater than withdraw
  amount otherwise there is an exception with appropriate message.*/
import java.util.*;

public class ATMException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount to be Withdrawl:");
            int b = sc.nextInt();
            int amount = 10000;
            int rem = amount - b;
            if (rem >= 0) {
                System.out.println("The withdrawl amount is:" + b);
                System.out.println("Remaining Balance is:" + rem);
            } else {
                throw new InsufficientException("Insufficient Balance.");
            }
        } catch (InsufficientException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("We have reach the end of the program.");
        }
    }
}

class InsufficientException extends Exception {
    public InsufficientException(String msg) {
        super(msg);
    }
}
