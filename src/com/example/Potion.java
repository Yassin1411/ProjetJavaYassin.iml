package com.example;

public class Potion {


  public Potion() {         //Constructeur health même si ya rien obligé de mettre
  }

  public void regenHealth(Wizard wizard) {
      int currentHealth = wizard.getHealth();
      int health = 10;
      if(wizard.getHouse() == "Hufflepuff"){
        health+=5;
      }
      int newHealth = currentHealth + health;
      wizard.setHealth(newHealth);
      System.out.println(wizard.getName() + " a regagné "+ Integer.toString(health) +" points de vie grâce à une potion.");

      
      
  }

}
