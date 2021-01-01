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
public class Rum {
 Player spelare = new Player("Erik",100,10);
  
  
  public void startFight(){
  Monster enemy = new Monster(null,10,80);
  enemy.setMonsterName(enemy.monsterRandomizer());
  System.out.printf("Caution!%s appeared with %d HP! and %d damage!",enemy.getMonsterName(),enemy.getMonsterHp(),enemy.getMonsterDamage());
  
  while(enemy.getMonsterHp() > 0 && spelare.getHealthPoints() > 0){
  System.out.printf("Press: F to attack the %s!",enemy.getMonsterName());
  Scanner input = new Scanner(System.in);
  String val = input.nextLine();
  
  switch(val){
      
      case "f":
   Random rand = new Random();
  int randInt = rand.nextInt(100) + 1;
  int monsterInt = rand.nextInt(100) +1;
      if(randInt <= 80){
       enemy.monsterTakingDamage();
       System.out.printf("\n You dealed %d damage on the enemy: %s,\nEnemy has %d HP left!",spelare.getDamage(),enemy.getMonsterName(),enemy.getMonsterHp());
      }
      else if(randInt > 80){
     System.out.println("You missed your attack, and dealt no damage!");
      }
      
      if(monsterInt <= 70){
          spelare.playerTakeDamage();
       System.out.printf("\n%s hit you for %d, you have %d HP left!",enemy.getMonsterName(),enemy.getMonsterDamage(),spelare.getHealthPoints());
      }
      
      else if(monsterInt > 70){
      System.out.printf("\n%s missed their attack on you and dealt no damage!",enemy.getMonsterName());
      }
       
       System.out.printf("\n The %s have %d HP left, and you (%s) have %d HP left!",enemy.getMonsterName(),enemy.getMonsterHp(),spelare.getName(),spelare.getHealthPoints());
       System.out.println("\n*********************************************************************************");
       break;
      
      
      default: 
      System.out.println("Unknown input registred, please try again!");
      continue;
      
  }
  
  
  
}
if(0 >= enemy.getMonsterHp()){
  System.out.printf("You defeated the %s, after a glorious battle!",enemy.getMonsterName());
  
  }
else{
    System.out.println("You died! Game over!");
    
}
}
  
  
  
public void dragonFight(){ // Inte klar, ignorera tillsvidare.
 Monster dragon = new Monster("The Legendary Dragon!",10,180);
 System.out.println("You suddenly feel a shiver up your spine, a great creature stirs....");
 System.out.printf("\nYou can see the %s nearing you, this might be your final breath",dragon.getMonsterName());
 System.out.printf("\nThe %s has %d HP and deals %d damage!",dragon.getMonsterName(),dragon.getMonsterHp(),dragon.getMonsterDamage());
  while(dragon.getMonsterHp() > 0 && spelare.getHealthPoints() > 0){

  System.out.printf("\nPress F: to fight for your life against the %s!",dragon.getMonsterName());
  Scanner input = new Scanner(System.in);
  String val = input.nextLine();
  
  switch(val){
      case "f":
          
  Random rand = new Random();
  int randInt = rand.nextInt(100) + 1;
  int monsterInt = rand.nextInt(100) +1;
  
  if(randInt <= 80){
        dragon.monsterTakingDamage();
       System.out.printf("You dealt: %d damage! %s has %d HP left!",spelare.getDamage(),dragon.getMonsterName(),dragon.getMonsterHp());
      }
  else if(randInt > 80){
      System.out.println("You missed your attack and dealt no damage!");
  }
  
  
  if(monsterInt <= 70 ){
    spelare.playerTakeDamage();
    System.out.printf("\n%s Cauterizing Flame dealt %d damage on you!",dragon.getMonsterName(),dragon.getMonsterDamage());
  }
  else if(monsterInt > 70){
      System.out.println("You managed to dodge the dragons fireblast!\n You took no damage! ");
  }
       
        System.out.println("\n*********************************************************************************");
        System.out.printf("\n%s have %d HP left, and you (%s) have %d HP left!",dragon.getMonsterName(),dragon.getMonsterHp(),spelare.getName(),spelare.getHealthPoints());
       System.out.println("\n*********************************************************************************");
       break;
      
      
      default: 
      System.out.println("Vänligen försök att skriva igen!");
      continue;
      
  }
}
 if(0 >= dragon.getMonsterHp()){
  System.out.printf("You defeated the %s, after a glorious battle!",dragon.getMonsterName());
  
  }
else{
    System.out.println("You died! Game over!");
}
}
}