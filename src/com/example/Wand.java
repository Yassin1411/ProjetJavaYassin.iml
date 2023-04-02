package com.example;

public class Wand {
  private Core core;
  private int size;


  //constructeur
  public Wand(Core core, int size){;
    this.core = core;
    this.size = size;
  }


  // Getters and setters
  public Core getCore() {
    return core;
  }

  public void setWood(Core core) {
    this.core = core;
  }

  public int getSize() {
    return size;
  }

}
