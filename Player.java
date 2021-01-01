/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uppgift3;

/**
 *
 * @author Gustaf
 */
public class Player {
     private String name;
    private int healthPoints;
    private int damage;
    private Item[] inventory;

   public Player(String playerName, int playerHealth, int playerDamage)
          
   {
      this.name = playerName;
      this.healthPoints = playerHealth;
      this.damage = playerDamage;
      
   }

   public Item[] addItem(Item item)
   {
      for(int i =0; i < inventory.length; i++)
      {
         if(inventory[i] == null)
         {
            inventory[i] = item;
            break;
         }
      }
      
      return inventory;
      
   }
   
   public Item[] removeItem(Item item)
   {
      for(int i =0; i < inventory.length; i++)
      {
         if(inventory[i] == item)
         {
            inventory[i] = null;
         }
      }
      return inventory;
      
   }
   
   public void displayInventory(Item[] inventory)
   {
      Item item;
      System.out.println("Items: ");
      for(int i =0; i < inventory.length; i++)
      {
         if(inventory[i] != null)
         {
            item = inventory[i];
            System.out.print(item.getName() + "  "); 
         }
      }
      System.out.println();
   }
   
   public void setInventory(Item[] inventory)
   {
      this.inventory = inventory;
   }
   
   public Item[] getInventory()
   {
      return inventory;
   }

   public int getDamage()
   {
      return damage;
   }

   public void setDamage(int damage)
   {
      this.damage = damage;
   }

   public int getHealthPoints()
   {
      return healthPoints;
   }

   public void setHealthPoints(int healthPoints)
   {
      this.healthPoints = healthPoints;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }
  public void playerTakeDamage(){
   this.healthPoints -= 10;
  
  }
}


