/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
 {
    public static void main(String[] args) 
    {
       int a;  
       int b;
       char znak;      
       Scanner wejscie = new Scanner(System.in);   
       System.out.println("Podaj pierwszą liczbę:"); 
       a = wejscie.nextInt();
       System.out.println("Podaj drugą liczbę:");
       b = wejscie.nextInt();
 
       System.out.println("Dodawanie dwóch liczb - wciśnij +");
       System.out.println("Odejmowanie dwóch liczb - wciśnij -");
       System.out.println("Mnożenie dwóch liczb - wciśnij *");
       System.out.println("Dzielenie dwóch liczb - wciśnij /");
       System.out.println("Operacaja modulo - wciśnij %");
 
       znak = wejscie.next().charAt(0);  
       switch(znak)     
       {
           case '+':    
           {
               System.out.println(a+b);
               break;
           }
           case '-':    
           {
               System.out.println(a-b);
               break;
           }
           case '*':   
           {
               System.out.println(a*b);
               break;
           }
           case '/':   
           {         
                 System.out.println(a/b);
               break;
           }
           case '%':  
           {
               System.out.println(a%b);
           }
 
       }
    }
 }
		