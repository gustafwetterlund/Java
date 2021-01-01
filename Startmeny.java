/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uppgift3;
import java.util.*;
/**
 *
 * @author Gustaf
 */
public class Startmeny {
 
public static void main(String[] args){
   Scanner input = new Scanner(System.in);
 int menyval = input.nextInt();
 Rum rum = new Rum();

 
 //while(true){
    
 switch(menyval){
   
   case 1: {rum.startFight();
   break;
   }
   case 2:{ rum.dragonFight();
       break;}
   }
   
 }
 
 }

    //    }

