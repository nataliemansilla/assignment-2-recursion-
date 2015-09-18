/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.util.Scanner;

/**
 *
 * @author natalie
 */
public class Exercise2 {
    
    static long sumDigits(int n)
    {
        int sum = 0;
        
        if (n > 0){
           return (n % 10) + sumDigits(n / 10);
        } else
        {
           return  0;
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = input.nextInt();
        
        System.out.println(sumDigits(num));
    }
    
}
