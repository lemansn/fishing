/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odev1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author leman
 */
public class Odev1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner giris = new Scanner(System.in); //kullanicidan veri almak icin gerekli 
        
        Random randomSayi = new Random(); //random sayi almak icin gerekli
        
        System.out.println("Let's go fishing!");
        
        int topScore = 0; // kazanılan toplam puan
        int count=0;  //kaç defa olta atıldığı 
        double average; //kazanılan ortalama puan
        String devam; 
        
       
        
        do 
        {
            int sayi = randomSayi.nextInt(7); // 6ya kadar random sayi aliniyor

            if (sayi == 1) 
            {
                System.out.println("You caught [an old shoe].");
                topScore +=1;    
            }
            
            else if (sayi == 2) 
            {
                System.out.println("You caught [a huge fish].");
                topScore += 100;
            }
            
            else if (sayi == 3) 
            {
                System.out.println("You caught [a leaf].");
                topScore += 2;                
            }
            
            else if (sayi == 4) 
            {
                System.out.println("You caught [a little fish].");
                topScore += 50;
            }
            
            else if (sayi == 5) 
            {
                System.out.println("You caught [a rock].");
                topScore += 3;
            }
            
            else 
            {
                System.out.println("You caught [garbage].");
                topScore +=0;
            }
            
            count ++;  //her donguden sonra dongu sayi artiriliyor
            
            System.out.println("Try fishing again? (Y or N): ");
            devam = giris.next(); //devam 'y' veya 'Y' olursa  program devam ediyor 
            
        }while (devam.charAt(0) == 'y' | devam.charAt(0) == 'Y');   
        
        System.out.println("You got a total of " + topScore + " fishing points.");
        System.out.println("You casted your fishing line " + count + " times.");
        
        average = (double)topScore/(double)count; //ortalama puan bulunuyor
        
        System.out.printf("Average = %6.2f ",average);
        System.out.println("");
        
        if (average >= 20) 
        {
            System.out.println("Great job!");
        }
        
        else if (average < 20 && average >10 ) 
        {
            System.out.println("That is some fine fishing");
        }
        
        else    
            System.out.println("Try again in future");
        
        
        System.exit(0);

// TODO code application logic here
    }
    
}
