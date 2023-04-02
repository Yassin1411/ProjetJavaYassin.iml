package com.example;      //Chemain à partir du fichier source

import java.util.Scanner;

public class Main {

  //Ajout de import lombok.Getter; et lombok.Setter; (librairie pour éviter d'utiliser les get et set )

  //Faire des tests unitaire 100% (clique droit sur la fonction chercher test)



  //Ici que des apples de fonctions, replacer les trucs d'en bas dans leurs classes et ne pas oublier de les appeler
  /*public static void main(String[] args) {
    // création d'une nouvelle instance de Wand
    String core="Sureau";
    int size = 40;
    Wand wand = new Wand(core, size);

    //Création d'une nouvelle instance de SortingHat
        SortingHat sortingHat = new SortingHat();

    // Créer une nouvelle instance de Wizard
    Scanner scanner = new Scanner(System.in);
    System.out.println("Entrez le nom du sorcier : ");
    String name = scanner.nextLine();
    int health = 100;
    int damage = 25;
        Wizard wizard = new Wizard(name, health, damage, wand);

        // Utiliser les méthodes et propriétés de l'objet Wizard créé
        System.out.println("Wizard Name : " + wizard.getName());
        System.out.println("Wizard Health : " + wizard.getHealth());
        System.out.println("Wizard Damage : " + wizard.getDamage());
        System.out.println("Size Wand : " + wizard.getWand().getSize());   //METTRE PLUTOT SIZE
        System.out.println("Core Wand : " + wizard.getWand().getCore());

        // Assigner une maison au sorcier
        var houses = SortingHat.assignHouse(wizard);
        System.out.println("La maison assignée à " + wizard.getName() + " est " + houses);

*/



  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Introduction dans le jeu
    System.out.println("Bienvenue dans Harry Potter At Home");

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
