/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview.again;

import java.util.Scanner;

/**
 *
 * @author natalie
 */
public class JavaReviewAgain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Problem1
        //Creates scanner for system input
        Scanner input = new Scanner(System.in);
        
        //asks for users name
        System.out.println("What is your name?");
        
        //Gets name and stores in variable
        String name = input.nextLine();
        
        //outputs to screen
        System.out.println("Hello, " + name + ".");
        
        
        
        //problem 2
        // Declaring variables that will be given values by the user
        int a;
        int b;
        int c;
        
        Scanner nums = new Scanner(System.in);
        
        //asks user to enter integers 
        System.out.println("Please enter an integer.");
        a = nums.nextInt();
        
        System.out.println("Please enter another integer.");
        b = nums.nextInt();
        
        System.out.println("Please enter one last integer.");
        c = nums.nextInt();
         
        //array stores the values given to the variables
        int[] myArray = new int [] {a, b, c};
        
        //Finds the product of all three variables
        double product;
        product = a*b*c;
        System.out.println("The product of these integers is " + product);
        
        //Finds the sqaure of the product
        double square;
        square = Math.pow(product, 2);
        System.out.println("The square of the product is " + square);
        
        //Finds the square root of the product
        double sqrt;
        sqrt = Math.sqrt(product);
        
        System.out.println("The square root of the product is " + sqrt);
        //having trouble creating different classes for the problems
        //problem 3
    }
    
}
