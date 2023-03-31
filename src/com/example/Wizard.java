package com.example;
import java.util.ArrayList;       //Array = type de liste

public class Wizard implements Character {
    private String name;
    private int health;
    private int damage;
    private Wand wand;
    private String house;
    private  ArrayList<Potion> potions;

  // Constructeur pour initialiser les propriétés
  public Wizard(String name, int health, int damage, Wand wand) {
    this.name = name;

    if (health < 0) {             //Les 6 lignes definissent le système de santé sans les gains et pertes
      this.health = 0;            // Si inferieur à 0 la santé est à 0 si sup. à 100, la sanét est à 100
    } else if (health > 100) {
      this.health = 100;
    } else {
    this.health = health;
  }

    this.damage = damage;
    this.wand = wand;
    SortingHat.assignHouse(this);     //this ==> concerne le wizard

    this.potions = new ArrayList<Potion>();     //Initialiser la liste

    for(int i = 0; i < 3; i++){               //Ajout de 3 potion
      this.potions.add(new Potion());
    }

  }


  // Getters and setters pour accéder aux propriétés
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public Wand getWand() {
    return wand;
  }

  public void setWand(Wand wand) {
    this.wand = wand;
  }

  public void setHouse(String house) {
    this.house = house;
  }

  public String getHouse() {
    return this.house;
  }

  public void addPotion(Potion p){
    //if(this.potions.size() < 3)
      this.potions.add(p);                //Ajout de la potion p dans la liste
  }

  public void usePotion(){        //Méthode

    if(this.potions.isEmpty()){
      System.out.println("Vous n'avez plus de potion");
      return;                  //Pour quitter la methode
    }
    (potions.get(potions.size() - 1)).regenHealth(this);   //Utilisation de la potion
                                                                  /*[5] => size = 1
                                                                   get(size - 1 = 0) => 1*/
    potions.remove(potions.size() - 1);                     // supprime le dernier élément de la liste
  }


  @Override
  public void attack(Character c) {
  }

  @Override
  public void damage(int damage) {
    this.health = this.health - damage;             //Pour lui enlever les degats au wizard
  }


}
