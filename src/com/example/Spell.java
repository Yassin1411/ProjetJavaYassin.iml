package com.example;

import java.util.Random;


public class Spell implements AbstractSpell{

  private String nameSpell;
  private int damageSpell;
  private int successRate;          //Classe de java pour le pourcentage de réussite des potions

  public Spell(int successRate, String name, int damage) {        //Constructeur
    this.successRate = successRate;
    this.nameSpell = name;
    this.damageSpell = damage;
  }

  public void attack(Character ennemi) {
    Random random = new Random();
    int chance = random.nextInt(100);     //Random valeur entre 0 et 100

  if (chance < successRate) {
    ennemi.damage(this.damageSpell);
  } else {
    System.out.println("Le sort a échoué.");
  }
}
}
