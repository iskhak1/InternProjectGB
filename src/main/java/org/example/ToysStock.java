package org.example;

import org.example.POJO.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ToysStock {

    private List<Toy> queue;
    private Toy[] toys;
    private Toy[] toys2;
    private Toy[] toys3;
    private Toy[][] toyOftoys;

    public ToysStock(){
        assemblyArray();
        put();
    }
  private void assemblyArray(){
      toys = new Toy[]{
              new Toy(1,"toy1", 10),
              new Toy(2,"toy2", 22),
              new Toy(3,"toy3", 11),
              new Toy(4,"toy4", 132),
              new Toy(5,"toy5", 15),
              new Toy(6,"toy6", 19),
              new Toy(7,"toy7", 1),
              new Toy(8,"toy8", 80),
      };

      toys2 = new Toy[]{
              new Toy(9,"toy8", 10),
              new Toy(11,"toy9", 22),
              new Toy(12,"toy10", 11),
              new Toy(13,"toy11", 132),
              new Toy(14,"toy12", 15),
              new Toy(15,"toy13", 19),
              new Toy(16,"toy14", 1),
              new Toy(17,"toy15", 80),
      };

      toys3 = new Toy[]{
              new Toy(18,"toy16", 10),
              new Toy(19,"toy17", 22),
              new Toy(20,"toy18", 11),
              new Toy(21,"toy19", 15),
              new Toy(22,"toy20", 132),
              new Toy(23,"toy21", 19),
              new Toy(24,"toy22", 1),
              new Toy(25,"toy23", 80),
      };
        toyOftoys = new Toy[][]{toys,toys2,toys3};
  }
  private void put(){
     queue = new ArrayList<>();
      for (int i = 0; i < toyOftoys.length; i++) {
          for (int j = 0; j < toyOftoys[i].length; j++) {
              queue.add(toyOftoys[i][j]);
          }
      }
  }
  public List getToys(){
      return queue;
  }

    public void add(Toy toy) {
        queue.add(toy);
    }
}
