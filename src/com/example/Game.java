package com.example;

import java.util.Scanner;

public class Game {

  private Wizard wizard;        //Utilisation de Wizard
  private Enemy enemy;
  private boolean isFinished;
  private boolean gameOver;
  private int level;

//Constructeur Pour niveau 1
  public Game(String name, int health, int damage, Wand wand, Pet pet){   //Constructeur enemy
    this.wizard = new Wizard(name, health, damage, wand, pet);    //Initialisation de wizard
    this.enemy = new Enemy("Troll", 100,10);
    this.isFinished = false;
    this.gameOver = false;
    this.level = 1;
  }

  public void nextLevel(){
    this.level++;
    this.isFinished = true;
    System.out.println("Next Level "+ Integer.toString(this.level));

    switch(this.level){
      case 2:                                                                     //Pour changer au LVL 2
        this.enemy = new Enemy("Basilic", 120,20);
        break;
      case 3:
        this.enemy = new Enemy("Détraqueurs", 120,20);
        break;

    }
  }

  public void play(){                                     //Pour jouer tt les lvl dispo
    while(!this.gameOver || this.level <= 7 ){
      switch(this.level){
        case 1:
          this.lvl_1();
          break;
        case 2:
          this.lvl_2();
          this.level = 10;
          break;

      }
    }
  }

  //Codage level 1
  public void lvl_1(){                                //Description lvl1
    this.isFinished = false;
    Spell spell = new Spell(100, "Wingardium Leviosa",20);
    this.wizard.addSpell(spell);
    System.out.println("Congratulation you have unlocked the spell Wingardium Leviosa !");
    System.out.println("Beat the Troll");

    while(!this.isFinished){

      System.out.println("Choose your action : ");
      System.out.println("1. Potion");
      System.out.println("2. Spell");
      Scanner scanner = new Scanner(System.in);
      int choose = scanner.nextInt();             //Demander à l'utilisateur de choir le 1 ou 2

      switch(choose){                                   //Choisir les actions à realiser
        case 1:
          this.wizard.usePotion();
          break;                                     //Break obligatoire sinon il garde uniquement le dernier choix
        case 2:
         System.out.println("Choose your spell : ");
          this.wizard.displaySpells();
          int chooseSpell = scanner.nextInt();
          this.wizard.attackWithSpell(this.enemy,chooseSpell);
          break;
      }

      if(this.enemy.getHealth() <= 0){                    //Si l'ennemie est en dessous de 0 Il dead
        System.out.println("WIN !");
        this.nextLevel();
        return;
      }

      this.enemy.attack(this.wizard);

      if(this.wizard.getHealth() <= 0){               //Si le wizard est en dessous de 0 Il dead
        System.out.println("LOST !");
        this.gameOver = true;
        return;
      }
      System.out.println("Enemy health : " + this.enemy.getHealth());
      System.out.println("Wizard health : " + this.wizard.getHealth());

      System.out.println("WIN !");


    }

  }



  public void lvl_2(){                                //Description lvl1
    this.isFinished = false;
    Spell spell = null;
    switch(this.wizard.getHouse()){       //Cas de griffondore au debut lvl 2 il a l'epée
      case Gryffindor:
          spell = new Spell(100, "Épée de Griffondor",20);
          this.wizard.addSpell(spell);
          break;
      default:
          spell = new Spell(100, "Accio",20);
          this.wizard.addSpell(spell);
    }

    System.out.println("Congratulation you have unlocked the spell "+spell.toString()+" !");
    System.out.println("Beat the Basilic ! ");

    while(!this.isFinished){

      System.out.println("Choose your action : ");
      System.out.println("1. Potion");
      System.out.println("2. Spell");
      Scanner scanner = new Scanner(System.in);
      int choose = scanner.nextInt();             //Demander à l'utilisateur de choir le 1 ou 2

      switch(choose){                                   //Choisir les actions à realiser
        case 1:
          this.wizard.usePotion();
          break;                                     //Break obligatoire sinon il garde uniquement le dernier choix
        case 2:
         System.out.println("Choose your spell : ");
          this.wizard.displaySpells();
          int chooseSpell = scanner.nextInt();
          this.wizard.attackWithSpell(this.enemy,chooseSpell);
          break;
      }

      if(this.enemy.getHealth() <= 0){                    //Si l'ennemie est en dessous de 0 Il dead
        System.out.println("WIN !");
        this.nextLevel();
        return;
      }

      this.enemy.attack(this.wizard);

      if(this.wizard.getHealth() <= 0){               //Si le wizard est en dessous de 0 Il dead
        System.out.println("LOST !");
        this.gameOver = true;
        return;
      }
      System.out.println("Enemy health : " + this.enemy.getHealth());
      System.out.println("Wizard health : " + this.wizard.getHealth());


    }

  }

}
