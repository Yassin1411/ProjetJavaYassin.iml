package com.example;

public class Enemy extends AbstractEnemy{            //Diff entre entends(pour abstract)& implements(pour interface)

  private String name;
  private int health;
  private int damage;

  public Enemy(String name, int health, int damage){
    this.name = name;
    this.health = health;
    this.damage = damage;
  }


  public int getHealth() {                            //Pour recup Health pour le combat 
    return health;
  }

  public String getName() {
    return name;
  }
  @Override
  public void attack(Character c) {                                   //Implementer les méthodes
    c.damage(this.damage);
  }

  @Override
  public void damage(int damage) {
    this.health = this.health - damage;             //Pour lui enlever les degats
  }
}
