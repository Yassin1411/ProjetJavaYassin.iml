package com.example;
import java.util.Random;    //Classe de java pour le random des maisons


public class SortingHat {
  //Tableau des 4 maisons + staticméthode est accessible sans créer d'abord un objet de la classe
  private static String[] houses = {"Gryffindor", "Slytherin", "Hufflepuff", "Ravenclaw"};

  public static String assignHouse(Wizard wizard) {
    Random random = new Random();
    int index = random.nextInt(houses.length);
    String house = houses[index];

    // Assigner la maison au sorcier
    wizard.setHouse(house);
    return house;

  }

}
