package com.example;      //Chemain à partir du fichier source

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
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


      }


}

