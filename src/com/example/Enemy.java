package com.example;

public class Enemy implements AbstractEnemy{

  private String name;
  private int health;
  private int damage;
  
  public Enemy(String name, int health, int damage){
    this.name = name;
    this.health = health;
    this.damage = damage;
  }
    
  @Override
  public void attack(Character c) {                                   //Implementer les méthodes 
    c.damage (this.damage);
  }

  @Override
  public void damage(int damage) {
    this.health = this.health - damage;             //Pour lui enlever les degats 
  }
}
