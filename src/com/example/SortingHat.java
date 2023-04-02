package com.example;
import java.util.Random;    //Classe de java pour le random des maisons


public class SortingHat {
  //Tableau des 4 maisons + staticméthode est accessible sans créer d'abord un objet de la classe
  private static String[] houses = {"Gryffindor", "Slytherin", "Hufflepuff", "Ravenclaw"};

  public static House assignHouse(Wizard wizard) {
    Random random = new Random();
    int index = random.nextInt(houses.length);
    String house = houses[index];
    House h = null;
    switch(house){
      case "Gryffindor":
        h = House.Gryffindor;
        break;
      case "Slytherin":
        h = House.Slytherin;
        break;
      case "Hufflepuff":
        h = House.Hufflepuff;
        break;
      case "Ravenclaw":
        h = House.Ravenclaw;
        break;
    }
    // Assigner la maison au sorcier
    wizard.setHouse(h);
    return h;

  }

}
