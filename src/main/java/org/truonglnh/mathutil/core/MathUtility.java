/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.truonglnh.mathutil.core;

/**
 *
 * @author lnhtr
 */
//Class nay clone giông class java.util.Math
//chua cac ham static Math.sqrt() Math.sin() Math.random()
public class MathUtility {
    
    public static final double PI = 3.1415;
    
    // hàm getF() là hàm tinh n! = 1.2.3....n
    //thiet ke ham nhu sau:
    //0! = 1! = 1
    //k co giai thua cho so am. neu dua -5! -> chui; nem ra exception
    // vi giai thua tang rat nha, 21! long k chua noi (long 18 so 0)
    //20! vua du cho long
    //21! 22! 23! > 20! -> chui, nem ra Exception
//    public static long getFactorial(int n){
//        
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid number n must be between 0..20, plz");
//        }
//        if(n == 0 || n == 1)
//            return 1;
//        
//        long product = 1; /// bien luu don cacs tinh 
//        for (int i = 2; i <= n; i++) 
//            product *= i;       
//        return product;      
//    }
    
    public static long getFactorial(int n){
        
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid number n must be between 0..20, plz");
        }
        if(n == 0 || n == 1)
            return 1;
        return n * getFactorial(n - 1);
              
             
    }
}

//5! = 1.2.3.4.5 = 1.2.3.4   .5
//               = 4!        .5 = 5 x 4!

//4! = 4 x 3!
//3! = 3 x 2!
//2! = 2 x 1!
//1! = 1; dung quá trình duoi nhau
//N! = N x (N - 1)!