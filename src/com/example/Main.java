package com.example;      //Chemain à partir du fichier source

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Introduction dans le jeu
    System.out.println("Bienvenue dans Harry Potter At Home !");

    // Create a Wizard
    System.out.println("Enter wizard's name : ");
    String name = scanner.nextLine();

    //Choose ur PET
    System.out.println("Choose ur pet");
    System.out.println("1. OWL");
    System.out.println("2. RAT");
    System.out.println("3. CAT");
    System.out.println("4. TOAD");
    System.out.println("5. DOG");
    int choicePet = scanner.nextInt();
    Pet pet = null;
    switch (choicePet) {
      case 1:
        pet = Pet.OWL;
       break;                                     //Break obligatoire sinon il garde uniquement le dernier choix
      case 2:
        pet = Pet.RAT;
       break;
      case 3:
        pet = Pet.CAT;
       break;
      case 4:
        pet = Pet.TOAD;
        break;
      case 5:
        pet = Pet.DOG;
        break;
    }
    System.out.println("Youre Pet is : " + pet);

    //Selection de Wand
    System.out.println("Choose ur Wand");
    System.out.println("1. PHOENIX_FEATHER");
    System.out.println("2. DRAGON_HEARTSTRING");
    System.out.println("3. Unicorn_tail_hairs");
    int choiceCore = scanner.nextInt();
    Core core = null;
    switch (choiceCore) {
      case 1:
        core = Core.PHOENIX_FEATHER;
        break;
      case 2:
        core = Core.DRAGON_HEARTSTRING;
        break;
      case 3:
        core = Core.Unicorn_tail_hairs;
        break;
    }
    Wand wand = new Wand(core, 10);

    System.out.println("Youre Core Wand is : " + core);

    Game game = new Game(name,100,20,wand, pet);

    game.play();

  }
}
