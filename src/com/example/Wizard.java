package com.example;
import java.util.ArrayList;


public class Wizard extends Character {
    private String name;
    private int health;
    private int damage;
    private Wand wand;
    private House house;
    private Pet pet;
    private  ArrayList<Potion> potions;
    private  ArrayList<AbstractSpell> knowsSpells;

  // Constructeur pour initialiser les propriétés
  public Wizard(String name, int health, int damage, Wand wand, Pet pet) {
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
    System.out.println("La maison assignée à " + this.getName() + " est " + SortingHat.assignHouse(this));     //this ==> concerne le wizard
    this.pet = pet;

    this.potions = new ArrayList<Potion>();     //Initialiser la liste
    this.knowsSpells = new ArrayList<AbstractSpell>();     //Initialiser la liste

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

  public void setHouse(House house) {
    this.house = house;
  }

  public House getHouse() {
    return this.house;
  }

  public void addPotion(Potion p){
    //if(this.potions.size() < 3)
      this.potions.add(p);                //Ajout de la potion p dans la liste
  }

  public void addSpell(AbstractSpell spell){
      this.knowsSpells.add(spell);                //Ajout d'un spell dans la liste
  }

  public void displaySpells(){
    int i = 1;
    for(AbstractSpell s : this.knowsSpells){
      System.out.println(Integer.toString(i)+" : "+s);
    }
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
    System.out.println("Vous avez utilisé(e) une potion !");

  }

  public void attackWithSpell(Character c, int indexSpell) {    //Attaque en fonction du spell
    this.knowsSpells.get(indexSpell-1).attack(c);
  }

  @Override
  public void attack(Character c) {
    c.damage(this.damage);
  }

  @Override
  public void damage(int damage) {
    this.health = this.health - damage;             //Pour lui enlever les degats au wizard
  }


}
